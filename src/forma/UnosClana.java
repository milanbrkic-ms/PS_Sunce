/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma;

import repozitorijum.Kontroler;
import domen.Clan;
import domen.Mesto;
import greske.SQLObjekatPostojiException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import osluskivac.OsluskivacClanovi;

/**
 *
 * @author Milan
 */
public class UnosClana extends javax.swing.JDialog {

    /**
     * Creates new form UnosClana
     */
    public UnosClana(java.awt.Frame parent, boolean modal) throws Exception {
        super(parent, modal);

        initComponents();
        postaviNazive();
        postaviOsluskivace();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        panelZaUnosIme = new forma.panel.panelZaUnos();
        panelZaUnosPrezime = new forma.panel.panelZaUnos();
        panelZaUnosRoditelj = new forma.panel.panelZaUnos();
        panelZaDatumRodj = new forma.panel.panelZaUnos();
        panelPol1 = new forma.panel.PanelPol();
        PanelGodinaUpisa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSpinnerGodUpisa = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxMesto = new javax.swing.JComboBox<>();
        PanelDugmad = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Unos clana");

        MainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Clan"));
        MainPanel.setLayout(new java.awt.GridLayout(7, 1));
        MainPanel.add(panelZaUnosIme);
        MainPanel.add(panelZaUnosPrezime);
        MainPanel.add(panelZaUnosRoditelj);
        MainPanel.add(panelZaDatumRodj);
        MainPanel.add(panelPol1);

        jLabel1.setText("Godina upisa: ");

        jSpinnerGodUpisa.setModel(new javax.swing.SpinnerNumberModel(2017, null, null, 1));

        jLabel3.setText("Mesto: ");

        javax.swing.GroupLayout PanelGodinaUpisaLayout = new javax.swing.GroupLayout(PanelGodinaUpisa);
        PanelGodinaUpisa.setLayout(PanelGodinaUpisaLayout);
        PanelGodinaUpisaLayout.setHorizontalGroup(
            PanelGodinaUpisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGodinaUpisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSpinnerGodUpisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxMesto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelGodinaUpisaLayout.setVerticalGroup(
            PanelGodinaUpisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGodinaUpisaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PanelGodinaUpisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSpinnerGodUpisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxMesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        MainPanel.add(PanelGodinaUpisa);

        jButton1.setText("Sacuvaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelDugmad.add(jButton1);

        MainPanel.add(PanelDugmad);

        getContentPane().add(MainPanel, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panelZaDatumRodj.getjPanel1().setBorder(null);
        panelZaUnosIme.getjPanel1().setBorder(null);
        panelZaUnosPrezime.getjPanel1().setBorder(null);
        panelZaUnosRoditelj.getjPanel1().setBorder(null);
        if (izvrsiProveru() & datumskaProvera()) {

            String ime = panelZaUnosIme.getJtxtFieldText();
            String prezime = panelZaUnosPrezime.getJtxtFieldText();
            String imeRoditelja = panelZaUnosRoditelj.getJtxtFieldText();
            String pol = panelPol1.returnSelected();
            String datumRodj = panelZaDatumRodj.getJtxtFieldText();
            int godinaUpisa = (int) jSpinnerGodUpisa.getValue();
            //Date date = format.parse(panelZaDatumRodj.getJtxtFieldText());
            LocalDate ld = LocalDate.parse(datumRodj.subSequence(0, datumRodj.length()), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            Mesto mesto = (Mesto) jComboBoxMesto.getSelectedItem();

            Clan clan = new Clan(ime, prezime, imeRoditelja, pol.charAt(0), ld, godinaUpisa, mesto);

            try {
                Kontroler.getInstance().ubaciClana(clan);

                //obavestiSveListeners(clan);
                JOptionPane.showMessageDialog(this, "Uspešno ste dodali člana.");
                int i = JOptionPane.showConfirmDialog(this, "Da li želite da dodate još članova?");
                if (i == 1) {
                    this.setVisible(false);
                }
                if (i == 0) {
                    restartujPolja();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Ubacivanje člana", JOptionPane.ERROR_MESSAGE);
            } catch (SQLObjekatPostojiException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Clan postoji u bazi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Popuni prazna polja");

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel PanelDugmad;
    private javax.swing.JPanel PanelGodinaUpisa;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Object> jComboBoxMesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerGodUpisa;
    private forma.panel.PanelPol panelPol1;
    private forma.panel.panelZaUnos panelZaDatumRodj;
    private forma.panel.panelZaUnos panelZaUnosIme;
    private forma.panel.panelZaUnos panelZaUnosPrezime;
    private forma.panel.panelZaUnos panelZaUnosRoditelj;
    // End of variables declaration//GEN-END:variables

    private void postaviNazive() throws Exception {
        panelZaUnosIme.setLabelaNaziv("Ime: ");
        panelZaUnosIme.setLabelaError("");

        panelZaUnosPrezime.setLabelaNaziv("Prezime: ");
        panelZaUnosPrezime.setLabelaError("");

        panelZaUnosRoditelj.setLabelaNaziv("Ime roditelja: ");
        panelZaUnosRoditelj.setLabelaError("");

        panelPol1.setLabelaError("");

        panelZaDatumRodj.setLabelaNaziv("Datum rodjenja: ");
        panelZaDatumRodj.getJtxtField().setText("format: dd-mm-yyyy");
        panelZaDatumRodj.getJtxtField().setToolTipText("dd-MM-yyyy");
        panelZaDatumRodj.getJtxtField().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                panelZaDatumRodj.getJtxtField().setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
        panelZaDatumRodj.setLabelaError("");
        SpinnerNumberModel model = (SpinnerNumberModel) jSpinnerGodUpisa.getModel();
        model.setMaximum(LocalDate.now().getYear());
        model.setMinimum(2010);
        popuniCombo();
    }

    private boolean izvrsiProveru() {
        //postaviNazive();
        return panelZaUnosIme.proveri()
                & panelZaUnosPrezime.proveri()
                & panelZaUnosRoditelj.proveri()
                & panelPol1.proveri()
                & panelZaDatumRodj.proveri();
    }
    //nije thread safe
    SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");

    private boolean datumskaProvera() {
        String datum = panelZaDatumRodj.getJtxtFieldText();
        try {
            if (!datum.matches("\\d{2}-\\d{2}-\\d{4}")) {
                throw new Exception("Format datuma je dd-mm-yyyy (ex. 01-01-2010)");
            }
            int god = Integer.parseInt(datum.substring(6));
            if (god > LocalDate.now().getYear() - 14) {
                throw new Exception("Clan mora da ima preko 14 godina.");
            }
            format.setLenient(false);
            format.parse(datum);
            return true;
            //return datum.matches("\\d{2}-\\d{2}-\\d{4}");
        } catch (Exception ex) {
            panelZaDatumRodj.setLabelaError(ex.getMessage());
            return false;
        }
    }

    private void restartujPolja() {
        panelZaUnosIme.getJtxtField().setText(null);
        panelZaUnosPrezime.getJtxtField().setText(null);
        panelZaUnosRoditelj.getJtxtField().setText(null);
        panelZaDatumRodj.getJtxtField().setText(null);

        jSpinnerGodUpisa.getModel().setValue(LocalDate.now().getYear());
        panelPol1.reset();
    }

    private void popuniCombo() throws Exception {
        List<Mesto> mesta = new ArrayList<>();
        jComboBoxMesto.removeAllItems();
        jComboBoxMesto.setModel(new DefaultComboBoxModel<>());
        try {
            Kontroler.getInstance().vratiMesta(mesta);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + "\nSistem ne moze da otvori formu za unos.", "Greska combo box", JOptionPane.ERROR_MESSAGE);

            throw new Exception();
        }

        mesta.stream().forEach((m) -> {
            jComboBoxMesto.addItem(m);
        });
    }

//    private void obavestiSveListeners(Clan clan) {
//        for (OsluskivacClanovi listener : listeners) {
//            listener.oDodajClana(clan);
//        }
//    }
    private void postaviOsluskivace() {
        panelZaUnosIme.getJtxtField().addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelZaUnosPrezime.getJtxtField().requestFocus();
            }
        });
        panelZaUnosPrezime.getJtxtField().addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               panelZaUnosRoditelj.getJtxtField().requestFocus();
            }
        });
        panelZaUnosRoditelj.getJtxtField().addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelZaDatumRodj.getJtxtField().requestFocus();
            }
        });
        panelZaDatumRodj.getJtxtField().addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPol1.getComponent(2).requestFocus();
            }
        });
        
    }

}

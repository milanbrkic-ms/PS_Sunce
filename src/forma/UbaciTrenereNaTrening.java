/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma;

import domen.Clan;
import domen.Trener;
import domen.Trening;
import forma.panel.PanelPrikazClanova;
import forma.panel.PanelPrikazTrenera;
import forma.panel.model.TabelaModelPrikazClan;
import forma.panel.model.TabelaModelPrikazTrener;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import komunikacija.Komunikacija;
import radnaMemorija.KontrolaOsluskivac;
import request.RequestObject;
import response.ResponseObject;
import status.EnumResponseStatus;
import util.Akcije;

/**
 *
 * @author Milan
 */
public class UbaciTrenereNaTrening extends javax.swing.JDialog {

    private final List<Trener> treneri;
    private Trening trening;

    /**
     * Creates new form UbaciClanoveUTrening
     */
    public UbaciTrenereNaTrening(java.awt.Frame parent, boolean modal) throws Exception {
        super(parent, modal);
        this.treneri = vratiTrenere();
        initComponents();

        postaviPanele();
    }

    public UbaciTrenereNaTrening(java.awt.Frame parent, boolean modal, Trening trening) throws Exception {
        this(parent, modal);
        this.trening = trening;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxtPretraga = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ubaci clanove");

        jPanel3.setPreferredSize(new java.awt.Dimension(634, 50));

        jLabel1.setText("Pretrazi: ");

        jTxtPretraga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtPretragaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtPretragaKeyReleased(evt);
            }
        });

        jButton1.setText("Dodaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtPretragaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtPretragaKeyPressed

    }//GEN-LAST:event_jTxtPretragaKeyPressed

    private void jTxtPretragaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtPretragaKeyReleased
        Predicate<String> searchedValue = (String v) -> v.toLowerCase().contains(jTxtPretraga.getText());
        List<Trener> kopija = treneri;
        List<Trener> filteredClanovi = filterList(searchedValue, kopija);
        TabelaModelPrikazTrener model = (TabelaModelPrikazTrener) panel.getjTable1().getModel();
        model.setTreneri(filteredClanovi);
    }//GEN-LAST:event_jTxtPretragaKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JTable table = panel.getjTable1();
        try {
            int rowSelectedViewModel = table.convertRowIndexToModel(table.getSelectedRow());
            if (rowSelectedViewModel != -1) {
                Trener t = ((TabelaModelPrikazTrener) table.getModel()).getTrenere().get(rowSelectedViewModel);
                if (trening.getTreneri().contains(t)) {
                    JOptionPane.showMessageDialog(this, "Trener je već prijavljen na trening", "Greška", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        RequestObject requestObj = new RequestObject();
                        requestObj.setAction(Akcije.DODAJ_TRENERA_NA_TRENING);
                        Object[] o = {t, trening};
                        requestObj.setObject(o);
                        Komunikacija.vratiInstancu().posaljiZahtev(requestObj);

                        ResponseObject responseObj = Komunikacija.vratiInstancu().procitajOdgovor();
                        if (responseObj.getStatus() == EnumResponseStatus.ERROR) {
                            throw new Exception(responseObj.getMessage());
                        }
                        
                        KontrolaOsluskivac.getInstance().obavestiSveDodavanje(t);
                        JOptionPane.showMessageDialog(this, "Uspešno ste dodali trenera na trening(" + trening + ")");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage());
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Morate izabrati trenera iz tabele!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTxtPretraga;
    // End of variables declaration//GEN-END:variables
    private PanelPrikazTrenera panel;

    private void postaviPanele() {
        try {
            TabelaModelPrikazTrener model = new TabelaModelPrikazTrener(treneri);
            panel = new PanelPrikazTrenera(model);
            panel.getHeader().setVisible(false);
            panel.getjTable1().setEnabled(true);
            this.add(panel);

            pack();
        } catch (Exception ex) {
            Logger.getLogger(UbaciTrenereNaTrening.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Trener> filterList(Predicate<String> p, List<Trener> treneri) {
        List<Trener> result = new ArrayList<>();
        for (Trener trener : treneri) {
            if (p.test(trener.getAttributes())) {
                result.add(trener);
            }
        }
        return result;
    }

    private List<Trener> vratiTrenere() throws Exception {
        ObjectOutputStream out = null;
        List<Trener> tr = new ArrayList<>();
        try {
            RequestObject requestObj = new RequestObject();
            requestObj.setAction(Akcije.VRATI_SVE_TRENERE);
            Komunikacija.vratiInstancu().posaljiZahtev(requestObj);

            ResponseObject responseObj = Komunikacija.vratiInstancu().procitajOdgovor();
            if (responseObj.getStatus() == EnumResponseStatus.ERROR) {
                throw new Exception(responseObj.getMessage());
            }
            tr = (List<Trener>) responseObj.getObject();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
        return tr;
    }
}

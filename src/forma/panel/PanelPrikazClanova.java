/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.panel;

import domen.Clan;
import domen.Mesto;
import forma.UnosClana;
import forma.panel.model.TabelaModelPrikazIIzmenaClan;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import repozitorijum.Kontroler;

/**
 *
 * @author Milan
 */
public class PanelPrikazClanova extends javax.swing.JPanel {

    /**
     * Creates new form PanelPrikazClanova
     */
    public PanelPrikazClanova(TableModel model) {

        initComponents();
        postaviModel(model);
        headerPostavke();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelHeader = new javax.swing.JPanel();
        jBtnSave = new javax.swing.JButton();
        jBtnObrisi = new javax.swing.JButton();
        jBtnDodaj = new javax.swing.JButton();

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        jBtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/rsz_1492201245_save.png"))); // NOI18N
        jBtnSave.setToolTipText("sacuvaj");
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });

        jBtnObrisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/rsz_delete.png"))); // NOI18N
        jBtnObrisi.setToolTipText("obrisi");
        jBtnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnObrisiActionPerformed(evt);
            }
        });

        jBtnDodaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/rsz_add_friend-512.png"))); // NOI18N
        jBtnDodaj.setToolTipText("dodaj clana");
        jBtnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDodajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBtnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jBtnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnDodaj)
                    .addComponent(jBtnObrisi)
                    .addComponent(jBtnSave)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDodajActionPerformed
        TabelaModelPrikazIIzmenaClan model = (TabelaModelPrikazIIzmenaClan) jTable1.getModel();

        try {
            UnosClana unosClana = new UnosClana(null, true);
            unosClana.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(PanelPrikazClanova.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.fireTableDataChanged();
    }//GEN-LAST:event_jBtnDodajActionPerformed

    private void jBtnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnObrisiActionPerformed
        TabelaModelPrikazIIzmenaClan model = (TabelaModelPrikazIIzmenaClan) jTable1.getModel();

        int rowSelected = jTable1.convertRowIndexToModel(jTable1.getSelectedRow());
        System.out.println("Selected row index to model: " + rowSelected);
        System.out.println(model.getClanovi().get(rowSelected));

        Clan clan = model.getClanovi().get(rowSelected);
        int odg = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da zelite da obrisete clana:\n " + clan, "Prihvatam uslove", JOptionPane.YES_NO_OPTION);

        if (odg == 0) {

            System.out.println(clan);

            try {
                Kontroler.getInstance().obrisi(clan);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Brisanje clana", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jBtnObrisiActionPerformed

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        List<Clan> clanoviIzModela = ((TabelaModelPrikazIIzmenaClan)jTable1.getModel()).getClanovi();
        
        for (Clan clan : clanoviIzModela) {
            if (clan.isPromenjen()) {
                //Kontroler.getInstance().promeni(clan);
            }
        }
    }//GEN-LAST:event_jBtnSaveActionPerformed

    public JPanel getHeader() {
        return jPanelHeader;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDodaj;
    private javax.swing.JButton jBtnObrisi;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void postaviModel(TableModel model) {
        try {

            jTable1.setModel(model);
            
            TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
            jTable1.setRowSorter(sorter);
            List<RowSorter.SortKey> sortKeys = new ArrayList<>();

            int columnIndexToSort = 0;
            sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));

            sorter.setSortKeys(sortKeys);
            sorter.sort();

            List<Mesto> mesta = new ArrayList<>();
            Kontroler.getInstance().vratiMesta(mesta);

            if (!mesta.isEmpty()) {
                JComboBox jcbMesta = new JComboBox(mesta.toArray());
                TableColumnModel tcm = jTable1.getColumnModel();
                TableColumn tc = tcm.getColumn(7);
                tc.setCellEditor(new DefaultCellEditor(jcbMesta));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void headerPostavke() {
        postaviDugme(jBtnSave);

    }

    public List<Clan> vratiClanoveIzModela() {
        return ((TabelaModelPrikazIIzmenaClan) jTable1.getModel()).getClanovi();
    }

    public void postaviModelTabele(TableModel model) {
        if (model != null) {
            jTable1.setModel(model);
        }
    }

    private void postaviDugme(JButton jBtnSave) {
//jBtnSave.setFocusPainted(false);
        //jBtnSave.setMargin(new Insets(0, 0, 0, 0));
        jBtnSave.setContentAreaFilled(false);
//        jBtnSave.setBorderPainted(false);
//        jBtnSave.setOpaque(false);
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.panel;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Milan
 */
public class panelZaUnos extends javax.swing.JPanel implements IPanel {

    /**
     * Creates new form panelZaUnos
     */
    public panelZaUnos() {
        initComponents();
        this.LabelaError.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelaNaziv = new javax.swing.JLabel();
        LabelaError = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTxtField = new javax.swing.JTextField();

        LabelaNaziv.setText("LabelaNaziv");

        LabelaError.setForeground(new java.awt.Color(255, 0, 0));
        LabelaError.setText("LabelaError");

        jTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtFieldFocusGained(evt);
            }
        });
        jTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelaError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelaNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelaNaziv, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelaError, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtFieldFocusGained
        //jTxtField.setText("");
    }//GEN-LAST:event_jTxtFieldFocusGained

    private void jTxtFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtFieldKeyTyped
        
    }//GEN-LAST:event_jTxtFieldKeyTyped

    public void setLabelaNaziv(String naziv) {
        this.LabelaNaziv.setText(naziv);

    }

    public void setLabelaError(String error) {
        this.LabelaError.setText(error);
        this.LabelaError.setVisible(true);
    }

    public JTextField getJtxtField() {

        return this.jTxtField;
    }

    public String getJtxtFieldText() {

        return this.jTxtField.getText().trim();
    }

    public JLabel getLabelaError() {
        return LabelaError;
    }

    public void setLabelaError(JLabel LabelaError) {
        this.LabelaError = LabelaError;
    }

    public JLabel getLabelaNaziv() {
        return LabelaNaziv;
    }

    public void setLabelaNaziv(JLabel LabelaNaziv) {
        this.LabelaNaziv = LabelaNaziv;
    }

    public JTextField getjTxtField() {
        return jTxtField;
    }

    public void setjTxtField(JTextField jTxtField) {
        this.jTxtField = jTxtField;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    @Override
    public boolean proveri() {
        if (this.jTxtField.getText().isEmpty()) {
            //this.LabelaError.setText("Obavezno polje.");
            jPanel1.setBorder(new LineBorder(Color.RED, 2));
            return false;
        }
        this.LabelaError.setText("");
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelaError;
    private javax.swing.JLabel LabelaNaziv;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtField;
    // End of variables declaration//GEN-END:variables
}

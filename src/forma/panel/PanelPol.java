/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.panel;

/**
 *
 * @author Milan
 */
public class PanelPol extends javax.swing.JPanel implements IPanel{

    /**
     * Creates new form PanelPol
     */
    public PanelPol() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        LabelaNaziv = new javax.swing.JLabel();
        jRadioMuski = new javax.swing.JRadioButton();
        jRadioZenski = new javax.swing.JRadioButton();
        LabelaError = new javax.swing.JLabel();

        LabelaNaziv.setText("Pol: ");

        buttonGroup1.add(jRadioMuski);
        jRadioMuski.setText("Muski");

        buttonGroup1.add(jRadioZenski);
        jRadioZenski.setText("Zenski");

        LabelaError.setForeground(new java.awt.Color(255, 0, 0));
        LabelaError.setText("LabelaError");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelaError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelaNaziv, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioMuski, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioZenski, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelaNaziv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioMuski, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioZenski, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelaError, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public String returnSelected(){
        if(jRadioMuski.isSelected()) return "Muski";
        if(jRadioZenski.isSelected()) return "Zenski";
        this.LabelaError.setText("Obavezno je uneti pol");
        return "N/A";
    }
    
    public void setLabelaError(String error){
        LabelaError.setText(error);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelaError;
    private javax.swing.JLabel LabelaNaziv;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jRadioMuski;
    private javax.swing.JRadioButton jRadioZenski;
    // End of variables declaration//GEN-END:variables

    @Override
    public boolean proveri()  {
        if(buttonGroup1.getSelection() == null){
            LabelaError.setText("Odaberite pol");
            return false;
        }
         LabelaError.setText("");
        return true;
    }
    
    public void reset(){
        buttonGroup1.clearSelection();
    }
}

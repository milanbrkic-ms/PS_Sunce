/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma;

import db.Util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import repozitorijum.Kontroler;

/**
 *
 * @author Milan
 */
public class JDialogUnosParametraZaBazu extends javax.swing.JDialog {

    /**
     * Creates new form JDialogUnosParametraZaBazu
     */
    public JDialogUnosParametraZaBazu(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jProgressBar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jtxtIpAdresa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtPort = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtKorisnickoIme = new javax.swing.JTextField();
        jtxtLozinka = new javax.swing.JTextField();
        jProgressBar = new javax.swing.JProgressBar();
        jBtnPovezi = new javax.swing.JButton();
        jBtnTest = new javax.swing.JButton();
        statusKonekcije = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Konektovanje na bazu");
        setSize(new java.awt.Dimension(527, 348));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Konekcija sa bazom", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Baza: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "MySQL" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ip adresa: ");

        jLabel3.setText("Port: ");

        jLabel4.setText("Korisnicko ime: ");

        jLabel5.setText("Lozinka: ");

        jProgressBar.setOpaque(true);
        jProgressBar.setStringPainted(true);

        jBtnPovezi.setText("Povezi se");
        jBtnPovezi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPoveziActionPerformed(evt);
            }
        });

        jBtnTest.setText("Test");
        jBtnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTestActionPerformed(evt);
            }
        });

        statusKonekcije.setText("Status: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxtIpAdresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtLozinka)
                            .addComponent(jtxtKorisnickoIme))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(statusKonekcije, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnTest, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnPovezi)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(38, 38, 38)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtIpAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtKorisnickoIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(statusKonekcije, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnTest)
                        .addComponent(jBtnPovezi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jBtnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTestActionPerformed
        try {
            testirajKonekciju();
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jBtnTestActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem().toString().toLowerCase().equals("mysql")) {
            jtxtPort.setText("3306");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jBtnPoveziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPoveziActionPerformed
        if (!tested) {
            try {
                testirajKonekciju();
                status = " Uspesna konekcija na bazu. URL: " + Util.getInstance().getUrl();
                statusKonekcije.setText(status);
            } catch (IOException ex) {

            } catch (Exception ex) {

            }
        } else {
            try {
                status = " Uspesna konekcija na bazu. URL: " + Util.getInstance().getUrl();
                statusKonekcije.setText(status);
            } catch (IOException ex) {
                Logger.getLogger(JDialogUnosParametraZaBazu.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jBtnPoveziActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnPovezi;
    private javax.swing.JButton jBtnTest;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JTextField jtxtIpAdresa;
    private javax.swing.JTextField jtxtKorisnickoIme;
    private javax.swing.JTextField jtxtLozinka;
    private javax.swing.JTextField jtxtPort;
    private javax.swing.JLabel statusKonekcije;
    // End of variables declaration//GEN-END:variables
    private boolean tested = false;
    //private boolean connected = false;

   // public boolean isConnected() {
  //      return connected;
   // }

    private void uspostaviKonekciju() throws Exception {

        Kontroler.getInstance().uspostaviKonekcijuNaBazu();

        jProgressBar.setVisible(true);
        jProgressBar.setValue(60);

    }
    private String status = "Status: ";

    private void testirajKonekciju() throws Exception {
        statusKonekcije.setText(status);
        if (!tested) {
            try {
                File file = new File("db.properties");
                file.createNewFile();
                String imeBaze = jComboBox1.getSelectedItem().toString().toLowerCase();

                String ipAdresa = jtxtIpAdresa.getText().trim();
                String port = jtxtPort.getText().trim();
                String user = jtxtKorisnickoIme.getText().trim().toLowerCase();
                String pass = jtxtLozinka.getText().trim();
                Properties properties = Util.getInstance().getProperties();
                final String url = "jdbc:mysql://" + ipAdresa + ":" + port + "/pssunce";

                properties.setProperty("current", imeBaze);
                properties.setProperty(imeBaze + "_driver", "com.mysql.jdbc.Driver");
                properties.setProperty(imeBaze + "_url", url);
                properties.setProperty(imeBaze + "_user", user);
                properties.setProperty(imeBaze + "_password", pass);
                properties.store(new FileOutputStream(file), "");
                
                uspostaviKonekciju();
                jProgressBar.setValue(100);
                Util.getInstance().setStatus(true);
                status += " Correct!";
                statusKonekcije.setText(status);
                tested = true;
            } catch (IOException ex) {
                statusKonekcije.setText(status + ex.getMessage());
            } catch (Exception ex) {
                statusKonekcije.setText(status + ex.getMessage());
                throw new Exception(ex);
            }
        }
    }
}

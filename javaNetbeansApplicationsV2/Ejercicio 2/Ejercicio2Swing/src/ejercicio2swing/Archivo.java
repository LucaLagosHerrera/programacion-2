/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2swing;

/**
 *
 * @author LUKA28
 */
public class Archivo extends javax.swing.JFrame {

    Usuario u = new Usuario();
    public Archivo() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtRecovery = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jBtnRecuperar = new javax.swing.JButton();
        jBtnVolver = new javax.swing.JButton();
        jBtnSalirDos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RECUPERACIÓN DE DATOS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(6, 6, 548, 58);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 70));

        jPanel2.setLayout(null);

        jTxtRecovery.setBackground(new java.awt.Color(204, 204, 204));
        jTxtRecovery.setColumns(20);
        jTxtRecovery.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTxtRecovery.setForeground(new java.awt.Color(51, 51, 51));
        jTxtRecovery.setRows(5);
        jScrollPane1.setViewportView(jTxtRecovery);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(6, 20, 412, 169);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Abed David - Eglez Matias - Lagos Luca");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(6, 195, 548, 39);

        jBtnRecuperar.setBackground(new java.awt.Color(0, 204, 102));
        jBtnRecuperar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBtnRecuperar.setForeground(new java.awt.Color(51, 51, 51));
        jBtnRecuperar.setText("Recuperar");
        jBtnRecuperar.setToolTipText("");
        jBtnRecuperar.setBorder(null);
        jBtnRecuperar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRecuperarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnRecuperar);
        jBtnRecuperar.setBounds(430, 20, 124, 47);

        jBtnVolver.setBackground(new java.awt.Color(102, 102, 255));
        jBtnVolver.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBtnVolver.setForeground(new java.awt.Color(51, 51, 51));
        jBtnVolver.setText("Ingreso");
        jBtnVolver.setBorder(null);
        jBtnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnVolver);
        jBtnVolver.setBounds(430, 85, 124, 45);

        jBtnSalirDos.setBackground(new java.awt.Color(255, 51, 51));
        jBtnSalirDos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBtnSalirDos.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSalirDos.setText("Salir");
        jBtnSalirDos.setBorder(null);
        jBtnSalirDos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnSalirDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirDosActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnSalirDos);
        jBtnSalirDos.setBounds(430, 148, 124, 41);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio2swing/fondo_de_pantalla.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, -4, 560, 250);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 560, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRecuperarActionPerformed
        jTxtRecovery.setText(u.recoveryDate());
    }//GEN-LAST:event_jBtnRecuperarActionPerformed

    private void jBtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVolverActionPerformed
        Login lg = new Login();
        this.setVisible(false);
        lg.setVisible(true);
        lg.setLocationRelativeTo(null);
        lg.setSize(513,285);
        lg.setResizable(false);
    }//GEN-LAST:event_jBtnVolverActionPerformed

    private void jBtnSalirDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirDosActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtnSalirDosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Archivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnRecuperar;
    private javax.swing.JButton jBtnSalirDos;
    private javax.swing.JButton jBtnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtRecovery;
    // End of variables declaration//GEN-END:variables
}

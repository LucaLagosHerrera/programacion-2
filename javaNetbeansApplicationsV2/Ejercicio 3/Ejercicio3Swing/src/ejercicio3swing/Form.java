/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3swing;

import javax.swing.JOptionPane;

/**
 *
 * @author luca_
 */
public class Form extends javax.swing.JDialog {

    /**
     * Creates new form Form
     */
    public Form(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBtnSalir = new javax.swing.JButton();
        jBtnAtras = new javax.swing.JButton();
        jLbId = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jTxtApellido = new javax.swing.JTextField();
        jTxtTelefono = new javax.swing.JTextField();
        jTxtDomicilio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jCbxUsuario = new javax.swing.JComboBox<>();
        jPwPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jBtnEditar = new javax.swing.JButton();
        jBtnBorrar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(459, 555));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDICIÓN DE USUARIOS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 0, 302, 70));

        jBtnSalir.setBackground(new java.awt.Color(255, 51, 51));
        jBtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSalir.setText("Salir");
        jBtnSalir.setToolTipText("Salir");
        jBtnSalir.setBorder(null);
        jBtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnSalir.setFocusable(false);
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 0, 84, 30));

        jBtnAtras.setBackground(new java.awt.Color(0, 51, 51));
        jBtnAtras.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAtras.setText("Volver Atrás");
        jBtnAtras.setBorder(null);
        jBtnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnAtras.setFocusable(false);
        jBtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAtrasActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 36, 84, 34));

        jLbId.setBackground(new java.awt.Color(153, 0, 0));
        jLbId.setFont(new java.awt.Font("Haettenschweiler", 1, 24)); // NOI18N
        jLbId.setForeground(new java.awt.Color(255, 255, 255));
        jLbId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbId.setToolTipText("");
        jLbId.setOpaque(true);
        jPanel2.add(jLbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(17, 54, 123, 25);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(17, 17, 123, 25);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(17, 128, 123, 25);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo Electrónico:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(17, 91, 123, 25);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Domicilio:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(17, 165, 123, 25);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Teléfono:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(17, 202, 123, 25);

        jTxtNombre.setBackground(new java.awt.Color(153, 153, 153));
        jTxtNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTxtNombre.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jTxtNombre);
        jTxtNombre.setBounds(146, 17, 292, 24);

        jTxtEmail.setBackground(new java.awt.Color(153, 153, 153));
        jTxtEmail.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTxtEmail.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jTxtEmail);
        jTxtEmail.setBounds(146, 91, 292, 24);

        jTxtApellido.setBackground(new java.awt.Color(153, 153, 153));
        jTxtApellido.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTxtApellido.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jTxtApellido);
        jTxtApellido.setBounds(146, 54, 292, 24);

        jTxtTelefono.setBackground(new java.awt.Color(153, 153, 153));
        jTxtTelefono.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTxtTelefono.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jTxtTelefono);
        jTxtTelefono.setBounds(146, 202, 292, 24);

        jTxtDomicilio.setBackground(new java.awt.Color(153, 153, 153));
        jTxtDomicilio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTxtDomicilio.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jTxtDomicilio);
        jTxtDomicilio.setBounds(146, 165, 292, 24);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tipo de Usuario:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(17, 240, 123, 25);

        jCbxUsuario.setBackground(new java.awt.Color(153, 153, 153));
        jCbxUsuario.setForeground(new java.awt.Color(51, 51, 51));
        jCbxUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comun", "Administrador" }));
        jCbxUsuario.setBorder(null);
        jPanel3.add(jCbxUsuario);
        jCbxUsuario.setBounds(146, 239, 292, 26);

        jPwPassword.setBackground(new java.awt.Color(153, 153, 153));
        jPwPassword.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPwPassword.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jPwPassword);
        jPwPassword.setBounds(146, 129, 292, 22);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("RECORDATORIO:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(17, 277, 421, 21);

        jLabel11.setForeground(new java.awt.Color(255, 153, 51));
        jLabel11.setText("Las contraseñas válidas deben cumplir con los siguientes requisitos:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(17, 304, 421, 16);

        jLabel12.setForeground(new java.awt.Color(255, 153, 51));
        jLabel12.setText("* Mínimo 8 caracteres (numeros, letras y signos).");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(17, 326, 421, 16);

        jLabel13.setForeground(new java.awt.Color(255, 153, 51));
        jLabel13.setText("* Mínimo 1 letra minúscula.");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(17, 348, 421, 16);

        jLabel14.setForeground(new java.awt.Color(255, 153, 51));
        jLabel14.setText("* Mínimo 1 letra mayúscula.");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(17, 370, 421, 16);

        jLabel15.setForeground(new java.awt.Color(255, 153, 51));
        jLabel15.setText("* Mínimo 3 números y máximo 25 números.");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(17, 392, 421, 16);

        jLabel16.setForeground(new java.awt.Color(255, 153, 51));
        jLabel16.setText("* Mínimo 1 signo de los siguientes \"$&+,.:%;=@#|\", sin contar las comillas.");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(17, 414, 421, 16);

        jBtnEditar.setBackground(new java.awt.Color(0, 204, 102));
        jBtnEditar.setForeground(new java.awt.Color(51, 51, 51));
        jBtnEditar.setText("Editar");
        jBtnEditar.setBorder(null);
        jBtnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnEditar.setFocusable(false);
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnEditar);
        jBtnEditar.setBounds(17, 442, 202, 35);

        jBtnBorrar.setBackground(new java.awt.Color(102, 0, 0));
        jBtnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnBorrar.setText("Borrar Todo");
        jBtnBorrar.setBorder(null);
        jBtnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnBorrar.setFocusable(false);
        jBtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnBorrar);
        jBtnBorrar.setBounds(231, 442, 207, 35);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 460, 490));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo de Pantalla.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 460, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 459, 592));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAtrasActionPerformed
        Admin a = new Admin();
        this.setVisible(false);
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        a.setResizable(false);
    }//GEN-LAST:event_jBtnAtrasActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed

        Usuario u = new Usuario();
            u.setNombre(this.jTxtNombre.getText());
            u.setApellido(this.jTxtApellido.getText());
            u.setEmail(this.jTxtEmail.getText());
            u.setPassword(this.jPwPassword.getText());
            u.setDomicilio(this.jTxtDomicilio.getText());
            u.setTelefono(this.jTxtTelefono.getText());
            u.setUsertype((String) this.jCbxUsuario.getSelectedItem());
            u.setId(this.jLbId.getText());
            if(u.validarUsuarioEditar() == 1){
                if(Consulta.editarUsuario(u)){
                    Consulta.listarUsuarioAdmin("");
                    JOptionPane.showMessageDialog(null, "El Usuario se ha editado correctamente","Mensaje", JOptionPane.INFORMATION_MESSAGE);  
                    this.setVisible(false);
                    Admin a = new Admin();
                    a.setVisible(true);
                    a.setLocationRelativeTo(null);
                    a.setResizable(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Ha Habido errores al editar","Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }    
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBorrarActionPerformed
        this.jTxtNombre.setText("");
        this.jTxtApellido.setText("");
        this.jTxtEmail.setText("");
        this.jPwPassword.setText("");
        this.jTxtDomicilio.setText("");
        this.jTxtTelefono.setText("");
    }//GEN-LAST:event_jBtnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Form dialog = new Form(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAtras;
    private javax.swing.JButton jBtnBorrar;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnSalir;
    public static javax.swing.JComboBox<String> jCbxUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLbId;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JPasswordField jPwPassword;
    public static javax.swing.JTextField jTxtApellido;
    public static javax.swing.JTextField jTxtDomicilio;
    public static javax.swing.JTextField jTxtEmail;
    public static javax.swing.JTextField jTxtNombre;
    public static javax.swing.JTextField jTxtTelefono;
    // End of variables declaration//GEN-END:variables
}

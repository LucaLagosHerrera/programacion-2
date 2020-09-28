/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Toolkit;

/**
 *
 * @author LUCA
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/GestionBiblioteca.png")));
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this, false);
        this.lbError.setText("");
        this.psPassword.setEchoChar((char)8226);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jPanel1 = new javax.swing.JPanel();
        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        pnLogo = new rspanelcircleborder.RSPanelCircleBorder();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        rSPanelShadow2 = new rojeru_san.RSPanelShadow();
        jPanel2 = new javax.swing.JPanel();
        txtEmail = new RSMaterialComponent.RSTextFieldMaterialIcon();
        psPassword = new RSMaterialComponent.RSPasswordMaterialIcon();
        lbError = new javax.swing.JLabel();
        btnLogin = new rojeru_san.RSButton();
        btnForgot = new rojeru_san.RSButton();
        chkShowPassword = new RSMaterialComponent.RSCheckBoxMaterial();
        btnSalir = new RSMaterialComponent.RSButtonIconOne();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión - Gestión de Biblioteca");
        setUndecorated(true);

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(171, 153, 105));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(77, 67, 47));
        rSPanelGradiente1.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.ESQUINA_3);

        pnLogo.setBackground(new java.awt.Color(137, 122, 84));
        pnLogo.setColorBorde(new java.awt.Color(255, 255, 255));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/img/Logo de San Vicente de Paul.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnLogoLayout = new javax.swing.GroupLayout(pnLogo);
        pnLogo.setLayout(pnLogoLayout);
        pnLogoLayout.setHorizontalGroup(
            pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnLogoLayout.setVerticalGroup(
            pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLogoLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtEmail.setForeground(new java.awt.Color(51, 51, 51));
        txtEmail.setColorIcon(new java.awt.Color(137, 122, 84));
        txtEmail.setColorMaterial(new java.awt.Color(137, 122, 84));
        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEmail.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ACCOUNT_BOX);
        txtEmail.setPhColor(new java.awt.Color(0, 0, 0));
        txtEmail.setPlaceholder("Ingrese su Correo Electrónico");
        txtEmail.setSelectionColor(new java.awt.Color(0, 0, 0));

        psPassword.setForeground(new java.awt.Color(51, 51, 51));
        psPassword.setToolTipText("");
        psPassword.setColorIcon(new java.awt.Color(137, 122, 84));
        psPassword.setColorMaterial(new java.awt.Color(137, 122, 84));
        psPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        psPassword.setPhColor(new java.awt.Color(0, 0, 0));
        psPassword.setPlaceholder("Ingrese su Contraseña");
        psPassword.setSelectionColor(new java.awt.Color(0, 0, 0));

        lbError.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbError.setForeground(new java.awt.Color(204, 0, 0));
        lbError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbError.setText("Ingrese los datos correctos!");

        btnLogin.setBackground(new java.awt.Color(137, 122, 84));
        btnLogin.setText("Iniciar Sesión");
        btnLogin.setBorderPainted(false);
        btnLogin.setColorHover(new java.awt.Color(171, 153, 105));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnForgot.setBackground(new java.awt.Color(171, 153, 105));
        btnForgot.setText("Recuperar Contraseña");
        btnForgot.setBorderPainted(false);
        btnForgot.setColorHover(new java.awt.Color(137, 122, 84));
        btnForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotActionPerformed(evt);
            }
        });

        chkShowPassword.setForeground(new java.awt.Color(137, 122, 84));
        chkShowPassword.setText("Mostrar Contraseña");
        chkShowPassword.setColorCheck(new java.awt.Color(137, 122, 84));
        chkShowPassword.setColorUnCheck(new java.awt.Color(137, 122, 84));
        chkShowPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkShowPassword.setRippleColor(new java.awt.Color(171, 153, 105));
        chkShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                        .addComponent(btnForgot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(psPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(chkShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(psPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkShowPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbError, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnForgot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        rSPanelShadow2.add(jPanel2, java.awt.BorderLayout.CENTER);

        btnSalir.setBackground(new java.awt.Color(204, 0, 0));
        btnSalir.setBackgroundHover(new java.awt.Color(255, 51, 51));
        btnSalir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(rSPanelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(pnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(pnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(rSPanelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void chkShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowPasswordActionPerformed
        if(this.chkShowPassword.isSelected()){
            this.chkShowPassword.setText("Ocultar Contraseña");
            this.psPassword.setEchoChar((char)0);
        }else{
            this.psPassword.setEchoChar((char)8226);
            this.chkShowPassword.setText("Mostrar Contraseña");
        }
    }//GEN-LAST:event_chkShowPasswordActionPerformed

    private void btnForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotActionPerformed
        Forgot f = new Forgot();
        this.setVisible(false);
        f.setVisible(true);
    }//GEN-LAST:event_btnForgotActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        model.Empleado e = new model.Empleado();
        validation.Validacion_Login v = new validation.Validacion_Login();
        encryptation.Encriptacion_Empleado en = new encryptation.Encriptacion_Empleado();
        e.setEmail(this.txtEmail.getText());
        String password = this.psPassword.getText();
        String pasEnc = en.encriptarPassword(password);
        e.setPassword(pasEnc);
        if (v.validarLogin(txtEmail, psPassword, lbError) == true) {
            if (bbdd.Consulta_Login.buscarEmpleado(e, this.lbError) == true) {
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btnForgot;
    private rojeru_san.RSButton btnLogin;
    private RSMaterialComponent.RSButtonIconOne btnSalir;
    private RSMaterialComponent.RSCheckBoxMaterial chkShowPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lbError;
    private rspanelcircleborder.RSPanelCircleBorder pnLogo;
    private RSMaterialComponent.RSPasswordMaterialIcon psPassword;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojeru_san.RSPanelShadow rSPanelShadow2;
    private RSMaterialComponent.RSTextFieldMaterialIcon txtEmail;
    // End of variables declaration//GEN-END:variables
}

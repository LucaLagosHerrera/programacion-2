/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import rojerusan.RSAnimation;

/**
 *
 * @author LUCA
 */
public class LoadingBossScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    private Timer t;
    private int n = 0;
    public LoadingBossScreen() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/GestionBiblioteca.png")));
        proBar.setValue(0);
        proBar.setColorBackground(new Color(0,0,0,0));
        pnTexto.setBackground(new Color(0,0,0,0));
        
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this, false);
        
        RSAnimation.setBajar(-240, 25, 1, 2, pnLogo);
        RSAnimation.setSubir(405, 283, 3, 2, pnTexto);
        
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(n <= 100){
                    proBar.setValue(n);
                    n = n + 15;
                }else{
                    t.stop();
                    dispose();
                    HomeBoss hb = new HomeBoss();
                    hb.setVisible(true);
                }
            }        
        };
        
        t = new Timer(100, action);
        t.start();
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
        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        pnLogo = new rspanelcircleborder.RSPanelCircleBorder();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        pnTexto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        proBar = new rojerusan.componentes.RSProgressBarSinText();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido Usuario Jefe - Gestión de Biblioteca");
        setUndecorated(true);

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(171, 153, 105));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(77, 67, 47));
        rSPanelGradiente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnLogo.setBackground(new java.awt.Color(137, 122, 84));
        pnLogo.setColorBorde(new java.awt.Color(255, 255, 255));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/img/Logo de San Vicente de Paul.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnLogoLayout = new javax.swing.GroupLayout(pnLogo);
        pnLogo.setLayout(pnLogoLayout);
        pnLogoLayout.setHorizontalGroup(
            pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pnLogoLayout.setVerticalGroup(
            pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLogoLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        rSPanelGradiente1.add(pnLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 25, 240, 240));

        pnTexto.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proyecto Final - Programación II");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gestión de Biblioteca");

        javax.swing.GroupLayout pnTextoLayout = new javax.swing.GroupLayout(pnTexto);
        pnTexto.setLayout(pnTextoLayout);
        pnTextoLayout.setHorizontalGroup(
            pnTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnTextoLayout.setVerticalGroup(
            pnTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rSPanelGradiente1.add(pnTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 283, 490, -1));

        proBar.setToolTipText("");
        proBar.setValue(20);
        proBar.setColorForeground(new java.awt.Color(137, 122, 84));
        proBar.setGrosorBorde(0);
        rSPanelGradiente1.add(proBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 389, 502, 16));

        rSPanelShadow1.add(rSPanelGradiente1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoadingBossScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingBossScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingBossScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingBossScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadingBossScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private rspanelcircleborder.RSPanelCircleBorder pnLogo;
    private javax.swing.JPanel pnTexto;
    private rojerusan.componentes.RSProgressBarSinText proBar;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    // End of variables declaration//GEN-END:variables
}

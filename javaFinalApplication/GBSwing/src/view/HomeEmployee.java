/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author LUCA
 */
public class HomeEmployee extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public HomeEmployee() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/GestionBiblioteca.png")));
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelGradiente2 = new rspanelgradiente.RSPanelGradiente();
        rSPanelCircleBorder1 = new rspanelcircleborder.RSPanelCircleBorder();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        btnAcerca = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnInicio = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnLibro = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnPrestamo = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnDevolucion = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnHistorial = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnEstudiante = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnLogout = new RSMaterialComponent.RSButtonMaterialIconOne();
        jSeparator1 = new javax.swing.JSeparator();
        panelSlider = new rojerusan.RSPanelsSlider();
        inicioEmployee2 = new view.InicioEmployee();
        estudiante2 = new view.Estudiante();
        libro2 = new view.Libro();
        devolucion1 = new view.Devolucion();
        prestamo2 = new view.Prestamo();
        historial2 = new view.Historial();
        acercaDe2 = new view.AcercaDe();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuario Empleado - Gestión de Biblioteca");
        setUndecorated(true);

        rSPanelGradiente2.setColorPrimario(new java.awt.Color(77, 67, 47));
        rSPanelGradiente2.setColorSecundario(new java.awt.Color(77, 67, 47));
        rSPanelGradiente2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelCircleBorder1.setBackground(new java.awt.Color(137, 122, 84));
        rSPanelCircleBorder1.setColorBorde(new java.awt.Color(255, 255, 255));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/img/Logo de San Vicente de Paul.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rSPanelCircleBorder1Layout = new javax.swing.GroupLayout(rSPanelCircleBorder1);
        rSPanelCircleBorder1.setLayout(rSPanelCircleBorder1Layout);
        rSPanelCircleBorder1Layout.setHorizontalGroup(
            rSPanelCircleBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelCircleBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        rSPanelCircleBorder1Layout.setVerticalGroup(
            rSPanelCircleBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelCircleBorder1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        rSPanelGradiente2.add(rSPanelCircleBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 108, 107));

        btnAcerca.setBackground(new java.awt.Color(77, 67, 47));
        btnAcerca.setText("   ACERCA DE");
        btnAcerca.setBackgroundHover(new java.awt.Color(137, 122, 84));
        btnAcerca.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btnAcerca.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HELP);
        btnAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaActionPerformed(evt);
            }
        });
        rSPanelGradiente2.add(btnAcerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 170, -1));

        btnInicio.setBackground(new java.awt.Color(77, 67, 47));
        btnInicio.setText("   INICIO");
        btnInicio.setBackgroundHover(new java.awt.Color(137, 122, 84));
        btnInicio.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btnInicio.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOME);
        btnInicio.setSelected(true);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        rSPanelGradiente2.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, -1));

        btnLibro.setBackground(new java.awt.Color(77, 67, 47));
        btnLibro.setText("   LIBROS");
        btnLibro.setBackgroundHover(new java.awt.Color(137, 122, 84));
        btnLibro.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btnLibro.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.BOOK);
        btnLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibroActionPerformed(evt);
            }
        });
        rSPanelGradiente2.add(btnLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 170, -1));

        btnPrestamo.setBackground(new java.awt.Color(77, 67, 47));
        btnPrestamo.setText("   PRÉSTAMOS");
        btnPrestamo.setBackgroundHover(new java.awt.Color(137, 122, 84));
        btnPrestamo.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btnPrestamo.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LIBRARY_ADD);
        btnPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamoActionPerformed(evt);
            }
        });
        rSPanelGradiente2.add(btnPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 170, -1));

        btnDevolucion.setBackground(new java.awt.Color(77, 67, 47));
        btnDevolucion.setText("   DEVOLUCIONES");
        btnDevolucion.setBackgroundHover(new java.awt.Color(137, 122, 84));
        btnDevolucion.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btnDevolucion.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LIBRARY_BOOKS);
        btnDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionActionPerformed(evt);
            }
        });
        rSPanelGradiente2.add(btnDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 170, -1));

        btnHistorial.setBackground(new java.awt.Color(77, 67, 47));
        btnHistorial.setText("   HISTORIAL");
        btnHistorial.setBackgroundHover(new java.awt.Color(137, 122, 84));
        btnHistorial.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btnHistorial.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HISTORY);
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        rSPanelGradiente2.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 170, -1));

        btnEstudiante.setBackground(new java.awt.Color(77, 67, 47));
        btnEstudiante.setText("   ESTUDIANTES");
        btnEstudiante.setBackgroundHover(new java.awt.Color(137, 122, 84));
        btnEstudiante.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btnEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudianteActionPerformed(evt);
            }
        });
        rSPanelGradiente2.add(btnEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 170, -1));

        btnLogout.setBackground(new java.awt.Color(77, 67, 47));
        btnLogout.setText("   CERRAR SESIÓN");
        btnLogout.setBackgroundHover(new java.awt.Color(137, 122, 84));
        btnLogout.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btnLogout.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ACCOUNT_CIRCLE);
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        rSPanelGradiente2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 170, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        rSPanelGradiente2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 170, 10));

        inicioEmployee2.setName("inicioEmployee2"); // NOI18N
        panelSlider.add(inicioEmployee2, "card2");

        estudiante2.setName("estudiante2"); // NOI18N
        panelSlider.add(estudiante2, "card3");

        libro2.setName("libro1"); // NOI18N
        panelSlider.add(libro2, "card4");

        devolucion1.setName("devolucion1"); // NOI18N
        panelSlider.add(devolucion1, "card6");

        prestamo2.setName("prestamo2"); // NOI18N
        panelSlider.add(prestamo2, "card5");

        historial2.setName("historial2"); // NOI18N
        panelSlider.add(historial2, "card7");

        acercaDe2.setName("acercaDe2"); // NOI18N
        panelSlider.add(acercaDe2, "card8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelGradiente2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelGradiente2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(panelSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibroActionPerformed
        if (!btnLibro.isSelected()) {
            btnInicio.setSelected(false);
            btnEstudiante.setSelected(false);
            btnLibro.setSelected(true);
            btnPrestamo.setSelected(false);
            btnDevolucion.setSelected(false);
            btnHistorial.setSelected(false);
            btnAcerca.setSelected(false);

            panelSlider.setPanelSlider(1, libro2, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btnLibroActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        if (!btnHistorial.isSelected()) {
            btnInicio.setSelected(false);
            btnEstudiante.setSelected(false);
            btnLibro.setSelected(false);
            btnPrestamo.setSelected(false);
            btnDevolucion.setSelected(false);
            btnHistorial.setSelected(true);
            btnAcerca.setSelected(false);

            panelSlider.setPanelSlider(1, historial2, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        if (!btnInicio.isSelected()) {
            btnInicio.setSelected(true);
            btnEstudiante.setSelected(false);
            btnLibro.setSelected(false);
            btnPrestamo.setSelected(false);
            btnDevolucion.setSelected(false);
            btnHistorial.setSelected(false);
            btnAcerca.setSelected(false);

            panelSlider.setPanelSlider(1, inicioEmployee2, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudianteActionPerformed
        if (!btnEstudiante.isSelected()) {
            btnInicio.setSelected(false);
            btnEstudiante.setSelected(true);
            btnLibro.setSelected(false);
            btnPrestamo.setSelected(false);
            btnDevolucion.setSelected(false);
            btnHistorial.setSelected(false);
            btnAcerca.setSelected(false);

            panelSlider.setPanelSlider(1, estudiante2, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btnEstudianteActionPerformed

    private void btnPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamoActionPerformed
        if (!btnPrestamo.isSelected()) {
            btnInicio.setSelected(false);
            btnEstudiante.setSelected(false);
            btnLibro.setSelected(false);
            btnPrestamo.setSelected(true);
            btnDevolucion.setSelected(false);
            btnHistorial.setSelected(false);
            btnAcerca.setSelected(false);

            panelSlider.setPanelSlider(1, prestamo2, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btnPrestamoActionPerformed

    private void btnDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionActionPerformed
        if (!btnDevolucion.isSelected()) {
            btnInicio.setSelected(false);
            btnEstudiante.setSelected(false);
            btnLibro.setSelected(false);
            btnPrestamo.setSelected(false);
            btnDevolucion.setSelected(true);
            btnHistorial.setSelected(false);
            btnAcerca.setSelected(false);

            panelSlider.setPanelSlider(1, devolucion1, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btnDevolucionActionPerformed

    private void btnAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaActionPerformed
        if (!btnAcerca.isSelected()) {
            btnInicio.setSelected(false);
            btnEstudiante.setSelected(false);
            btnLibro.setSelected(false);
            btnPrestamo.setSelected(false);
            btnDevolucion.setSelected(false);
            btnHistorial.setSelected(false);
            btnAcerca.setSelected(true);

            panelSlider.setPanelSlider(1, acercaDe2, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btnAcercaActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro de Cerrar Sesión?", "MENSAJE", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            LoadingCloseScreen lc = new LoadingCloseScreen();
            this.setVisible(false);
            lc.setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(HomeEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.AcercaDe acercaDe2;
    private RSMaterialComponent.RSButtonMaterialIconOne btnAcerca;
    private RSMaterialComponent.RSButtonMaterialIconOne btnDevolucion;
    private RSMaterialComponent.RSButtonMaterialIconOne btnEstudiante;
    private RSMaterialComponent.RSButtonMaterialIconOne btnHistorial;
    private RSMaterialComponent.RSButtonMaterialIconOne btnInicio;
    private RSMaterialComponent.RSButtonMaterialIconOne btnLibro;
    private RSMaterialComponent.RSButtonMaterialIconOne btnLogout;
    private RSMaterialComponent.RSButtonMaterialIconOne btnPrestamo;
    private view.Devolucion devolucion1;
    private view.Estudiante estudiante2;
    private view.Historial historial2;
    private view.InicioEmployee inicioEmployee2;
    private javax.swing.JSeparator jSeparator1;
    private view.Libro libro2;
    private rojerusan.RSPanelsSlider panelSlider;
    private view.Prestamo prestamo2;
    private rspanelcircleborder.RSPanelCircleBorder rSPanelCircleBorder1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente2;
    private rojerusan.RSPanelImage rSPanelImage1;
    // End of variables declaration//GEN-END:variables
}

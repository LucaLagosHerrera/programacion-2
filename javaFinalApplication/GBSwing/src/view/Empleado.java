/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author LUCA
 */
public class Empleado extends javax.swing.JPanel {

    /**
     * Creates new form Inicio
     */
    public Empleado() {
        initComponents();
        bbdd.Consulta_Empleado.listarEmpleado("");
        this.lbError.setText("");
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
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new RSMaterialComponent.RSButtonIconOne();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new RSMaterialComponent.RSTextFieldMaterial();
        jSeparator2 = new javax.swing.JSeparator();
        txtNombre = new RSMaterialComponent.RSTextFieldMaterial();
        txtApellido = new RSMaterialComponent.RSTextFieldMaterial();
        txtEmail = new RSMaterialComponent.RSTextFieldMaterial();
        lbError = new javax.swing.JLabel();
        btnGuardar = new RSMaterialComponent.RSButtonIconOne();
        btnEditar = new RSMaterialComponent.RSButtonIconOne();
        btnEliminar = new RSMaterialComponent.RSButtonIconOne();
        btnBorrar = new RSMaterialComponent.RSButtonIconOne();
        txtPassword = new RSMaterialComponent.RSTextFieldMaterial();
        txtRespuesta = new RSMaterialComponent.RSTextFieldMaterial();
        cbPregunta = new RSMaterialComponent.RSComboBoxMaterial();
        cbRol = new RSMaterialComponent.RSComboBoxMaterial();
        txtDni = new RSMaterialComponent.RSTextFieldMaterial();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEmpleado = new rojerusan.RSTableMetro();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1029, 603));

        jPanel1.setBackground(new java.awt.Color(137, 122, 84));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión de Biblioteca - Programación II");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Empleados");

        btnSalir.setBackground(new java.awt.Color(204, 0, 0));
        btnSalir.setBackgroundHover(new java.awt.Color(255, 51, 51));
        btnSalir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(137, 122, 84));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PANEL DE EMPLEADOS");

        jSeparator1.setBackground(new java.awt.Color(137, 122, 84));
        jSeparator1.setForeground(new java.awt.Color(137, 122, 84));
        jSeparator1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(137, 122, 84));

        txtBuscar.setForeground(new java.awt.Color(51, 51, 51));
        txtBuscar.setColorMaterial(new java.awt.Color(77, 67, 47));
        txtBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtBuscar.setPhColor(new java.awt.Color(0, 0, 0));
        txtBuscar.setPlaceholder("Buscar...");
        txtBuscar.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        txtNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre.setColorMaterial(new java.awt.Color(77, 67, 47));
        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre.setPhColor(new java.awt.Color(0, 0, 0));
        txtNombre.setPlaceholder("Nombre");
        txtNombre.setSelectionColor(new java.awt.Color(0, 0, 0));

        txtApellido.setForeground(new java.awt.Color(51, 51, 51));
        txtApellido.setColorMaterial(new java.awt.Color(77, 67, 47));
        txtApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtApellido.setPhColor(new java.awt.Color(0, 0, 0));
        txtApellido.setPlaceholder("Apellido");
        txtApellido.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtEmail.setForeground(new java.awt.Color(51, 51, 51));
        txtEmail.setColorMaterial(new java.awt.Color(77, 67, 47));
        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEmail.setPhColor(new java.awt.Color(0, 0, 0));
        txtEmail.setPlaceholder("Correo Electronico");
        txtEmail.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lbError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbError.setForeground(new java.awt.Color(204, 0, 0));
        lbError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbError.setText("Ingrese los datos correctos!");

        btnGuardar.setBackground(new java.awt.Color(0, 153, 102));
        btnGuardar.setBackgroundHover(new java.awt.Color(0, 255, 102));
        btnGuardar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CHECK_CIRCLE);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(51, 51, 255));
        btnEditar.setBackgroundHover(new java.awt.Color(153, 153, 255));
        btnEditar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CREATE);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setBackgroundHover(new java.awt.Color(255, 102, 102));
        btnEliminar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(255, 153, 0));
        btnBorrar.setBackgroundHover(new java.awt.Color(255, 204, 102));
        btnBorrar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CANCEL);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        txtPassword.setForeground(new java.awt.Color(51, 51, 51));
        txtPassword.setColorMaterial(new java.awt.Color(77, 67, 47));
        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPassword.setPhColor(new java.awt.Color(0, 0, 0));
        txtPassword.setPlaceholder("Contraseña");
        txtPassword.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtRespuesta.setForeground(new java.awt.Color(51, 51, 51));
        txtRespuesta.setColorMaterial(new java.awt.Color(77, 67, 47));
        txtRespuesta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRespuesta.setPhColor(new java.awt.Color(0, 0, 0));
        txtRespuesta.setPlaceholder("Respuesta");
        txtRespuesta.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespuestaActionPerformed(evt);
            }
        });

        cbPregunta.setForeground(new java.awt.Color(51, 51, 51));
        cbPregunta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "¿Cuál es tu Apellido Materno?", "¿Cuál es tu apodo?", "¿Cuál es tu primer amigo de la infancia?", "¿Cuál es el nombre de tu Escuela?", "¿Cuál es el nombre de tu mascota favorita?" }));
        cbPregunta.setColorMaterial(new java.awt.Color(77, 67, 47));
        cbPregunta.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cbPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPreguntaActionPerformed(evt);
            }
        });

        cbRol.setForeground(new java.awt.Color(51, 51, 51));
        cbRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Empleado", "Jefe" }));
        cbRol.setColorMaterial(new java.awt.Color(77, 67, 47));
        cbRol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRolActionPerformed(evt);
            }
        });

        txtDni.setForeground(new java.awt.Color(51, 51, 51));
        txtDni.setColorMaterial(new java.awt.Color(77, 67, 47));
        txtDni.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDni.setPhColor(new java.awt.Color(0, 0, 0));
        txtDni.setPlaceholder("DNI");
        txtDni.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRespuesta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbError, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        tbEmpleado.setForeground(new java.awt.Color(51, 51, 51));
        tbEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "DNI", "Rol", "Correo Electronico", "Contraseña", "Pregunta", "Respuesta"
            }
        ));
        tbEmpleado.setAltoHead(20);
        tbEmpleado.setColorBackgoundHead(new java.awt.Color(137, 122, 84));
        tbEmpleado.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        tbEmpleado.setColorBordeHead(new java.awt.Color(204, 204, 204));
        tbEmpleado.setColorFilasForeground1(new java.awt.Color(177, 153, 105));
        tbEmpleado.setColorFilasForeground2(new java.awt.Color(177, 153, 105));
        tbEmpleado.setColorSelBackgound(new java.awt.Color(177, 153, 105));
        tbEmpleado.setSelectionBackground(new java.awt.Color(137, 122, 84));
        tbEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbEmpleado);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespuestaActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void cbPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPreguntaActionPerformed

    private void cbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRolActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        model.Empleado e = new model.Empleado();
        validation.Validacion_Empleado v = new validation.Validacion_Empleado();
        encryptation.Encriptacion_Empleado en = new encryptation.Encriptacion_Empleado();
        e.setNombre(this.txtNombre.getText());
        e.setApellido(this.txtApellido.getText());
        e.setDni(this.txtDni.getText());
        e.setRol((String) this.cbRol.getSelectedItem());
        e.setEmail(this.txtEmail.getText());
        e.setPassword(this.txtPassword.getText());
        e.setPregunta((String) this.cbPregunta.getSelectedItem());
        e.setRespuesta(this.txtRespuesta.getText());
        String password = e.password;
        String pasEnc = en.encriptarPassword(password);
        if (v.validarEmpleado(this.txtNombre, this.txtApellido, this.txtDni, this.txtEmail, this.txtPassword, this.txtRespuesta, this.lbError) == true) {
            if (bbdd.Consulta_Empleado.buscarEmailEmpleado(e, this.lbError) == false) {
                if (bbdd.Consulta_Empleado.buscarRespuestaEmpleado(e, lbError) == false) {
                    if (bbdd.Consulta_Empleado.buscarEmpleadoRegistrado(e, lbError) == false) {
                        if (bbdd.Consulta_Empleado.registrarEmpleado(e, pasEnc)) {
                            bbdd.Consulta_Empleado.listarEmpleado("");
                            view.SuccessAlert sa = new view.SuccessAlert();
                            sa.setVisible(true);
                            sa.setLocationRelativeTo(null);
                            sa.setResizable(false);
                        } else {
                            view.DangerAlert da = new view.DangerAlert();
                            da.setVisible(true);
                            da.setLocationRelativeTo(null);
                            da.setResizable(false);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        model.Empleado e = new model.Empleado();
        validation.Validacion_Empleado v = new validation.Validacion_Empleado();
        encryptation.Encriptacion_Empleado en = new encryptation.Encriptacion_Empleado();
        e.setNombre(this.txtNombre.getText());
        e.setApellido(this.txtApellido.getText());
        e.setDni(this.txtDni.getText());
        e.setRol((String) this.cbRol.getSelectedItem());
        e.setEmail(this.txtEmail.getText());
        e.setPassword(this.txtPassword.getText());
        e.setPregunta((String) this.cbPregunta.getSelectedItem());
        e.setRespuesta(this.txtRespuesta.getText());
        String password = e.password;
        String pasEnc = en.encriptarPassword(password);
        if (v.validarEmpleado(this.txtNombre, this.txtApellido, this.txtDni, this.txtEmail, this.txtPassword, this.txtRespuesta, this.lbError) == true) {
            if (bbdd.Consulta_Empleado.buscarRespuestaEmpleado(e, lbError) == false) {
                if (bbdd.Consulta_Empleado.buscarEmpleadoEditado(e, lbError) == true) {
                    if (bbdd.Consulta_Empleado.editarEmpleado(e, pasEnc)) {
                        bbdd.Consulta_Empleado.listarEmpleado("");
                        view.SuccessAlert sa = new view.SuccessAlert();
                        sa.setVisible(true);
                        sa.setLocationRelativeTo(null);
                        sa.setResizable(false);
                    } else {
                        view.DangerAlert da = new view.DangerAlert();
                        da.setVisible(true);
                        da.setLocationRelativeTo(null);
                        da.setResizable(false);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        model.Empleado e = new model.Empleado();
        validation.Validacion_Empleado v = new validation.Validacion_Empleado();
        e.setDni(this.txtDni.getText());
        if (v.validarEmpleado(this.txtNombre, this.txtApellido, this.txtDni, this.txtEmail, this.txtPassword, this.txtRespuesta, this.lbError) == true) {
            if (bbdd.Consulta_Empleado.buscarEmpleadoEliminar(e, lbError) == true) {
                if (JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este empleado?", "MENSAJE", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    if (bbdd.Consulta_Empleado.eliminarEmpleado(e)) {
                        bbdd.Consulta_Empleado.listarEmpleado("");
                        this.txtNombre.setText("");
                        this.txtApellido.setText("");
                        this.txtDni.setText("");
                        this.txtEmail.setText("");
                        this.txtPassword.setText("");
                        this.txtRespuesta.setText("");
                        this.lbError.setText("");
                        SuccessAlert sa = new SuccessAlert();
                        sa.setVisible(true);
                        sa.setLocationRelativeTo(null);
                        sa.setResizable(false);
                    } else {
                        DangerAlert da = new DangerAlert();
                        da.setVisible(true);
                        da.setLocationRelativeTo(null);
                        da.setResizable(false);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        this.txtNombre.setText("");
        this.txtApellido.setText("");
        this.txtDni.setText("");
        this.txtEmail.setText("");
        this.txtPassword.setText("");
        this.txtRespuesta.setText("");
        this.lbError.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void tbEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEmpleadoMouseClicked
        encryptation.Encriptacion_Empleado en = new encryptation.Encriptacion_Empleado();
        int fila = this.tbEmpleado.getSelectedRow();
        this.txtNombre.setText(this.tbEmpleado.getValueAt(fila, 1).toString());
        this.txtApellido.setText(this.tbEmpleado.getValueAt(fila, 2).toString());
        this.txtDni.setText(this.tbEmpleado.getValueAt(fila, 3).toString());
        this.cbRol.setSelectedItem(this.tbEmpleado.getValueAt(fila, 4));
        this.txtEmail.setText(this.tbEmpleado.getValueAt(fila, 5).toString());
        String password = this.tbEmpleado.getValueAt(fila, 6).toString();
        String pasDec = en.desencriptarPassword(password);
        this.txtPassword.setText(pasDec);
        this.cbPregunta.setSelectedItem(this.tbEmpleado.getValueAt(fila, 7));
        this.txtRespuesta.setText(this.tbEmpleado.getValueAt(fila, 8).toString());
    }//GEN-LAST:event_tbEmpleadoMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        bbdd.Consulta_Empleado.listarEmpleado(this.txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonIconOne btnBorrar;
    private RSMaterialComponent.RSButtonIconOne btnEditar;
    private RSMaterialComponent.RSButtonIconOne btnEliminar;
    private RSMaterialComponent.RSButtonIconOne btnGuardar;
    private RSMaterialComponent.RSButtonIconOne btnSalir;
    public RSMaterialComponent.RSComboBoxMaterial cbPregunta;
    public RSMaterialComponent.RSComboBoxMaterial cbRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel lbError;
    public static rojerusan.RSTableMetro tbEmpleado;
    public RSMaterialComponent.RSTextFieldMaterial txtApellido;
    private RSMaterialComponent.RSTextFieldMaterial txtBuscar;
    public RSMaterialComponent.RSTextFieldMaterial txtDni;
    public RSMaterialComponent.RSTextFieldMaterial txtEmail;
    public RSMaterialComponent.RSTextFieldMaterial txtNombre;
    public RSMaterialComponent.RSTextFieldMaterial txtPassword;
    public RSMaterialComponent.RSTextFieldMaterial txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
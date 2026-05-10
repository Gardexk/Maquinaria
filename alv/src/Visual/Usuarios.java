package Visual;

import Controlador.Ctrl_Usuario;
import Dashboard.Menú;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import conexion.Conexion;
import Modelo.Usuario;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Usuarios extends javax.swing.JPanel {
    
    int iduser;

    
    public Usuarios() {
        initComponents();
        CargarTablasUsuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar2 = new javax.swing.JScrollBar();
        presentaciontxt = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        pbuscar = new javax.swing.JPanel();
        buscartxt = new javax.swing.JLabel();
        popciones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Usuario = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        combousuario = new javax.swing.JComboBox<>();
        peliminar = new javax.swing.JPanel();
        Boton_eliminar = new javax.swing.JLabel();
        pactualizar = new javax.swing.JPanel();
        Boton_actualizar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        presentaciontxt.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        presentaciontxt.setText("Usuarios");

        txt_buscar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_buscar.setForeground(new java.awt.Color(204, 204, 204));
        txt_buscar.setText("Ingrese el nombre de usuario a buscar");
        txt_buscar.setBorder(null);
        txt_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_buscarFocusGained(evt);
            }
        });
        txt_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_buscarMousePressed(evt);
            }
        });
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscarKeyPressed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 153, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));

        pbuscar.setBackground(new java.awt.Color(255, 153, 0));

        buscartxt.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        buscartxt.setForeground(new java.awt.Color(255, 255, 255));
        buscartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscartxt.setText("Buscar");
        buscartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscartxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscartxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscartxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pbuscarLayout = new javax.swing.GroupLayout(pbuscar);
        pbuscar.setLayout(pbuscarLayout);
        pbuscarLayout.setHorizontalGroup(
            pbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );
        pbuscarLayout.setVerticalGroup(
            pbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        popciones.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout popcionesLayout = new javax.swing.GroupLayout(popciones);
        popciones.setLayout(popcionesLayout);
        popcionesLayout.setHorizontalGroup(
            popcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        popcionesLayout.setVerticalGroup(
            popcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jTable_Usuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable_Usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Usuario", "Contraseña", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Usuario);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Tipo de usuario");

        jLabel20.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Nombre:");

        jLabel21.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Usuario:");

        jLabel22.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Contraseña:");

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Telefono:");

        txt_usuario.setBorder(null);

        txt_nombre.setBorder(null);

        txt_contraseña.setBorder(null);

        txt_telefono.setBorder(null);

        jSeparator15.setForeground(new java.awt.Color(255, 133, 0));

        jSeparator16.setForeground(new java.awt.Color(255, 133, 0));

        jSeparator17.setForeground(new java.awt.Color(255, 133, 0));

        jSeparator18.setForeground(new java.awt.Color(255, 133, 0));

        jSeparator19.setForeground(new java.awt.Color(255, 133, 0));

        combousuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        combousuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el tipo de usuario", "Administrador", "Usuario" }));
        combousuario.setBorder(null);
        combousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combousuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator15)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(combousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator16)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jSeparator17)
                    .addComponent(txt_usuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator16, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                                .addComponent(jSeparator17)
                                .addComponent(jSeparator19)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        peliminar.setBackground(new java.awt.Color(255, 153, 0));

        Boton_eliminar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Boton_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Boton_eliminar.setText("Eliminar");
        Boton_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_eliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout peliminarLayout = new javax.swing.GroupLayout(peliminar);
        peliminar.setLayout(peliminarLayout);
        peliminarLayout.setHorizontalGroup(
            peliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Boton_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        peliminarLayout.setVerticalGroup(
            peliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Boton_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pactualizar.setBackground(new java.awt.Color(255, 153, 0));

        Boton_actualizar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Boton_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_actualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Boton_actualizar.setText("Actualizar");
        Boton_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_actualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pactualizarLayout = new javax.swing.GroupLayout(pactualizar);
        pactualizar.setLayout(pactualizarLayout);
        pactualizarLayout.setHorizontalGroup(
            pactualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Boton_actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        );
        pactualizarLayout.setVerticalGroup(
            pactualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Boton_actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(popciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(228, 228, 228)
                        .addComponent(pactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(peliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(presentaciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                                    .addComponent(jSeparator1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(presentaciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(popciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(peliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_buscarMousePressed
       
    }//GEN-LAST:event_txt_buscarMousePressed

    private void buscartxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscartxtMouseEntered
        pbuscar.setBackground(new Color (255, 160, 30));
    }//GEN-LAST:event_buscartxtMouseEntered

    private void buscartxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscartxtMouseExited
        pbuscar.setBackground(new Color(222, 137, 21));
    }//GEN-LAST:event_buscartxtMouseExited

    private void buscartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscartxtMouseClicked
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_buscartxtMouseClicked

    private void Boton_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_actualizarMouseClicked
        
        Usuario usuario = new Usuario();
        Ctrl_Usuario ctrl_Usuario = new Ctrl_Usuario();
        
        String tipousuario="";
        tipousuario=combousuario.getSelectedItem().toString().trim();
        
        if(txt_usuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione un usuario de la Tabla");
        }else{
            if (tipousuario.equalsIgnoreCase("Selecciona el tipo de usuario")) {
                JOptionPane.showMessageDialog(null, "Selecciona el tipo de usuario");
            }else{
             
                try {
                    
                    if (tipousuario.equalsIgnoreCase("Administrador")) {
                        usuario.setTipoUsuario("Administrador");
                    } else if (tipousuario.equalsIgnoreCase("Usuario")) {
                        usuario.setTipoUsuario("Usuario");
                    }
                    
                    usuario.setNomUsuario(txt_nombre.getText().trim());
                    usuario.setTelefono(txt_telefono.getText().trim());
                    usuario.setUsuario(txt_usuario.getText().trim());
                    usuario.setPassword(txt_contraseña.getText().trim());

                    if (ctrl_Usuario.actualizar(usuario, iduser)) {
                        JOptionPane.showMessageDialog(null, "El registro se actualizo");
                        CargarTablasUsuario();
                        Limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al actualizar");
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    System.out.println("Error en: " + e);
                }
                
            }
            
            
        }
        
    }//GEN-LAST:event_Boton_actualizarMouseClicked

    private void Boton_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_eliminarMouseClicked

        Ctrl_Usuario ctrl_Usuario = new Ctrl_Usuario();
        
        if (iduser == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario de la tabla");
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
            
            if(resp==0){
                if (ctrl_Usuario.eliminar(iduser)) {
                JOptionPane.showMessageDialog(null, "Usuario Eliminado");
                CargarTablasUsuario();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar al usuario");
            }
            }else{
                Limpiar();
            }
        }
    }//GEN-LAST:event_Boton_eliminarMouseClicked

    private void combousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combousuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combousuarioActionPerformed

    private void txt_buscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_buscarFocusGained
        // TODO add your handling code here:
        txt_buscar.setText("");
    }//GEN-LAST:event_txt_buscarFocusGained

    private void txt_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           buscar();
        }
    }//GEN-LAST:event_txt_buscarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Boton_actualizar;
    private javax.swing.JLabel Boton_eliminar;
    private javax.swing.JLabel buscartxt;
    private javax.swing.JComboBox<String> combousuario;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JTable jTable_Usuario;
    private javax.swing.JPanel pactualizar;
    private javax.swing.JPanel pbuscar;
    private javax.swing.JPanel peliminar;
    private javax.swing.JPanel popciones;
    private javax.swing.JLabel presentaciontxt;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables


    private void CargarTablasUsuario() {
        Connection con = conexion.Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select id_usuario, tipo_usuario, nom_usuario, usuario, password, telefono  from usuario order by id_usuario asc;";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            jTable_Usuario = new JTable(model);
            jScrollPane1.setViewportView(jTable_Usuario);
            
           
            model.addColumn("N°");
            model.addColumn("Tipo de usuario");
            model.addColumn("Nombre");
            model.addColumn("Usuario");
            model.addColumn("Contraseña");
            model.addColumn("Telefono");
           

            while (rs.next()) {

                Object fila[] = new Object[6];

                for (int i = 0; i < 6; i++) {

                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla usuario" + e);
        }
        jTable_Usuario.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Menú.ShowJPanel(new ActuCliente());
                int fila_point = jTable_Usuario.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    iduser = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosUsuarioSeleccionado(iduser);
                }
            }
        });
    }
    private void EnviarDatosUsuarioSeleccionado(int id_usuario) {
        try {
            Connection con = conexion.Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from usuario where id_usuario='" + id_usuario + "';");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_nombre.setText(rs.getString("nom_usuario"));
                txt_usuario.setText(rs.getString("usuario"));
                txt_contraseña.setText(rs.getString("password"));
                txt_telefono.setText(rs.getString("telefono"));
                
                
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al enviar los datos del usuario" + e);
        }
    }
    
    
    private void buscar(){
        String nombre;
        nombre= txt_buscar.getText().trim();
        
        Connection con = conexion.Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select id_usuario, tipo_usuario, nom_usuario, usuario, password, telefono  from usuario where nom_usuario ~* '" + nombre +"';";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            jTable_Usuario = new JTable(model);
            jScrollPane1.setViewportView(jTable_Usuario);
            
           
             model.addColumn("N°");//id
            model.addColumn("Tipo de usuario");//id
            model.addColumn("Nombre");
            model.addColumn("Usuario");
            model.addColumn("Contraseña");
            model.addColumn("Telefono");
           

            while (rs.next()) {

                Object fila[] = new Object[6];

                for (int i = 0; i < 6; i++) {

                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla clientes" + e);
        }
        jTable_Usuario.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Menú.ShowJPanel(new ActuCliente());
                int fila_point = jTable_Usuario.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    iduser = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosUsuarioSeleccionado(iduser);
                }
            }
        });
    }
    
    public void Limpiar(){
        txt_contraseña.setText("");
        txt_nombre.setText("");
        txt_telefono.setText("");
        txt_usuario.setText("");
        txt_usuario.setText("");
        combousuario.setSelectedIndex(0);
        
    }
    
}

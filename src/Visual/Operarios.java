package Visual;


import Controlador.Ctrl_Operario;
import Dashboard.Menú;
import Modelo.Operario;
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
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Operarios extends javax.swing.JPanel {
    
    int idope;

    
    public Operarios() {
        initComponents();
        CargarTablasOperario();
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
        jTable_operario = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_nombreoperario = new javax.swing.JTextField();
        txt_direccionoperario = new javax.swing.JTextField();
        txt_emailoperario = new javax.swing.JTextField();
        txt_telefonooperario = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        peliminar = new javax.swing.JPanel();
        boton_Eliminar = new javax.swing.JLabel();
        pactualizar = new javax.swing.JPanel();
        Boton_actualizar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        presentaciontxt.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        presentaciontxt.setText("Operarios");

        txt_buscar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_buscar.setForeground(new java.awt.Color(204, 204, 204));
        txt_buscar.setText("Ingrese el nombre de operario a buscar");
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

        jTable_operario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable_operario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Direccion", "Telefono", "Email"
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
        jScrollPane1.setViewportView(jTable_operario);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Nombre:");

        jLabel21.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Direccion:");

        jLabel22.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Email:");

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Telefono:");

        txt_nombreoperario.setBorder(null);

        txt_direccionoperario.setBorder(null);

        txt_emailoperario.setBorder(null);

        txt_telefonooperario.setBorder(null);

        jSeparator16.setForeground(new java.awt.Color(255, 133, 0));

        jSeparator17.setForeground(new java.awt.Color(255, 133, 0));

        jSeparator18.setForeground(new java.awt.Color(255, 133, 0));

        jSeparator19.setForeground(new java.awt.Color(255, 133, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_nombreoperario, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator16))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_direccionoperario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jSeparator17))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_emailoperario, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(jSeparator18)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator19)
                            .addComponent(txt_telefonooperario))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombreoperario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_direccionoperario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_emailoperario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefonooperario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator16, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                        .addComponent(jSeparator17)
                        .addComponent(jSeparator19)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        peliminar.setBackground(new java.awt.Color(255, 153, 0));

        boton_Eliminar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        boton_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        boton_Eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_Eliminar.setText("Eliminar");
        boton_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_EliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout peliminarLayout = new javax.swing.GroupLayout(peliminar);
        peliminar.setLayout(peliminarLayout);
        peliminarLayout.setHorizontalGroup(
            peliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        peliminarLayout.setVerticalGroup(
            peliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(presentaciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                                    .addComponent(jSeparator1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
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

        Operario operario = new Operario();
        Ctrl_Operario controlOperario = new Ctrl_Operario();
        
        if(txt_nombreoperario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione un operador/a de la Tabla");
        }else{
            
            try {
                operario.setNomOperario(txt_nombreoperario.getText().trim());
                operario.setDireccion(txt_direccionoperario.getText().trim());
                operario.setCorreo(txt_emailoperario.getText().trim());
                operario.setTelefono(txt_telefonooperario.getText().trim());
                
                if(controlOperario.actualizar(operario, idope)){
                    JOptionPane.showMessageDialog(null, "El registro se actualizo");
                    CargarTablasOperario();
                    Limpiar();
                }else{
                    JOptionPane.showMessageDialog(null, "Error al actualizar");
                }
            } catch (HeadlessException | NumberFormatException e) {
                System.out.println("Error en: " + e);
            }
            
        }
    }//GEN-LAST:event_Boton_actualizarMouseClicked

    private void boton_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_EliminarMouseClicked
        
        Ctrl_Operario ctrl_Operario = new Ctrl_Operario();
        
        if (idope == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un operario/a de la tabla.");
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
            
            if(resp==0){
                if (ctrl_Operario.eliminar(idope)) {
                JOptionPane.showMessageDialog(null, "Operario eliminado/a");
                CargarTablasOperario();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar al operario/a");
            }
            }else{
                Limpiar();
            }
        }
    }//GEN-LAST:event_boton_EliminarMouseClicked

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
    private javax.swing.JLabel boton_Eliminar;
    private javax.swing.JLabel buscartxt;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JTable jTable_operario;
    private javax.swing.JPanel pactualizar;
    private javax.swing.JPanel pbuscar;
    private javax.swing.JPanel peliminar;
    private javax.swing.JPanel popciones;
    private javax.swing.JLabel presentaciontxt;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_direccionoperario;
    private javax.swing.JTextField txt_emailoperario;
    private javax.swing.JTextField txt_nombreoperario;
    private javax.swing.JTextField txt_telefonooperario;
    // End of variables declaration//GEN-END:variables


    private void CargarTablasOperario() {
        Connection con = conexion.Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select id_operario, nombre, direccion, telefono, email from operarios;";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            jTable_operario = new JTable(model);
            jScrollPane1.setViewportView(jTable_operario);
            
           

            model.addColumn("ID°");//id
            model.addColumn("Operario");
            model.addColumn("Direccion");
            model.addColumn("Telefono");
            model.addColumn("Correo Electronico");
           

            while (rs.next()) {

                Object fila[] = new Object[5];

                for (int i = 0; i < 5; i++) {

                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla Operarios" + e);
        }
        jTable_operario.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Menú.ShowJPanel(new ActuCliente());
                int fila_point = jTable_operario.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idope = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosOperarioSeleccionado(idope);
                }
            }
        });
    }
    private void EnviarDatosOperarioSeleccionado(int id_operario) {
        try {
            Connection con = conexion.Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from operarios where id_operario='" + id_operario + "';");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                //txt_idoperario.setText(rs.getString("id_operario"));
                txt_nombreoperario.setText(rs.getString("nombre"));
                txt_direccionoperario.setText(rs.getString("direccion"));
                txt_emailoperario.setText(rs.getString("email"));
                txt_telefonooperario.setText(rs.getString("telefono"));
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al selecionar al operario" + e);
        }
    }
    
    
    private void buscar(){
        String nombre;
        nombre= txt_buscar.getText().trim();
        
        Connection con = conexion.Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select * from operarios where nombre ~* '" + nombre +"';";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            jTable_operario = new JTable(model);
            jScrollPane1.setViewportView(jTable_operario);
            
           

            model.addColumn("ID°");//id
            model.addColumn("Operario");
            model.addColumn("Direccion");
            model.addColumn("Telefono");
            model.addColumn("Correo Electronico");
           

            while (rs.next()) {

                Object fila[] = new Object[5];

                for (int i = 0; i < 5; i++) {

                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla operario" + e);
        }
        
        jTable_operario.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Menú.ShowJPanel(new ActuCliente());
                int fila_point = jTable_operario.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idope = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosOperarioSeleccionado(idope);
                }
            }
        });
    }
    
    public void Limpiar(){
        txt_direccionoperario.setText("");
        txt_emailoperario.setText("");
        txt_nombreoperario.setText("");
        txt_telefonooperario.setText("");
    }
    
    
}

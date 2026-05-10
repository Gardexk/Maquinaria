package Visual;

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
import javax.swing.JOptionPane;
import Controlador.Ctrl_Maquina;
import java.awt.HeadlessException;
import Modelo.Maquina;
import java.awt.event.KeyEvent;

public class Maquinas extends javax.swing.JPanel {

    int idmaq;

    
    public Maquinas() {
        initComponents();
        CargarTablasMaquina();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_maquina = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_marcamaquina = new javax.swing.JTextField();
        txt_modelomaquina = new javax.swing.JTextField();
        txt_preciomaquina = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        comboestado = new javax.swing.JComboBox<>();
        combotipo = new javax.swing.JComboBox<>();
        peliminar = new javax.swing.JPanel();
        boton_eliminar = new javax.swing.JLabel();
        pactualizar = new javax.swing.JPanel();
        Boton_actualizar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        presentaciontxt.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        presentaciontxt.setText("Maquinas");

        txt_buscar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_buscar.setForeground(new java.awt.Color(204, 204, 204));
        txt_buscar.setText("Ingrese el tipo de maquinaria a buscar");
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
        pbuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pbuscar.add(buscartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 69, 27));

        jTable_maquina.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable_maquina.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Marca", "Modelo", "Estado", "Precio renta"
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
        jScrollPane1.setViewportView(jTable_maquina);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Marca:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 50, -1));

        jLabel21.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Modelo:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 60, -1));

        jLabel22.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Estado:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 90, -1));

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Precio renta:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 100, -1));

        txt_marcamaquina.setBorder(null);
        jPanel3.add(txt_marcamaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 160, -1));

        txt_modelomaquina.setBorder(null);
        jPanel3.add(txt_modelomaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 100, -1));

        txt_preciomaquina.setBorder(null);
        jPanel3.add(txt_preciomaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 140, -1));

        jSeparator15.setForeground(new java.awt.Color(255, 133, 0));
        jPanel3.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 140, 10));

        jLabel24.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Tipo de Maquina");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 120, -1));

        jSeparator22.setForeground(new java.awt.Color(255, 133, 0));
        jPanel3.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 160, 10));

        jSeparator23.setForeground(new java.awt.Color(255, 133, 0));
        jPanel3.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 170, 10));

        jSeparator24.setForeground(new java.awt.Color(255, 133, 0));
        jPanel3.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 100, 10));

        jSeparator25.setForeground(new java.awt.Color(255, 133, 0));
        jPanel3.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 150, 10));

        comboestado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        comboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estado de la maquina", "Disponible", "Alquilada", "Reparacion" }));
        comboestado.setBorder(null);
        comboestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboestadoActionPerformed(evt);
            }
        });
        jPanel3.add(comboestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 150, -1));

        combotipo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        combotipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el tipo de maquina", "Bulldozer", "Excavadora", "Miniexcavadora", "Retroexcavadora", "Minicargador", "Motoniveladoras", "Camiones articulados" }));
        combotipo.setBorder(null);
        combotipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotipoActionPerformed(evt);
            }
        });
        jPanel3.add(combotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 160, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 840, 84));

        peliminar.setBackground(new java.awt.Color(255, 153, 0));

        boton_eliminar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        boton_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        boton_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_eliminar.setText("Eliminar");
        boton_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_eliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout peliminarLayout = new javax.swing.GroupLayout(peliminar);
        peliminar.setLayout(peliminarLayout);
        peliminarLayout.setHorizontalGroup(
            peliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        peliminarLayout.setVerticalGroup(
            peliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
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
                .addComponent(presentaciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(pactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(peliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(presentaciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
       buscar();
    }//GEN-LAST:event_buscartxtMouseClicked

    private void Boton_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_actualizarMouseClicked
      
        Maquina maquina = new Maquina();
        Ctrl_Maquina ctrl_Maquina = new Ctrl_Maquina();

        String tipomaquina = "";
        String estadomaquina = "";
        tipomaquina = combotipo.getSelectedItem().toString().trim();
        estadomaquina = comboestado.getSelectedItem().toString().trim();

        if (txt_marcamaquina.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione una maquina de la Tabla");
        } else {

            if (tipomaquina.equalsIgnoreCase("Selecciona el tipo de maquina")) {
                JOptionPane.showMessageDialog(null, "Selecciona el tipo de maquina");
            } else {
                if (estadomaquina.equalsIgnoreCase("Selecciona el estado de la maquina")) {
                    JOptionPane.showMessageDialog(null, "Selecciona el estado de la maquina");
                } else {
                    try {
                        
                        if (tipomaquina.equalsIgnoreCase("Bulldozer")) {
                            maquina.setTipoMaquina("Bulldozer");
                        } else if (tipomaquina.equalsIgnoreCase("Excavadora")) {
                            maquina.setTipoMaquina("Excavadora");
                        } else if (tipomaquina.equalsIgnoreCase("Miniexcavadora")) {
                            maquina.setTipoMaquina("Miniexcavadora");
                        } else if (tipomaquina.equalsIgnoreCase("Retroexcavadora")) {
                            maquina.setTipoMaquina("Retroexcavadora");
                        } else if (tipomaquina.equalsIgnoreCase("Minicargador")) {
                            maquina.setTipoMaquina("Minicargador");
                        } else if (tipomaquina.equalsIgnoreCase("Motoniveladoras")) {
                            maquina.setTipoMaquina("Motoniveladoras");
                        } else if (tipomaquina.equalsIgnoreCase("Camiones articulados")) {
                            maquina.setTipoMaquina("Camiones articulados");
                        }
                        
                        maquina.setMarca(txt_marcamaquina.getText().trim());
                        maquina.setModelo(Integer.parseInt(txt_modelomaquina.getText().trim()));
                        
                        if (estadomaquina.equalsIgnoreCase("Disponible")) {
                            maquina.setEstatus("Disponible");
                        } else if (estadomaquina.equalsIgnoreCase("Alquilada")) {
                            maquina.setEstatus("Alquilada");
                        }else if (estadomaquina.equalsIgnoreCase("Reparacion")) {
                            maquina.setEstatus("Reparacion");
                        }

                        String precioTXT = "";
                        double Precio = 0.0;
                        precioTXT = txt_preciomaquina.getText().trim();
                        boolean aux = false;
                        /*
                            *si el usuario ingresa coma como punto decimal lo trasformamos a punto
                         */
                        for (int i = 0; i < precioTXT.length(); i++) {
                            if (precioTXT.charAt(i) == ',') {
                                String precioNuevo = precioTXT.replace(",", ".");
                                Precio = Double.parseDouble(precioNuevo);
                                aux = true;
                            }
                        }

                        // evaluamos la condicion
                        if (aux == true) {
                            maquina.setCostoRenta(Precio);
                        } else {
                            Precio = Double.parseDouble(precioTXT);
                            maquina.setCostoRenta(Precio);
                        }

                        if (ctrl_Maquina.actualizar(maquina, idmaq)) {
                            JOptionPane.showMessageDialog(null, "El registro se actualizo");
                            CargarTablasMaquina();
                            Limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                        }
                    } catch (HeadlessException | NumberFormatException e) {
                        System.out.println("Error en: " + e);
                    }
                }
            }

        }
    }//GEN-LAST:event_Boton_actualizarMouseClicked

    private void boton_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminarMouseClicked

        Ctrl_Maquina ctrl_Maquina = new Ctrl_Maquina();
        
        if (idmaq == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una maquina de la tabla");
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
            
            if(resp==0){
                if (ctrl_Maquina.eliminar(idmaq)) {
                JOptionPane.showMessageDialog(null, "Maquina eliminada");
                this.CargarTablasMaquina();
                Limpiar();
                //this.Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar a la maquina");
            }
            }else{
                Limpiar();
            }
        }
    }//GEN-LAST:event_boton_eliminarMouseClicked

    private void comboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboestadoActionPerformed

    private void combotipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combotipoActionPerformed

    private void txt_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           buscar();
        }
    }//GEN-LAST:event_txt_buscarKeyPressed

    private void txt_buscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_buscarFocusGained
        // TODO add your handling code here:
        txt_buscar.setText("");
    }//GEN-LAST:event_txt_buscarFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Boton_actualizar;
    private javax.swing.JLabel boton_eliminar;
    private javax.swing.JLabel buscartxt;
    private javax.swing.JComboBox<String> comboestado;
    private javax.swing.JComboBox<String> combotipo;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JTable jTable_maquina;
    private javax.swing.JPanel pactualizar;
    private javax.swing.JPanel pbuscar;
    private javax.swing.JPanel peliminar;
    private javax.swing.JLabel presentaciontxt;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_marcamaquina;
    private javax.swing.JTextField txt_modelomaquina;
    private javax.swing.JTextField txt_preciomaquina;
    // End of variables declaration//GEN-END:variables


    private void CargarTablasMaquina() {
        Connection con = conexion.Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select id_maquinaria, tipo, marca, modelo, fecha_adquisicion, estatus, costo_renta_dia from maquinaria order by id_maquinaria asc;";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            jTable_maquina = new JTable(model);
            jScrollPane1.setViewportView(jTable_maquina);
            
           

            model.addColumn("ID°");//id
            model.addColumn("Tipo de Maquina");
            model.addColumn("Marca");
            model.addColumn("Modelo");
            model.addColumn("Fecha de Compra");
            model.addColumn("Estado");
            model.addColumn("Costo de renta dia");
           

            while (rs.next()) {

                Object fila[] = new Object[7];

                for (int i = 0; i < 7; i++) {

                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);
   
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla clientes" + e);
        }
        jTable_maquina.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Menú.ShowJPanel(new ActuCliente());
                int fila_point = jTable_maquina.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idmaq = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosUsuarioSeleccionado(idmaq);
                }
            }
        });
    }
    private void EnviarDatosUsuarioSeleccionado(int id_usuario) {
        try {
            Connection con = conexion.Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from maquinaria where id_maquinaria='" + id_usuario + "';");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                //this.txt_idmaquina.setText(rs.getString("id_maquinaria"))
                txt_marcamaquina.setText(rs.getString("marca"));
                txt_modelomaquina.setText(rs.getString("modelo"));
                txt_preciomaquina.setText(rs.getString("costo_renta_dia"));
                
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al selecionar al cliente" + e);
        }
    }
    
    
    private void buscar(){
         // TODO add your handling code here:
        String tipo;
        tipo= txt_buscar.getText().trim();
        
        Connection con = conexion.Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select * from maquinaria where tipo ~* '" + tipo +"';";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            jTable_maquina = new JTable(model);
            jScrollPane1.setViewportView(jTable_maquina);
            
           

            model.addColumn("ID°");//id
            model.addColumn("Tipo de Maquina");
            model.addColumn("Marca");
            model.addColumn("Modelo");
            model.addColumn("Fecha de Compra");
            model.addColumn("Estado");
            model.addColumn("Costo de renta dia");
           

            while (rs.next()) {

                Object fila[] = new Object[7];

                for (int i = 0; i < 7; i++) {

                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla clientes" + e);
        }
        jTable_maquina.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Menú.ShowJPanel(new ActuCliente());
                int fila_point = jTable_maquina.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idmaq = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosUsuarioSeleccionado(idmaq);
                }
            }
        });
    }
    
    public void Limpiar(){
        txt_marcamaquina.setText("");
        txt_modelomaquina.setText("");
        txt_preciomaquina.setText("");
        comboestado.setSelectedIndex(0);
        combotipo.setSelectedIndex(0);
    }
}

package Visual;

import Controlador.Ctrl_Clientes;
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
import Modelo.Cliente;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Clientes extends javax.swing.JPanel {
    
    int idcliente;

    
    public Clientes() {
        initComponents();
        CargarTablasCliente();  
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
        jTable_clientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        peliminar = new javax.swing.JPanel();
        Boton_eliminar = new javax.swing.JLabel();
        pactualizar = new javax.swing.JPanel();
        Boton_actualizar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        presentaciontxt.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        presentaciontxt.setText("Clientes");
        add(presentaciontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 12, 159, 27));

        txt_buscar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_buscar.setForeground(new java.awt.Color(204, 204, 204));
        txt_buscar.setText("Ingrese el nombre de cliente a buscar");
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
        add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 56, 584, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 153, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 78, 584, 10));

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

        add(pbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 45, -1, -1));

        popciones.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout popcionesLayout = new javax.swing.GroupLayout(popciones);
        popciones.setLayout(popcionesLayout);
        popcionesLayout.setHorizontalGroup(
            popcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );
        popcionesLayout.setVerticalGroup(
            popcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        add(popciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 405, 139, -1));

        jTable_clientes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable_clientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_clientes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 106, 683, 110));

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

        txtnombre.setBorder(null);

        txt_direccion.setBorder(null);

        txt_email.setBorder(null);

        txt_telefono.setBorder(null);

        jSeparator16.setForeground(new java.awt.Color(255, 133, 0));

        jSeparator17.setForeground(new java.awt.Color(255, 133, 0));

        jSeparator18.setForeground(new java.awt.Color(255, 133, 0));

        jSeparator19.setForeground(new java.awt.Color(255, 133, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jSeparator16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(jSeparator17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator18)
                    .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addComponent(jSeparator19)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGap(0, 738, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 260, -1, -1));

        peliminar.setBackground(new java.awt.Color(255, 153, 0));
        peliminar.setPreferredSize(new java.awt.Dimension(101, 30));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        peliminarLayout.setVerticalGroup(
            peliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(peliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, -1));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pactualizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Boton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pactualizarLayout.setVerticalGroup(
            pactualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pactualizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Boton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(pactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, -1));
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
        
        Cliente cliente = new Cliente();
        Ctrl_Clientes controlcliente = new Ctrl_Clientes();
        
        if(txtnombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione un Cliente de la Tabla");
        }else{
            
            try {
                //cliente.setIdCliente(Integer.parseInt(txt_idcliente.getText().trim()));
                cliente.setDireccion(txt_direccion.getText().trim());
                cliente.setEmail(txt_email.getText().trim());
                cliente.setNomCliente(txtnombre.getText().trim());
                cliente.setTelefono(txt_telefono.getText().trim());
                
                if(controlcliente.actualizar(cliente, idcliente)){
                    JOptionPane.showMessageDialog(null, "El registro se actualizo");
                    CargarTablasCliente();
                    Limpiar();
                }else{
                    JOptionPane.showMessageDialog(null, "Error al actualizar");
                }
            } catch (HeadlessException | NumberFormatException e) {
                System.out.println("Error en: " + e);
            }
            
        }
        
    }//GEN-LAST:event_Boton_actualizarMouseClicked

    private void Boton_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_eliminarMouseClicked

        Ctrl_Clientes ctrl_Clientes = new Ctrl_Clientes();
        
        if (idcliente == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un cliente de la tabla");
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
            
            if(resp==0){
                if (ctrl_Clientes.eliminar(idcliente)) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado/a");
                CargarTablasCliente();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar al cliente");
            }
            }else{
                Limpiar();
            }
        }
    }//GEN-LAST:event_Boton_eliminarMouseClicked

    private void txt_buscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_buscarFocusGained
        // TODO add your handling code here:
        txt_buscar.setText("");
    }//GEN-LAST:event_txt_buscarFocusGained

    private void txt_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           buscar();
        }
    }//GEN-LAST:event_txt_buscarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Boton_actualizar;
    private javax.swing.JLabel Boton_eliminar;
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
    private javax.swing.JTable jTable_clientes;
    private javax.swing.JPanel pactualizar;
    private javax.swing.JPanel pbuscar;
    private javax.swing.JPanel peliminar;
    private javax.swing.JPanel popciones;
    private javax.swing.JLabel presentaciontxt;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables


    private void CargarTablasCliente() {
        Connection con = conexion.Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select id_cliente, nombre, direccion, telefono, email from clientes order by id_cliente asc;";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            jTable_clientes = new JTable(model);
            jScrollPane1.setViewportView(jTable_clientes);
            
           

            model.addColumn("ID°");//id
            model.addColumn("Cliente");
            model.addColumn("Direccion");
            model.addColumn("Telefono");
            model.addColumn("Email");
           

            while (rs.next()) {

                Object fila[] = new Object[5];

                for (int i = 0; i < 5; i++) {

                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla clientes" + e);
        }
        jTable_clientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Menú.ShowJPanel(new ActuCliente());
                int fila_point = jTable_clientes.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idcliente = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosClienteSeleccionado(idcliente);
                }
            }
        });
    }
    private void EnviarDatosClienteSeleccionado(int id_cliente) {
        try {
            Connection con = conexion.Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from clientes where id_cliente='" + id_cliente + "';");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                this.txtnombre.setText(rs.getString("nombre"));
                //txt_idcliente.setText(rs.getString("id_cliente"));
                this.txt_direccion.setText(rs.getString("direccion"));
                txt_email.setText(rs.getString("email"));
                txt_telefono.setText(rs.getString("telefono"));
                
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al selecionar al cliente" + e);
        }
    }
    
    
    private void buscar(){
        String nombre;
        nombre= txt_buscar.getText().trim();
        
        Connection con = conexion.Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select * from clientes where nombre ~* '" + nombre +"' order by id_cliente asc;";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            jTable_clientes = new JTable(model);
            jScrollPane1.setViewportView(jTable_clientes);
            
           

            model.addColumn("ID°");//id
            model.addColumn("Cliente");
            model.addColumn("Direccion");
            model.addColumn("Telefono");
            model.addColumn("Email");
           

            while (rs.next()) {

                Object fila[] = new Object[5];

                for (int i = 0; i < 5; i++) {

                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla clientes" + e);
        }
        
        jTable_clientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Menú.ShowJPanel(new ActuCliente());
                int fila_point = jTable_clientes.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idcliente = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosClienteSeleccionado(idcliente);
                }
            }
        });
    }
    
    
    public void Limpiar(){
        txt_direccion.setText("");
        txt_email.setText("");
        txt_telefono.setText("");
        txtnombre.setText("");
    }
    
    
    
    
}

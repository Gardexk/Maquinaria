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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class Historial_renta extends javax.swing.JPanel {
    
    int idcliente;

    
    public Historial_renta() {
        initComponents();
        CargarTablasCliente();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar2 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_historial = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_fecha1 = new com.toedter.calendar.JDateChooser();
        presentaciontxt = new javax.swing.JLabel();
        txt_fecha2 = new com.toedter.calendar.JDateChooser();
        presentaciontxt2 = new javax.swing.JLabel();
        pactualizar2 = new javax.swing.JPanel();
        Buscar = new javax.swing.JLabel();
        presentaciontxt1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_historial.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable_historial.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_historial);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 740, 280));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 153, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));

        txt_fecha1.setDateFormatString("dd MMMM yyyy");

        presentaciontxt.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        presentaciontxt.setText("De Fecha");

        txt_fecha2.setDateFormatString("dd MMM yyyy");

        presentaciontxt2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        presentaciontxt2.setText("A Fecha");

        pactualizar2.setBackground(new java.awt.Color(255, 153, 0));

        Buscar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Buscar.setText("Buscar");
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pactualizar2Layout = new javax.swing.GroupLayout(pactualizar2);
        pactualizar2.setLayout(pactualizar2Layout);
        pactualizar2Layout.setHorizontalGroup(
            pactualizar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pactualizar2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pactualizar2Layout.setVerticalGroup(
            pactualizar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pactualizar2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(presentaciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(presentaciontxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(txt_fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pactualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(presentaciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(presentaciontxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_fecha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fecha2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pactualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 750, 90));

        presentaciontxt1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        presentaciontxt1.setText("Historial de rentas");
        add(presentaciontxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 12, 150, 27));
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
        
        Date fecha_1 = txt_fecha1.getDate();
        Date fecha_2 = txt_fecha2.getDate();
        buscar(fecha_1, fecha_2);
    }//GEN-LAST:event_BuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_historial;
    private javax.swing.JPanel pactualizar2;
    private javax.swing.JLabel presentaciontxt;
    private javax.swing.JLabel presentaciontxt1;
    private javax.swing.JLabel presentaciontxt2;
    private com.toedter.calendar.JDateChooser txt_fecha1;
    private com.toedter.calendar.JDateChooser txt_fecha2;
    // End of variables declaration//GEN-END:variables


    private void CargarTablasCliente() {
     Connection con = conexion.Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = """
                     SELECT r.id_renta, m.tipo, m.marca, m.modelo, c.nombre, r.fecha_inicio, r.fecha_fin, r.costo_total
                     FROM renta r, clientes c, maquinaria m
                     WHERE c.id_cliente = r.id_cliente AND m.id_maquinaria = r.id_maquinaria;""";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            jTable_historial = new JTable(model);
            jScrollPane1.setViewportView(jTable_historial);
            
           

            model.addColumn("ID°");//id
            model.addColumn("Tipo");
            model.addColumn("Marca");
            model.addColumn("Modelo");
            model.addColumn("Nombre");
            model.addColumn("fecha_inicio");
            model.addColumn("fecha_fin");
            model.addColumn("costo_total");
           

            while (rs.next()) {

                Object fila[] = new Object[8];

                for (int i = 0; i < 8; i++) {

                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla clientes" + e);
        }
        
           
    }
    
    private void buscar(Date fecha_1, Date fecha_2){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        if (fecha_1 == null || fecha_2 == null) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            String fecha1 = sdf.format(fecha_1);
            String fecha2 = sdf.format(fecha_2);

            Connection con = conexion.Conexion.conectar();
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Renta");
            model.addColumn("Tipo");
            model.addColumn("Marca");
            model.addColumn("Modelo");
            model.addColumn("Cliente");
            model.addColumn("Fecha Inicio");
            model.addColumn("Fecha Fin");
            model.addColumn("Total de días");
            model.addColumn("Costo Total");
            String sql = "SELECT r.id_renta, m.tipo, m.marca, m.modelo, c.nombre, r.fecha_inicio, r.fecha_fin, r.costo_total "
                    + "FROM renta r, clientes c, maquinaria m "
                    + "WHERE c.id_cliente = r.id_cliente AND m.id_maquinaria = r.id_maquinaria "
                    + "AND r.fecha_inicio >= ? AND r.fecha_fin <= ?";
            PreparedStatement pst;

            try {
                pst = con.prepareStatement(sql);
                pst.setDate(1, new java.sql.Date(fecha_1.getTime()));
                pst.setDate(2, new java.sql.Date(fecha_2.getTime()));

                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    Object[] row = new Object[9];
                    row[0] = rs.getInt("id_renta");
                    row[1] = rs.getString("tipo");
                    row[2] = rs.getString("marca");
                    row[3] = rs.getString("modelo");
                    row[4] = rs.getString("nombre");
                    row[5] = rs.getDate("fecha_inicio");
                    row[6] = rs.getDate("fecha_fin");
                    long diff = rs.getDate("fecha_fin").getTime() - rs.getDate("fecha_inicio").getTime();
                    row[7] = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
                    row[8] = rs.getDouble("costo_total");
                    model.addRow(row);
                }

                jTable_historial.setModel(model);
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al buscar en la base de datos: " + e.getMessage());
            }
        }
    }
    
    
    public void Limpiar(){
        
    }
    
    
    
    
}

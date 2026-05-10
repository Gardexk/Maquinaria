/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Renta;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Danny
 */
public class Ctrl_Renta {

    public boolean guardar(Renta objeto){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        if (cn == null) {
            return false;
        }
        
        try {
            cn.setAutoCommit(false);

            try (PreparedStatement renta = cn.prepareStatement(
                    "insert into renta(id_maquinaria, id_cliente, fecha_inicio, fecha_fin, costo_total) values (?,?,?,?,?)");
                 PreparedStatement operacion = cn.prepareStatement(
                    "insert into operaciones(id_maquinaria, id_operario, fecha_inicio, fecha_fin) values (?,?,?,?)");
                 PreparedStatement maquinaria = cn.prepareStatement(
                    "update maquinaria set estatus='Alquilada' where id_maquinaria=?")) {

                renta.setInt(1, objeto.getIdMaquinaria());
                renta.setInt(2, objeto.getIdCliente());
                renta.setDate(3, objeto.getFechaInicio());
                renta.setDate(4, objeto.getFechaFin());
                renta.setDouble(5, objeto.getCostoTotal());
                renta.executeUpdate();

                operacion.setInt(1, objeto.getIdMaquinaria());
                operacion.setInt(2, objeto.getIdOperario());
                operacion.setDate(3, objeto.getFechaInicio());
                operacion.setDate(4, objeto.getFechaFin());
                operacion.executeUpdate();

                maquinaria.setInt(1, objeto.getIdMaquinaria());
                maquinaria.executeUpdate();

                cn.commit();
                respuesta = true;
            }
        } catch (SQLException e) {
            try {
                cn.rollback();
            } catch (SQLException rollbackError) {
                System.out.println("Error al revertir la renta: " + rollbackError);
            }
            System.out.println("Error al guardar la renta: " + e);
        } finally {
            try {
                cn.setAutoCommit(true);
                cn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion: " + e);
            }
        }
        
        return respuesta;
    }
    
    public boolean existeRenta(String id_renta) {
        boolean respuesta = false;
        String sql = "select id_renta from renta where id_renta='" + id_renta + "';";
        Statement st;

        try {
            Connection cn = conexion.Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar el usuario " + e);
        }
        return respuesta;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.Maquina;

/**
 *
 * @author Danny
 */
public class Ctrl_Maquina {
    
    
    public boolean guardar(Maquina objeto){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        if (cn == null) {
            return false;
        }
        
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into  maquinaria (id_maquinaria, tipo, marca, modelo, fecha_adquisicion, costo_renta_dia, estatus) values (?,?,?,?,?,?,?)");
            // consulta.setInt(1, 0);//id
            consulta.setInt(1, objeto.getIdMaquina());
            consulta.setString(2, objeto.getTipoMaquina());
            consulta.setString(3, objeto.getMarca());
            consulta.setInt(4, objeto.getModelo());
            consulta.setDate(5, objeto.getFechaAdquisicion());
            consulta.setDouble(6, objeto.getCostoRenta());
            consulta.setString(7, objeto.getEstatus());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar al usuario: " + e);
        }
        
        return respuesta;
    }
    
    public boolean existeMaquina(String id_maquina) {
        boolean respuesta = false;
        String sql = "select id_maquinaria from maquinaria where id_maquinaria='" + id_maquina + "';";
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
    
    public boolean actualizar(Maquina objeto, int id_maquinaria) {
        boolean respuesta = false;
        Connection con = Conexion.conectar();
        if (con == null) {
            return false;
        }
        try {
            PreparedStatement consulta = con.prepareStatement("update maquinaria set tipo=?, marca=?, modelo=?, estatus=?, costo_renta_dia=? where id_maquinaria=?");
            consulta.setString(1, objeto.getTipoMaquina());
            consulta.setString(2, objeto.getMarca());
            consulta.setInt(3, objeto.getModelo());
            consulta.setString(4, objeto.getEstatus());
            consulta.setDouble(5, objeto.getCostoRenta());
            consulta.setInt(6, id_maquinaria);
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error al actualizar la maquina " + e);
        }
        return respuesta;
    }
    
    public boolean eliminar(int id_maquina) {
        boolean respuesta = false;
        Connection con = Conexion.conectar();
        if (con == null) {
            return false;
        }
        try {
            PreparedStatement consulta = con.prepareStatement("delete from maquinaria where id_maquinaria=?");
            consulta.setInt(1, id_maquina);

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error al eliminar la maquinaria: " + e);
        }
        return respuesta;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Operario;
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
public class Ctrl_Operario {
    
    public boolean guardar(Operario objeto){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        if (cn == null) {
            return false;
        }
        
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into operarios(id_operario, nombre, direccion, telefono, email) values(?,?,?,?,?)");
            // consulta.setInt(1, 0);//id
            consulta.setInt(1, objeto.getIdOperario());
            consulta.setString(2, objeto.getNomOperario());
            consulta.setString(3, objeto.getDireccion());
            consulta.setString(4, objeto.getTelefono());
            consulta.setString(5, objeto.getCorreo());
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar el operario: " + e);
        }
        
        return respuesta;
        
    }
    
    public boolean existeOperario(String id_operario) {
        boolean respuesta = false;
        String sql = "select id_operario from operarios where id_operario='" + id_operario + "';";
        Statement st;

        try {
            Connection cn = conexion.Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar el operario " + e);
        }
        return respuesta;
    }
    
    public boolean actualizar(Operario objeto, int id_operario) {
        boolean respuesta = false;
        Connection con = Conexion.conectar();
        if (con == null) {
            return false;
        }
        try {
            PreparedStatement consulta = con.prepareStatement("update operarios set nombre=?, direccion=?, telefono=?, email=? where id_operario=?");
            
            consulta.setString(1, objeto.getNomOperario());
            consulta.setString(2, objeto.getDireccion());
            consulta.setString(3, objeto.getTelefono());
            consulta.setString(4, objeto.getCorreo());
            consulta.setInt(5, id_operario);
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error al actualizar el operario " + e);
        }
        return respuesta;
    }
    
    public boolean eliminar(int id_operario) {
        boolean respuesta = false;
        Connection con = Conexion.conectar();
        if (con == null) {
            return false;
        }
        try {
            PreparedStatement consulta = con.prepareStatement("delete from operarios where id_operario=?");
            consulta.setInt(1, id_operario);

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error al eliminar al operario/a: " + e);
        }
        return respuesta;
    }
    
}

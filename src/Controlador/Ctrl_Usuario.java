/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Modelo.Usuario;

/**
 *
 * @author Danny
 */
public class Ctrl_Usuario {
    
    public String loginUsuario(Usuario objeto) {

        Connection cn = Conexion.conectar();
        if (cn == null) {
            return null;
        }
        String tipoUsuario = null;

        String sql = "select tipo_usuario from usuario where usuario= ? and password= ?";

        try (PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, objeto.getUsuario());
            ps.setString(2, objeto.getPassword());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                tipoUsuario = rs.getString("tipo_usuario");
            }
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión");
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
        } finally {
            try {
                if (null != cn) {
                    cn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión");
            }
        }

        return tipoUsuario;
    }
    
    public boolean guardar(Usuario objeto){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        if (cn == null) {
            return false;
        }
        
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into usuario(id_usuario, nom_usuario, tipo_usuario, usuario, password, telefono ) values(?,?,?,?,?,?)");
            // consulta.setInt(1, 0);//id
            consulta.setInt(1, objeto.getIdUsuario());
            consulta.setString(2, objeto.getNomUsuario());
            consulta.setString(3, objeto.getTipoUsuario());
            consulta.setString(4, objeto.getUsuario());
            consulta.setString(5, objeto.getPassword());
            consulta.setString(6, objeto.getTelefono());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar al usuario: " + e);
        }
        
        return respuesta;
    }
    
    public boolean existeUsuario(String id_usuario) {
        boolean respuesta = false;
        String sql = "select id_usuario from usuario where id_usuario='" + id_usuario + "';";
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
    
    public boolean actualizar(Usuario objeto, int id_usuario) {
        boolean respuesta = false;
        Connection con = Conexion.conectar();
        if (con == null) {
            return false;
        }
        try {
            PreparedStatement consulta = con.prepareStatement("update usuario set tipo_usuario=?, nom_usuario=?, telefono=?, usuario=?, password=? where id_usuario=?");
            consulta.setString(1, objeto.getTipoUsuario());
            consulta.setString(2, objeto.getNomUsuario());
            consulta.setString(3, objeto.getTelefono());
            consulta.setString(4, objeto.getUsuario());
            consulta.setString(5, objeto.getPassword());
            consulta.setInt(6, id_usuario);
            
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error al actualizar al usuario " + e);
        }
        return respuesta;
    }
    
    public boolean eliminar(int id_usuario) {
        boolean respuesta = false;
        Connection con = Conexion.conectar();
        if (con == null) {
            return false;
        }
        try {
            PreparedStatement consulta = con.prepareStatement("delete from usuario where id_usuario=?");
            consulta.setInt(1, id_usuario);

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error al eliminar al usuario/a: " + e);
        }
        return respuesta;
    }
    
}

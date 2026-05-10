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

/**
 *
 * @author Danny
 */
public class Ctrl_Clientes {
    
    public boolean guardar(Cliente objeto){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        if (cn == null) {
            return false;
        }
        
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into clientes(id_cliente, nombre, direccion, telefono, email) values(?,?,?,?,?)");
            // consulta.setInt(1, 0);//id
            consulta.setInt(1, objeto.getIdCliente());
            consulta.setString(2, objeto.getNomCliente());
            consulta.setString(3, objeto.getDireccion());
            consulta.setString(4, objeto.getTelefono());
            consulta.setString(5, objeto.getEmail());
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar el cliente: " + e);
        }
        
        return respuesta;
        
    }
    
    public boolean existeCliente(String id_cliente) {
        boolean respuesta = false;
        String sql = "select id_cliente from clientes where id_cliente='" + id_cliente + "';";
        Statement st;

        try {
            Connection cn = conexion.Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar el cliente " + e);
        }
        return respuesta;
    }
    
    public boolean actualizar(Cliente objeto, int id_cliente) {
        boolean respuesta = false;
        Connection con = Conexion.conectar();
        if (con == null) {
            return false;
        }
        try {
            PreparedStatement consulta = con.prepareStatement("update clientes set nombre=?, direccion=?, telefono=?, email=? where id_cliente=?");
            consulta.setString(1, objeto.getNomCliente());
            consulta.setString(2, objeto.getDireccion());
            consulta.setString(3, objeto.getTelefono());
            consulta.setString(4, objeto.getEmail());
            consulta.setInt(5, id_cliente);
            
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error al actualizar el cliente " + e);
        }
        return respuesta;
    }
    
    public boolean eliminar(int id_cliente) {
        boolean respuesta = false;
        Connection con = Conexion.conectar();
        if (con == null) {
            return false;
        }
        try {
            PreparedStatement consulta = con.prepareStatement("delete from clientes where id_cliente=?");
            consulta.setInt(1, id_cliente);

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error al eliminar al cliente/a: " + e);
        }
        return respuesta;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3swing;

import bbdd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luca_
 */
public class Consulta {
    private static bbdd.Conexion con = new Conexion();
    private static Connection conexion = con.getConection();
    private static PreparedStatement ps = null;
    
    public static boolean registrarUsuario(Usuario u){
        String sql = Sentencia.crear;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getPassword());
            ps.setString(5, u.getDomicilio());
            ps.setString(6, u.getTelefono());
            ps.setString(7, u.getUsertype());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            
        }
    }

    
    public static boolean editarUsuario(Usuario u){
        String sql = Sentencia.editar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getPassword());
            ps.setString(5, u.getDomicilio());
            ps.setString(6, u.getTelefono());
            ps.setString(7, u.getUsertype());
            ps.setString(8, u.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean eliminarUsuario(Usuario u){
        String sql = Sentencia.eliminar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, u.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean eliminarTodos(){
        String sql = Sentencia.eliminar_todo;
        try {
            ps = conexion.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
            return false; 
        }
    }
    
    public static void listarUsuarioAdmin(String busqueda){
        DefaultTableModel model = (DefaultTableModel)Admin.jTbUsuario.getModel();
        while(model.getRowCount() > 0){
            model.removeRow(0);
        }
        String sql = "";
        if(busqueda.equals("")){
            sql = Sentencia.listar;
        }else{
            sql = "SELECT * FROM usuario WHERE (" + 
                    "id LIKE'" + busqueda + "%' OR " +
                    "nombre LIKE'" + busqueda + "%' OR " +
                    "apellido LIKE'" + busqueda + "%' OR " +
                    "email LIKE'" + busqueda + "%' OR " +
                    "password LIKE'" + busqueda + "%' OR " +
                    "domicilio LIKE'" + busqueda + "%' OR " +
                    "telefono LIKE'" + busqueda + "%' OR " +
                    "usertype LIKE'" + busqueda + "%')";
        }
        String datos[] = new String[8];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("apellido");
                datos[3] = rs.getString("email");
                datos[4] = rs.getString("password");
                datos[5] = rs.getString("domicilio");
                datos[6] = rs.getString("telefono");
                datos[7] = rs.getString("usertype");
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void listarUsuarioComun(String busqueda){
        DefaultTableModel model = (DefaultTableModel)Common.jTbUsuario.getModel();
        while(model.getRowCount() > 0){
            model.removeRow(0);
        }
        String sql = "";
        if(busqueda.equals("")){
            sql = Sentencia.listar;
        }else{
            sql = "SELECT * FROM usuario WHERE (" + 
                    "id LIKE'" + busqueda + "%' OR " +
                    "nombre LIKE'" + busqueda + "%' OR " +
                    "apellido LIKE'" + busqueda + "%' OR " +
                    "email LIKE'" + busqueda + "%' OR " +
                    "password LIKE'" + busqueda + "%' OR " +
                    "domicilio LIKE'" + busqueda + "%' OR " +
                    "telefono LIKE'" + busqueda + "%' OR " +
                    "usertype LIKE'" + busqueda + "%')";
        }
        String datos[] = new String[8];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("apellido");
                datos[3] = rs.getString("email");
                datos[4] = rs.getString("password");
                datos[5] = rs.getString("domicilio");
                datos[6] = rs.getString("telefono");
                datos[7] = rs.getString("usertype");
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static boolean buscarUsuario(Usuario u){
        Admin a = new Admin();
        Common c = new Common();
        boolean registrado = false;
        String sql = "SELECT * FROM usuario WHERE email = '"+u.email+"' && password = '"+u.password+"'";
        try {
            ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                u.email = rs.getString("email");
                u.password = rs.getString("password");
                u.usertype = rs.getString("usertype");
                switch (u.usertype){
                    case "Administrador":
                        JOptionPane.showMessageDialog(null, "Bienvenido al Panel de Administracion","Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        a.setLocationRelativeTo(null);
                        a.setResizable(false);
                        a.setVisible(true);
                        break;
                    case "Comun":
                        JOptionPane.showMessageDialog(null, "Bienvenido al Panel de Visualizacion","Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        c.setLocationRelativeTo(null);
                        c.setResizable(false);
                        c.setVisible(true);
                        break;
                } 
                registrado = true;
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña inválidos","Mensaje", JOptionPane.ERROR_MESSAGE);
                registrado = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
            registrado = false;
        }
        return registrado;
    }
}

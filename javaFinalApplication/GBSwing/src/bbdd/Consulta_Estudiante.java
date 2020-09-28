/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import model.Estudiante;

/**
 *
 * @author LUKA28
 */
public class Consulta_Estudiante {

    private static Conexion con = new Conexion();
    private static Connection conexion = con.getConnection();
    private static PreparedStatement ps = null;

    //Metodo de Registro de Estudiantes
    public static boolean registrarEstudiante(Estudiante e) {
        
        //Llamado a sentencia SQL
        String sql = Sentencia_Estudiante.crear;
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setString(3, e.getDni());
            ps.setString(4, e.getCurso());
            ps.setString(5, e.getDivision());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Estudiante.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo de Edicion de Estudiantes
    public static boolean editarEstudiante(Estudiante e) {
        
        //Llamado de sentencia SQL
        String sql = Sentencia_Estudiante.editar;
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setString(3, e.getDni());
            ps.setString(4, e.getCurso());
            ps.setString(5, e.getDivision());
            ps.setString(6, e.getDni());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Estudiante.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo de Eliminacion de Estudiantes
    public static boolean eliminarEstudiante(Estudiante e) {
        
        //Llamado de sentencia SQL
        String sql = Sentencia_Estudiante.eliminar;
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ps.setString(1, e.getDni());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Estudiante.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo de Listado/Busqueda de Estudiantes
    public static void listarEstudiante(String busqueda) {
        
        //Llamado de Tabla de Estudiantes
        DefaultTableModel model = (DefaultTableModel) view.Estudiante.tbEstudiante.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        String sql = "";
        
        //Procedimiento de Busqueda de Estudiantes
        if (busqueda.equals("")) {
            sql = Sentencia_Estudiante.listar;
        } else {
            sql = "SELECT * FROM estudiante WHERE ("
                    + "id LIKE'" + busqueda + "%' OR "
                    + "nombre LIKE'" + busqueda + "%' OR "
                    + "apellido LIKE'" + busqueda + "%' OR "
                    + "dni LIKE'" + busqueda + "%' OR "
                    + "curso LIKE'" + busqueda + "%' OR "
                    + "division LIKE'" + busqueda + "%')";
        }
        String datos[] = new String[6];
        
        //Procedimiento de Insercion de datos en Tabla
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("apellido");
                datos[3] = rs.getString("dni");
                datos[4] = rs.getString("curso");
                datos[5] = rs.getString("division");
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Metodo de Busqueda/Verificacion de Estudiante Registrado
    public static boolean buscarEstudianteRegistrado(Estudiante e, JLabel mensaje) {
        boolean registrado = false;
        
        //Sentencia SQL
        String sql = "SELECT * FROM estudiante WHERE dni = '" + e.dni + "'";
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mensaje.setText("El estudiante ya existe");
                registrado = true;
            } else {
                if (Consulta_Estudiante.registrarEstudiante(e)) {
                    view.SuccessAlert sa = new view.SuccessAlert();
                    sa.setVisible(true);
                    sa.setLocationRelativeTo(null);
                    sa.setResizable(false);
                } else {
                    view.DangerAlert da = new view.DangerAlert();
                    da.setVisible(true);
                    da.setLocationRelativeTo(null);
                    da.setResizable(false);
                }
                registrado = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registrado;
    }

    //Metodo de Busqueda/Verificacion de Estudiante a Editar
    public static boolean buscarEstudianteEditado(Estudiante e, JLabel mensaje) {
        boolean registrado = false;
        
        //Sentencia SQL
        String sql = "SELECT * FROM estudiante WHERE dni = '" + e.dni + "'";
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                if (Consulta_Estudiante.editarEstudiante(e)) {
                    view.SuccessAlert sa = new view.SuccessAlert();
                    sa.setVisible(true);
                    sa.setLocationRelativeTo(null);
                    sa.setResizable(false);
                } else {
                    view.DangerAlert da = new view.DangerAlert();
                    da.setVisible(true);
                    da.setLocationRelativeTo(null);
                    da.setResizable(false);
                }
                registrado = true;
            } else {
                mensaje.setText("El estudiante no existe");
                registrado = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registrado;
    }
    
    //Metodo de Busqueda/Verificacion de Estudiante a Eliminar
    public static boolean buscarEstudianteEliminar(Estudiante e, JLabel mensaje) {
        boolean registrado = false;
        
        //Sentencia SQL
        String sql = "SELECT * FROM estudiante WHERE dni = '" + e.dni + "'";
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                registrado = true;
            } else {
                mensaje.setText("El estudiante no existe");
                registrado = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registrado;
    }
}

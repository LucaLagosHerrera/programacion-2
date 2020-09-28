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
import model.Empleado;

/**
 *
 * @author LUKA28
 */
public class Consulta_Empleado {

    private static Conexion con = new Conexion();
    private static Connection conexion = con.getConnection();
    private static PreparedStatement ps = null;

    //Metodo de Registro de Empleados
    public static boolean registrarEmpleado(Empleado e, String passwordEncriptada) {
        
        //Llamado a sentencia SQL
        String sql = Sentencia_Empleado.crear;
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setString(3, e.getDni());
            ps.setString(4, e.getRol());
            ps.setString(5, e.getEmail());
            ps.setString(6, passwordEncriptada);
            ps.setString(7, e.getPregunta());
            ps.setString(8, e.getRespuesta());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Empleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo de Edicion de Empleados
    public static boolean editarEmpleado(Empleado e, String passwordEncriptada) {
        
        //Llamado a sentencia SQL
        String sql = Sentencia_Empleado.editar;
        try {
           
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setString(3, e.getDni());
            ps.setString(4, e.getRol());
            ps.setString(5, e.getEmail());
            ps.setString(6, passwordEncriptada);
            ps.setString(7, e.getPregunta());
            ps.setString(8, e.getRespuesta());
            ps.setString(9, e.getDni());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Empleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo de Eliminacion de Empleados
    public static boolean eliminarEmpleado(Empleado e) {
        
        //Llamado de sentencia SQL
        String sql = Sentencia_Empleado.eliminar;
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ps.setString(1, e.getDni());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Empleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo de Listado/Busqueda de Empleados
    public static void listarEmpleado(String busqueda) {
        
        //Llamado a Tabla de Empleados
        DefaultTableModel model = (DefaultTableModel) view.Empleado.tbEmpleado.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        String sql = "";
        
        //Procedimiento de Busqueda de Empleados
        if (busqueda.equals("")) {
            sql = Sentencia_Empleado.listar;
        } else {
            sql = "SELECT * FROM empleado WHERE ("
                    + "id LIKE'" + busqueda + "%' OR "
                    + "nombre LIKE'" + busqueda + "%' OR "
                    + "apellido LIKE'" + busqueda + "%' OR "
                    + "dni LIKE'" + busqueda + "%' OR "
                    + "rol LIKE'" + busqueda + "%' OR "
                    + "email LIKE'" + busqueda + "%' OR "
                    + "password LIKE'" + busqueda + "%' OR "
                    + "pregunta LIKE'" + busqueda + "%' OR "
                    + "respuesta LIKE'" + busqueda + "%')";
        }
        String datos[] = new String[9];
        
        //Procedimiento de Insercion de datos en Tabla
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("apellido");
                datos[3] = rs.getString("dni");
                datos[4] = rs.getString("rol");
                datos[5] = rs.getString("email");
                datos[6] = rs.getString("password");
                datos[7] = rs.getString("pregunta");
                datos[8] = rs.getString("respuesta");
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Metodo de Busqueda/Verificacion de Empleado Registrado
    public static boolean buscarEmpleadoRegistrado(Empleado e, JLabel mensaje) {
        boolean registrado = false;
        
        //Sentencia SQL
        String sql = "SELECT * FROM empleado WHERE dni = '" + e.dni + "'";
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mensaje.setText("El empleado ya existe");
                registrado = true;
            } else {
                registrado = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registrado;
    }
    
    //Metodo de Busqueda/Verificacion de Correo Electronico
    public static boolean buscarEmailEmpleado(Empleado e, JLabel mensaje) {
        boolean registrado = false;
        
        //Sentencia SQL
        String sql = "SELECT * FROM empleado WHERE email = '" + e.email + "'";
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mensaje.setText("El email ya existe");
                registrado = true;
            } else {
                registrado = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registrado;
    }
    
    //Metodo de Busqueda/Verificacion de Respuesta
    public static boolean buscarRespuestaEmpleado(Empleado e, JLabel mensaje) {
        boolean registrado = false;
        
        //Sentencia SQL
        String sql = "SELECT * FROM empleado WHERE respuesta = '" + e.respuesta + "'";
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mensaje.setText("La respuesta ya existe");
                registrado = true;
            } else {
                registrado = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registrado;
    }

    //Metodo de Busqueda/Verificacion de Empleado a Editar
    public static boolean buscarEmpleadoEditado(Empleado e, JLabel mensaje) {
        boolean registrado = false;
        
        //Sentencia SQL
        String sql = "SELECT * FROM empleado WHERE dni = '" + e.dni + "' && email = '" + e.email + "'";
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                registrado = true;
            } else {
                mensaje.setText("El empleado no existe");
                registrado = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registrado;
    }
    
    //Metodo de Busqueda/Verificacion de Empleado a Editar
    public static boolean buscarEmpleadoEliminar(Empleado e, JLabel mensaje) {
        boolean registrado = false;
        
        //Sentencia SQL
        String sql = "SELECT * FROM empleado WHERE dni = '" + e.dni + "'";
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                registrado = true;
            } else {
                mensaje.setText("El empleado no existe");
                registrado = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registrado;
    }
}

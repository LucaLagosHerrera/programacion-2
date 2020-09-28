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
import model.Libro;

/**
 *
 * @author LUKA28
 */
public class Consulta_Libro {

    private static Conexion con = new Conexion();
    private static Connection conexion = con.getConnection();
    private static PreparedStatement ps = null;

    //Metodo de Registro de Libros
    public static boolean registrarLibro(Libro l) {
        
        //Llamado de sentencia SQL
        String sql = Sentencia_Libro.crear;
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ps.setString(1, l.getTitulo());
            ps.setString(2, l.getEdicion());
            ps.setString(3, l.getIsbn());
            ps.setString(4, l.getAutor());
            ps.setString(5, l.getEditorial());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Libro.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo de Edicion de Libros
    public static boolean editarLibro(Libro l) {
        
        //Llamado de sentencia SQL
        String sql = Sentencia_Libro.editar;
        
        //Preparacion y ejecucion de sentencia SQL
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, l.getTitulo());
            ps.setString(2, l.getEdicion());
            ps.setString(3, l.getIsbn());
            ps.setString(4, l.getAutor());
            ps.setString(5, l.getEditorial());
            ps.setString(6, l.getIsbn());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Libro.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo de Eliminacion de Libros
    public static boolean eliminarLibro(Libro l) {
        
        //Llamado de sentencia SQL
        String sql = Sentencia_Libro.eliminar;
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ps.setString(1, l.getIsbn());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Libro.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo de Listado/Busqueda de Libros
    public static void listarLibro(String busqueda) {
        
        //Llamado de Tabla de Libros
        DefaultTableModel model = (DefaultTableModel) view.Libro.tbLibro.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        String sql = "";
        
        //Procedimiento de Busqueda de Libros
        if (busqueda.equals("")) {
            sql = Sentencia_Libro.listar;
        } else {
            sql = "SELECT * FROM libro WHERE (" +
                    "id LIKE'" + busqueda + "%' OR " + 
                    "titulo LIKE'" + busqueda + "%' OR " +
                    "edicion LIKE'" + busqueda + "%' OR " +
                    "isbn LIKE'" + busqueda + "%' OR " +
                    "autor LIKE'" + busqueda + "%' OR " +
                    "editorial LIKE'" + busqueda + "%')";
        }
        String datos[] = new String[6];
        
        //Procedimiento de Insercion de Datos en Tabla
        try{
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("titulo");
                datos[2] = rs.getString("edicion");
                datos[3] = rs.getString("isbn");
                datos[4] = rs.getString("autor");
                datos[5] = rs.getString("editorial");
                model.addRow(datos);
            }
        } catch(SQLException ex){
            Logger.getLogger(Consulta_Libro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Metodo de Busqueda/Verificacion de Libro Registrado
    public static boolean buscarLibroRegistrado(Libro l, JLabel mensaje) {
        boolean registrado = false;
        
        //Sentencia SQL
        String sql = "SELECT * FROM libro WHERE isbn = '" + l.isbn + "'";
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mensaje.setText("El libro ya existe");
                registrado = true;
            } else {
                if (Consulta_Libro.registrarLibro(l)) {
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

    //Metodo de Busqueda/Verificacion de Libro a Editar
    public static boolean buscarLibroEditado(Libro l, JLabel mensaje) {
        boolean registrado = false;
        
        //Sentencia SQL
        String sql = "SELECT * FROM libro WHERE isbn = '" + l.isbn + "'";
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                if (Consulta_Libro.editarLibro(l)) {
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
                mensaje.setText("El libro no existe");
                registrado = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registrado;
    }
    
    //Metodo de Busqueda/Verificacion de Libro a Eliminar
    public static boolean buscarLibroEliminar(Libro l, JLabel mensaje) {
        boolean registrado = false;
        
        //Sentencia SQL
        String sql = "SELECT * FROM libro WHERE isbn = '" + l.isbn + "'";
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                registrado = true;
            } else {
                mensaje.setText("El libro no existe");
                registrado = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registrado;
    }
}

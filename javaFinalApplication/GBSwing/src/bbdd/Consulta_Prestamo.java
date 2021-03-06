/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Prestamo;

/**
 *
 * @author LUKA28
 */
public class Consulta_Prestamo {

    private static Conexion con = new Conexion();
    private static Connection conexion = con.getConnection();
    private static PreparedStatement ps = null;

    //Metodo de Registro de Prestamos
    public static boolean registrarPrestamo(Prestamo p) {
        
        //Llamado de sentencia SQL
        String sql = Sentencia_Prestamo.crear;
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ps.setString(1, p.getNombre_estudiante());
            ps.setString(2, p.getApellido_estudiante());
            ps.setString(3, p.getDni_estudiante());
            ps.setString(4, p.getCurso_estudiante());
            ps.setString(5, p.getDivision_estudiante());
            ps.setString(6, p.getTitulo_libro());
            ps.setString(7, p.getEdicion_libro());
            ps.setString(8, p.getIsbn_libro());
            ps.setString(9, p.getAutor_libro());
            ps.setString(10, p.getEditorial_libro());
            ps.setDate(11, (Date) p.getFecha_prestamo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Prestamo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //Metodo de Listado/Busqueda de Prestamos en Historial
    public static void listarPrestamo(String busqueda) {
        
        //Llamado de Tabla de Prestamos en Historial
        DefaultTableModel model = (DefaultTableModel) view.Historial.tbPrestamo.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        String sql = "";
        
        //Procedimiento de Busqueda de Prestamos
        if (busqueda.equals("")) {
            sql = Sentencia_Prestamo.listar;
        } else {
            sql = "SELECT * FROM prestamo WHERE ("
                    + "id LIKE'" + busqueda + "%' OR "
                    + "nombre_estudiante LIKE'" + busqueda + "%' OR "
                    + "apellido_estudiante LIKE'" + busqueda + "%' OR "
                    + "dni_estudiante LIKE'" + busqueda + "%' OR "
                    + "curso_estudiante LIKE'" + busqueda + "%' OR "
                    + "division_estudiante LIKE'" + busqueda + "%' OR "
                    + "titulo_libro LIKE'" + busqueda + "%' OR "
                    + "edicion_libro LIKE'" + busqueda + "%' OR "
                    + "isbn_libro LIKE'" + busqueda + "%' OR "
                    + "autor_libro LIKE'" + busqueda + "%' OR "
                    + "editorial_libro LIKE'" + busqueda + "%' OR "
                    + "fecha_prestamo LIKE'" + busqueda + "%')";
        }
        String datos[] = new String[12];
        
        //Procedimiento de Insercion de datos en Tabla
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("nombre_estudiante");
                datos[2] = rs.getString("apellido_estudiante");
                datos[3] = rs.getString("dni_estudiante");
                datos[4] = rs.getString("curso_estudiante");
                datos[5] = rs.getString("division_estudiante");
                datos[6] = rs.getString("titulo_libro");
                datos[7] = rs.getString("edicion_libro");
                datos[8] = rs.getString("isbn_libro");
                datos[9] = rs.getString("autor_libro");
                datos[10] = rs.getString("editorial_libro");
                datos[11] = rs.getString("fecha_prestamo");
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Prestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Metodo para buscar Libro
    public static void buscarLibro(JTextField ti, JTextField ed, JTextField i, JTextField a, JTextField edi, JTextField bu, JLabel mensaje) {
        
        //Llamado a sentencia SQL
        String sql = bbdd.Sentencia_Prestamo.buscarLibro;
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ps.setString(1, bu.getText());
            ResultSet rs = ps.executeQuery();
            
            //Reemplazo de texto de JTextFields por los datos encontrados en BBDD
            if (rs.next()) {
                mensaje.setText("");
                String titulo = rs.getString("titulo");
                ti.setText(titulo);
                String edicion = rs.getString("edicion");
                ed.setText(edicion);
                String isbn = rs.getString("isbn");
                i.setText(isbn);
                String autor = rs.getString("autor");
                a.setText(autor);
                String editorial = rs.getString("editorial");
                edi.setText(editorial);
                rs.close();
                ps.close();
            } else {
                mensaje.setText("Libro no registrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Prestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Metodo para buscar Estudiante
    public static void buscarEstudiante(JTextField nom, JTextField ap, JTextField d, JTextField cu, JTextField di, JTextField bu, JLabel mensaje) {
        
        //Llamado a sentencia SQL
        String sql = bbdd.Sentencia_Prestamo.buscarEstudiante;
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ps.setString(1, bu.getText());
            ResultSet rs = ps.executeQuery();
            
            //Reemplazo de texto de JTextFields por los datos encontrados en BBDD
            if (rs.next()) {
                mensaje.setText("");
                String nombre = rs.getString("nombre");
                nom.setText(nombre);
                String apellido = rs.getString("apellido");
                ap.setText(apellido);
                String dni = rs.getString("dni");
                d.setText(dni);
                String curso = rs.getString("curso");
                cu.setText(curso);
                String division = rs.getString("division");
                di.setText(division);
                rs.close();
                ps.close();
            } else {
                mensaje.setText("Estudiante no registrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Prestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

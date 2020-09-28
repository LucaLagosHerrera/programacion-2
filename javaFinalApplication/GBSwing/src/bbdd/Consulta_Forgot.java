/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author LUKA28
 */
public class Consulta_Forgot {

    private static Conexion con = new Conexion();
    private static Connection conexion = con.getConnection();
    private static PreparedStatement ps = null;

    //Metodo de Busqueda de Empleado Registrado
    public static void buscarEmpleado(JTextField bu, JTextField e, JTextField p, JLabel mensaje) {

        //Sentencia SQL
        String sql = "SELECT * FROM empleado WHERE dni = ?";
        try {

            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ps.setString(1, bu.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mensaje.setText("");
                String email = rs.getString("email");
                e.setText(email);
                String pregunta = rs.getString("pregunta");
                p.setText(pregunta);
                rs.close();
                ps.close();
            } else {
                mensaje.setText("Empleado no registrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Prestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Metodo de Busqueda de Contraseña de Empleado
    public static void buscarPasswordEmpleado(JTextField re, JTextField pas, JLabel mensaje) {
        encryptation.Encriptacion_Empleado en = new encryptation.Encriptacion_Empleado();

        //Sentencia SQL
        String sql = "SELECT * FROM empleado WHERE respuesta = ?";

        //Preparacion y ejecucion de sentencia SQL
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, re.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mensaje.setForeground(Color.green);
                mensaje.setText("Respuesta Correcta");
                String password = rs.getString("password");
                String pasDec = en.desencriptarPassword(password);
                pas.setText(pasDec);
                rs.close();
                ps.close();
            } else {
                mensaje.setText("Respuesta Incorrecta");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Prestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

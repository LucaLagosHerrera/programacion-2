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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import model.Empleado;
import view.BossMessage;
import view.EmployeeMessage;

/**
 *
 * @author LUKA28
 */
public class Consulta_Login {

    private static Conexion con = new Conexion();
    private static Connection conexion = con.getConnection();
    private static PreparedStatement ps = null;

    //Metodo de Busqueda de Correo Electronico/ Contraseña de Empleado Registrado
    public static boolean buscarEmpleado(Empleado e, JLabel mensaje) {
        BossMessage bm = new BossMessage();
        EmployeeMessage em = new EmployeeMessage();
        boolean registrado = false;
        
        //Sentencia SQL
        String sql = "SELECT * FROM empleado WHERE email = '" + e.email + "' && password = '" + e.password + "'";
        try {
            
            //Preparacion y ejecucion de sentencia SQL
            ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                e.rol = rs.getString("rol");
                e.email = rs.getString("email");
                e.password = rs.getString("password");
                switch (e.rol) {
                    case "Jefe":
                        bm.setVisible(true);
                        break;
                    case "Empleado":
                        em.setVisible(true);
                        break;
                }
                registrado = true;
            } else {
                mensaje.setText("Usuario o Contraseña Inválidos");
                registrado = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Empleado.class.getName()).log(Level.SEVERE, null, ex);
            registrado = false;
        }
        return registrado;
    }
}

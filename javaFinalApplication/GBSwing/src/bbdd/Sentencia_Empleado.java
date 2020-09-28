/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

/**
 *
 * @author LUKA28
 */
public class Sentencia_Empleado {
    public static String listar = "SELECT * FROM empleado";
    public static String crear = "INSERT INTO empleado (" + 
            "nombre," + 
            "apellido," + 
            "dni," +
            "rol," +
            "email," +
            "password," +
            "pregunta," + 
            "respuesta) " + 
            "VALUES(?,?,?,?,?,?,?,?)" ;
    public static String editar = "UPDATE empleado SET " + 
            "nombre = ?," +
            "apellido = ?," +
            "dni = ?," +
            "rol = ?," +
            "email = ?," +
            "password = ?," +
            "pregunta = ?," +
            "respuesta = ? " +
            "WHERE dni = ?";
    public static String eliminar = "DELETE FROM empleado WHERE dni = ?";
}

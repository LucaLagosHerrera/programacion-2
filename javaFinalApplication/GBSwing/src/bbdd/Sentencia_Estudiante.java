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
public class Sentencia_Estudiante {
    public static String listar = "SELECT * FROM estudiante";
    public static String crear = "INSERT INTO estudiante (" + 
            "nombre," + 
            "apellido," + 
            "dni," + 
            "curso," + 
            "division) " + 
            "VALUES(?,?,?,?,?)" ;
    public static String editar = "UPDATE estudiante SET " + 
            "nombre = ?," +
            "apellido = ?," +
            "dni = ?," +
            "curso = ?," +
            "division = ? " +
            "WHERE dni = ?";
    public static String eliminar = "DELETE FROM estudiante WHERE dni = ?";
}

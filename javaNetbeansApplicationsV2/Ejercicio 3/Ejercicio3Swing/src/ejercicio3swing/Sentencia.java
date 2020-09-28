/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3swing;

/**
 *
 * @author luca_
 */

public class Sentencia {
    
    public static String listar = "SELECT * FROM usuario";
    public static String crear = "INSERT INTO usuario (" + 
            "nombre," + 
            "apellido," + 
            "email," + 
            "password," + 
            "domicilio," + 
            "telefono," + 
            "usertype) " + 
            "VALUES(?,?,?,?,?,?,?)" ;
    public static String editar = "UPDATE usuario SET " + 
            "nombre = ?," +
            "apellido = ?," +
            "email = ?," +
            "password = ?," +
            "domicilio = ?," +
            "telefono = ?," + 
            "usertype = ? " +
            "WHERE id = ?";
    public static String eliminar = "DELETE FROM usuario WHERE id = ?";
    public static String eliminar_todo = "TRUNCATE TABLE usuario";
}

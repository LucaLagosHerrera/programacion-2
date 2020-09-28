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
public class Sentencia_Libro {
    public static String listar = "SELECT * FROM libro";
    public static String crear = "INSERT INTO libro (" + 
            "titulo," + 
            "edicion," + 
            "isbn," + 
            "autor," + 
            "editorial) " + 
            "VALUES(?,?,?,?,?)" ;
    public static String editar = "UPDATE libro SET " + 
            "titulo = ?," +
            "edicion = ?," +
            "isbn = ?," +
            "autor = ?," +
            "editorial = ? " +
            "WHERE isbn = ?";
    public static String eliminar = "DELETE FROM libro WHERE isbn = ?";
}

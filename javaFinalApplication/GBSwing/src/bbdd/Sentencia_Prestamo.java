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
public class Sentencia_Prestamo {
    public static String listar = "SELECT * FROM prestamo";
    public static String buscarEstudiante = "SELECT * FROM estudiante WHERE dni = ?";
    public static String buscarLibro = "SELECT * FROM libro WHERE isbn = ?";
    public static String crear = "INSERT INTO prestamo (" + 
            "nombre_estudiante," + 
            "apellido_estudiante," + 
            "dni_estudiante," + 
            "curso_estudiante," +
            "division_estudiante," +
            "titulo_libro," +
            "edicion_libro," +
            "isbn_libro," +
            "autor_libro," +
            "editorial_libro," +
            "fecha_prestamo) " + 
            "VALUES(?,?,?,?,?,?,?,?,?,?,?)" ;
}

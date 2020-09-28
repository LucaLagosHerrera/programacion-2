/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author LUKA28
 */
public class Validacion_Libro {

    //Datos de Validacion de Libro
    String titulo;
    String edicion;
    String isbn;
    String autor;
    String editorial;
    String mensajeTitulo;
    String mensajeEdicion;
    String mensajeIsbn;
    String mensajeAutor;
    String mensajeEditorial;

    //Metodo de Validacion de Libro
    public boolean validarLibro(JTextField ti, JTextField ed, JTextField i, JTextField a, JTextField edi, JLabel mensaje) {
        titulo = ti.getText();
        edicion = ed.getText();
        isbn = i.getText();
        autor = a.getText();
        editorial = edi.getText();
        boolean validado = false;
        if (validarTitulo() != null) {
            mensaje.setText(this.mensajeTitulo);
        } else if (validarEdicion() != null) {
            mensaje.setText(this.mensajeEdicion);
        } else if (validarIsbn() != null) {
            mensaje.setText(this.mensajeIsbn);
        } else if (validarAutor() != null) {
            mensaje.setText(this.mensajeAutor);
        } else if (validarEditorial() != null) {
            mensaje.setText(this.mensajeEditorial);
        } else {
            mensaje.setText("");
            validado = true;
        }
        return validado;
    }

    //Metodo de Validacion de Titulo de Libro
    public String validarTitulo() {
        if (titulo.isEmpty()) {
            this.mensajeTitulo = "Complete el campo Titulo";
        } else {
            this.mensajeTitulo = null;
        }
        return this.mensajeTitulo;
    }

    //Metodo de Validacion de Edicion de Libro
    public String validarEdicion() {
        if (edicion.isEmpty()) {
            this.mensajeEdicion = "Complete el campo Edición";
        } else {
            this.mensajeEdicion = null;
        }
        return this.mensajeEdicion;
    }

    //Metodo de Validacion de ISBN de Libro
    public String validarIsbn() {
        
        //Compilador de Expresion Regular
        Pattern p;
        
        //Comparador de Expresion Regular con cadena de caracteres
        Matcher m;
        
        //Expresion Regular compilada para Validacion de ISBN (solo numeros)
        p = Pattern.compile("[\\D]");
        
        //Comparacion de Expresion Regular compilada con dato de ISBN de Libro (isbn)
        m = p.matcher(isbn);
        if (isbn.isEmpty()) {
            this.mensajeIsbn = "Complete el campo ISBN";
        } else if (m.find()) {
            this.mensajeIsbn = "ISBN debe contener solo números";
        } else if (isbn.length() < 10 || isbn.length() > 10) {
            this.mensajeIsbn = "ISBN debe contener 10 números";
        } else {
            this.mensajeIsbn = null;
        }
        return this.mensajeIsbn;
    }

    //Metodo de Validacion de Autor de Libro
    public String validarAutor() {
        Pattern p;
        Matcher m;
        p = Pattern.compile("[0-9$&+,.:%;=@#|]");
        m = p.matcher(autor);
        if (autor.isEmpty()) {
            this.mensajeAutor = "Complete el campo Autor";
        } else if (m.find()) {
            this.mensajeAutor = "Autor debe contener solo letras";
        } else {
            this.mensajeAutor = null;
        }
        return this.mensajeAutor;
    }

    //Metodo de Validacion de Editorial de Libro
    public String validarEditorial() {
        if (editorial.isEmpty()) {
            this.mensajeEditorial = "Complete el campo Editorial";
        } else {
            this.mensajeEditorial = null;
        }
        return this.mensajeEditorial;
    }
}

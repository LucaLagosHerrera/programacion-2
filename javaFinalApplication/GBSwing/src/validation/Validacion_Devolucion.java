/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JTextField;
import rojeru_san.componentes.RSDateChooser;

/**
 *
 * @author LUKA28
 */
public class Validacion_Devolucion {

    //Datos de Validacion de Fecha de Devolucion
    Date fecha;
    String mensajeFecha;

    //Metodo de Validaciond de Fecha de Devolucion
    public boolean validarFechaDevolucion(RSDateChooser f, JLabel mensaje) {
        fecha = f.getDatoFecha();
        boolean validado = false;
        if (validarFechaDevolucion() != null) {
            mensaje.setText(this.mensajeFecha);
        } else {
            mensaje.setText("");
            validado = true;
        }
        return validado;
    }

    //Datos de Validacion de Estudiante para Devolucion
    String nombre;
    String apellido;
    String dni;
    String curso;
    String division;
    String mensajeEstudiante;
    
    //Metodo de Validacion de Estudiante para Devolucion
    public boolean validarDevolucionEstudiante(JTextField nom, JTextField ap, JTextField d, JTextField cu, JTextField di, JLabel mensaje){
        nombre = nom.getText();
        apellido = ap.getText();
        dni = d.getText();
        curso = cu.getText();
        division = di.getText();
        boolean validado = false;
        if(validarEstudiante() != null){
            mensaje.setText(this.mensajeEstudiante);
        } else {
            mensaje.setText("");
            validado = true;
        }
        return validado;
    }
    
    //Datos de Validacion de Busqueda de Estudiante
    String buscarEstudiante; 
    String mensajeDni;

    //Metodo de Validacion de Busqueda de Estudiante
    public boolean validarBuscarEstudiante(JTextField be, JLabel mensaje) {
        
        buscarEstudiante = be.getText();
        boolean validado = false;
        if (validarDni() != null) {
            mensaje.setText(this.mensajeDni);
        } else {
            mensaje.setText("");
            validado = true;
        }
        return validado;
    }

    //Datos de Validacion de Libro para Devolucion
    String titulo;
    String edicion;
    String isbn;
    String autor;
    String editorial;
    String mensajeLibro;
    
    //Metodo de Validacion de Libro para Devolucion
    public boolean validarDevolucionLibro(JTextField ti, JTextField ed, JTextField i, JTextField a, JTextField edi, JLabel mensaje){
        titulo = ti.getText();
        edicion = ed.getText();
        isbn = i.getText();
        autor = a.getText();
        editorial = edi.getText();
        boolean validado = false;
        if (validarLibro() != null) {
            mensaje.setText(this.mensajeLibro);
        } else {
            mensaje.setText("");
            validado = true;
        }
        return validado;
    }
    
    //Datos de Validacion de Busqueda de Libro
    String buscarLibro;
    String mensajeIsbn;

    //Metodo de Validacion de Busqueda de Libro
    public boolean validarBuscarLibro(JTextField bl, JLabel mensaje) {
        
        buscarLibro = bl.getText();
        boolean validado = false;
        if (validarIsbn() != null) {
            mensaje.setText(this.mensajeIsbn);
        } else {
            mensaje.setText("");
            validado = true;
        }
        return validado;
    }

    //Metodo de Validacion de DNI de Estudiante
    public String validarDni() {
        
        //Compilador de Expresion Regular
        Pattern p;
        
        //Comparador de Expresion Regular con cadena de caracteres
        Matcher m;
        
        //Expresion Regular compilada para Validacion de DNI (solo numeros)
        p = Pattern.compile("[\\D]");
        
        //Comparacion de Expresion Regular compilada con dato de Busqueda de Estudiante (buscarEstudiante)
        m = p.matcher(buscarEstudiante);
        if (buscarEstudiante.isEmpty()) {
            this.mensajeDni = "Complete el campo Búsqueda";
        } else if (m.find()) {
            this.mensajeDni = "Búsqueda debe contener solo números";
        } else if (buscarEstudiante.length() < 8 || buscarEstudiante.length() > 8) {
            this.mensajeDni = "Búsqueda debe contener 8 números";
        } else {
            this.mensajeDni = null;
        }
        return this.mensajeDni;
    }

    //Metodo de Validacion de ISBN
    public String validarIsbn() {
        Pattern p;
        Matcher m;
        p = Pattern.compile("[\\D]");
        m = p.matcher(buscarLibro);
        if (buscarLibro.isEmpty()) {
            this.mensajeIsbn = "Complete el campo Búsqueda";
        } else if (m.find()) {
            this.mensajeIsbn = "Búsqueda debe contener solo números";
        } else if (buscarLibro.length() < 10 || buscarLibro.length() > 10) {
            this.mensajeIsbn = "Búsqueda debe contener 10 números";
        } else {
            this.mensajeIsbn = null;
        }
        return this.mensajeIsbn;
    }

    //Metodo de Validacion de Fecha de Devolucion
    public String validarFechaDevolucion() {
        if (fecha == null) {
            this.mensajeFecha = "Complete el campo Fecha de Devolución";
        } else {
            this.mensajeFecha = null;
        }
        return this.mensajeFecha;
    }

    //Metodo de Validacion de Estudiante para Devolucion
    public String validarEstudiante() {
        if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || curso.isEmpty() || division.isEmpty()) {
            this.mensajeEstudiante = "Los campos de Estudiante estan vacíos";
        } else {
            this.mensajeEstudiante = null;
        }
        return this.mensajeEstudiante;
    }

    //Metodo de Validacion de Libro para Devolucion
    public String validarLibro() {
        if (titulo.isEmpty() || edicion.isEmpty() || isbn.isEmpty() || autor.isEmpty() || editorial.isEmpty()) {
            this.mensajeLibro = "Los campos de Libro estan vacíos";
        } else {
            this.mensajeLibro = null;
        }
        return this.mensajeLibro;
    }
}

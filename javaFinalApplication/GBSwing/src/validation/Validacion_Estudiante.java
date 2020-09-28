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
public class Validacion_Estudiante {

    //Datos de Validacion de Estudiante
    String nombre;
    String apellido;
    String dni;
    String mensajeNombre;
    String mensajeApellido;
    String mensajeDni;

    //Metodo de Validacion de Estudiante
    public boolean validarEstudiante(JTextField nom, JTextField ap, JTextField d, JLabel mensaje) {
        nombre = nom.getText();
        apellido = ap.getText();
        dni = d.getText();
        boolean validado = false;
        if(validarNombre() != null){
            mensaje.setText(this.mensajeNombre);
        } else if (validarApellido() != null){
            mensaje.setText(this.mensajeApellido);
        } else if (validarDni() != null){
            mensaje.setText(this.mensajeDni);
        } else {
            mensaje.setText("");
            validado = true;
        }
        return validado;
    }

    //Metodo de Validacion de Nombre de Estudiante
    public String validarNombre() {
        
        //Compilador de Expresion Regular
        Pattern p;
        
        //Comparador de Expresion Regular con cadena de caracteres
        Matcher m;
        
        //Expresion Regular compilada para Validacion de Nombre (solo letras)
        p = Pattern.compile("[0-9$&+,.:%;=@#|]");
        
        //Comparacion de Expresion Regular compilada con dato de Nombre de Estudiante (nombre)
        m = p.matcher(nombre);
        if (nombre.isEmpty()) {
            this.mensajeNombre = "Complete el campo Nombre";
        } else if (m.find()) {
            this.mensajeNombre = "Nombre debe contener solo letras";
        } else {
            this.mensajeNombre = null;
        }
        return this.mensajeNombre;
    }

    //Metodo de Validacion de Apeliido de Estudiante
    public String validarApellido() {
        Pattern p;
        Matcher m;
        p = Pattern.compile("[0-9$&+,.:%;=@#|]");
        m = p.matcher(apellido);
        if (apellido.isEmpty()) {
            this.mensajeApellido = "Complete el campo Apellido";
        } else if (m.find()) {
            this.mensajeApellido = "Apellido debe contener solo letras";
        } else {
            this.mensajeApellido = null;
        }
        return this.mensajeApellido;
    }

    //Metodo de Validacion de DNI de Estudiante
    public String validarDni() {
        Pattern p;
        Matcher m;
        p = Pattern.compile("[\\D]");
        m = p.matcher(dni);
        if (dni.isEmpty()) {
            this.mensajeDni = "Complete el campo DNI";
        } else if (m.find()) {
            this.mensajeDni = "El DNI debe contener solo números";
        } else if (dni.length() < 8 || dni.length() > 8) {
            this.mensajeDni = "DNI debe contener 8 números";
        } else {
            this.mensajeDni = null;
        }
        return this.mensajeDni;
    }
}

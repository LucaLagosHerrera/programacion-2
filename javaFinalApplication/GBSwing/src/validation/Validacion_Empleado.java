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
public class Validacion_Empleado {

    //Datos de Validacion de Empleado
    String nombre;
    String apellido;
    String dni;
    String email;
    String password;
    String respuesta;
    String mensajeNombre;
    String mensajeApellido;
    String mensajeDni;
    String mensajeEmail;
    String mensajePassword;
    String mensajeRespuesta;

    //Metodo de Validacion de Empleado
    public boolean validarEmpleado(JTextField nom, JTextField ap, JTextField d, JTextField em, JTextField pas, JTextField res, JLabel mensaje) {
        nombre = nom.getText();
        apellido = ap.getText();
        dni = d.getText();
        email = em.getText();
        password = pas.getText();
        respuesta = res.getText();
        boolean validado = false;
        if(validarNombre() != null){
            mensaje.setText(this.mensajeNombre);
        } else if (validarApellido() != null){
            mensaje.setText(this.mensajeApellido);
        } else if (validarDni() != null){
            mensaje.setText(this.mensajeDni);
        } else if (validarEmail() != null){
            mensaje.setText(this.mensajeEmail);
        }else if (validarPassword() != null){
            mensaje.setText(this.mensajePassword);
        }else if (validarRespuesta() != null){
            mensaje.setText(this.mensajeRespuesta);
        }else {
            mensaje.setText("");
            validado = true;
        }
        return validado;
    }

    //Metodo de Validacion de Nombre de Empleado
    public String validarNombre() {
        
        //Compilador de Expresion Regular
        Pattern p;
        
        //Comparador de Expresion Regular con cadena de caracteres
        Matcher m;
        
        //Expresion Regular compilada para Validacion de Nombre (solo letras)
        p = Pattern.compile("[0-9$&+,.:%;=@#|]");
        
        //Comparacion de Expresion Regular compilada con dato de Nombre de Empleado (nombre)
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

    //Metodo de Validacion de Apellido de Empleado
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

    //Metodo de Validacion de DNI de Empleado
    public String validarDni() {
        Pattern p;
        Matcher m;
        p = Pattern.compile("[\\D]");
        m = p.matcher(dni);
        if (dni.isEmpty()) {
            this.mensajeDni = "Complete el campo DNI";
        } else if (m.find()) {
            this.mensajeDni = "DNI debe contener solo números";
        } else if (dni.length() < 8 || dni.length() > 8) {
            this.mensajeDni = "DNI debe contener 8 números";
        } else {
            this.mensajeDni = null;
        }
        return this.mensajeDni;
    }

    //Metodo de Validacion de Correo Electronico de Empleado
    public String validarEmail() {
        Pattern p;
        Pattern web;
        Matcher m;
        Matcher bew;
        p = Pattern.compile("^[_a-zA-Z0-9-]+(\\.[_a-z0-9-]+)*@"
                + "[a-z0-9-]+(\\.[a-z]{2,3})$");
        m = p.matcher(email);
        web = Pattern.compile("^www\\.");
        bew = web.matcher(email);
        if (email.isEmpty()) {
            mensajeEmail = "Complete el campo Correo Electrónico";
        } else if (!m.find()) {
            mensajeEmail = "Correo Electrónico inválido";
        } else if (bew.find()) {
            mensajeEmail = "Correo Electrónico inválido";
        } else {
            mensajeEmail = null;
        }
        return mensajeEmail;
    }

    //Metodo de Validacion de Contraseña de Empleado
    public String validarPassword() {
        if (password.isEmpty()) {
            mensajePassword = "Complete el campo Contraseña";
        } else {
            Pattern cantMay;
            Pattern cantMin;
            Pattern cantNum;
            Pattern cantSig;
            Matcher cMay;
            Matcher cMin;
            Matcher cNum;
            Matcher cSig;
            cantMay = Pattern.compile("[A-Z]");
            cMay = cantMay.matcher(password);
            cantMin = Pattern.compile("[a-z]");
            cMin = cantMin.matcher(password);
            cantNum = Pattern.compile("[0-9]{3,25}");
            cNum = cantNum.matcher(password);
            cantSig = Pattern.compile("[$&+,.:%;=@#|]");
            cSig = cantSig.matcher(password);
            if (password.length() < 8) {
                mensajePassword = "Contraseña debe tener mínimo 8 digitos";
            } else if (!cMay.find()) {
                mensajePassword = "Contraseña debe tener mínimo 1 mayúscula";
            } else if (!cMin.find()) {
                mensajePassword = "Contraseña debe tener mínimo 1 minúscula";
            } else if (!cNum.find()) {
                mensajePassword = "Contraseña debe tener mínimo 3 números";
            } else if (!cSig.find()) {
                mensajePassword = "Contraseña debe tener mínimo 1: ' $&+,.:%;=@#| '";
            } else {
                mensajePassword = null;
            }
        }
        return mensajePassword;
    }

    //Metodo de Validacion de Respuesta de Empleado
    public String validarRespuesta() {
        if (respuesta.isEmpty()) {
            mensajeRespuesta = "Complete el campo Respuesta";
        } else {
            mensajeRespuesta = null;
        }
        return mensajeRespuesta;
    }
}

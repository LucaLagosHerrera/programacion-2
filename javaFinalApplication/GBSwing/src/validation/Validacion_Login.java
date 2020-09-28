/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author LUKA28
 */
public class Validacion_Login {
    
    //Datos de Validacion de Inicio de Sesion
    String email;
    String password;
    String mensajeEmail;
    String mensajePassword;
    
    //Metodo de Validacion de Inicio de Sesion
    public boolean validarLogin(JTextField e, JPasswordField p, JLabel mensaje){
        email = e.getText();
        password = p.getText();
        boolean validado = false;
        if(validarEmail() != null){
            mensaje.setText(this.mensajeEmail);
        } else if (validarPassword() != null){
            mensaje.setText(this.mensajePassword);
        } else {
            mensaje.setText("");
            validado = true;
        }
        return validado;
    }
    
    //Metodo de Validacion de Correo Electronico de Inicio de Sesion
    public String validarEmail() {
        
        //Compiladores de Expresiones Regulares
        Pattern p;
        Pattern web;
        
        //Comparadores de Expresiones Regulares con cadenas de caracteres
        Matcher m;
        Matcher bew;
        
        //Expresion Regular compilada para Validacion de Correo Electronico (verificar estructura correcta de un Email)
        p = Pattern.compile("^[_a-zA-Z0-9-]+(\\.[_a-z0-9-]+)*@"
                + "[a-z0-9-]+(\\.[a-z]{2,3})$");
        
        //Comparacion de Expresion Regular compilada con dato de Correo Electronico (email)
        m = p.matcher(email);
        
        //Expresion Regular compilada para Validacion de Correo Electronico (evitar "www")
        web = Pattern.compile("^www\\.");
        
        //Comparacion de Expresion Regular compilada con dato de Correo Electronico (email)
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

    //Metodo de Validacion de Contraseña
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
                mensajePassword = "Contraseña debe tener mínimo una mayúscula";
            } else if (!cMin.find()) {
                mensajePassword = "Contraseña debe tener mínimo una minúscula";
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
}

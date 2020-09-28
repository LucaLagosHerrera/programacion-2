/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2swing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author LUKA28
 */
public class Validacion {

    String email;
    String password;
    String messageEmail;
    String messagePassword;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String validateEmail() {
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
            messageEmail = "Complete el Campo de Correo Electrónico";
        } else if (!m.find()) {
            messageEmail = "El Correo Electrónico ingresado es inválido";
        } else if (bew.find()) {
            messageEmail = "Debe ingresar un Correo Electrónico, no una URL";
        } else {
            messageEmail = null;
        }
        return messageEmail;
    }

    public String validatePassword() {
        if (password.isEmpty()) {
            messagePassword = "Complete el Campo de Contraseña";
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
                messagePassword = "La contraseña debe tener como mínimo 8 digitos";
            } else if (!cMay.find()) {
                messagePassword = "La contraseña debe tener como mínimo una mayúscula";
            } else if (!cMin.find()) {
                messagePassword = "La contraseña debe tener como mínimo una minúscula";
            } else if (!cNum.find()) {
                messagePassword = "La contraseña debe tener como mínimo 3 números";
            } else if (!cSig.find()) {
                messagePassword = "La contraseña debe tener como mínimo uno de estos signos \n ' $&+,.:%;=@#| '";
            } else {
                messagePassword = null;
            }
        }
        return messagePassword;
    }
}

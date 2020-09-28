/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3swing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author luca_
 */
public class Validacion {

    String nombre;
    String apellido;
    String email;
    String password;
    String repeatPassword;
    String domicilio;
    String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

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

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Validacion{" + "nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", password=" + password + ", repeatPassword=" + repeatPassword + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }

    private String mensajeNombre;
    private String mensajeApellido;
    private String mensajeEmail;
    private String mensajePassword;
    private String mensajeRepeatPassword;
    private String mensajeDomicilio;
    private String mensajeTelefono;

    public String validarNombre() {
        Pattern caracter;
        Matcher car;
        caracter = Pattern.compile("[0-9$&+,.:%;=@#|]");
        car = caracter.matcher(nombre);
        if (nombre.isEmpty()) {
            mensajeNombre = "Complete el Campo de Nombre";
        } else if (car.find()) {
            mensajeNombre = "El Nombre no debe contener ni numeros ni signos";
        } else {
            mensajeNombre = null;
        }
        return mensajeNombre;
    }

    public String validarApellido() {
        Pattern caracter;
        Matcher car;
        caracter = Pattern.compile("[0-9$&+,.:%;=@#|]");
        car = caracter.matcher(apellido);
        if (apellido.isEmpty()) {
            mensajeApellido = "Complete el Campo de Apellido";
        } else if (car.find()) {
            mensajeApellido = "El Apellido no debe contener ni numeros ni signos";
        } else {
            mensajeApellido = null;
        }
        return mensajeApellido;
    }

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
            mensajeEmail = "Complete el Campo de Correo Electrónico";
        } else if (!m.find()) {
            mensajeEmail = "El Correo Electrónico ingresado es inválido";
        } else if (bew.find()) {
            mensajeEmail = "Debe ingresar un Correo Electrónico, no una URL";
        } else {
            mensajeEmail = null;
        }
        return mensajeEmail;
    }

    public String validarPassword() {
        if (password.isEmpty()) {
            mensajePassword = "Complete el Campo de Contraseña";
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
                mensajePassword = "La contraseña debe tener como mínimo 8 digitos";
            } else if (!cMay.find()) {
                mensajePassword = "La contraseña debe tener como mínimo una mayúscula";
            } else if (!cMin.find()) {
                mensajePassword = "La contraseña debe tener como mínimo una minúscula";
            } else if (!cNum.find()) {
                mensajePassword = "La contraseña debe tener como mínimo 3 números";
            } else if (!cSig.find()) {
                mensajePassword = "La contraseña debe tener como mínimo uno de estos signos \n ' $&+,.:%;=@#| '";
            } else {
                mensajePassword = null;
            }
        }
        return mensajePassword;
    }

    public String validarRepeatPassword() {
        if (repeatPassword.isEmpty()) {
            mensajeRepeatPassword = "Complete el Campo de Repetir Contraseña";
        } else if (!repeatPassword.equals(password)) {
            mensajeRepeatPassword = "No hay coincidencias con la contraseña";
        } else {
            mensajeRepeatPassword = null;
        }
        return mensajeRepeatPassword;
    }

    public String validarDomicilio() {
        if (domicilio.isEmpty()) {
            mensajeDomicilio = "Complete el Campo de Domicilio";
        } else {
            mensajeDomicilio = null;
        }
        return mensajeDomicilio;
    }

    public String validarTelefono() {
        Pattern caracter;
        Matcher car;
        caracter = Pattern.compile("[\\D]");
        car = caracter.matcher(telefono);
        if (telefono.isEmpty()) {
            mensajeTelefono = "Complete el Campo de Telefono";
        } else if (car.find()) {
            mensajeTelefono = "El Telefono debe contener solo numeros";
        } else if (telefono.length() < 10) {
            mensajeTelefono = "El Telefono debe tener un minimo de 10 numeros";
        } else if (telefono.length() > 20) {
            mensajeTelefono = "El Telefono debe tener un maximo de 20 numeros";
        } else {
            mensajeTelefono = null;
        }
        return mensajeTelefono;
    }

}

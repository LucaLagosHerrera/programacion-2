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
public class Validacion_Forgot {

    //Datos de Validacion de Busqueda de Empleado
    String buscar;
    String mensajeBuscar;

    //Metodo de Validacion de Busqueda de Empleado
    public boolean validarBuscarEmpleado(JTextField bu, JLabel mensaje) {
        buscar = bu.getText();
        boolean validado = false;
        if (validarDni() != null) {
            mensaje.setText(this.mensajeBuscar);
        } else {
            mensaje.setText("");
            validado = true;
        }
        return validado;
    }

    //Metodo de Validacion de DNI de Empleado
    public String validarDni() {
        
        //Compilador de Expresion Regular
        Pattern p;
        
        //Comparador de Expresion Regular con cadena de caracteres
        Matcher m;
        
        //Expresion Regular compilada para Validacion de DNI (solo numeros)
        p = Pattern.compile("[\\D]");
        
        //Comparacion de Expresion Regular compilada con dato de DNI de Empleado (dni)
        m = p.matcher(buscar);
        if (buscar.isEmpty()) {
            this.mensajeBuscar = "Complete el campo Búsqueda";
        } else if (m.find()) {
            this.mensajeBuscar = "El DNI debe contener solo números";
        } else if (buscar.length() < 8 || buscar.length() > 8) {
            this.mensajeBuscar = "DNI debe contener 8 números";
        } else {
            this.mensajeBuscar = null;
        }
        return this.mensajeBuscar;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptation;

import java.util.Base64;

/**
 *
 * @author LUKA28
 */
public class Encriptacion_Empleado {

    /*En este caso, se utilizo el Sistema Base64 para los Encriptados/Desencriptados de
     la Contraseña de Empleado, el cual no precisamente se utiliza para encriptar datos, sino para codificarlos 
    con caracteres ASCII para asi protegerlos cuando sean enviados; aun asi, en este caso, es muy util.
     */
       
     //Metodo de Encriptacion de Contraseña de Empleado con Sistema Base64
    public String encriptarPassword(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes());
    }

    //Metodo de Desencriptacion de Contraseña de Empleado con Sistema Base64
    public String desencriptarPassword(String password) {
        return new String(Base64.getMimeDecoder().decode(password));
    }
}

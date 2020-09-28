/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3swing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luca_
 */
public class Encriptacion {
       
    public String encriptarContraseña(String password){
        String cifrado = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] array = md.digest(password.getBytes());
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < array.length; i++){
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            cifrado = sb.toString();
            return cifrado;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Encriptacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

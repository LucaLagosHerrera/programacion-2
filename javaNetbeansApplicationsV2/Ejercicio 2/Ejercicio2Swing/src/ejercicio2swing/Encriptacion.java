/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2swing;

import java.util.ArrayList;

/**
 *
 * @author LUKA28
 */
public class Encriptacion {

    String email;
    String password;


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

    public String encryptDate() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Email: " + email + "\n");
        lista.add("Password: " + password + "\n");
        String document = String.valueOf(lista);
        char array[] = document.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] + (char) 5);
        }
        String encrypt = String.valueOf(array);
        return encrypt;
    }

    public String desencryptDate(String encrypt) {
        char array[] = encrypt.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] - (char) 5);
        }
        String desencrypt = String.valueOf(array);
        return desencrypt;
    }
}

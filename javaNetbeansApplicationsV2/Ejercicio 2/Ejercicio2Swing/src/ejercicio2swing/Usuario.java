/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2swing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author LUKA28
 */
public class Usuario {

    public static void main(String[] args) {
        Login lg = new Login();
        lg.setVisible(true);
        lg.setLocationRelativeTo(null);
        lg.setSize(513, 285);
        lg.setResizable(false);
    }

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

    Validacion v = new Validacion();
    Encriptacion e = new Encriptacion();
    Respaldo r = new Respaldo();
    JFileChooser select = new JFileChooser();
    File file;
    FileInputStream entry;
    FileOutputStream exit;

    public int validateDate() {
        v.email = email;
        v.password = password;
        int number = 0;
        if (v.validateEmail() != null) {
            JOptionPane.showMessageDialog(null, "" + v.validateEmail());
        } else if (v.validatePassword() != null) {
            JOptionPane.showMessageDialog(null, "" + v.validatePassword());
        } else {
            e.email = email;
            e.password = password;
            
            if (select.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
                file = select.getSelectedFile();
                if (file.getName().endsWith("txt")) {
                    String message = r.saveFile(file, e.encryptDate());
                    if (message != null) {
                        number = 1;
                        JOptionPane.showMessageDialog(null, message);
                        Archivo a = new Archivo();
                        a.setVisible(true);
                        a.setLocationRelativeTo(null);
                        a.setResizable(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Archivo no compatible");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debe guardar el archivo con la extensión 'txt");
                }
            }
        }
        return number;
    }

    public String recoveryDate() {
        r.recoveryFile();
        return r.recovery;
    }

}

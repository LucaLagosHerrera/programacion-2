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
public class Respaldo {

    Encriptacion e = new Encriptacion();
    String text;
    String recovery;
    String message;
    String document;
    JFileChooser select = new JFileChooser();
    File file;
    FileInputStream entry;
    FileOutputStream exit;
    
    public String saveFile(File file, String document) {
        message = null;
        try {
            exit = new FileOutputStream(file);
            byte[] bytxt = document.getBytes();
            exit.write(bytxt);
            message = "Los Datos se han guardado correctamente";
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return message;
    }

    public String openFile(File file) {
        document = "";
        try {
            entry = new FileInputStream(file);
            int ascii;
            while ((ascii = entry.read()) != -1) {
                char character = (char) ascii;
                document = document + character;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return document;
    }

    public String recoveryFile() {
        if (select.showDialog(select, "Abrir") == JFileChooser.APPROVE_OPTION) {
            file = select.getSelectedFile();
            if (file.canRead() && file.getName().endsWith("txt")) {
                String document = this.openFile(file);
                String desencrypt = e.desencryptDate(document);
                recovery = desencrypt;
            } else {
                JOptionPane.showMessageDialog(null, "Archivo no compatible");
            }

        }
        return recovery;
    }
}

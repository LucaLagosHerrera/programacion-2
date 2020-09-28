/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3swing;

import javax.swing.JOptionPane;

/**
 *
 * @author luca_
 */
public class Usuario {

    String id;
    String nombre;
    String apellido;
    String email;
    String password;
    String repeatPassword;
    String domicilio;
    String telefono;
    String usertype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", password=" + password + ", repeatPassword=" + repeatPassword + ", domicilio=" + domicilio + ", telefono=" + telefono + ", usertype=" + usertype + '}';
    }

    public int validarUsuarioRegistrar() {
        Validacion v = new Validacion();
        int number = 0;
        v.nombre = nombre;
        v.apellido = apellido;
        v.email = email;
        v.password = password;
        v.repeatPassword = repeatPassword;
        v.domicilio = domicilio;
        v.telefono = telefono;
        if (v.validarNombre() != null) {
            JOptionPane.showMessageDialog(null, "" + v.validarNombre());
        } else if (v.validarApellido() != null) {
            JOptionPane.showMessageDialog(null, "" + v.validarApellido());
        } else if (v.validarEmail() != null) {
            JOptionPane.showMessageDialog(null, "" + v.validarEmail());
        } else if (v.validarPassword() != null) {
            JOptionPane.showMessageDialog(null, "" + v.validarPassword());
        } else if (v.validarRepeatPassword() != null) {
            JOptionPane.showMessageDialog(null, "" + v.validarRepeatPassword());
        } else if (v.validarDomicilio() != null) {
            JOptionPane.showMessageDialog(null, "" + v.validarDomicilio());
        } else if (v.validarTelefono() != null) {
            JOptionPane.showMessageDialog(null, "" + v.validarTelefono());
        } else {
            number = 1;
        }
        return number;
    }

    public int validarUsuarioEditar() {
        Validacion v = new Validacion();
        int number = 0;
        v.nombre = nombre;
        v.apellido = apellido;
        v.email = email;
        v.password = password;
        v.repeatPassword = repeatPassword;
        v.domicilio = domicilio;
        v.telefono = telefono;
        if (v.validarNombre() != null) {
            JOptionPane.showMessageDialog(null, "" + v.validarNombre());
        } else if (v.validarApellido() != null) {
            JOptionPane.showMessageDialog(null, "" + v.validarApellido());
        } else if (v.validarEmail() != null) {
            JOptionPane.showMessageDialog(null, "" + v.validarEmail());
        } else if (v.validarPassword() != null) {
            JOptionPane.showMessageDialog(null, "" + v.validarPassword());
        } else if (v.validarDomicilio() != null) {
            JOptionPane.showMessageDialog(null, "" + v.validarDomicilio());
        } else if (v.validarTelefono() != null) {
            JOptionPane.showMessageDialog(null, "" + v.validarTelefono());
        } else {
            number = 1;
        }
        return number;
    }

    public int validarUsuarioLogin() {
        Validacion v = new Validacion();
        int number = 0;
        v.email = email;
        v.password = password;
        if (v.validarEmail() != null) {
            JOptionPane.showMessageDialog(null, "" + v.validarEmail());
        } else if (v.validarPassword() != null) {
            JOptionPane.showMessageDialog(null, "" + v.validarPassword());
        } else {
            number = 1;
        }
        return number;
    }
}

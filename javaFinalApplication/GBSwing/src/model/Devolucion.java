/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author LUKA28
 */
public class Devolucion {
    
    //Datos del modelo de tabla devolucion de BBDD
    String id;
    String nombre_estudiante;
    String apellido_estudiante;
    String dni_estudiante;
    String curso_estudiante;
    String division_estudiante;
    String titulo_libro;
    String edicion_libro;
    String isbn_libro;
    String autor_libro;
    String editorial_libro;
    public Date fecha_devolucion;

    //Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    public String getApellido_estudiante() {
        return apellido_estudiante;
    }

    public void setApellido_estudiante(String apellido_estudiante) {
        this.apellido_estudiante = apellido_estudiante;
    }

    public String getDni_estudiante() {
        return dni_estudiante;
    }

    public void setDni_estudiante(String dni_estudiante) {
        this.dni_estudiante = dni_estudiante;
    }

    public String getCurso_estudiante() {
        return curso_estudiante;
    }

    public void setCurso_estudiante(String curso_estudiante) {
        this.curso_estudiante = curso_estudiante;
    }

    public String getDivision_estudiante() {
        return division_estudiante;
    }

    public void setDivision_estudiante(String division_estudiante) {
        this.division_estudiante = division_estudiante;
    }

    public String getTitulo_libro() {
        return titulo_libro;
    }

    public void setTitulo_libro(String titulo_libro) {
        this.titulo_libro = titulo_libro;
    }

    public String getEdicion_libro() {
        return edicion_libro;
    }

    public void setEdicion_libro(String edicion_libro) {
        this.edicion_libro = edicion_libro;
    }

    public String getIsbn_libro() {
        return isbn_libro;
    }

    public void setIsbn_libro(String isbn_libro) {
        this.isbn_libro = isbn_libro;
    }

    public String getAutor_libro() {
        return autor_libro;
    }

    public void setAutor_libro(String autor_libro) {
        this.autor_libro = autor_libro;
    }

    public String getEditorial_libro() {
        return editorial_libro;
    }

    public void setEditorial_libro(String editorial_libro) {
        this.editorial_libro = editorial_libro;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    //ToString
    @Override
    public String toString() {
        return "Devolucion{" + "id=" + id + ", nombre_estudiante=" + nombre_estudiante + ", apellido_estudiante=" + apellido_estudiante + ", dni_estudiante=" + dni_estudiante + ", curso_estudiante=" + curso_estudiante + ", division_estudiante=" + division_estudiante + ", titulo_libro=" + titulo_libro + ", edicion_libro=" + edicion_libro + ", isbn_libro=" + isbn_libro + ", autor_libro=" + autor_libro + ", editorial_libro=" + editorial_libro + ", fecha_devolucion=" + fecha_devolucion + '}';
    }
}

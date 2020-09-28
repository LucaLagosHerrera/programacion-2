/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LUKA28
 */
public class Libro {
    
    //Datos del modelo de tabla libro de BBDD
    String id;
    public String titulo;
    public String edicion;
    public String isbn;
    public String autor;
    public String editorial;

    //Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    //ToString
    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", titulo=" + titulo + ", edicion=" + edicion + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
   
}

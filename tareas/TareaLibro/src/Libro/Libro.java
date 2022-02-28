/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author jaimegm
 */
public class Libro {
    private String titulo, autor, editorial;
    private String tamaño;
    private int paginas;
    private String color;
    
    //Método constructor
    public Libro() {
    }
    
    //Método constructor sobrecargado
    public Libro(String titulo, String autor, String editorial, String tamaño, int paginas, String color) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.tamaño = tamaño;
        this.paginas = paginas;
        this.color = color;
    }
    
    //Método de uso general
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}

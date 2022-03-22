/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScottPilgrim;

import DatosLibro.Autor;
import DatosLibro.Editorial;

/**
 *
 * @author jaimegm
 */
public class Libro {

    private String titulo;
    private Autor escritor;
    private Editorial libreria;

    public Libro() {
    }

    public Libro(String titulo, Autor escritor, Editorial libreria) {
        this.titulo = titulo;
        this.escritor = escritor;
        this.libreria = libreria;
    }

    public Editorial getLibreria() {
        return libreria;
    }

    public void setLibreria(Editorial libreria) {
        this.libreria = libreria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", escritor=" + escritor + ", libreria=" + libreria + '}';
    }

    public void leer(String libro) {
        System.out.println(this.titulo + " está siendo leído ");
    }

    public void escribir(String nombre) {
        System.out.println(this.escritor + " escribió este libro ");
    }

    public void publicar(String nombre) {
        System.out.println(this.libreria + " ha publicado este libro ");
    }
}

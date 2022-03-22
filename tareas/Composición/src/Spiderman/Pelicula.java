/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Spiderman;

import DatosPelicula.Actor;
import DatosPelicula.Director;
import DatosPelicula.Productora;

/**
 *
 * @author jaimegm
 */
public class Pelicula {
    private String titulo;
    private Director realizador;
    private Productora elaboradora;
    private Actor personaje;

    public Pelicula() {
    }

    public Pelicula(String titulo, Director realizador, Productora elaboradora, Actor personaje) {
        this.titulo = titulo;
        this.realizador = realizador;
        this.elaboradora = elaboradora;
        this.personaje = personaje;
    }

    public Actor getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Actor personaje) {
        this.personaje = personaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Director getRealizador() {
        return realizador;
    }

    public void setRealizador(Director realizador) {
        this.realizador = realizador;
    }

    public Productora getElaboradora() {
        return elaboradora;
    }

    public void setElaboradora(Productora elaboradora) {
        this.elaboradora = elaboradora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", realizador=" + realizador + ", elaboradora=" + elaboradora + ", personaje=" + personaje + '}';
    }
    
    public void dirigir(String nombre) {
        System.out.println(this.realizador + " ha dirigido esta película ");
    }
    
    public void producir(String nombre) {
        System.out.println(this.elaboradora + " ha producido esta película ");
    }
    
    public void representar(String nombre) {
        System.out.println(this.personaje + " ha actuado en esta película ");
    }
    
    public void ver (String nombre) {
        System.out.println(this.titulo + " está siendo vista ");
    }
}

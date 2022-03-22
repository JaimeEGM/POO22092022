/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composición;

import DatosLibro.Autor;
import DatosLibro.Editorial;
import DatosPelicula.Actor;
import DatosPelicula.Director;
import DatosPelicula.Productora;
import ScottPilgrim.Libro;
import Spiderman.Pelicula;

/**
 *
 * @author jaimegm
 */
public class Composición {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("LIBRO");
        Libro scottpilgrim = new Libro();
        scottpilgrim.setTitulo("Scott Pilgrim y la Tristeza Infinita");
        scottpilgrim.setEscritor(new Autor("Bryan Lee O'Malley", 43));
        scottpilgrim.setLibreria(new Editorial("Kamité", "México, CDMX"));
        System.out.println(scottpilgrim);
        scottpilgrim.escribir("Bryan Lee O'Malley");
        scottpilgrim.publicar("Kamité");
        scottpilgrim.leer("Scott Pilgrim y la Tristeza Infinita");

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(" PELÍCULA ");
        Pelicula peli1 = new Pelicula();
        peli1.setTitulo("Spiderman 2");
        peli1.setRealizador(new Director("Sam Raimi", 62));
        peli1.setElaboradora(new Productora(" Columbia Pictures ", " 200 millones USD "));
        peli1.setPersonaje(new Actor("Tobey Maguire", 46));
        System.out.println(peli1);
        peli1.dirigir("Sam");
        peli1.producir("Columbia");
        peli1.representar("Tobey");
        peli1.ver("Spiderman");

    }

}

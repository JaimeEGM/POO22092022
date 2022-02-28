/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibro;

import Libro.Libro;

/**
 *
 * @author jaimegm
 */
public class TareaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Leamos un libro!!");
        Libro scottpilgrim = new Libro();
        scottpilgrim.setAutor("Bryan Lee O'Malley");
        System.out.println("Autor: " + scottpilgrim.getAutor());
        scottpilgrim.setEditorial("Kamite");
        System.out.println("Editorial: " + scottpilgrim.getEditorial());
        scottpilgrim.setTitulo("Scott Pilgrim vs el Universo");
        System.out.println("Titulo: " + scottpilgrim.getTitulo());
        scottpilgrim.setPaginas(234);
        System.out.println("Páginas: " + scottpilgrim.getPaginas());
        scottpilgrim.setColor("Morado con amarillo");
        System.out.println("Color de portada: " + scottpilgrim.getColor());
        scottpilgrim.setTamaño("Mediano pasta gruesa");
        System.out.println("Tamaño y pasta: " + scottpilgrim.getTamaño());

        // TODO code application logic here
    }

}

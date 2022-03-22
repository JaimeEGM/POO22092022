/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import ico.fes.herencia.polimorfismo.Animal;
import ico.fes.herencia.polimorfismo.Perro;
import javax.swing.JFrame;

/**
 *
 * @author jaimegm
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = new String("José José");
        System.out.println(nombre);
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.toUpperCase());

        /*
        JFrame ventana = new JFrame("Mi primer ventana Java");
        ventana.setSize(600, 400);
        ventana.setVisible(true);
         */
        Computadora miCompu = new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setModelo("TUF Gaming F15");
        miCompu.setCpu(new Procesador("intel", 2.6f));
        miCompu.setPantalla(new Monitor("LG", 32));
        miCompu.setRatón(new Mouse("Hp", "Inalámbrico"));
        miCompu.setTeclado(new Teclado("Por defecto", 200));
        System.out.println(miCompu);
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
        //Ejercicio; Establecer un mouse marca Logitech del tipo óptico
        miCompu.setRatón(new Mouse("Logitech", "Óptico"));
        System.out.println(miCompu);

        Computadora compu2 = new Computadora("Apple", "MacBook Pro",
                new Monitor("Toshiba", 14.3f),
                new Mouse("Acteck", "Óptico"),
                new Teclado("Apple", 101),
                new Procesador("M1", 3.4f));
        System.out.println(compu2);
        /*Método 1: compu2.setRatón(new Mouse("Apple", "Touch"));
        Método 2:
         */
        compu2.getRatón().setMarca("Apple");
        compu2.getRatón().setTipo("Touch");
        System.out.println(compu2);

        System.out.println("-----------------------------------------------");
        Alumno alu1 = new Alumno();
        alu1.setNombre("Jaime");
        System.out.println(alu1);

        Alumno alu2 = new Alumno("317074006", "ICO", "Jaime González", 21);
        System.out.println(alu2);

        alu1.setNumeroCuenta("31234567");
        alu1.setEdad(20);
        System.out.println(alu1);

        System.out.println("--------------------Composición y Herencia en la misma clase-------------");
        Servidor server = new Servidor();
        System.out.println(server);
        server.setNumeroTarjetasRed(2);
        System.out.println(server);
        server.setMarca("HP");
        System.out.println(server);
        server.setRatón(new Mouse("LG", "Óptico"));
        server.getRatón().setMarca("Logitech");
        System.out.println(server);
        
        System.out.println("----------Ejemplo polimorfismo----------");
        Perro dog = new Perro("Bull dog", "5 estrellas", 4);
        Animal animal1 = new Animal(4);
        dog.emitirSonido();
        animal1.emitirSonido();

    }

}

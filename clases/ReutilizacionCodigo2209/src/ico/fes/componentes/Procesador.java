/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author jaimegm
 */
public class Procesador {
    private String marca;
    private float frecuanciaEnGhz;

    public Procesador() {
    }

    public Procesador(String marca, float frecuanciaEnGhz) {
        this.marca = marca;
        this.frecuanciaEnGhz = frecuanciaEnGhz;
    }

    public float getFrecuanciaEnGhz() {
        return frecuanciaEnGhz;
    }

    public void setFrecuanciaEnGhz(float frecuanciaEnGhz) {
        this.frecuanciaEnGhz = frecuanciaEnGhz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Procesador{" + "marca=" + marca + ", frecuanciaEnGhz=" + frecuanciaEnGhz + '}';
    }
    
    
}

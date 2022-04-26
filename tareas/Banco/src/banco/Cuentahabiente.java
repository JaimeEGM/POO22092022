/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author jaimegm
 */
public class Cuentahabiente {

    private String idCliente;
    private String nombre;
    private float balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(String idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }

    public void retirarDinero(float monto) {
        //Código para restarle el monto al balance
        System.out.println(this.nombre + " ha retirado " + monto + "MXN");
        this.balance -= monto;
        System.out.println(" Su balance ahora es de " + this.balance + "MXN");
    }

    public String evaluarNivelCliente() {
        return this.balance < 50000 ? this.nombre + " es cliente REGULAR :| " : this.nombre + " es cliente PREMIUM ;) ";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author jaimegm
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------Lista y retiro de Cuentahabientes------");
        Cuentahabiente[] lista = new Cuentahabiente[5];//5 cuentahabientes
        lista[0] = new Cuentahabiente("310095", "Karime", 140601.00f);
        lista[1] = new Cuentahabiente("317074", "Jaime", 220900.00f);
        lista[2] = new Cuentahabiente("124563", "Said", 45600.00f);
        lista[3] = new Cuentahabiente("312844", "Johnny", 21060.00f);
        lista[4] = new Cuentahabiente("317230", "Abraham", 20800.00f);
        System.out.println(lista [0]);
        lista[0].retirarDinero(15000f);
        System.out.println("------------------------------------------");
        System.out.println(lista[1]);
        lista[1].retirarDinero(120500f);
        System.out.println("------------------------------------------");
        System.out.println(lista[2]);
        lista[2].retirarDinero(3500f);
        System.out.println("------------------------------------------");
        System.out.println(lista[3]);
        lista[3].retirarDinero(2633.8f);
        System.out.println("------------------------------------------");
        System.out.println(lista[4]);
        lista[4].retirarDinero(20500.5f);
        
        System.out.println("------------Estado de cuentahabientes-----------");
        for (Cuentahabiente cuentahabiente : lista) {
            System.out.println(cuentahabiente.evaluarNivelCliente());

        }

    }

}

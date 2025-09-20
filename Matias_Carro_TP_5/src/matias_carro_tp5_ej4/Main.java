/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej4;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {
        Banco banco1 = new Banco("Banco Macro", "30-50001008-4");
        Cliente cliente1 = new Cliente("Matias Carro", "12345678");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("4000 1234 5678 9123", "11/30", banco1);

        //Creando las relaciones
        cliente1.setTarjetaDeCredito(tarjeta1);
        tarjeta1.setCliente(cliente1);

        //Probando las asociaciones
        System.out.println(cliente1.getTarjetaDeCredito());
        System.out.println(tarjeta1.getCliente());

        System.out.println(cliente1);
        System.out.println(cliente1.getCliente());

    }
}

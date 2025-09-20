/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej6;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Matias", "1145671234");
        Cliente cliente2 = new Cliente("Emiliano", "158156631");
        Cliente cliente3 = new Cliente("Gisel", "116584224");

        Mesa mesa1 = new Mesa("1", "4");
        Mesa mesa2 = new Mesa("2", "2");

        Reserva reserva1 = new Reserva("20/9", "20:00 hs", mesa1);
        Reserva reserva2 = new Reserva("22/10", "20:30 hs", mesa2);
        Reserva reserva3 = new Reserva("15/9", "21:00 hs", mesa1);

        //creamos la relacion unidireccional
        reserva1.setCliente(cliente1);
        reserva2.setCliente(cliente2);
        reserva3.setCliente(cliente3);

        //probamos las relaciones
        System.out.println(reserva1.getCliente());
        System.out.println(reserva1.getMesa());

        //toString()
        System.out.println(reserva1);
        System.out.println(reserva2);
        System.out.println(reserva3);
    }
}

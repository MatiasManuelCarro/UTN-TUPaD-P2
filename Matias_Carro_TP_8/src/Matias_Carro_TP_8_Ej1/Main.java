/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matias_Carro_TP_8_Ej1;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {

        //Se crean clientes
        Cliente cliente1 = new Cliente("Matias");

        //se crean los productos
        Producto producto1 = new Producto("Lapicera", 600);
        Producto producto2 = new Producto("Cuaderno", 1500);
        Producto producto3 = new Producto("Lapiz", 200);

        //se crea la lista 1 de productos
        ArrayList<Producto> lista1 = new ArrayList<>();

        //se le agregan prodcutos a la lista
        lista1.add(producto1);
        lista1.add(producto1);
        lista1.add(producto1);
        lista1.add(producto2);
        lista1.add(producto3);
        lista1.add(producto3);

        //se crea el pedido 1 
        Pedido pedido1 = new Pedido(lista1, 0, "Tarjeta", cliente1);

        //Se muestra total
        System.out.println("Pedido : " + pedido1 + "- Total: " + pedido1.calcularTotal());

     // el cliente paga con tarjteta de credito
        PagoConDescuento medioPago = new TarjetaCredito();
        double totalConDescuento = medioPago.aplicarDescuento(pedido1.calcularTotal());
        medioPago.procesarPago(totalConDescuento);       
        


       //El cliente paga con una billetera virtual (sin descuento)
        Pago mercado = new BilleteraVirtual();
        mercado.procesarPago(pedido1.calcularTotal());

       //Se cambia el estado del pedido y se notifica al cliente
        pedido1.cambiarEstado("En preparación");
        pedido1.cambiarEstado("Enviado");
        pedido1.cambiarEstado("Entregado");

        
        
        
    }
}

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

public class Pedido implements Pagable {

    private ArrayList<Producto> productos;
    private double totalPedido;
    private double descuento;
    private String tipoPago;
    private Cliente cliente;
   private String estado;


    public Pedido(ArrayList<Producto> productos, double descuento, String tipoPago, Cliente cliente) {
        this.productos = productos;
        this.descuento = descuento;
        this.tipoPago = tipoPago;
        this.cliente = cliente;
    }

    public double getDescuento() {
        return descuento;
    }
    
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

      
        public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El pedido cambió de estado a: " + nuevoEstado);
    }

    @Override
    public double calcularTotal() {
        totalPedido = 0; 
        for (Producto p : productos) {
            totalPedido += p.getPrecio();
        }
        return totalPedido;
    }


    @Override
    public String toString() {
        String resultado = "\n";
        for (Producto p : productos) {
            resultado += "- " + p.getNombre() + " - $" + p.getPrecio() + "\n";
        }
        return resultado;
    }
}

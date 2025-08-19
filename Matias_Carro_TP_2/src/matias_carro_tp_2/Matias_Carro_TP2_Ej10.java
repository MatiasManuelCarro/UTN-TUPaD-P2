/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp_2;

import java.util.Scanner;

/**
 *
 * @author matias.carro
 */
public class Matias_Carro_TP2_Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int stockActual, cantidadVendida, cantidadRecibida;
                                             
            System.out.println("Ingrese el stock actual del product");
            stockActual = Integer.parseInt(input.nextLine());
            
            System.out.println("Ingrese la cantidad vendida de productos");
            cantidadVendida = Integer.parseInt(input.nextLine());
            
            System.out.println("Ingrese la cantidad que ingresan de productos");
            cantidadRecibida = Integer.parseInt(input.nextLine());
            
            System.out.println("El nuevo stock del producto es: "+actualizaStock(stockActual, cantidadVendida, cantidadRecibida));
            
            
            
    }
    
    static int actualizaStock (int stockActual, int cantidadVendida, int cantidadRecibida) {
        stockActual = (stockActual - cantidadVendida) + cantidadRecibida;
        return stockActual;
    }
}

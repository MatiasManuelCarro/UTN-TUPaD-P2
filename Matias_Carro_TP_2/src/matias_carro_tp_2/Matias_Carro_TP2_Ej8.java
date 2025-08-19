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
public class Matias_Carro_TP2_Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
               
        double precioBase, impuesto, descuento;
        
        System.out.println("Ingrese el precio del producto :");
        precioBase = Double.parseDouble(input.nextLine());
        System.out.println("preciobase"+precioBase);
        System.out.println("Ingrese el impuesto en porcentaje \"(sin %)\" :");
        impuesto = Double.parseDouble(input.nextLine());
        System.out.println("Imgrese el descuyento en porcentaje \"(sin %)\" :");
        descuento = Double.parseDouble(input.nextLine());
        
        //llamamos al metodo dentro del print
        System.out.println(calcularPrecioFinal(impuesto, descuento, precioBase));      
              
            
        }
   
    static double calcularPrecioFinal(double impuesto, double descuento, double precioBase) {
        double precioFinal = precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
        return precioFinal;
             
    }
       
    }
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp_2;

/**
 *
 * @author matias.carro
 */
public class Matias_Carro_TP2_Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {255.00, 399.99, 125.00, 1945.00, 89.99};
        
        //mostramos los precios originales
        System.out.println("Precios originales:");
        for (int i = 0; i <precios.length; i++){
            System.out.println(precios[i]); 
        }
            
        //modificamos un producto
        
        precios[2] = 575.99;
        
       
        //mostramos los precios modificados
        System.out.println("Precios modificados:");
        for (int c = 0; c <precios.length; c++){
            System.out.println(precios[c]); 
        }
    }
    
}
    
  
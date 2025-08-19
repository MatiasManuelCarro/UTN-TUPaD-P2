/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp_2;

/**
 *
 * @author matias.carro
 */
public class Matias_Carro_TP2_Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {255.00, 399.99, 125.00, 1945.00, 89.99};
        int c = 0;
        int i = 0;
        
        //mostramos los precios originales
        System.out.println("Precios originales:");
        //llamamos a la funcion recursiva        
        preciosOriginalesRecursivo(precios, i);
            
        //modificamos un producto
        precios[2] = 575.99;
        
       
        //mostramos los precios modificados
        System.out.println("Precios modificados:");
        //llamamos a la funcion recursiva
        preciosModificadosRecursivo(precios, c);
        
    }
    
    public static void preciosModificadosRecursivo(double[] precios, int c) {

        if (c < precios.length){
            System.out.println(precios[c]);
            preciosModificadosRecursivo(precios, c+1);        
        }
    }
        
   
    public static void preciosOriginalesRecursivo(double[] precios, int i) {

        if (i < precios.length){
            System.out.println(precios[i]);
            preciosOriginalesRecursivo(precios, i+1);
        }   
    }
}
        
    


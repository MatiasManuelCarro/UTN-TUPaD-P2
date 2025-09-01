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
public class Matias_Carro_TP2_Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        System.out.println("Ingrese 10 numeros, el programa va a contar cuantos son positivos, cuantos negativos y cuantos 0");
        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese un numero");
            numero = Integer.parseInt(input.nextLine());
            
            if (numero > 0){
                positivos++;
            }else if (numero < 0){
                negativos++;
            }else {
                ceros++;
            }
        } 
        
        System.out.println("Resultados:"); 
        System.out.println("Positivos: "+positivos);
        System.out.println("Negativos: "+negativos);
        System.out.println("Ceros: "+ceros);
        
    }
          
       
        
}
    

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
public class Matias_Carro_TP2_Ej1 {
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anio;
        
                
        System.out.println("Ingrese un año para verificar si es bisiesto: ");
        anio = input.nextInt();
        
        if((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
            System.out.println("El año "+anio+" es bisiesto");
        }else {
            System.out.println("El año "+anio+" no es bisiesto");
        }
    }
}

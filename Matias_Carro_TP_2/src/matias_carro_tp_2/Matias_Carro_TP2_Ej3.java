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
public class Matias_Carro_TP2_Ej3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int edad;
                                             
            System.out.println("Ingrese su edad");
            edad = input.nextInt();
            
            if(edad < 12){
                System.out.println("Eres un niño");               
            }else if(edad >= 12 && edad <= 17){
                System.out.println("Eres un adolescente");
            }else if(edad >= 18 && edad <= 59){
                System.out.println("Eres un Adulto");                
            }else if(edad >= 60){
                System.out.println("Eres un adulto mayor");
            }
    }
    
}

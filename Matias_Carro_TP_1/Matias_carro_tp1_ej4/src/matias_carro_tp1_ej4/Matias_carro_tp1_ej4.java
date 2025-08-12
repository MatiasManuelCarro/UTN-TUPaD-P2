/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matias_carro_tp1_ej4;

import java.util.Scanner;

/**
 *
 * @author matias.carro
 */
public class Matias_carro_tp1_ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
                
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());      
        
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su edad es: "+edad);
    }
    
}

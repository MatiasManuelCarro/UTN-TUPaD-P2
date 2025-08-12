/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matias_carro_tp1_ej8;

import java.util.Scanner;

/**
 *
 * @author matias.carro
 */
public class Matias_carro_tp1_ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
  
        
                
        System.out.println("Ingrese dos numeros enteros para dividir el primero por el segundo");
        System.out.println("Ingrese el primer numero: ");
        numero1 = Integer.parseInt(input.nextLine()); 
        System.out.println("Ingrese el segundo numero (recuerde no ingresar un 0): ");
        numero2 = Integer.parseInt(input.nextLine());  
        
        System.out.println("La division entre los numeros "+numero1+" y "+numero2+" es: "+(numero1 /numero2));
    }
    
}

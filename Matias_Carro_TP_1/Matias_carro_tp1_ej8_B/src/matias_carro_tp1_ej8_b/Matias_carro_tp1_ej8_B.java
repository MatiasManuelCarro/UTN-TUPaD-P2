/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matias_carro_tp1_ej8_b;

import java.util.Scanner;

/**
 *
 * @author matias.carro
 */
public class Matias_carro_tp1_ej8_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero1;
        double numero2;
  
        
                
        System.out.println("Ingrese dos numeros enteros para dividir el primero por el segundo");
        System.out.println("Ingrese el primer numero: ");
        numero1 = Double.parseDouble(input.nextLine()); 
        System.out.println("Ingrese el segundo numero (recuerde no ingresar un 0): ");
        numero2 = Double.parseDouble(input.nextLine());  
        
        System.out.println("La division entre los numeros "+numero1+" y "+numero2+" es: "+(numero1 /numero2));
    }
    
}

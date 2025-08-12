/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matias_carro_tp1_ej5;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Matias_Carro_TP1_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
                      
        System.out.println("Ingrese dos numeros enteros positivos para mostrar las operaciones entre si");
        System.out.println("Ingrese el primer numero: ");
        numero1 = Integer.parseInt(input.nextLine()); 
        System.out.println("Ingrese el segundo numero (recuerde no ingresar un 0): ");
        numero2 = Integer.parseInt(input.nextLine());  
        
        System.out.println("La suma entre los numeros "+numero1+" y "+numero2+" es: "+(numero1+numero2));
        System.out.println("La resta entre los numeros "+numero1+" y "+numero2+" es: "+(numero1-numero2));
        System.out.println("La multiplicacion entre los numeros "+numero1+" y "+numero2+" es: "+(numero1*numero2));
        System.out.println("La division entre los numeros "+numero1+" y "+numero2+" es: "+(numero1 * 1.0 /numero2));
           
    }
    
}

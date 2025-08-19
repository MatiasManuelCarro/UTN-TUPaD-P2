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
public class Matias_Carro_TP2_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;
        int suma = 0;
        
        System.out.println("Ingrese un numero, si es par se va a sumar a sus numeros ingresados\n para terminar, ingrese 0");
        do{
            System.out.println("Ingrese un numero, recuerde que 0 termina el programa");
            numero = Integer.parseInt(input.nextLine());
            
            if (numero %2 == 0){
                suma = suma + numero;
            }
            
        } while (numero != 0);
        
        System.out.println("La suma de los numeros pares es: "+suma);
    }
    
}

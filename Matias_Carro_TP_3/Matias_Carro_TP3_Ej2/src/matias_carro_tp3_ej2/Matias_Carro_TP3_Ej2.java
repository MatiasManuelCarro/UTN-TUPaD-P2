/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matias_carro_tp3_ej2;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Matias_Carro_TP3_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //creamos una mascota
      String nombre, especie;
      int edad;
      
      System.out.println("Ingrese el nombre de la mascota:");
        nombre = input.nextLine();
          
        System.out.println("Ingrese la especie:");
        especie = input.nextLine();
        
        System.out.println("Ingrese la edad");
        edad = Integer.parseInt(input.nextLine()); 
      
      Mascota mascota1 = new Mascota(nombre, especie, edad);
      
      mascota1.mostrarInfo();
      
      mascota1.cumplirAnios();
      
      mascota1.mostrarInfo();
    }
    
}

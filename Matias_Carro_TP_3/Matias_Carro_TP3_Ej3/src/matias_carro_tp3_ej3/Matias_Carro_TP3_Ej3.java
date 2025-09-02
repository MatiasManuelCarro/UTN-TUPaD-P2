/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matias_carro_tp3_ej3;

import java.util.Scanner;

/**
 *
 * @author matias.carro
 */
public class Matias_Carro_TP3_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int año;
         Scanner input = new Scanner(System.in);
         
        //creamos un nuevo libro
        Libro libro1 = new Libro("El cuervo","Edgar Allan Poe",1840);        
         
        //mostramos el nuevo libro con los Getter
        System.out.println("Titulo del libro: " + libro1.getTitulo() + "\nAutor: " + libro1.getAutor() + " \nAño: " +  libro1.getAñoPublicacion());
        
        //se pide año nuevo para el libro
        System.out.println("Ingrese nuevo año para el libro");
        año = Integer.parseInt(input.nextLine()); 
        libro1.setAñoPublicacion(año);      
              
        System.out.println("Titulo del libro: " + libro1.getTitulo() + "\nAutor: " + libro1.getAutor() + " \nAño: " +  libro1.getAñoPublicacion());

    }
     
}

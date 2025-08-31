/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matias_carro_tp3_ej1;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Matias_Carro_TP3_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre, apellido, curso;
        double calificacion;
                
        //Creamos un estudiante
        System.out.println("Ingrese el nombre del estudiante:");
        nombre = input.nextLine();
        
        System.out.println("Ingrese el Apellido del estudiante:");
        apellido = input.nextLine();
        
        System.out.println("Ingrese la materia:");
        curso = input.nextLine();
        
        System.out.println("Ingrese la calificacion");
        calificacion = Integer.parseInt(input.nextLine()); 
        Estudiante estudiante1  = new Estudiante(nombre, apellido, curso, calificacion);
       
        System.out.println("\n Datos del estudiante:");
        estudiante1.mostrarInfo();

        estudiante1.subirCalificacion(1.0);

        estudiante1.bajarCalificacion(0.5);
        
        //mostramos las nuevas calificaciones modificadas
        System.out.println("\nCalificacion final:");
         estudiante1.mostrarInfo();
    }
    
}

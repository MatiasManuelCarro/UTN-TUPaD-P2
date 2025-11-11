/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matias_Carro_TP_8_Ej2;

/**
 *
 * @author Matias
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //1 - Division Segura
        System.out.println("==== 1 - Divisiones ====");
        DivisionSegura division = new DivisionSegura();

        division.dividir(10, 2);
        division.dividir(7, 3);
        division.dividir(10, 0);   //No es posible dividir por 0, da error 

        // 2 - Conversion cadena a numero
        System.out.println("\n==== 1 - Cadena a Numero ====");

        CadenaANumero conversion = new CadenaANumero();

        conversion.convertir("123");
        conversion.convertir("prueba");
        conversion.convertir("456");

        // 3- Lectura de Archivo
        System.out.println("\n==== 3 - Lectura de Archivo ====");

        LecturaArchivo lector = new LecturaArchivo();

        //el archivo se encuentra en la carpeta data del proyecto 
        lector.leer("data/archivo.txt");
        System.out.println("\n");
        lector.leer("inexistente.txt");   //Este archivo no existe
    }
}

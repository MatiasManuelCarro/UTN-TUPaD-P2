/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matias_Carro_TP_8_Ej2;

/**
 *
 * @author Matias
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {

    public void leer(String nombreArchivo) {
        try {
            Scanner sc = new Scanner(new File(nombreArchivo));
            System.out.println("Contenido del archivo \"" + nombreArchivo + "\":");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo \"" + nombreArchivo + "\" no existe.");
        }
    }
}



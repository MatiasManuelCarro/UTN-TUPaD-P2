/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matias_Carro_TP_8_Ej2;

/**
 *
 * @author Matias
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorConRecursos {
    public void leer(String nombreArchivo) {
        // try-with-resources: el BufferedReader se cierra solo al terminar
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            System.out.println("Contenido del archivo \"" + nombreArchivo + "\":");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

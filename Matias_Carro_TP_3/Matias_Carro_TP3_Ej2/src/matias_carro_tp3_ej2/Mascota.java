/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp3_ej2;

/**
 *
 * @author Matias
 */
public class Mascota{
    String nombre;
    String especie;
    int edad;

//constructor
public Mascota(String nombre, String especie, int edad) {
    this.nombre = nombre;
    this.especie = especie;
    this.edad = edad;
}  
 
public void mostrarInfo(){
    System.out.println("\nDatos de la mascota:");
    System.out.println(nombre);
    System.out.println(especie);
    System.out.println(edad);
}

public void cumplirAnios(){
    System.out.println("Feliz cumpleaños " + nombre + "!");
    edad ++;
}
}
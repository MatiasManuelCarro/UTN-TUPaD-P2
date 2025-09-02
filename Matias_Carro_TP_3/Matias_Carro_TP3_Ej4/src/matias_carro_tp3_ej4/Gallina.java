/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp3_ej4;

/**
 *
 * @author Matias
 */
public class Gallina {
int idGallina;
int huevosPuestos;
int edad;

public Gallina(int idGallina, int huevosPuestos, int edad) {
 this.idGallina = idGallina;
this.huevosPuestos = huevosPuestos;
this.edad = edad;
}
   
    
public void ponerHuevo(){
huevosPuestos ++;    
 }   

public void envejecer(){
edad++;
}

public void mostrarEstado(){
    System.out.println("\nGallina " + idGallina + "\nEdad: " + edad + "\nHuevos puestos: " + huevosPuestos);   
}

}

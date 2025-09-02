/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matias_carro_tp3_ej4;

/**
 *
 * @author Matias
 */
public class Matias_Carro_TP3_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int idGallina;
    int huevosPuestos;
    int edad;
    
    //se crean las gallinas
    Gallina gallina1 = new Gallina(1, 0, 0);
    Gallina gallina2 = new Gallina(2, 0, 0);
    
    //simulamos un año de huevos puesto por la gallina 1
    for (int i = 0; i <  200; i++){
    gallina1.ponerHuevo();
    }    
    //gallina 1 envejece 1 año
    gallina1.envejecer();
    
    gallina1.mostrarEstado();
    
 
    //simulamos dos años de huevos puesto por la gallina 2
    for (int i = 0; i <  400; i++){
    gallina2.ponerHuevo();
    }     
    //gallina 2 envejece 2 años
       for (int i = 0; i <  2; i++){
    gallina2.envejecer();
    }
       
   gallina2.mostrarEstado();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matias_carro_tp3_ej3;

/**
 *
 * @author matias.carro
 */
public class Matias_Carro_TP3_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos un nuevo libro
        Libro libro1 = new Libro("prueba","test",1990);
        
        System.out.println(libro1.getAñoPublicacion());
        
        libro1.setAñoPublicacion(-650);
        
        System.out.println(libro1.getAñoPublicacion());
        
        libro1.setAñoPublicacion(2020);
        
        System.out.println(libro1.getAñoPublicacion());

    }
    
    
}

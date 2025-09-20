/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej3;

/**
 *
 * @author Matias
 */
public class Main {


    public static void main(String[] args) {
        
        
        Editorial editorial1 = new Editorial("Ediciones Gigamesh", "Carrer de Bailèn, 8, Barcelona, España");
        Libro libro1 = new Libro("Cancion de Hielo y Fuego", "0-4924-0882-3", editorial1);
        Autor autor1 = new Autor("George R.R. Martin", "Estados Unidos");
        
        //creamos la asociacion unidireccional
        libro1.setAutor(autor1);
        
        //probamos las relaciones
        System.out.println(libro1.getEditorial());
        System.out.println(libro1.getAutor());     
        
        System.out.println(libro1.getLibro());
      
        
    }
    
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp3_ej3;

/**
 *
 * @author matias.carro
 */
public class Libro {
    private String titulo, autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }
    
    //Getter titulo
    public String getTitulo(){
        return titulo;
    }
    
    //Getter autor
    public String getAutor(){
        return autor;
    }
    
     //Getter añoPublicacion
    public int getAñoPublicacion(){
        return añoPublicacion;
    }
            
    public void setAñoPublicacion(int año){
        if (año > 0 && año < 2025){
        this.añoPublicacion = año;
            System.out.println("Año modificado correctamente");
        } else {
            System.out.println("Ingrese un año correcto.");
        }
       
    }      
           
}

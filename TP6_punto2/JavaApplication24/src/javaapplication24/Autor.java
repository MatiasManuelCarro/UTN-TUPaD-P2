/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;

/**
 *
 * @author matias.carro
 */
public class Autor {
    
    private String id;
    private String nombre;
    private String nacionalidad; 

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }
     
       
    public void mostarInfo(){
              System.out.println(this.toString());
        
    }
    
    

    @Override
    public String toString() {
        return "ID Autor: " + id + " | Nombre autor: " + nombre + " |  Nacionalidad: " + nacionalidad;
    }
    
    
    
}

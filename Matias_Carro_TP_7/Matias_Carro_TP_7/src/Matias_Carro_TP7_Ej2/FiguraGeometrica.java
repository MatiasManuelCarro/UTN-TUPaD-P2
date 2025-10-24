/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matias_Carro_TP7_Ej2;

/**
 *
 * @author Matias
 */
public abstract class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();
    
       public String getNombre() {
        return nombre;
    }

    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matias_carro_TP7_Ej1;

/**
 *
 * @author Matias
 */
public class Auto extends Vehiculo {
    private int cantidadDePuertas;
   

    public Auto(int cantidadDePuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }
    
    
    @Override
    public void mostrarInfo(){
        System.out.println("Marca Vehiculo: " + this.marca + " | Modelo vehiculo: " + this.modelo + " | Cantidad de puertas: " + cantidadDePuertas);
    }
    
    
}

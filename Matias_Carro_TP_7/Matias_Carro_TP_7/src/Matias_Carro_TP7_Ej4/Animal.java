/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matias_Carro_TP7_Ej4;

/**
 *
 * @author Matias
 */
public abstract class Animal {

    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract String hacerSonido();

    public String describirAnimal() {
        return "El animal se llama: " + nombre;
    }

}

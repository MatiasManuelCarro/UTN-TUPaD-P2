/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matias_Carro_TP7_Ej4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {

        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Lola"));
        
        for (Animal a : animales) {
            System.out.println(a.describirAnimal());
            System.out.println("Sonido: " + a.hacerSonido());

        }


    }

    
}

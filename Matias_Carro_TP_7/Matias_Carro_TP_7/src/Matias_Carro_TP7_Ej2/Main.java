/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matias_Carro_TP7_Ej2;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo(7, "Círculo 1"));
        figuras.add(new Rectangulo(3.8, 6.2, "Rectángulo 1"));
        figuras.add(new Circulo(3.9, "Círculo 2"));
        figuras.add(new Rectangulo(8, 7, "Rectángulo 2"));

        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.getNombre() + " - Área: " + figura.calcularArea());
        }

    }

}

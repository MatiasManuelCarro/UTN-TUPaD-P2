/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matias_Carro_TP7_Ej2;

/**
 *
 * @author Matias
 */
class Rectangulo extends FiguraGeometrica {
    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

   
    
    @Override
    public double calcularArea() {
        return base * altura;
    }
}

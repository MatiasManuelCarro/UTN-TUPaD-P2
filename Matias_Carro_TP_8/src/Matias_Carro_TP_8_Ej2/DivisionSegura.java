/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matias_Carro_TP_8_Ej2;

/**
 *
 * @author Matias
 */
public class DivisionSegura {

    public void dividir(double numerador, double denominador) {
        try {
            if (denominador == 0) {
                throw new ArithmeticException("División por cero no permitida.");
            }
            double resultado = numerador / denominador;
            System.out.println("El resultado de: " + numerador + " Divido por: " + denominador + " Es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matias_Carro_TP7_Ej3;

/**
 *
 * @author Matias
 */
public abstract class Empleado {

    protected String nombre;
    protected String apellido;
    protected int legajo;
    protected double horasTrabajadas;

    public Empleado(String nombre, String apellido, int legajo, double horasTrabajadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.horasTrabajadas = horasTrabajadas;
    }



    public abstract double calcularSueldo();

}

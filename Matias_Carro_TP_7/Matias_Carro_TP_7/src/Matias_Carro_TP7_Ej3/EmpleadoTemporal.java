/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matias_Carro_TP7_Ej3;

/**
 *
 * @author Matias
 */
public class EmpleadoTemporal extends Empleado {

    private double valorHoraTemporal = 4000;

    public EmpleadoTemporal(String nombre, String apellido, int legajo, int horasTrabajadas) {
        super(nombre, apellido, legajo, horasTrabajadas);
    }

    public double getValorHoraTemporal() {
        return valorHoraTemporal;
    }

    public void setValorHoraTemporal(double valorHoraTemporal) {
        if (valorHoraTemporal > 0) {
            this.valorHoraTemporal = valorHoraTemporal;
        }
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHoraTemporal;

    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + " " + apellido + " | Legajo: " + legajo;

    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matias_Carro_TP7_Ej3;

/**
 *
 * @author Matias
 */
public class EmpleadoPlanta extends Empleado {

    private double valorHoraPlanta = 6000;

    public EmpleadoPlanta(String nombre, String apellido, int legajo, int horasTrabajadas) {
        super(nombre, apellido, legajo, horasTrabajadas);
    }

    public double getValorHoraPlanta() {
        return valorHoraPlanta;
    }

    public void setValorHoraPlanta(double valorHoraPlanta) {
        if (valorHoraPlanta > 0) {
            this.valorHoraPlanta = valorHoraPlanta;
        }
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHoraPlanta;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + " " + apellido + " | Legajo: " + legajo; 
    }
    

    

}

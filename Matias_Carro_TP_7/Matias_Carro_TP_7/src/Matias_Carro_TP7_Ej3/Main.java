/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matias_Carro_TP7_Ej3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {

        //creando lista de empleados
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Matias", "Carro", 1, 160));
        empleados.add(new EmpleadoTemporal("Juan", "Pérez", 2, 120));
        empleados.add(new EmpleadoPlanta("Carlos", "López", 3, 150));
        empleados.add(new EmpleadoTemporal("María", "Suárez", 4, 190));

        for (Empleado e : empleados) {
            if (e instanceof EmpleadoPlanta) {
                System.out.println(e + " | Empleado Planta Permantene " + " | Sueldo a cobrar: " + e.calcularSueldo());
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(e + " | Empleado Temporal " + " | Sueldo a cobrar: " + e.calcularSueldo());
            }
        }

    }
}

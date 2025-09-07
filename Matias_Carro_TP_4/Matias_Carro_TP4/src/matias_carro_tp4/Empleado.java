/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp4;

/**
 *
 * @author Matias
 */
public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    static int totalEmpleados;
    private double salarioBase = 900000;

    public Empleado(String nombre, String puesto, int id, double salario) {
        setNombre(nombre);
        setPuesto(puesto);
        setId(id);
        setSalario(salario);
        totalEmpleados++;
        System.out.println("Se crea el empleado.");
    }

    public Empleado(String nombre, String puesto) {
        setNombre(nombre);
        setPuesto(puesto);
        this.salario = salarioBase;
        totalEmpleados++;
        this.id = totalEmpleados; //se asigna una id igual al numero de empleado
        System.out.println("Se crea el empleado.");
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Ingrese un nombre por favor");
        }
    }

    public void setPuesto(String puesto) {
        if (puesto != null && !puesto.trim().isEmpty()) {
            this.puesto = puesto;
        } else {
            System.out.println("Ingrese un puesto por favor");
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void actualizarSalario(double cantidad) {
        salario += cantidad;
        System.out.println("Se actualiza el salario");

    }

    public void actualizarSalario(int cantidad) {
        salario += ((salario * cantidad) / 100);
        System.out.println("Se actualiza el salario");
    }

    public static void mostrarTotalEmpleados(){
        System.out.println("Total de empleados:" + totalEmpleados);
    }

@Override
public String toString(){
    return "Empleado: " + nombre + " | Puesto: " + puesto + " | ID: " + id + " | Salario: " + salario;
}


    
}

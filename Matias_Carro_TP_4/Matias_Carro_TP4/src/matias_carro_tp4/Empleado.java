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
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        System.out.println("Se crea el empleado " + nombre);
    }

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salarioBase;
        totalEmpleados++;
        this.id = totalEmpleados; //se asigna una id igual al numero de empleado
        System.out.println("Se crea el empleado " + nombre);
    }

    public void setNombre(String nombre) {
        //verifica que el ingreso no sea null ni vacio
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setPuesto(String puesto) {
        //verifica que el ingreso no sea null ni vacio
        if (puesto != null && !puesto.trim().isEmpty()) {
            this.puesto = puesto;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void actualizarSalario(double cantidad) {
        //ingresando double aumenta cantidad fina
        salario += cantidad;
        System.out.println("Se actualiza el salario del empleado: " + nombre + " en una suma fija de: " + cantidad);

    }

    public void actualizarSalario(int cantidad) {
        //ingresando int aumenta porcentaje del salario
        salario += ((salario * cantidad) / 100);
        System.out.println("Se actualiza el salario del empleado: " + nombre + " en un porcentaje de: %" + cantidad);
    }

    public static void mostrarTotalEmpleados() {
        System.out.println("Total de empleados:" + totalEmpleados);
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + " | Puesto: " + puesto + " | ID: " + id + " | Salario: " + salario;
    }

}

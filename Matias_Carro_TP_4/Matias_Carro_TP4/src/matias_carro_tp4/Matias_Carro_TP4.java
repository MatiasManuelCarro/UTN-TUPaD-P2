/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matias_carro_tp4;

/**
 *
 * @author Matias
 */
public class Matias_Carro_TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Matias", "Soporte", 1, 1000000.00);

        Empleado empleado2 = new Empleado("Jonathan", "Soporte", 2, 1000000.00);

        //Mostramos los empleados al momento
        Empleado.mostrarTotalEmpleados();
        System.out.println("");
        
        //se crean empleados con un constructor sobrecargado
        Empleado empleado3 = new Empleado("Nicolas", "Soporte");

        Empleado empleado4 = new Empleado("Federico", "Soporte");

        //mostramos el total de empleados y los empleados
        System.out.println("\nListado de empleados:");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);
        Empleado.mostrarTotalEmpleados();
        System.out.println("");
        
        //para aumenta sueldo
        //se ingresa double = valor fijo aumentado
        //se ingresa int = porcentaje aumentado
        empleado1.actualizarSalario(50000.0);
        empleado2.actualizarSalario(10);
        empleado3.actualizarSalario(55000.00);
        empleado4.actualizarSalario(12);

        //mostramos a los empleados con los sueldos actualizados
        System.out.println("\nListado de empleados:");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);

    }

}

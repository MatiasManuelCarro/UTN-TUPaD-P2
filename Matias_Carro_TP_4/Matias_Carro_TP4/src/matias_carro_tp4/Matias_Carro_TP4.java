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
           
        Empleado empleado1 = new Empleado("Matias", "Soporte", 1, 1000000);
        
        Empleado empleado2 = new Empleado("Jona", "Soporte", 2, 1000000);
        
         Empleado empleado3 = new Empleado("Nico", "Soporte");
         
        Empleado empleado4 = new Empleado("Fede", "Soporte");
        
        //para aumenta sueldo
        //se ingresa double = valor fijo aumentado
        //se ingresa int = porcentaje aumentado
        
        empleado1.actualizarSalario(50000.0);
        empleado2.actualizarSalario(10);
        
        Empleado.mostrarTotalEmpleados();
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);
             
    }
    

    
}

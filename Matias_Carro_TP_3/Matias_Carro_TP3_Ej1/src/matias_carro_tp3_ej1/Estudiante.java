/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp3_ej1;

/**
 *
 * @author Matias
 */
public class Estudiante {    
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    
    //Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    //Metodo para mostrar la informacion
    public void mostrarInfo() {
        System.out.println("Nombre: "+ nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
        // Método para subir la calificación
    public void subirCalificacion(double nota) {
        calificacion += nota;
        System.out.println("Nueva calificación: " + calificacion);
    }

    // Método para bajar la calificación
    public void bajarCalificacion(double nota) {
        calificacion -= nota;
        System.out.println("Nueva calificación: " + calificacion);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp_6_ej3;

/**
 *
 * @author Matias
 */
public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    //consutructor de curso sin profesor asignado
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor nuevoProfesor) {
        if (nuevoProfesor != null && this.profesor != null){ //verifica que nuevo profesor NO sea null y si existe otro profesor
            this.profesor.eliminarCurso(this); //quita el profesor
        }
        this.profesor = nuevoProfesor;
        
        //nuevoProfesor != null -> verifica que no sea null el ingreso
        //&& !nuevoProfesor.listarCursos().contains(this) -> verifica que el profesor no este en la lista
        if (nuevoProfesor != null && !nuevoProfesor.listarCursos().contains(this)){
            System.out.println("Profesor Agregado al curso");
            nuevoProfesor.agregarCurso(this); //agrega al nuevo profesor            
        }
        

    }
    
    public void mostrarInfo(){
        System.out.println(this);
    }
    
    
    

    @Override
    public String toString() {
        return "\nCodigo curso: " + codigo + " | Nombre Curso: " + nombre + " | Profesor: " + (profesor != null ? profesor : "No tiene profesor asignado");
    }
}

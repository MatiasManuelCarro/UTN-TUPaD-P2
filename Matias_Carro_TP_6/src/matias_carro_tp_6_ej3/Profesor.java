/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp_6_ej3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Matias
 */
public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
        if (c.getProfesor() != this) { //Si el profesor del curso no coincide con este 
            c.setProfesor(this); //setprofesr este profesor como profesor del curso
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            c.setProfesor(null); //elimina el profesor del curso
        }
    }
    
    public List listarCursos(){
        return cursos; //devuelve la lista de cursos del profesor
    }
    
    public void mostrarInfo(){
        System.out.println(this);
        
    }

    public String getId() {
        return id;
    }
    
    

    @Override
    public String toString() {
        return "ID Profesor: " + id + " | Nombre: " + nombre + " | Especialidad: " + especialidad + "\nCursos dictados: " + cursos.size();
    }

}

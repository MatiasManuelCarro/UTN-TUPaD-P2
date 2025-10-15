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
public class Universidad {

    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }
    
    

    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) { //si el ingreso no es nulo Y no se encuentra ya en la lista
            profesores.add(p); //agregarlo
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }

    private Curso buscarCursoPorCodigo(String codigo) {
        Curso cursoEncontrado = null;
        Iterator<Curso> it = this.cursos.iterator();
        while (it.hasNext() && cursoEncontrado == null) {
            Curso c = it.next();
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                cursoEncontrado = c;
            }
        }
        System.out.println("CURSO ENCONTRADO: DEBUG");
        return cursoEncontrado;
    }

    private Profesor buscarProfesorPorId(String id) {
        Profesor profesorEncontrado = null;
        Iterator<Profesor> it = this.profesores.iterator();
        while (it.hasNext() && profesorEncontrado == null) {
            Profesor p = it.next();
            if (p.getId().equalsIgnoreCase(id)) {
                profesorEncontrado = p;
            }
        }
        System.out.println("PROFESOR ENCONTRADO: DEBUG");
        return profesorEncontrado;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso busquedaCurso = buscarCursoPorCodigo(codigoCurso); //busca si existe el curso
        Profesor busquedaProfesor = buscarProfesorPorId(idProfesor); //busca si existe el profesor
        if (busquedaCurso != null && busquedaProfesor != null) { //si ambos no son null, quiere decir que existen
            busquedaCurso.setProfesor(busquedaProfesor); //se agrega al curso, el profesor.
        }
    }

    public void listarProfesores() {
        System.out.println(this.profesores);
    }
    
    public void listarCursos(){
        System.out.println(this.cursos);
    }
    
     public void eliminarCurso(String codigo) {
        Curso busquedaCurso = buscarCursoPorCodigo(codigo);
        if (busquedaCurso != null) {
            if (busquedaCurso.getProfesor() != null) {
                busquedaCurso.setProfesor(null); // rompe vínculo
            }
            cursos.remove(busquedaCurso);
        }
    }
     
  

}

/*
  public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        }
    }

 */

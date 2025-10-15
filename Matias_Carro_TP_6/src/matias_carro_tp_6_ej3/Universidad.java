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
            System.out.println("Profesor: " + p.getNombre() + " Agregado");
            profesores.add(p); //lo agrega
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            System.out.println("Curso " + c.getNombre() + " Agregado");
            cursos.add(c);
        }
    }

    public  Curso buscarCursoPorCodigo(String codigo) {
        Curso cursoEncontrado = null;
        Iterator<Curso> it = this.cursos.iterator();
        while (it.hasNext() && cursoEncontrado == null) {
            Curso c = it.next();
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                cursoEncontrado = c;
            }
        }
        return cursoEncontrado;
    }

    public Profesor buscarProfesorPorId(String id) {
        Profesor profesorEncontrado = null;
        Iterator<Profesor> it = this.profesores.iterator();
        while (it.hasNext() && profesorEncontrado == null) {
            Profesor p = it.next();
            if (p.getId().equalsIgnoreCase(id)) {
                profesorEncontrado = p;
            }
        }
        return profesorEncontrado;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso busquedaCurso = buscarCursoPorCodigo(codigoCurso); //busca si existe el curso
        Profesor busquedaProfesor = buscarProfesorPorId(idProfesor); //busca si existe el profesor
        if (busquedaCurso != null && busquedaProfesor != null) { //si ambos no son null, quiere decir que existen
            busquedaCurso.setProfesor(busquedaProfesor); //se agrega el profesro al curso
        }
    }

    public void listarProfesores() {
        System.out.println(profesores);
    }

    public void listarCursos() {
        System.out.println(cursos);
    }

    public void eliminarCurso(String codigo) {
        Curso busquedaCurso = buscarCursoPorCodigo(codigo);
        if (busquedaCurso != null) {
            if (busquedaCurso.getProfesor() != null) {
                busquedaCurso.getProfesor().eliminarCurso(busquedaCurso);
                busquedaCurso.setProfesor(null); // elimina al profesor ligado al curso
                
            }
            cursos.remove(busquedaCurso);
        }
    }
}
    /*
    public void eliminarProfesor(String id) {
        Profesor busquedaProfesor = buscarProfesorPorId(id); //llama a la busqueda para verificar que el profesor exista
        if (busquedaProfesor != null) { //si devuelve null, no esta en la lista
            List<Curso> cursosEliminar = busquedaProfesor.listarCursos();
            if (!cursosEliminar.isEmpty()) {
                for (Curso c : cursosEliminar) {
                    busquedaProfesor.eliminarCurso(c);

                }

            }
            profesores.remove(busquedaProfesor);

        }
    }
    
    */
    /*
    public void eliminarProfesor(String id) {
        Profesor busquedaProfesor = buscarProfesorPorId(id); //llama a la busqueda para verificar que el profesor exista
        if (busquedaProfesor != null) { //si devuelve null, no esta en la lista
            // Desvincular todos los cursos primero
            for (Curso c : busquedaProfesor.listarCursos()) {
                c.setProfesor(null);
            }
            // Vaciar la lista de cursos del profesor
            busquedaProfesor.listarCursos().clear();

            // Eliminar al profesor de la universidad
            profesores.remove(busquedaProfesor);

            System.out.println("Profesor eliminado: " + busquedaProfesor.getNombre());
        } else {
            System.out.println("No se encontró profesor con id: " + id);
        }
    }

    public void listarProfesores() {
        for (Profesor p : profesores) {
            System.out.println(p);
        }
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

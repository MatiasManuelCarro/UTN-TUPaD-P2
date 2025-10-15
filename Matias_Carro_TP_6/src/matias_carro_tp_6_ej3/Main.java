/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp_6_ej3;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {
        // Crear universidad
        Universidad utn = new Universidad("UTN");

        // Crear profesores
        Profesor prof1 = new Profesor("P001", "Ana Torres", "Programación");
        Profesor prof2 = new Profesor("P002", "Luis Gómez", "Bases de Datos");
        Profesor prof3 = new Profesor("P003", "Carla Méndez", "Desarrollo Web");

        // Agregar profesores a la universidad
        utn.agregarProfesor(prof1);
        utn.agregarProfesor(prof2);
        utn.agregarProfesor(prof3);

        // Crear cursos
        Curso c1 = new Curso("C101", "Introducción a la Programación");
        Curso c2 = new Curso("C102", "Programación en Java");
        Curso c3 = new Curso("C103", "Bases de Datos SQL");
        Curso c4 = new Curso("C104", "Desarrollo Web con HTML y CSS");
        Curso c5 = new Curso("C105", "Git y Control de Versiones");

        // Agregar cursos a la universidad
        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);

        // Asignar profesores a cursos
        c1.setProfesor(prof1);
        c2.setProfesor(prof1);
        c3.setProfesor(prof2);
        c4.setProfesor(prof3);
        c5.setProfesor(prof3);

        // Mostrar datos
        System.out.println("=== Profesores ===");
        utn.listarProfesores();

        System.out.println("\n=== Cursos ===");
        utn.listarCursos();
    }
}
   

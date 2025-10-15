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
        System.out.println("\n------ Ejercicio 1 ------");
        Universidad utn = new Universidad("UTN");

        // 1 - Crear 3  profesores 
        System.out.println("\nCreando profesores: ");
        Profesor p1 = new Profesor("P01", "Ana Gutierrez", "Programación");
        Profesor p2 = new Profesor("P02", "Luis Gómez", "Bases de Datos");
        Profesor p3 = new Profesor("P03", "Carlos Perez", "Desarrollo Web");

        // 1- Crear 5 cursos
        System.out.println("\nCreando cursos:");
        Curso c1 = new Curso("C01", "Introducción a la Programación");
        Curso c2 = new Curso("C02", "Programación en Java");
        Curso c3 = new Curso("C03", "Bases de Datos SQL");
        Curso c4 = new Curso("C04", "Desarrollo Web con HTML y CSS");
        Curso c5 = new Curso("C05", "Git y Control de Versiones");
        Curso c6 = new Curso("C06", "Virtualizaciones");

        // 2- Agregar profesores a la universidad
        System.out.println("\n------ Ejercicio 2 ------");
        System.out.println("\nAGREGANDO PROFESORES");
        utn.agregarProfesor(p1);
        utn.agregarProfesor(p2);
        utn.agregarProfesor(p3);

        // 2- Agregar cursos a la universidad 
        System.out.println("\nAGREGANDO CURSOS");
        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);
        utn.agregarCurso(c6);

        // 3 - Asignar profesores a cursos
        System.out.println("\n------ Ejercicio 3 ------");
        System.out.println("\nASIGNANDO PROFESORES A CURSOS");
        utn.asignarProfesorACurso("C01", "P01");
        utn.asignarProfesorACurso("C02", "P01");
        utn.asignarProfesorACurso("C03", "P02");
        utn.asignarProfesorACurso("C04", "P03");
        utn.asignarProfesorACurso("C05", "P03");

        // 4 - Mostrar cursos y pforesores
        System.out.println("\n------ Ejercicio 4 ------");
        System.out.println("\n Listado de profesores: ");
        utn.listarProfesores();

        System.out.println("\nListado de cursos: ");
        utn.listarCursos();

 
        //5 - Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados
        System.out.println("\n------ Ejercicio 5 ------");
        System.out.println("\nASIGNANDO CURSO 1 A PROFESOR 3");
        utn.asignarProfesorACurso("C01", "P03");
        //mostrar infor del profesor 03
        System.out.println("Informacion del profesor:");
        p3.mostrarInfo();
        System.out.println("Cursos dictados:");
        System.out.println(p3.listarCursos());
        
        //verificando que el profesor 1 no tenga mas el curso 1
        System.out.println("\nInformacion profesor 1");
         p1.mostrarInfo();
        System.out.println(p1.listarCursos());

        // 6 - Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("\n------ Ejercicio 6 ------");
        System.out.println("\nMostrando info de curso 05 antes de eliminar");
        c5.mostrarInfo();
        System.out.println("\nMostrando info profesor 03 antes de eliminar");
        System.out.println("Listado de cursos del profesor: " + p3.listarCursos());
        System.out.println("\nEliminando curso 05");
        utn.eliminarCurso("C05");
        System.out.println("\n Mostrando info de curso 05");
        c5.mostrarInfo();
        System.out.println("\nListando los cursos del profesor 03");
        System.out.println(p3.listarCursos());

        System.out.println("Listado actualizado de cursos");
        utn.listarCursos();

        // 7 - Remover un profesor y dejar profesor = null
        System.out.println("\n------ Ejercicio 7  ------");
        System.out.println("\nMostrando info de curso 03 antes de eliminar");
        c3.mostrarInfo();
        System.out.println("\nMostrando info profesor 02 antes de eliminar");
        System.out.println("Listado de cursos del profesor:" + p3.listarCursos());
        System.out.println("\nEliminando profesor  02");
        utn.eliminarProfesor("P02");
        System.out.println("\nMostrando info de curso 03 despues de eliminar");
        c3.mostrarInfo();
        System.out.println("\nMostrando listado de profesores despues de eliminar al 02");
        utn.listarProfesores();

        // 8 Mostrar un reporte: cantidad de cursos por profesor.
        System.out.println("\n------ Ejercicio 8  ------");
        System.out.println("Informe de profesores: ");
        utn.reporteCursosPorProfesor("P01");
        utn.reporteCursosPorProfesor("P02");
        utn.reporteCursosPorProfesor("P03");

    }
}

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


}
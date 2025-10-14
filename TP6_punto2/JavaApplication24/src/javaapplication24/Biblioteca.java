/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matias.carro
 */
public class Biblioteca {

    private String nombre;
    private List<Libro> listaLibros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        listaLibros.add(libro);
        System.out.println("Libro agregado");
    }
    
    public void listarLibros(){
        System.out.println(listaLibros);
    }
           
    public Libro buscarLibroPorIsbn(Strign isb) {
        Libro libroEncontrado = null 
                
                
                
                
                
                
    }

}

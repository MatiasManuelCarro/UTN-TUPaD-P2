/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;

import java.util.ArrayList;
import java.util.Iterator;
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
        System.out.println("Libro agregado: " + titulo);
    }

    public void listarLibros() {
        System.out.println(listaLibros);
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        Libro libroEncontrado = null;
        Iterator<Libro> it = this.listaLibros.iterator();
        while (it.hasNext() && libroEncontrado == null) {
            Libro lib = it.next();
            if (lib.getIsbn().equalsIgnoreCase(isbn)) {
                libroEncontrado = lib;

            }
        }
        System.out.println("\nLibro encontrado:");
        return libroEncontrado;
    }

    public void eliminarLibro(String isbn) {
        Libro libroEncontrado = buscarLibroPorIsbn(isbn);
        if (libroEncontrado != null) {
            System.out.println("\nSe elimina el libro: " + libroEncontrado.getTitulo());
            listaLibros.remove(libroEncontrado);
        } else {
            System.out.println("El libro no existe, no se elimina ningun libro");
        }
    }

    public int obtenerCantidadLibros() {
        int acuLibros = 0;
        for (Libro libro : listaLibros) {
            if (libro != null) {
                acuLibros++;
            }

        }
        return acuLibros;
    }

    public void filtrarLibrosPorAnio(int anio) {
        List<Libro> listaOrdenadaPorAnio = new ArrayList<>();

        for (Libro libro : listaLibros) {
            if (libro.getAnioPublicacion() == anio) {
                listaOrdenadaPorAnio.add(libro);
            }
        }
        System.out.println("\nLibros de año: " + anio);
        System.out.println(listaOrdenadaPorAnio);
    }

    public void mostrarAutoresDisponibles() {
        List<Autor> listaAutores = new ArrayList<>();

        for (Libro libro : listaLibros) {
            Autor autor = libro.getAutor();
            if (!listaAutores.contains(autor)) {
                listaAutores.add(autor);
            }

        }
        System.out.println("Autores disponibles:");
        for (Autor a : listaAutores) {
            a.mostarInfo();

        }
    }

}

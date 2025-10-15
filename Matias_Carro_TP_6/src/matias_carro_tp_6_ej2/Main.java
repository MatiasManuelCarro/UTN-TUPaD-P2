/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp_6_ej2;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {
        
        //1 - crear biblioteca
        Biblioteca biblioteca1 = new Biblioteca("Primer Biblioteca");

        //2  - Creando autores
        Autor autor1 = new Autor("Autor1", "Gabriel García Márquez", "Colombia");
        Autor autor2 = new Autor("Autor2", "J.K. Rowling", "Inglaterra");
        Autor autor3 = new Autor("Autor3", "Julio Cortázar", "Argentina");
        Autor autor4 = new Autor("Autor4", "George Orwell", "Inglaterra");
        Autor autor5 = new Autor("Autor5", "Isabel Allende", "Chile");

        //3 - creando libros        
        biblioteca1.agregarLibro("0-4811-2089-0", "Cien años de soledad", 1967, autor1);
        biblioteca1.agregarLibro("0-5466-6449-0", "El amor en los tiempos del cólera", 1997, autor1);
        biblioteca1.agregarLibro("0-5164-1189-6", "Harry Potter y la piedra filosofal", 1997, autor2);
        biblioteca1.agregarLibro("0-9639-9244-9", "Rayuela", 1963, autor3);
        biblioteca1.agregarLibro("0-2475-5165-1", "1984", 1949, autor4);
        biblioteca1.agregarLibro("0-9238-1414-0", "La ciudad de las Bestias", 1982, autor5);
        biblioteca1.agregarLibro("0-1326-7850-0", "Harry Potter y la cámara secreta", 1998, autor2);
        biblioteca1.agregarLibro("0-5355-3680-1", "Harry Potter y el prisionero de Azkaban", 1999, autor2);
        biblioteca1.agregarLibro("0-4002-9448-6", "Harry Potter y el cáliz de fuego", 2000, autor2);
        biblioteca1.agregarLibro("0-2185-9270-1", "Harry Potter y la Orden del Fénix", 2003, autor2);

        //4 - listar todos los libros
        biblioteca1.listarLibros();

        //5 - buscar libro
        System.out.println(biblioteca1.buscarLibroPorIsbn("0-1326-7850-0"));

        //6 - filtrar libros por año 1997
        biblioteca1.filtrarLibrosPorAnio(1997);

        //6 - filtrar por año 2000
        biblioteca1.filtrarLibrosPorAnio(2000);
        
        //7 - eliminar un libro
       biblioteca1.eliminarLibro("0-9238-1414-0");
       
        //7 - listar todos los libros restantes
        biblioteca1.listarLibros();
        
        //8 -  cantidad total de libros        
        System.out.println("\nCantidad total de libros: " + biblioteca1.obtenerCantidadLibros());
        
        //9 - Autores disponibles:
        biblioteca1.mostrarAutoresDisponibles();
        
        
        

    }
}

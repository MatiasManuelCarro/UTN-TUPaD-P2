/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej3;

/**
 *
 * @author Matias
 */
public class Libro {

    private String titulo;
    private String isbn;
    private Editorial editorial;
    private Autor autor;

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
        }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null) {
            this.titulo = titulo;
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn != null) {
            this.isbn = isbn;
        }
    }
    
    //comienzan las relaciones

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        if (editorial != null) {
            this.editorial = editorial;
        }
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        if (autor != null){
        this.autor = autor;
    }
    
    }
    
    public String getLibro(){
        return "Titulo Libro: " + titulo + " | ISBN: " + isbn + autor + editorial;
    }

    @Override
    public String toString() {
        return " | Titulo Libro: " + titulo + " | ISBN: " + isbn;
    }

}

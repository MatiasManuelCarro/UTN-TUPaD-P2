/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej8;

/**
 *
 * @author Matias
 */
public class Documento {

    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        //Creamos la firma digital dentro del constructor de documento
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null) {
            this.titulo = titulo;
        }
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        if (contenido != null) {
            this.contenido = contenido;
        }
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }
    
    

    @Override
    public String toString() {
        return "Titulo del documento: " + titulo + "\nContenido: " +  contenido + firmaDigital;
    }
    
    

}

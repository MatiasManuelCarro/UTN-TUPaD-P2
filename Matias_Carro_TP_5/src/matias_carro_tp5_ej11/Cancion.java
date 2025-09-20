/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej11;

/**
 *
 * @author Matias
 */
public class Cancion {

    private String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }
    

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
  
    @Override
    public String toString() {
        return "Titulo: " + titulo + artista;
    }

    
    
}

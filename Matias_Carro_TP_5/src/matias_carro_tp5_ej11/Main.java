/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej11;

/**
 *
 * @author Matias
 */
public class Main {
    
    public static void main(String[] args) {
        Artista artista1 = new Artista("The Beatles", "Rock");
        Cancion cancion1 = new Cancion("Helter Skelter");
        
        //creamos la relacion
        cancion1.setArtista(artista1);
        
        //probamos la relacion
        System.out.println(cancion1.getArtista());
        System.out.println(cancion1);
        
        //llamamos a la dependencia reproducir
        System.out.println("\nReproductor:");
        Reproductor.Reproducir(cancion1);
    }
    
}

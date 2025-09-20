/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej8;

/**
 *
 * @author Matias
 */
public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Matias Carro", "Matias.carro@mail.com");
        Documento documento1 = new Documento("Documento 1", "\"Texto del documento\"", "9f3c1a7b2e4d8f6a1c3e9b7d5a2f4c8e", "14/09/2025", usuario1);
    
        //probando las relaciones
        
        System.out.println(documento1.getFirmaDigital());
        
        //pedimos la fecha de la firma, pasando por firma mediante documento
        System.out.println("\nFecha de la firma:");
        System.out.println(documento1.getFirmaDigital().getFecha());
        
        //pedimos el usuario que firma, pasando por firma mediante documento
        System.out.println(documento1.getFirmaDigital().getUsuario());
        System.out.println("\nDatos completos:");        
        System.out.println(documento1);
    
    }
}

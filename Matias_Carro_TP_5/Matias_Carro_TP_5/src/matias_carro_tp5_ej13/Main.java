/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej13;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {
        
        //creamos los usuarios y generamos los codigos

        Usuario usuario1 = new Usuario("Matias Carro", "matias.carro@mail.com");
        GeneradorQR.generar("123456", usuario1);

        Usuario usuario2 = new Usuario("Emiliano Carro", "emiliano.carro@mail.com");
        GeneradorQR.generar("789456", usuario2);
        
        //cambiamos el valor de usuario 1 y generamos nuevamente el QR
        
        usuario1.setNombre("Matias Manuel Carro");
        usuario1.setEmail("carro.m.matias@mail.com");
        GeneradorQR.generar("456123", usuario1);
        

    }
}

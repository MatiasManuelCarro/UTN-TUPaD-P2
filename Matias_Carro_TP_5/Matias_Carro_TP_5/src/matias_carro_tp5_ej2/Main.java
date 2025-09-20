/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_ttp5_ej2;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Matias Carro", "12345678");
        Bateria bateria1 = new Bateria("EB-BG530BBE", "4000");
        Celular celular1 = new Celular("353450018167338", "Samsung", "Galaxy", bateria1);
     

        //Creando las relaciones
        usuario1.setCelular(celular1);
        celular1.setUsuario(usuario1);

        //probamos las relaciones        
        System.out.println(usuario1.getCelular());
        System.out.println(celular1.getUsuario());

        //usando toString()
        System.out.println("\nUsando to String");
        System.out.println(usuario1);
        System.out.println(celular1);
        System.out.println(bateria1);

    }

}

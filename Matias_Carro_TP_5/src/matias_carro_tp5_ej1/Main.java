/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matias_carro_tp5_ej1;

/**
 *
 * @author Matias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Titular titular1 = new Titular("Matias Carro", "12345678");
        Foto foto1 = new Foto("fotoMatias", ".JPG");

        Pasaporte pasaporte1 = new Pasaporte("00000001", "21/05/2024");
        
        

        //Creando las relaciones 
        pasaporte1.setTitular(titular1);
        pasaporte1.setFoto(foto1);
        titular1.setPasaporte(pasaporte1);
        
        //probando relaciones
        System.out.println(pasaporte1.getTitular());
        System.out.println(titular1.getPasaporte());
        System.out.println(pasaporte1.getFoto());
        System.out.println("\nMetodo toString:");
        
        //usando toString()
        System.out.println(pasaporte1);
       
        
        
       

    }

}

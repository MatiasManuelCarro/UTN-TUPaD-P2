/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej5;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {

        Computadora computadora1 = new Computadora("Dell", "BE6854", "Asus B550M", "AMD B550");
        Propietario propietario1 = new Propietario("Matias Carro", "12345678");
        
        
        
        //creando las relaciones
        computadora1.setPropietario(propietario1);
        propietario1.setComputadora(computadora1);
        
        System.out.println(computadora1);
    }

}

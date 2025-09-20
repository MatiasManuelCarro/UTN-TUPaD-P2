/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej12;

/**
 *
 * @author Matias
 */
public class Main {
    public static void main(String[] args) {
        Contribuyente contribuyente1 = new Contribuyente("Matias Carro", "20301234567");
        Impuesto impuesto1 = new Impuesto(5000);
        
        //creamos la relacion
        impuesto1.setContribuyente(contribuyente1);
        
        //probamos la relacion
        System.out.println(impuesto1.getContribuyente());
        
        Calculadora.calcular(impuesto1);
        
    }
      
    
}

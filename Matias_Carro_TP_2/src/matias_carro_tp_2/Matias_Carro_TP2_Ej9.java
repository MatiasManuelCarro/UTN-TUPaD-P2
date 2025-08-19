/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp_2;

import java.util.Scanner;

/**
 *
 * @author matias.carro
 */
public class Matias_Carro_TP2_Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pesoPaquete = 0;
        double precioProducto = 0;
        String zonaEnvio = "";
        double costoEnvio;
        double totalCompra;
        
        System.out.println("Imgrese el peso del paquete en Kg");
        pesoPaquete = Double.parseDouble(input.nextLine());
        do{
        System.out.println("Ingrese la zona del envio nacional o internacional");
        zonaEnvio = input.nextLine();
        zonaEnvio = zonaEnvio.toLowerCase();
        
        if ((!zonaEnvio.equals("nacional") && !zonaEnvio.equals("internacional"))){
            System.out.println("Ingreso incorrecto, ingrese nuevamente");           
        }
        
        } while (!zonaEnvio.equals("nacional") && !zonaEnvio.equals("internacional"));
        
        System.out.println("Imgrese el precio del producto");
        precioProducto = Double.parseDouble(input.nextLine());
        
       costoEnvio = calcularCostoEnvio(pesoPaquete, zonaEnvio);
       totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
       
        System.out.println("El costo del envio es: "+costoEnvio);
        System.out.println("El total a pagar es: "+totalCompra);
       
       
       
       
    }
        
    static double calcularCostoEnvio(double pesoPaquete, String zonaEnvio) {
        
        int zonaNacional = 5;
        int zonaInternacional = 10;
        double costoEnvio;
        
        if (zonaEnvio.equals("nacional")){
            costoEnvio = (pesoPaquete * zonaNacional);
        }else {
            costoEnvio = (pesoPaquete * zonaInternacional);            
        }
        
        return costoEnvio;
    }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double totalCompra = precioProducto + costoEnvio;
        return totalCompra;
    }
        
}
    


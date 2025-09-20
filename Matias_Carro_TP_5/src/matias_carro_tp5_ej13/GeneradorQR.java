/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej13;

/**
 *
 * @author Matias
 */
public class GeneradorQR {
      
    public static void generar(String valor, Usuario usuario){
        CodigoQR codigoQRGenerado = new CodigoQR(valor, usuario); 
        System.out.println("Codigo QR generado: " + codigoQRGenerado);
    }
}

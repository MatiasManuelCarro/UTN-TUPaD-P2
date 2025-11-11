/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matias_Carro_TP_8_Ej1;

/**
 *
 * @author Matias
 */
public class TarjetaCredito implements Pago, PagoConDescuento {

   @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando con tarjeta de crédito: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.9; // 10% de descuento

    }


}

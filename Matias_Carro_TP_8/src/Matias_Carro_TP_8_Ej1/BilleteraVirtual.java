/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matias_Carro_TP_8_Ej1;

/**
 *
 * @author Matias
 */
public class BilleteraVirtual implements Pago, PagoConDescuento {

       @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando con MercadoLibre: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.5; // Es un 5% de descuento
    }

}

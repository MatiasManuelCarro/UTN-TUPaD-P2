/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej10;

/**
 *
 * @author Matias
 */
public class Main {
    public static void main(String[] args) {
        
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("2853456894635189413521", "1000", "123456", "14/09/2025");
        Titular titular1 = new Titular("Matias Carro", "12345678");
        
        //creamos las relaciones
        cuentaBancaria1.setTitular(titular1);
        titular1.setCuentaBancaria(cuentaBancaria1);
        
        //probamos las relaciones
        System.out.println(titular1.getCuentaBancaria());
        System.out.println(cuentaBancaria1.getTitular());
        System.out.println(cuentaBancaria1.getClaveSeguridad());
        
        System.out.println("\nDatos completos:");
        System.out.println(cuentaBancaria1);
        
        
    }
}

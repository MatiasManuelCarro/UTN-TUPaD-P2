/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej7;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {
        Motor motor1 = new Motor("Toyota 2ZR-FE", "2ZRFE-9A3X7B21");
        Vehiculo vehiculo1 = new Vehiculo("AB 123 CD", "Corolla", motor1);
        Conductor conductor1 = new Conductor("Matias Carro", "00000001");

        //creamos las relaciones
        conductor1.setVehiculo(vehiculo1);
        vehiculo1.setConductor(conductor1);

        //probamos las relaciones
        System.out.println(conductor1.getVehiculo());
        System.out.println(vehiculo1.getConductor());
        System.out.println(vehiculo1.getMotor());

        //usando toString()
        System.out.println(vehiculo1);

    }

}

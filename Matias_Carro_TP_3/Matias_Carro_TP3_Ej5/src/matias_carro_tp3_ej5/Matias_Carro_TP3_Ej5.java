/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matias_carro_tp3_ej5;


/**
 *
 * @author Matias
 */
public class Matias_Carro_TP3_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     //se crea la navecon 50 de combustible
     NaveEspacial nave1 = new NaveEspacial("Millenium Falcon", 50);
     
     //se despega la nave
        System.out.println("*Despegando la nave*");
     nave1.despegar();
          
     //se intenta avanzar sin combustible suficiente
        System.out.println("\n*Intentando avanzar con 50 de combustible:*");
     nave1.avanzar(100);
     
     //se recarga combustible para el viaje
        System.out.println("\n*Se recarga combustible*");
     nave1.recargarCombustible(125);
     
     //se logra avanzar
        System.out.println("\n*Intentamos avanzar nuevamente*");
     nave1.avanzar(100);
     
     //se muestra estado al final
     nave1.mostrarEstado();
    }
    
}

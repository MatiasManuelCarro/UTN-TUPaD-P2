/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp3_ej5;

/**
 *
 * @author Matias
 */
public class NaveEspacial {
    String nombre;
    int combustible;
    boolean naveDespegada = false;
    int distanciaViajada;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }
    
      
    public void despegar(){
        if (naveDespegada == true){
            System.out.println("La nave ya se encuentra despegada! ");
        }else{
            naveDespegada = true;
            System.out.println("Despegue en 3... 2... 1...");
            System.out.println("Nave en orbita");
        }
        }
  
        
    public void avanzar(int distancia){
        if (combustible <= 50 ){
            System.out.println("Combustible muy bajo para el salto, recargue.");
        }else if (combustible > 50 && naveDespegada == true){
            System.out.println("Comenzando viaje");
            distanciaViajada += distancia;
            
        }
    }
        
     public void recargarCombustible(int cantidad){
         combustible += cantidad;
         System.out.println("Se recargan "+cantidad+" unidades de combustible");
     }


}
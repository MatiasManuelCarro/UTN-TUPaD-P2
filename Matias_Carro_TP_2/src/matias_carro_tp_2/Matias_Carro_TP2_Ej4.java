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
public class Matias_Carro_TP2_Ej4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int precio;
            String categoria;
            
                                             
            System.out.println("Ingrese el precio del producto");
            precio = Integer.parseInt(input.nextLine());
            
            System.out.println("Ingrese la categoria del producto A, B o C en mayusculas");
            categoria = input.nextLine();
            
            if(categoria.equals("A")){
                System.out.println("El precio original es: $"+precio);
                System.out.println("Descuento final aplicado: 10% \nEl precio final es: $"+(precio-precio*0.10));                
            }else if(categoria.equals("B")){  
                System.out.println("El precio original es: $"+precio);
                System.out.println("Descuento final aplicado: 15% \nEl precio final es: $"+(precio-precio*0.15));
            }else if(categoria.equals("C")){  
                System.out.println("El precio original es: $"+precio);
                System.out.println("Descuento final aplicado: 20% \nEl precio final es: $"+(precio-precio*0.20));
            }else{
                System.out.println("La categoria no es correcta, no se aplica ningun descuento");
                System.out.println("El precio original es: $"+precio);
            }
        }
    }    


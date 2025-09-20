/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej14;

/**
 *
 * @author Matias
 */
public class EditorVideo {
    public static void exportar(String formato, Proyecto proyecto){
        Render exportarRender = new Render(formato, proyecto);
        System.out.println("Render Exportado | " + exportarRender);
        
    }
        
}

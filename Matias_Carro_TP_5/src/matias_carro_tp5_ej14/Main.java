/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej14;

/**
 *
 * @author Matias
 */
public class Main {
    public static void main(String[] args) {
        Proyecto proyecto1 = new Proyecto("Proyecto numero 1", "00:25:00");
        EditorVideo.exportar("MKV", proyecto1);
        
        Proyecto proyecto2 = new Proyecto("Proyecto numero 2", "00:37:16");
        EditorVideo.exportar("MKV", proyecto2);
        
    }
}

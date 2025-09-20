/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej14;

/**
 *
 * @author Matias
 */
public class Proyecto {

    private final String nombre;
    private final String duracionMin;

    public Proyecto(String nombre, String DuracionMin) {
        this.nombre = nombre;
        this.duracionMin = DuracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDuracionMin() {
        return duracionMin;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Duracion: " + duracionMin;
    }
}

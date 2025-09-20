/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej4;

/**
 *
 * @author Matias
 */
public class Banco {

    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        if (cuit != null) {
            this.cuit = cuit;
        }
    }

    @Override
    public String toString() {
        return " | Nombre Banco: " + nombre + " | Cuit: " + cuit;
    }

    
    
}

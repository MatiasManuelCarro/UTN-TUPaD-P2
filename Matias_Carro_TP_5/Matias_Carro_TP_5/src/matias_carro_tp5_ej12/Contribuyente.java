/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej12;

/**
 *
 * @author Matias
 */
public class Contribuyente {

    private String nombre;
    private String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        if (cuil != null) {
            this.cuil = cuil;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCUIL: " + cuil;
    }

}

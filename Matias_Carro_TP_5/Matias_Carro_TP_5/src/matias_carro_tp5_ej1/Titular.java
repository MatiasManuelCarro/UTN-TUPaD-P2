/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej1;

/**
 *
 * @author Matias
 */
public class Titular {

    private String nombre;
    private String dni;
    private Pasaporte pasaporte; //asociacion 1:1

    public Titular(String nombre, String dni) { //Constructor del titular
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getDni() { //getter del dni
        return dni;
    }

    public void setDni(String dni) { //setter Dni
        if (dni != null) {
            this.dni = dni;
        }
    }
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    //Aca empiezan las relaciones 
    
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

   
    @Override
    public String toString() {
        return "Nombre del Titular: " + nombre + " | dni: " + dni;
    }

}

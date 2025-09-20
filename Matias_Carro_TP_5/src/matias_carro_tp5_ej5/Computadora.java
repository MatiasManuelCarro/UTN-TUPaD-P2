/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej5;

/**
 *
 * @author Matias
 */
public class Computadora {

    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modeloPlacaMadre, String chipsetPlacaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        //creamos la placa madre dentro del constructor de computadora 
        this.placaMadre = new PlacaMadre(numeroSerie, modeloPlacaMadre);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null) {
            this.marca = marca;
        }
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        if (numeroSerie != null) {
            this.numeroSerie = numeroSerie;
        }
    }

    public String getComputadora() {
        return marca + numeroSerie + propietario;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }

    }

    @Override
    public String toString() {
        return "Marca de la PC: " + marca + " | S/N: " + numeroSerie + placaMadre + propietario;
    }
}

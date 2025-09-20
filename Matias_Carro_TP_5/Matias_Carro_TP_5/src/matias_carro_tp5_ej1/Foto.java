/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej1;

/**
 *
 * @author Matias
 */
public class Foto {

    private String imagen;
    private String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        if (imagen != null) {
            this.imagen = imagen;
        }
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        if (formato != null) {
            this.formato = formato;
        }
    }

    @Override
    public String toString() {
        return "Foto: " + imagen + formato; 
    }

    
}

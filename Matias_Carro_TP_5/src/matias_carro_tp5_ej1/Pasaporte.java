/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej1;

/**
 *
 * @author Matias
 */
public class Pasaporte {

    private String numero;
    private String fechaEmision;
    private Titular titular;
    private Foto foto;

    public Pasaporte(String numero, String fechaEmision) { //constructor de pasaporte 
        this.numero = numero;
        this.fechaEmision = fechaEmision;
    }

    public String getNumero() { //getter de numero de pasaporte
        return numero;
    }

    public void setNumero(String numero) { //setter de numero de pasaporte
        this.numero = numero;
    }

    public String getFechaEmision() { //getter de fecha de pasaporte
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) { //setter de fecha de pasaporte
        if (fechaEmision != null) {
            this.fechaEmision = fechaEmision;
        }
    }
    
    //aca comienzan las relaciones

    public Titular getTitular() { //getter del titular 
        return titular;

    }

    public void setTitular(Titular titular) { //setter del titular, crea la relacion con titular
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this){
            titular.setPasaporte(this);
        }      
    }

    public Foto getFoto() { //getter de la foto
        return foto;
    }

    public void setFoto(Foto foto) { //setter, crea la relacion pasaporte -> foto
        this.foto = foto;
    }

    @Override
    public String toString() {
        //return "Numero de pasaporte: "+numero+ " | Fecha de emision: " + fechaEmision + " | " +  titular.toString()+" | Foto: "+foto.getImagen()+foto.getFormato();
        return "Numero de pasaporte: " + numero + " | Fecha de emision: " + fechaEmision + " | " + titular + " | " + foto;
    }

}

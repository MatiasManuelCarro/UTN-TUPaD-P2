/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej6;

/**
 *
 * @author Matias
 */
public class Reserva {

    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        if (fecha != null) {
            this.fecha = fecha;
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        if (hora != null) {
            this.hora = hora;
        }

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (fecha != null) {
            this.cliente = cliente;
        }
    }

    public Mesa getMesa() {
        return mesa;
    }

    @Override
    public String toString() {
        return "\nReserva: \nFecha: " + fecha + "\nHora: " + hora + mesa + cliente;
    }
    
    

}

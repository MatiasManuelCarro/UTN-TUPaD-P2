/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej12;

/**
 *
 * @author Matias
 */
public class Impuesto {

    private int monto;
    private Contribuyente contribuyente;

    public Impuesto(int monto) {
        this.monto = monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        if (contribuyente != null) {
            this.contribuyente = contribuyente;
        }
    }

    public int getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Monto impuesto: $" + monto;
    }
    
    

    
}

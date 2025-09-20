/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej10;

/**
 *
 * @author Matias
 */
public class CuentaBancaria {

    private String cbu;
    private String saldo;
    private Titular titular;
    private ClaveSeguridad claveSeguridad;

    public CuentaBancaria(String cbu, String saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        if (cbu != null) {
            this.cbu = cbu;
        }
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        if (saldo != null) {
            this.saldo = saldo;
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }

    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    @Override
    public String toString() {
        return "\nCBU cuenta: " + cbu + "\nSaldo cuenta: $" + saldo + titular;
    }

}

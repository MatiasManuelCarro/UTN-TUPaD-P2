/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej8;

/**
 *
 * @author Matias
 */
public class FirmaDigital {

    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public String getFirmaDigital(){
        return codigoHash + fecha + usuario;
    }
    
    public Usuario getUsuario(){
        return usuario;
    }

    @Override
    public String toString() {
        return "\nCodigo hash de la firma: " + codigoHash + "\nFecha de la firma: " + fecha + usuario;
    }

}

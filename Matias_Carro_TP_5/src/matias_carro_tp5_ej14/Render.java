/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej14;

/**
 *
 * @author Matias
 */
public class Render {
    private final String formato;
    private final Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }
 

    public String getFormato() {
        return formato;
    }
    
    @Override
    public String toString(){
        //return "Formato: " + formato + proyecto;
        return proyecto + " | Formato: " + formato;
    }
}

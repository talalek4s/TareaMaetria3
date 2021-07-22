/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.talalek.ejercicioprogramacion;

/**
 *
 * @author J. PINEDA
 */
public class MotorizadosTerrestres extends Terrestres implements Movimiento{

    private String combustible;

    public MotorizadosTerrestres(String combustible, int numeroDeRuedas, String nombre, Double velocidad, Double peso) {
        super(numeroDeRuedas, nombre, velocidad, peso);
        this.combustible = combustible;
    }
   
    @Override
    public String desplazamiento() {
        return " Se desplaza sobre tierra "; //To change body of generated methods, choose Tools | Templates.
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return " Este vehiculo es  " + nombre + " consume " + combustible + desplazamiento();
    }
    
    
}

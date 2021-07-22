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
public class Terrestres extends Vehiculos   {

    
    private int numeroDeRuedas;

    public Terrestres(int numeroDeRuedas, String nombre, Double velocidad, Double peso) {
        super(nombre, velocidad, peso);
        this.numeroDeRuedas = numeroDeRuedas;
    }

    
    
    /**
     * @return the numeroDeRuedas
     */
    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    /**
     * @param numeroDeRuedas the numeroDeRuedas to set
     */
    public void setNumeroDeRuedas(int numeroDeRuedas) {
        this.numeroDeRuedas = numeroDeRuedas;
    }

    @Override
    public String toString() {
        return "Terrestres{" + "numeroDeRuedas=" + numeroDeRuedas + '}';
    }
    
    
    
}

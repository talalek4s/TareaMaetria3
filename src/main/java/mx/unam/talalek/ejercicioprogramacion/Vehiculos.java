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
public class Vehiculos {
    protected String nombre;
    protected Double velocidad;
    protected Double peso;

    public Vehiculos(String nombre, Double velocidad, Double peso) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.peso = peso;
    }
    
    
    
    @Override
    public String toString(){
     return "";
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the velocidad
     */
    public Double getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }
}

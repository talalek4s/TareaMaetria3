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
public class Acuaticos extends Vehiculos  implements Movimiento {

    String navegacion;

    public Acuaticos(String navegacion, String nombre, Double velocidad, Double peso) {
        super(nombre, velocidad, peso);
        this.navegacion = navegacion;
    }
    
    

    public String getNavegacion() {
        return navegacion;
    }

    public void setNavegacion(String navegacion) {
        this.navegacion = navegacion;
    }

    @Override
    public String toString() {
        return "Este transporte es " + getNombre() + " se mueve " + desplazamiento();
    }

    @Override
    public String desplazamiento() {
        return " Bajo el agua "; //To change body of generated methods, choose Tools | Templates.
    }

    
}

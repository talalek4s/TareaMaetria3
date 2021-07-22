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
public class SinMotorTerrestres extends Terrestres implements Movimiento{
    
    public SinMotorTerrestres(int numeroDeRuedas, String nombre, Double velocidad, Double peso) {
        super(numeroDeRuedas, nombre, velocidad, peso);
    }

    @Override
    public String toString() {
        return " Este vehiculo es  " + nombre + " tiene " + getNumeroDeRuedas() +" ruedas " + desplazamiento();
    }

    @Override
    public String desplazamiento() {
        return "Se desplaza con el pie"; //To change body of generated methods, choose Tools | Templates.
    }
    
}

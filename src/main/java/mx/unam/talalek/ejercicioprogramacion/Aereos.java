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
public class Aereos extends Vehiculos  implements Movimiento{

   String impulso;

    public Aereos(String impulso, String nombre, Double velocidad, Double peso) {
        super(nombre, velocidad, peso);
        this.impulso = impulso;
    }

   
   
    public String getImpulso() {
        return impulso;
    }

    public void setImpulso(String impulso) {
        this.impulso = impulso;
    }

    @Override
    public String toString() {
        return "Este transporte es " + getNombre()+ " se mueve " + desplazamiento();
    }

    @Override
    public String desplazamiento() {
        return " con helices "; //To change body of generated methods, choose Tools | Templates.
    }

    
}

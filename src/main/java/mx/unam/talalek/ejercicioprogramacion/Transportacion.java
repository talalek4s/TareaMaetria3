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
public class Transportacion {
    public static void main(String[] args) {
        
        MotorizadosTerrestres transporte1 = new MotorizadosTerrestres("Gasolina", 2, "Motocicleta", 75.0, 80.0);
        SinMotorTerrestres transporte2 = new SinMotorTerrestres(2, "Patineta", 10.0, 4.0);
        Acuaticos transporte3 = new Acuaticos("Helices" , "submarino" , 100.0 , 30000.0);
        Aereos transporte4 = new Aereos("Helices", "Helicoptero", 300.0, 2500.0);
        
        
        System.out.println(transporte1.toString());
        System.out.println(transporte2.toString());
        System.out.println(transporte3.toString());
        System.out.println(transporte4.toString());
    }
}

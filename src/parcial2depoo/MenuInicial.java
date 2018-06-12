/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo;

import java.util.Scanner;
import parcial2depoo.AbstractFactoryJuego.AbstractFactoryJuego;
import parcial2depoo.AbstractFactoryJuego.FactoryProducerJuego;
//import parcial2depoo.Razas.FactoryRazas;
import parcial2depoo.Razas.Razas;

/**
 *
 * @author Melissa
 */
public class MenuInicial {
    
    public void DatosJugador(){
        Scanner dato= new Scanner(System.in);
        AbstractFactoryJuego factory;
        System.out.println("------JUGADOR 1-----");
        System.out.print("Ingrese su nombre: ");
        String jugador1 = dato.nextLine();
        System.out.println("Razas existentes: Animan, Hechiceros, DuendesYHadas");
        System.out.print("Ingrese la raza a escoger: ");             
        String razaJugador1= dato.nextLine();
        factory= FactoryProducerJuego.getFactory("Razas");
        Razas razaJ1= factory.getRazas(razaJugador1);
        Jugador j1 = new Jugador(jugador1,razaJ1);
        
        System.out.println("------JUGADOR 2-----");
        System.out.print("Ingrese su nombre: ");
        String jugador2 = dato.nextLine();
        System.out.println("Razas existentes: Animan, Hechiceros, DuendesYHadas");
        System.out.print("Ingrese la raza a escoger: ");
        String razaJugador2= dato.nextLine();
        //factory= FactoryProducerJuego.getFactory("Razas");
        Razas razaJ2= factory.getRazas(razaJugador2);
        Jugador j2 = new Jugador(jugador2,razaJ2);
    }
}

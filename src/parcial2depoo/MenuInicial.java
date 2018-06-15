/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo;

import java.util.Scanner;
import parcial2depoo.AbstractFactoryJuego.AbstractFactoryJuego;
import parcial2depoo.AbstractFactoryJuego.FactoryProducerJuego;
import parcial2depoo.Razas.Razas;

/**
 * Esta clase realiza el menu de inicio y posteriormente los menus de las acciones de los jugadores
 * @author Melissa
 */
public class MenuInicial {
    //Variable para controlar el numero de las fases del juego
    static int fase=1;
    
    /**
     * Metodo que pide los datos de los jugadores y el menu de las acciones
     */
    public static void MenuPrincipal(){
        Scanner dato= new Scanner(System.in);
        AbstractFactoryJuego factory;
        factory= FactoryProducerJuego.getFactory(1);
        
        System.out.println("------JUGADOR 1-----");
        System.out.print("Ingrese su nombre: ");
        String jugador1 = dato.nextLine();
        System.out.println("Razas existentes: 1.Animan | 2.Duendes | 3.Hechiceros");
        System.out.print("Ingrese la raza a escoger: ");             
        int razaJugador1= dato.nextInt();
        Razas razaJ1= factory.getRazas(razaJugador1);
        Jugador j1 = new Jugador(jugador1,razaJ1);
        
        System.out.println("");
        
        System.out.println("------JUGADOR 2-----");
        System.out.print("Ingrese su nombre: ");
        String jugador2 = dato.next();
        System.out.println("Razas existentes: 1.Animan | 2.Duendes | 3.Hechiceros");
        System.out.print("Ingrese la raza a escoger: ");
        int razaJugador2= dato.nextInt();
        Razas razaJ2= factory.getRazas(razaJugador2);
        Jugador j2 = new Jugador(jugador2,razaJ2);
        
        while(true){
            System.out.println("\n FASE#"+fase);
            System.out.println("\n TURNO DEL JUGADOR 1");
            j1.Menu();
            System.out.println("\n TURNO DEL JUGADOR 2");
            j2.Menu();
            fase= fase+1;
        }
    }
}

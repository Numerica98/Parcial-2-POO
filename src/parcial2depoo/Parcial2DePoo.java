/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo;

import java.util.Scanner;

/**
 *
 * @author Melissa
 */
public class Parcial2DePoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("¡¡¡¡¡BIENVENIDOS A NURIARIVAS'S WORD!!!!!");
        System.out.println("Donde todo puede pasar en el campo de batalla");
        System.out.println("Pueden elegir pertenecer al bando de: Los Duendes y Hadas, Los Hechiceros y Los Animan");
        System.out.println("Así que ¡no esperen mas! Ingresen sus nombres y la raza a escoger por favor");
        Scanner dato= new Scanner(System.in);
        System.out.println("------JUGADOR 1-----");
        System.out.println("Nombre: ");
        String jugador1 = dato.nextLine();
        System.out.println("Raza: ");
        String razaJugador1= dato.nextLine();
        System.out.println("------JUGADOR 2-----");
        System.out.println("Nombre: ");
        String jugador2 = dato.nextLine();
        System.out.println("Raza: ");
        String razaJugador2= dato.nextLine();
    }
    
}

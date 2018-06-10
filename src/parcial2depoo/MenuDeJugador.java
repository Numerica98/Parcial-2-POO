/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Melissa
 */
public class MenuDeJugador {
    private static MenuDeJugador Menu;
    
    private MenuDeJugador(){}
    
    public static MenuDeJugador getInstance(){
        if(Menu == null){
           Menu= new MenuDeJugador(); 
        }
        return Menu;
    }
    
    public void opcionesDelMenu(){
        System.out.println("¿Qué desea hacer jugador?");
        System.out.println("1. Construir edificaciones");
        System.out.println("2. Entrenar tropas");
        System.out.println("3. Atacar al enemigo");
        System.out.println("4. Recolectar recursos");
        System.out.println("5. Terminar turno");
    }
    
    public void Menu(){
        int opcion =6;
        Scanner dato= new Scanner(System.in);
        
        while (opcion !=5){
            opcionesDelMenu();
            try{
                opcion= dato.nextInt();
                
                switch(opcion){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Por favor ingrese un numero de una de las opciones disponibles");
                }
            } catch(InputMismatchException e){
                System.out.println("Por favor ingrese un numero valido");
                dato.nextLine();
            }
        }
    }
}

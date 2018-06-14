/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import parcial2depoo.AbstractFactoryJuego.AbstractFactoryJuego;
import parcial2depoo.AbstractFactoryJuego.FactoryProducerJuego;
import parcial2depoo.Edificaciones.Edificaciones;
import parcial2depoo.Razas.Razas;

/**
 *
 * @author Melissa
 */
public class Jugador {
    private String nombre;
    private Razas raza;
    private CuartelJugador cuartelJugador; 
    private ArrayList<Edificaciones> Edificaciones; 
    
    public Jugador(String nombre, Razas raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Razas getRaza() {
        return raza;
    }

    public void setRaza(Razas raza) {
        this.raza = raza;
    }

    public ArrayList<Edificaciones> getEdificaciones() {
        return Edificaciones;
    }

    public void setEdificaciones(ArrayList<Edificaciones> Edificaciones) {
        this.Edificaciones = Edificaciones;
    }

    public CuartelJugador getCuartelJugador() {
        return cuartelJugador;
    }

    public void setCuartelJugador(CuartelJugador cuartelJugador) {
        this.cuartelJugador = cuartelJugador;
    }
    
    public void Menu(){
        Scanner dato= new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        AbstractFactoryJuego factory;
        boolean bandera=true;
        
        while (bandera==true){
            //System.out.println("JUGADOR cuentas con los siguientes recursos: "); 
            //System.out.println("Recurso 1: "+cuartelJugador.getRecurso1());
            //System.out.println("Recurso 2: "+cuartelJugador.getRecurso2());
            //System.out.println("Recurso 3: "+cuartelJugador.getRecurso3());
            System.out.println("\n ¿Qué deseas hacer jugador?");
            System.out.println("1. Construir edificaciones");
            System.out.println("2. Entrenar tropas");
            System.out.println("3. Atacar al enemigo");
            System.out.println("4. Recolectar recursos");
            System.out.println("5. Terminar turno");
            System.out.print("Ingrese su opcion: ");
            
            try{
                int opcion= dato.nextInt();
                
                switch(opcion){
                    case 1:
                        factory =  FactoryProducerJuego.getFactory(2);
                        System.out.println("¿Que tipo de edificio desea construir? 1.Cuartel | 2.Recursos | 3.Vehiculos) ");
                        System.out.print("Opcion: ");
                        int tipo= input.nextInt();
                        Edificaciones edificio = factory.getEdificaciones(tipo);
                        Edificaciones.add(edificio);
                        //recursoset(recursoget-1)
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        bandera= false;
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

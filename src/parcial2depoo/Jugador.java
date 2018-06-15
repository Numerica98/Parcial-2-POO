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
 *Esta clase sirve para el manejo de los jugadores
 * @author Melissa
 */
public class Jugador {
    //Atributos del jugador
    private String nombre;
    private Razas raza;
    private CuartelJugador cuartelJugador = new CuartelJugador(); 
    private ArrayList<Edificaciones> Edificaciones = new ArrayList(); 
    
    /**
     * Constructor de la clase para inicializar el objeto con valores predeterminados
     * @param nombre nombre o alias del jugador
     * @param raza la raza escogida por el jugador
     */
    public Jugador(String nombre, Razas raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    /**
     * Metodo get para obtener el nombre del jugador
     * @return el dato obtenido de nombre
     */
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
    
    /**
     * Metodo para construir edificios o crear milicia y vehiculos
     * @param opcion 
     */
    public void construir(int opcion){
        Scanner input = new Scanner(System.in);
        AbstractFactoryJuego factory;
        int tipo, NumeroEdificio;
        switch(opcion){
            case 1:
                factory =  FactoryProducerJuego.getFactory(2);
                System.out.println("\n ¿Que tipo de edificio desea construir? ");
                System.out.println("1.Cuartel (200 Recurso 1 y 100 Recurso 2)");                
                System.out.println("2.Vehiculos (300 Recurso 1 y 100 Recurso 3)");
                System.out.println("3.Recursos (400 Recurso 2 y 200 Recurso 3)");
                System.out.print("Opcion: ");
                tipo= input.nextInt();
                Edificaciones.add(factory.getEdificaciones(tipo));
                if(tipo==1){
                    cuartelJugador.setRecurso1(cuartelJugador.getRecurso1()-200);
                    cuartelJugador.setRecurso2(cuartelJugador.getRecurso2()-100);
                }
                if(tipo==2){
                   cuartelJugador.setRecurso2(cuartelJugador.getRecurso2()-400);
                   cuartelJugador.setRecurso3(cuartelJugador.getRecurso3()-200);
                }
                if(tipo==3){
                   cuartelJugador.setRecurso1(cuartelJugador.getRecurso1()-300);
                   cuartelJugador.setRecurso3(cuartelJugador.getRecurso3()-100);
                }
                break;
            case 2:
                System.out.println("\n-----EDIFICIOS EXISTENTES-----");
                for (int i=0; i<Edificaciones.size(); i++ ){
                    System.out.println("Edificio#"+(i+1)+" "+ Edificaciones.get(i).getClass().getName());
                }
                System.out.println("Selecciona el cuartel donde deseas entrenar a tu tropa");
                System.out.print("Ingrese el numero del cuartel: ");
                NumeroEdificio= input.nextInt();
                System.out.println("\n ¿Que tipo de milicia desea entrenar? ");
                System.out.println("1.Escuadron (500 Recurso 1 y 200 Recurso 3)");
                System.out.println("2.Especialista (1000 Recurso 1 y 400 Recurso 3)");
                System.out.print("Opcion: ");
                tipo= input.nextInt();
                Edificaciones.get(NumeroEdificio-1).producirMilicia(tipo);
                if(tipo==1){
                    cuartelJugador.setRecurso1(cuartelJugador.getRecurso1()-500);
                    cuartelJugador.setRecurso3(cuartelJugador.getRecurso3()-200);
                }
                if(tipo==2){
                   cuartelJugador.setRecurso1(cuartelJugador.getRecurso1()-400);
                   cuartelJugador.setRecurso3(cuartelJugador.getRecurso3()-200);
                }
                System.out.println("\n Se ha creado tu milicia");
            case 3: 
                System.out.println("\n-----EDIFICIOS EXISTENTES-----");
                for (int i=0; i<Edificaciones.size(); i++ ){
                    System.out.println("Edificio#"+(i+1)+" "+ Edificaciones.get(i).getClass().getName());
                }
                System.out.println("Selecciona el edificio de Vehiculos donde deseas crear tu vehiculo");
                System.out.print("Ingrese el numero del edificio de vehiculos: ");
                NumeroEdificio= input.nextInt();
                System.out.println("\n ¿Que tipo de vehiculo desea crear? ");
                System.out.println("1.Terrestre (800 Recurso 2 y 600 Recurso 3)");
                System.out.println("2.Aereo (900 Recurso 1 y 500 Recurso 3)");
                System.out.print("Opcion: ");
                tipo= input.nextInt();
                Edificaciones.get(NumeroEdificio-1).producirVehiculos(tipo);
                if(tipo==1){
                    cuartelJugador.setRecurso2(cuartelJugador.getRecurso2()-800);
                    cuartelJugador.setRecurso3(cuartelJugador.getRecurso3()-200);
                }
                if(tipo==2){
                   cuartelJugador.setRecurso1(cuartelJugador.getRecurso1()-900);
                   cuartelJugador.setRecurso3(cuartelJugador.getRecurso3()-500);
                }
                System.out.println("\n Se ha creado tu vehiculo");
            default:
                System.out.println("Ingreso un termino invalido");
        }
        
    }
    
    /**
     * Metodo para implementar un menu para las acciones de los jugadores
     */
    public void Menu(){
        Scanner dato= new Scanner(System.in);
        
        boolean bandera=true;
        
        while (bandera==true){
            System.out.println("JUGADOR cuentas con los siguientes recursos: "); 
            System.out.println("Recurso 1: "+cuartelJugador.getRecurso1());
            System.out.println("Recurso 2: "+cuartelJugador.getRecurso2());
            System.out.println("Recurso 3: "+cuartelJugador.getRecurso3());
            System.out.println("\n ¿Qué deseas hacer jugador?");
            System.out.println("1. Construir edificaciones");
            System.out.println("2. Crear tropas");
            System.out.println("3. Crear vehiculos");
            System.out.println("4. Atacar al enemigo");
            System.out.println("5. Recolectar recursos");
            System.out.println("6. Terminar turno");
            System.out.print("Ingrese su opcion: ");
            
            try{
                int opcion= dato.nextInt();
                
                switch(opcion){
                    case 1:
                        construir(1);
                        break;
                    case 2:
                        construir(2);
                        break;
                    case 3:
                        construir(3);
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        bandera= false;
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

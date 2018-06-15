/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo.Edificaciones;

import parcial2depoo.AbstractFactoryJuego.AbstractFactoryJuego;
import parcial2depoo.Milicia.Milicia;
import parcial2depoo.Razas.Razas;
import parcial2depoo.Vehiculo.Vehiculo;

/**
 * Clase encargada de la fabricacion de los edificios
 * @author Melissa
 */
public class FactoryEdificaciones implements AbstractFactoryJuego{

    @Override
    public Edificaciones getEdificaciones(int tipo) {
        switch(tipo){
            case 1:
                System.out.println("\n Se creo el cuartel para las tropas");
                return new CuartelDeMilicia();
            case 2:
                System.out.println("\n Se creo la fabrica de vehiculos");
                return new Vehiculos();
            case 3:
                System.out.println("\n Se creo la fabrica de recursos");
                return new Recursos();
        }
        return null;
    }

    @Override
    public Razas getRazas(int tipo) {
        return null;
    }

    @Override
    public Milicia getMilicia(int tipo) {
        return null;
    }

    @Override
    public Vehiculo getVehiculo(int tipo) {
        return null;
    }
        
}

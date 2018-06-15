/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo.Vehiculo;

import parcial2depoo.AbstractFactoryJuego.AbstractFactoryJuego;
import parcial2depoo.Edificaciones.Edificaciones;
import parcial2depoo.Milicia.Milicia;
import parcial2depoo.Razas.Razas;

/**
 * Fabrica de vehiculos
 * @author Melissa
 */
public class FactoryVehiculo implements AbstractFactoryJuego{

    @Override
    public Edificaciones getEdificaciones(int tipo) {
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
        switch(tipo){
            case 1:
                return new Terrestre();
            case 2:
                return new Aereo();
        }
        return null;
    }
    
}

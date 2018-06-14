/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo.AbstractFactoryJuego;

import parcial2depoo.Edificaciones.FactoryEdificaciones;
import parcial2depoo.Milicia.FactoryMilicia;
import parcial2depoo.Razas.FactoryRazas;
import parcial2depoo.Vehiculo.FactoryVehiculo;

/**
 *
 * @author Melissa
 */
public class FactoryProducerJuego {
    public static AbstractFactoryJuego getFactory(int tipo){
        switch(tipo){
            case 1:
                return new FactoryRazas();
            case 2:
                return new FactoryEdificaciones();
            case 3:
                return new FactoryMilicia();
            case 4:
                return new FactoryVehiculo();
        }
        return null;
    }
}

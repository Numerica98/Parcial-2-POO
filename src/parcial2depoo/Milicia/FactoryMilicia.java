/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo.Milicia;

import parcial2depoo.AbstractFactoryJuego.AbstractFactoryJuego;
import parcial2depoo.Edificaciones.Edificaciones;
import parcial2depoo.Razas.Razas;
import parcial2depoo.Vehiculo.Vehiculo;

/**
 *
 * @author Melissa
 */
public class FactoryMilicia implements AbstractFactoryJuego{

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
        switch(tipo){
            case 1:
                return new Escuadron();
            case 2:
                return new Especialista();
        }
        return null;
    }

    @Override
    public Vehiculo getVehiculo(int tipo) {
        return null;
    }
    
}

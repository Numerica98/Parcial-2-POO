/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo.Edificaciones;

import parcial2depoo.AbstractFactoryJuego.AbstractFactoryJuego;
import parcial2depoo.AbstractFactoryJuego.FactoryProducerJuego;
import parcial2depoo.Milicia.Milicia;
import parcial2depoo.Vehiculo.Vehiculo;

/**
 * Clase encargada de producir los vehiculos
 * @author Melissa
 */
public class Vehiculos implements Edificaciones{

    @Override
    public Milicia producirMilicia(int tipo) {
        return null;
    }

    @Override
    public Vehiculo producirVehiculos(int tipo) {
        AbstractFactoryJuego factory;
        factory =  FactoryProducerJuego.getFactory(4);
        return factory.getVehiculo(tipo);  
    }
    
    
}

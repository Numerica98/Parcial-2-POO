/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo.Edificaciones;

import parcial2depoo.AbstractFactoryJuego.AbstractFactoryJuego;
import parcial2depoo.Razas.Razas;

/**
 *
 * @author Melissa
 */
public class FactoryEdificaciones implements AbstractFactoryJuego{

    @Override
    public Edificaciones getEdificaciones(String tipo) {
        switch(tipo){
            case "Milicia":
                return new Milicia();
            case "Vehiculos":
                return new Vehiculos();
            case "Recursos":
                return new Recursos();
        }
        return null;
    }

    @Override
    public Razas getRazas(String tipo) {
        return null;
    }

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo.AbstractFactoryJuego;

import parcial2depoo.Edificaciones.FactoryEdificaciones;
import parcial2depoo.Razas.FactoryRazas;

/**
 *
 * @author Melissa
 */
public class FactoryProducerJuego {
    public static AbstractFactoryJuego getFactory(String tipo){
        switch(tipo){
            case "Razas":
                return new FactoryRazas();
            case "Edificaciones":
                return new FactoryEdificaciones();
        }
        return null;
    }
}

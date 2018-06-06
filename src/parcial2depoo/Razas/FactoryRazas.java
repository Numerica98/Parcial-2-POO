/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo.Razas;

import parcial2depoo.AbstractFactoryJuego.AbstractFactoryJuego;
import parcial2depoo.Edificaciones.Edificaciones;

/**
 *
 * @author Melissa
 */
public class FactoryRazas implements AbstractFactoryJuego{

    @Override
    public Edificaciones getEdificaciones(String tipo) {
        return null;
    }

    @Override
    public Razas getRazas(String tipo) {
        switch(tipo){
            case "Animan":
                return new Animan();
            case "DuendesYHadas":
                return new DuendesYHadas();
            case "Hechiceros":
                return new Hechiceros();
        }
        return null;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo.AbstractFactoryJuego;

import parcial2depoo.Edificaciones.Edificaciones;
import parcial2depoo.Razas.Razas;

/**
 *
 * @author Melissa
 */
public interface AbstractFactoryJuego {
    
    Edificaciones getEdificaciones(String tipo);
    Razas getRazas(String tipo);
}

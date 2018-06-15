/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo.AbstractFactoryJuego;

import parcial2depoo.Edificaciones.Edificaciones;
import parcial2depoo.Milicia.Milicia;
import parcial2depoo.Razas.Razas;
import parcial2depoo.Vehiculo.Vehiculo;

/**
 * Interfaz que obtiene el tipo de fabrica a usar
 * @author Melissa
 */
public interface AbstractFactoryJuego {
    
    Edificaciones getEdificaciones(int tipo);
    Razas getRazas(int tipo);
    Milicia getMilicia(int tipo);
    Vehiculo getVehiculo(int tipo);
}

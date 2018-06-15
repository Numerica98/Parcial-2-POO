/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo.Edificaciones;

import parcial2depoo.Milicia.Milicia;
import parcial2depoo.Vehiculo.Vehiculo;

/**
 * Interfaz comun de las edificaciones
 * @author Melissa
 */
public interface Edificaciones {
    Milicia producirMilicia(int tipo);
    Vehiculo producirVehiculos(int tipo);
    
}

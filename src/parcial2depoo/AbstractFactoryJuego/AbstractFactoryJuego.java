/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo.AbstractFactoryJuego;

import parcial2depoo.Animan.Animan;
import parcial2depoo.DuendesYHadas.DuendesYHadas;
import parcial2depoo.Hechiceros.Hechiceros;

/**
 *
 * @author Melissa
 */
public interface AbstractFactoryJuego {
    DuendesYHadas getDuendesYHadas(String tipo);
    Hechiceros getHechiceros(String tipo);
    Animan getAniman(String tipo);
}

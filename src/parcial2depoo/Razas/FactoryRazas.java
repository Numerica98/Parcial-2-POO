/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo.Razas;

import parcial2depoo.AbstractFactoryJuego.AbstractFactoryJuego;
import parcial2depoo.Edificaciones.Edificaciones;
import parcial2depoo.Milicia.Milicia;
import parcial2depoo.Vehiculo.Vehiculo;

/**
 * Clase encargada de fabricar las razas
 * @author Melissa
 */
public class FactoryRazas implements AbstractFactoryJuego{

    @Override
    public Edificaciones getEdificaciones(int tipo) {
        return null;
    }

    @Override
    public Razas getRazas(int tipo) {
        switch(tipo){
            case 1:
                System.out.println("\n Felicidades ahora perteneces a la raza de los Animan");
                return new Animan();
            case 2:
                System.out.println("\n Felicidades ahora perteneces a la raza de los Duendes");
                return new Duendes();
            case 3:
                System.out.println("\n Felicidades ahora perteneces a la raza de los Hechiceros");
                return new Hechiceros();
        }
        return null;
    }

    @Override
    public Milicia getMilicia(int tipo) {
        return null;
    }

    @Override
    public Vehiculo getVehiculo(int tipo) {
        return null;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo;

import parcial2depoo.Razas.Razas;

/**
 *
 * @author Melissa
 */
public class Jugador {
    private String nombre;
    private Razas raza;
    //private Recursos recurso;

    public Jugador(String nombre, Razas raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    
    public Jugador(){}
}

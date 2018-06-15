/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo.Milicia;

/**
 * Clase encargada del especialista de la milicia
 * @author Melissa
 */
public class Especialista implements Milicia{

    @Override
    public void atacar() {
        System.out.println("El especialista ataco el objetivo");
    }
    
}

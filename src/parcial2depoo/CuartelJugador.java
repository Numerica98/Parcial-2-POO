/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2depoo;

/**
 * Clase para simular el centro de mando de los jugadores, donde se manejan sus recursos a usar
 * @author Melissa
 */
public class CuartelJugador {
    //Atributos de la clase
    private int recurso1= 10000;
    private int recurso2= 5000;
    private int recurso3= 1000; 
    private int vida= 100000;
    
    /**
     * Metodo get para obtener el recurso 1 del jugador
     * @return el dato obtenido de recurso1
     */
    public int getRecurso1() {
        return recurso1;
    }
    
    /**
     * Metodo set para acceder al atributo recurso1
     * @param recurso1 valor del recurso1
     */
    public void setRecurso1(int recurso1) {
        this.recurso1 = recurso1;
    }
    
    /**
     * Metodo get para obtener el recurso 2 del jugador
     * @return el dato obtenido de recurso2
     */
    public int getRecurso2() {
        return recurso2;
    }
    
    /**
     * Metodo set para acceder al atributo recurso2
     * @param recurso2 valor del recurso2
     */
    public void setRecurso2(int recurso2) {
        this.recurso2 = recurso2;
    }

    /**
     * Metodo get para obtener el recurso 3 del jugador
     * @return el dato obtenido de recurso3
     */
    public int getRecurso3() {
        return recurso3;
    }

    /**
     * Metodo set para acceder al atributo recurso 3 
     * @param recurso3 valor del recurso3
     */
    public void setRecurso3(int recurso3) {
        this.recurso3 = recurso3;
    }
    
    /**
     * Metodo get para obtener la vida del CuartelJugador
     * @return el dato obtenido de vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * Metodo set para acceder al atributo vida
     * @param vida valor de vida
     */
    public void setVida(int vida) {
        this.vida = vida;
    }
    
}

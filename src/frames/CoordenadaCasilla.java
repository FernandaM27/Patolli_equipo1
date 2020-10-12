/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import entidades.Casilla;

/**
 *
 * @author Dany
 */
public class CoordenadaCasilla extends Coordenada {
    private Casilla casilla;

    /**
     * Consructor que establece una casilla y sus coordenadas, hereda de Coordenada
     * @param x coordenada x
     * @param y coordenada y
     * @param casilla la casilla que va a estar en las coordenadas establecidas
     */
    public CoordenadaCasilla(int x,int y,Casilla casilla) {
        super(x, y);
        this.casilla = casilla;
    }

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }
    
}

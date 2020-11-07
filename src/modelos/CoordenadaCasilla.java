/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.Casilla;

/**
 *
 * @author Dany
 */
public class CoordenadaCasilla extends Coordenada {
    private Casilla casilla;

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

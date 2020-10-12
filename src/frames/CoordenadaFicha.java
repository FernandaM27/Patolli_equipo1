/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import entidades.Ficha;

/**
 *
 * @author Dany
 */
public class CoordenadaFicha extends Coordenada{
    private Ficha ficha;
    
    public CoordenadaFicha(Ficha ficha,int x, int y) {
        super(x, y);
        this.ficha=ficha;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    @Override
    public String toString() {
        return ficha.getOrden()+"";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import entidades.Ficha;
import entidades.Tablero;

/**
 *
 * @author MSI GF63
 */
public class Fachada implements IDibujoTablero{

    private Tablero tablero;
    private CanvasTablero canvas;

    public Fachada(Tablero tablero) {
        this.tablero = tablero;
        
    }
            
    @Override
    public void dibujarTablero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dibujarFichas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moverFicha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarFicha(Ficha ficha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

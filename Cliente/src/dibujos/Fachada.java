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
            
    /**
     * método constructor que inicializa el tablero
     * @param tablero 
     */
    public Fachada(Tablero tablero) {
        this.tablero = tablero;
        
    }
    /**
     * método que encarga de dibujar el tablero
     */
    @Override
    public void dibujarTablero() {
     }
    /**
     * método que se encarga dibujar fichas 
     */
    @Override
    public void dibujarFichas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * método que se encarga de mover una ficha
     */
    @Override
    public void moverFicha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Método que se encarga eliminar una ficha
     * @param ficha 
     */
    @Override
    public void eliminarFicha(Ficha ficha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

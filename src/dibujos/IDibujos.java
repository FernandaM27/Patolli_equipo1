/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import entidades.Ficha;

/**
 *
 * @author MSI GF63
 */
public interface IDibujos {
    public void dibujarTablero();
    
    public void dibujarFichas();
    
    public void moverFicha();
    
    public void eliminarFicha(Ficha ficha);
}

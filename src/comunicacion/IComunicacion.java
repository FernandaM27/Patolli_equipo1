/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacion;

import entidades.Partida;

/**
 *
 * @author jc
 */
public interface IComunicacion {        
    
    public void crearPartida(Partida partida);    
    
    public void pagarApuesta();
    
    public void realizarMovimiento();
    
    public void ingresarPartida();
    
    public void actualizarModelo();
    
    public void notificarTurno();
    
    
}

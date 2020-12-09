/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacionServidor;

import entidades.Jugador;
import entidades.Movimiento;
import entidades.Partida;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Alfon
 */
public class Protocolo implements Observer {

    @Override
    public void update(Observable arg0, Object arg1) {

    }

    /**
     * Revisar en el ejemplo del profe
     *
     * @param <T>
     * @param input
     */
    public <T> void processInput(Class<T> input) {
        
    }
    
    public void manejarJugador(Jugador jugador){
        
    }
    public void manejarPartida(Partida partida){
        
    }
    
    public void manejarMovimiento(Movimiento movimiento){
        
    }

    /*
        ### checar
       Si las notificaciones a los demás jugadores se van a manejar en los methods de arriba 
    */
    
}

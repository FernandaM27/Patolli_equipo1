/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entidades.Partida;

/**
 *
 * @author Alfon
 */
public class CtrlPartida {
    private static CtrlPartida ctrl;
    
    private CtrlPartida() {
    }

    public static CtrlPartida getInstance(){
        if (ctrl==null) {
            return ctrl= new CtrlPartida();
        }
        return ctrl;
    }
    
    public void crearPartida(Partida partida) {
    
    }

    public void iniciarPartida() {
    
    }

    public void terminarPartida() {
    
    }
}

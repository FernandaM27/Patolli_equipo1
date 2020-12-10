/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entidades.Partida;
import modelo.ModeloPartida;

/**
 *
 * @author Alfon
 */
public class CtrlPartida {

    private static CtrlPartida ctrl;
    private ModeloPartida modeloPartida;

    private CtrlPartida() {
        this.modeloPartida = ModeloPartida.getInstance();
    }

    public static CtrlPartida getInstance() {
        if (ctrl == null) {
            return ctrl = new CtrlPartida();
        }
        return ctrl;
    }

    public void crearPartida(Partida partida) {
        this.modeloPartida.crearPartida(partida);
    }

    public void iniciarPartida() {
        this.modeloPartida.iniciarPartida();
    }

    public void terminarPartida() {
        
    }
}

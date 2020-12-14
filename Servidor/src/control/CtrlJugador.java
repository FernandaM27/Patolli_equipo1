/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entidades.Jugador;
import modelo.ModeloPartida;

/**
 *
 * @author Alfon
 */
public class CtrlJugador {
    private static CtrlJugador ctrl;
    private ModeloPartida modeloPartida;
    
    private CtrlJugador() {
        this.modeloPartida= ModeloPartida.getInstance();
    }
    
    public static CtrlJugador getInstance(){
        if (ctrl==null) {
            return ctrl= new CtrlJugador();
        }
        return ctrl;
    }
    
    public void agregarJugador(Jugador jugador) {
        this.modeloPartida.agregarJugador(jugador);
     }

    public void eliminarJugador(Jugador jugador) {
        this.modeloPartida.eliminarDatosJugador(jugador);
     }

}

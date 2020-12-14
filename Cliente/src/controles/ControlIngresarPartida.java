/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import entidades.Jugador;
import frames.FrmTablero;
import java.awt.event.ActionEvent;
 
/**
 *
 * @author Alfon
 */
public class ControlIngresarPartida extends ControlComunicacion implements ControlBase{
    
    private FrmTablero frmTablero=null;
    private static ControlIngresarPartida ctrl;
    /**
     * método constructor que se encarga de incializar frmTablero
     */
    
    private ControlIngresarPartida() {
        this.frmTablero= FrmTablero.getInstance();
        this.setId(2);
    }
    
    /**
     * método singleton que regresa la instancia de controlPartida
     * @return 
     */
    public static ControlIngresarPartida getInstance(){
        if (ctrl==null) {
            return ctrl= new ControlIngresarPartida();
        }
        return ctrl;
    }
    
    public void ingresarJugador(Jugador jugador){
        super.comunicacion.ingresarPartida(jugador);
    }

    /**
     * método que permite procesar los eventos que sucedan en el frmIngresarPartida
     * @param arg0 
     */
    @Override
    public void actionPerformed(ActionEvent arg0) {
        
        
    }
    /**
     * método que permite a un jugador ingresar a partida
     * @param jugador 
     */
    public void ingresarPartida(Jugador jugador){
        super.comunicacion.ingresarPartida(jugador);
        try {
            super.mostrarPantalla(frmTablero);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
    }
}

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
public class ControlngresarPartida extends ControlComunicacion implements ControlBase{
    
    private FrmTablero frmTablero=null;
    private static ControlngresarPartida ctrl;
    
    private ControlngresarPartida() {
        this.frmTablero= FrmTablero.getInstance();
    }
    
    public static ControlngresarPartida getInstance(){
        if (ctrl==null) {
            return ctrl= new ControlngresarPartida();
        }
        return ctrl;
    }


    @Override
    public void actionPerformed(ActionEvent arg0) {
        
        
    }
    
    public void ingresarPartida(Jugador jugador){
        super.comunicacion.ingresarPartida(jugador);
        try {
            super.mostrarPantalla(frmTablero);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import entidades.Partida;
import frames.FrmCrearPartida;
import java.awt.event.ActionEvent;


/**
 *
 * @author Alfonso Sempoalt
 */
public class ControlCrearPartida extends ControlComunicacion implements ControlBase{
    
    private FrmCrearPartida frame;
    
    public ControlCrearPartida(FrmCrearPartida frame) {
        this.frame = frame;
    }
    
    public void crearPartida(Partida partida) {
        super.comunicacion.crearPartida(partida);
    }

    @Override
    public void mostrarPantalla() {
        
    }

    @Override
    public void mostrarError() {
        
    }

    @Override
    public void mostrarExito() {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacionCliente;

import controles.ControlComunicacion;
import entidades.Partida;

/**
 *
 * @author jc
 */
public class Comunicacion implements IComunicacion {
    
    private ControlComunicacion comunicacion;

    public Comunicacion(ControlComunicacion comunicacion) {
        this.comunicacion = comunicacion;
    }    

    @Override
    public void crearPartida(Partida partida) {
        
    }

    @Override
    public void pagarApuesta() {

    }

    @Override
    public void realizarMovimiento() {

    }

    @Override
    public void ingresarPartida() {

    }

    @Override
    public void actualizarModelo() {

    }

    @Override
    public void notificarTurno() {

    }

}

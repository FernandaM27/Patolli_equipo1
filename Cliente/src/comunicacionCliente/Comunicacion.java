/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacionCliente;

import controles.ControlComunicacion;
import entidades.Jugador;
import entidades.Partida;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jc
 */
public class Comunicacion implements IComunicacion, Observer {

    private ClienteSocket cliente;

    private ControlComunicacion ctrlComunicacion;
 
    public Comunicacion(ControlComunicacion comunicacion) {
        this.ctrlComunicacion = comunicacion;
        this.cliente = new ClienteSocket("localhost", this);
        new Thread(this.cliente).start();
    }

    @Override
    public void crearPartida(String ip, Partida partida) {
        try {
            this.cliente.enviar(partida);
        } catch (IOException ex) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void pagarApuesta() {

    }

    @Override
    public void realizarMovimiento() {

    }

    @Override
    public void ingresarPartida(Jugador jugador) {

    }

    @Override
    public void actualizarModelo() {

    }

    @Override
    public void notificarTurno() {

    }

    @Override
    public void notificarCliente(String mensaje) {
        this.ctrlComunicacion.mostrarExito(mensaje);
    }

    @Override
    public void update(Observable o, Object arg) {
        
    }

}

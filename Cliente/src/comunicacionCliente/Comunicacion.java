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
    /**
     * metodo constructor que se encarga de inicializar controlComunicacion
     * @param comunicacion 
     */
    public Comunicacion(ControlComunicacion comunicacion) {
        this.ctrlComunicacion = comunicacion;
        this.cliente = new ClienteSocket(this);
        new Thread(this.cliente).start();
    }
    /**
     * método que se encarga de crear una partida 
     * @param partida
     * @return 
     */
    @Override
    public void crearPartida(String ip, Partida partida) {
        try {
            this.cliente.enviarPartida(partida);
        } catch (IOException ex) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Agregar Metodos clienteSockets
    
    
    /**
     * metodo que se permite el pagar apuesta
     */
    @Override
    public void pagarApuesta() {

    }
    /**
     * metodo que permite realizar un movimiento y cambiar la ubicación de una ficha
     */
    @Override
    public void realizarMovimiento() {

    }
    /**
     * metodo que permite ingresar partida a un jugador
     * @param jugador 
     */
    @Override
    public void ingresarPartida(Jugador jugador) {

    }
    /**
     * metodo que permite actualiza el modelo
     */
    @Override
    public void actualizarModelo(Partida partida) {
        //Enviar al modelo
        //this.ctrlComunicacion
    }
    /**
     * metodo que permite notificar el turno en momento
     */
    @Override
    public void notificarTurno() {

    }
    /**
     * método que permite notificar al cliente mediante un mensaje
     * @param mensaje 
     */
    @Override
    public void notificarCliente(String mensaje) {
        this.ctrlComunicacion.mostrarExito(mensaje);
    }
    /**
     * método que permite actualizar los objetos observados
     * @param o
     * @param arg 
     */
    @Override
    public void update(Observable o, Object arg) {
        
    }

}

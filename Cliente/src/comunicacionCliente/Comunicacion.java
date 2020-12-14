/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacionCliente;

import controles.ControlComunicacion;
import controles.ControlCrearPartida;
import controles.ControlIngresarPartida;
import controles.ControlTablero;
import entidades.Jugador;
import entidades.Movimiento;
import entidades.Partida;
import frames.FrmIngresarPartida;
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
    
    private static Comunicacion comunicacion;
    
    private ClienteSocket cliente;

    private ControlCrearPartida ctrlCrearPartida;
    private ControlIngresarPartida ctrlIngresarPartida;
    private ControlTablero ctrlTablero;
    public int envio; 
    /**
     * metodo constructor que se encarga de inicializar controlComunicacion
     * @param comunicacion 
     */
    private Comunicacion() {
        this.cliente = new ClienteSocket(this);
        System.out.println("entre");
        new Thread(this.cliente).start();
    }
    
    public static Comunicacion getInstance(){
        if(comunicacion == null){
            comunicacion = new Comunicacion();
        }
        return comunicacion;
    }
    /**
     * método que se encarga de crear una partida 
     * @param partida
     * @return 
     */
    @Override
    public void crearPartida(Partida partida) {
        try {
            this.cliente.enviarPartida(partida);
            envio=1;
            System.out.println("id"+envio);
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
    public void realizarMovimiento(Movimiento movimiento) {
        try {
            this.cliente.enviarMovimiento(movimiento);
        } catch (IOException ex) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * metodo que permite ingresar partida a un jugador
     * @param jugador 
     */
    @Override
    public void ingresarPartida(Jugador jugador) {
        envio=2;
        try {
            this.cliente.enviarJugador(jugador);
        } catch (IOException ex) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * metodo que permite actualiza el modelo
     */
    @Override
    public void actualizarModelo(Partida partida) {
        if(envio==1){
            //this.ctrlCrearPartida.mostrarExito("Se ha creado una partida");
            //this.ctrlCrearPartida.mostrarPantalla(FrmIngresarPartida.getInstance());
        }else if(envio ==2){
           //this.ctrlCrearPartida.mostrarExito(mensaje);
            System.out.println("HOla");
        }else if(envio == 3){
            //this.ctrlCrearPartida.mostrarExito(mensaje);
            System.out.println("Adios");
        }
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
        
        //this.ctrlComunicacion.mostrarExito(mensaje);
    }
    /**
     * método que permite actualizar los objetos observados
     * @param o
     * @param arg 
     */
    @Override
    public void update(Observable o, Object arg) {
        
    }

    public static Comunicacion getComunicacion() {
        return comunicacion;
    }

    public static void setComunicacion(Comunicacion comunicacion) {
        Comunicacion.comunicacion = comunicacion;
    }

    public ClienteSocket getCliente() {
        return cliente;
    }

    public void setCliente(ClienteSocket cliente) {
        this.cliente = cliente;
    }

    public ControlCrearPartida getCtrlCrearPartida() {
        return ctrlCrearPartida;
    }

    public void setCtrlCrearPartida(ControlCrearPartida ctrlCrearPartida) {
        this.ctrlCrearPartida = ctrlCrearPartida;
    }

    public ControlIngresarPartida getCtrlIngresarPartida() {
        return ctrlIngresarPartida;
    }

    public void setCtrlIngresarPartida(ControlIngresarPartida ctrlIngresarPartida) {
        this.ctrlIngresarPartida = ctrlIngresarPartida;
    }

    public ControlTablero getCtrlTablero() {
        return ctrlTablero;
    }

    public void setCtrlTablero(ControlTablero ctrlTablero) {
        this.ctrlTablero = ctrlTablero;
    }

    public int getEnvio() {
        return envio;
    }

    public void setEnvio(int envio) {
        this.envio = envio;
    }

    
}

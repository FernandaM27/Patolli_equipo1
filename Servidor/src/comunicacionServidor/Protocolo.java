/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacionServidor;

import control.Fachada;
import control.IControl;
import entidades.Jugador;
import entidades.Movimiento;
import entidades.Partida;
import entidades.Tablero;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ModeloPartida;

/**
 *
 * @author Alfon
 */
public class Protocolo implements Observer {

    private IControl fachada;
    private ModeloPartida modeloPartida;
    Server server;

    public Protocolo(Server hilo) {
        fachada = new Fachada();
        this.server = hilo;
        this.modeloPartida = ModeloPartida.getInstance();
        this.modeloPartida.addObserver(this);
    }

    /**
     * Revisar en el ejemplo del profe
     *
     * @param input
     */
    public void processInput(Object input) {
        if (input instanceof Movimiento) {
            Movimiento movimiento = (Movimiento) input;
            this.manejarMovimiento(movimiento);
        } else if (input instanceof Partida) {
            Partida partida = (Partida) input;
            this.manejarPartida(partida);
        } else if (input instanceof Jugador) {
            Jugador jugador = (Jugador) input;
            this.manejarJugador(jugador);
        } else if (input instanceof Tablero) {
            Tablero tablero = (Tablero) input;
            // Sino se ocupa Remover
        }

    }

    public void manejarJugador(Jugador jugador) {
        fachada.agregarJugador(jugador);
    }

    public void manejarPartida(Partida partida) {
        fachada.crearPartida(partida);
    }

    public void manejarMovimiento(Movimiento movimiento) {
        if(movimiento.getApuesta()!=null){
            fachada.pagarApuesta(movimiento);
        }
        fachada.moverFichas(movimiento);
    }

    public void manejarTablero(Tablero tablero) {
//        fachada.(tablero);
    }

    /*
        ### checar
       Si las notificaciones a los demás jugadores se van a manejar en los methods de arriba 
     */
     @Override
    public void update(Observable mPartida, Object mensaje) {
         if(((String)mensaje).equalsIgnoreCase("partida creada")){
             try {
                 this.notificarPartidaCreada("partida creada");
             } catch (IOException ex) {
                 Logger.getLogger(Protocolo.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }
    
    private void notificarPartidaCreada(String mensaje) throws IOException{
       // this.server.notificarCliente(mensaje);
    }
}

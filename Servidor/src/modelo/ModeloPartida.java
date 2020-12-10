/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.Jugador;
import entidades.Partida;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author Alfon
 */
public class ModeloPartida extends Observable {

    private Partida partida;
    private List<Jugador> jugadores;
    private static ModeloPartida modeloPartida;

    private ModeloPartida() {
        this.partida = new Partida();
        this.jugadores = new ArrayList<>();
    }

    public static ModeloPartida getInstance() {
        if (modeloPartida == null) {
            return modeloPartida = new ModeloPartida();
        }
        return modeloPartida;
    }

    public boolean partidaCreada() {
        return partida == null;
    }

    public void addJugador(Jugador jugador) {
        if (this.partidaCreada()) {
            jugadores.add(jugador);
            super.setChanged();
            super.notifyObservers("jugadorAgregado");
        } else {
            super.notifyObservers("PartidaNoExistente");
        }
    }

    public void deleteJugador(Jugador jugador) {
        if (this.partidaCreada()) {
            jugadores.remove(jugador);
            super.setChanged();
            super.notifyObservers("jugadorEliminado");
        } else {
            super.notifyObservers("PartidaNoExistente");
        }

    }

}

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
    
    public ModeloPartida() {
        this.partida= new Partida();
        this.jugadores= new ArrayList<>();
    }
    
    
}

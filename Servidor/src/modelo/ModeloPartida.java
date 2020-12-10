/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.Apuesta;
import entidades.Casilla;
import entidades.Ficha;
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
    private String estado;
    
    private ModeloPartida() {
        this.jugadores = new ArrayList<>();
    }

    public static ModeloPartida getInstance() {
        if (modeloPartida == null) {
            return modeloPartida = new ModeloPartida();
        }
        return modeloPartida;
    }

    public boolean partidaCreada() {
        if(this.partida==null){
            return false;
        }return true;
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
    
    public void crearPartida(Partida partida){
        if (!this.partidaCreada()) {
            this.partida=partida;
            this.estado="listo";
            System.out.println("se creo con éxito");
            super.setChanged();
            super.notifyObservers("partida creada");
            
        } else{
            super.notifyObservers("Ya hay una partida creada");
        }
    }
   
    public void iniciarPartida(){
        if (!this.partidaCreada() && this.partida.getNumeroJugadores()==this.jugadores.size()) {
            this.estado="iniciado";
            super.setChanged();
            super.notifyObservers("partida inicializada");
        } else{
            super.notifyObservers("Ya hay una partida creada");
        }
    }
    
    public void pagarApuesta(Jugador jugador, Apuesta apuesta){
        int i=this.jugadores.indexOf(jugador);
        if(i!=-1){
            Jugador j = this.jugadores.get(i);
            j.setMonto(j.getMonto()-apuesta.getCantidad());
            this.validarFondos(j);
        }
    }
    
    private void validarFondos(Jugador j){
        if(j.getMonto()<=0){
            this.jugadores.remove(j);
            this.setChanged();
            this.notifyObservers("Jugador eliminado");
        }
    }
    
    public void tirarCanias(int resultado){
        this.setChanged();
        this.notifyObservers("Resultado fue"+resultado);
    }

    public void eliminarFicha(Casilla casilla){
       // t//his.ta
    }
}

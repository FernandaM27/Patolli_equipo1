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
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author Alfon
 */
public class ModeloPartida extends Observable {

    private Partida partida;
    private static ModeloPartida modeloPartida;
    private String estado;
    private List<Jugador> turnos;
    
    private ModeloPartida() {
        this.turnos= new LinkedList<>();
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

    public void agregarJugador(Jugador jugador) {
        if (this.partidaCreada()) {
            partida.getJugadores().add(jugador);
            turnos.add(jugador);
            super.setChanged();
            super.notifyObservers(this.partida);
        } else {
            super.notifyObservers("PartidaNoExistente");
        }
    }

    public void eliminarDatosJugador(Jugador jugador) {
        if (this.partidaCreada()) {
             partida.getJugadores().remove(jugador);
            super.setChanged();
            super.notifyObservers(this.partida);
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
            super.notifyObservers(partida);
        } else{
            super.notifyObservers("Ya hay una partida creada");
        }
    }
   
    public void iniciarPartida(){
        if (!this.partidaCreada() && this.partida.getNumeroJugadores()== partida.getJugadores().size()) {
            this.estado="iniciado";
            super.setChanged();
            super.notifyObservers("partida inicializada");
        } else{
            super.notifyObservers("Ya hay una partida creada");
        }
    }
    
    public void pagarApuesta(Jugador jugador, Apuesta apuesta){
        int i= partida.getJugadores().indexOf(jugador);
        if(i!=-1){
            if(validarFondos(jugador, apuesta.getCantidad())){
                jugador.setFondos(jugador.getFondos()-apuesta.getCantidad());
            }else{
                eliminarDatosJugador(jugador);
                super.notifyObservers();
            }
        }
    }
    
    private void actualizarJugador(){
        
    }
    
    private boolean validarFondos(Jugador j, int apuesta){
        if(j.getFondos()-apuesta<=0){
            return false;
        }
        return true;
    }
    
    public void tirarCanias(int resultado){
        this.setChanged();
        this.notifyObservers("Resultado fue"+resultado);
    }

    public void eliminarFicha(Casilla casilla){
       // t//his.ta
    }
    
}

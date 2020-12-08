/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.Cania;
import entidades.Jugador;
import entidades.Tablero;
import java.util.List;

/**
 *
 * @author Alfon
 */
public class ModeloTablero extends ModeloBase{
    private Tablero tablero;
    private List<Jugador> jugadores;
    private List<Cania> canias;
    
    public ModeloTablero() {
        super();
    }

    public ModeloTablero(Tablero tablero, List<Jugador> jugadores) {
        this.tablero = tablero;
        this.jugadores = jugadores;
    }
    
   public Tablero getTablero(){
        return this.tablero;
   }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setCanias(List<Cania> canias) {
        this.canias = canias;
    }
    
    public void eliminarJugador(Jugador jugador){
        this.jugadores.remove(jugador);
        //agregar metodo para notificar
    }
   
    @Override
    protected void setEtiquetas(List<String> etiquetas) {
       super.etiquetas.add("crear partida");
       super.etiquetas.add("Tamaño del tablero");
       super.etiquetas.add("casillas");
       super.etiquetas.add("Num. jugadores");
       super.etiquetas.add("Num. fichas");
       super.etiquetas.add("fondos de apuesta");
       super.etiquetas.add("valor por apuesta");
    }
    
    
}

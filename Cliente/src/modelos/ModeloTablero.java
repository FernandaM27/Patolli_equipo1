/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.Cania;
import entidades.Casilla;
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
    /**
     * método constructor vacio de la clase el cual ejecuta el método
     * setEtiquetas
     */
    public ModeloTablero() {
        super();
        this.setEtiquetas();
    }

    /**
     * método constructor del modelo tablero que recibe dos parametros el
     * tablero y la lista de jugadores e inicializa los atributos con el valor
     * de los parámetros.
     *
     * @param tablero
     * @param jugadores
     */
    public ModeloTablero(Tablero tablero, List<Jugador> jugadores) {
        this();
        this.tablero = tablero;
        this.jugadores = jugadores;

    }
    
    /**
     * Método que regresa el tablero
     * @return 
     */
    public Tablero getTablero() {
        return this.tablero;
    }
    
    /**
     * método que regresa los jugadores
     * @return 
     */
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * Mètodo set que asigna el tablero
     * @param tablero 
     */
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
    
    /**
     * método para mover una ficha de casilla dentro del tablero tomando la posición desde el tablero
     * @param casilla 
     */
    public void realizaMovimiento(Casilla casilla) {
        List<Casilla> casillas = tablero.getCasillas();
        Casilla c = casillas.get(casillas.indexOf(casilla));

    }

    /**
     * método set que inicializa el valor de la lista por el pasado dentro del parámetro
     * @param jugadores 
     */
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * método que inicializa la lista canias con la lista pasada por el paràmetro del método
     * @param canias 
     */
    public void setCanias(List<Cania> canias) {
        this.canias = canias;
    }

    /**
     * Elimina el jugador pasado por el parametro de la lista
     * @param jugador 
     */
    public void eliminarJugador(Jugador jugador) {
        this.jugadores.remove(jugador);
        super.notifyObservers();
    }

    /**
     * Agrega el jugador pasado por el parametro a la lista de jugadores
     * @param jugador 
     */
    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
        super.notifyObservers();
    }

    /**
     * le asigna los valores a la lista de etiquetas heredada de modeloBase y corresponden al frame
     *s 
     */
    @Override
    protected void setEtiquetas() {
        super.addEtiqueta("Patolli");
        super.etiquetas.add("crear partida");
        super.etiquetas.add("Tamaño del tablero");
        super.etiquetas.add("casillas");
        super.etiquetas.add("Num. jugadores");
        super.etiquetas.add("Num. fichas");
        super.etiquetas.add("fondos de apuesta");
        super.etiquetas.add("valor por apuesta");
    }
    
    
}

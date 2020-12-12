package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Partida implements Serializable{

    private static final long serialVersionUID = 3931645525716260135L;
    
    private final List<Cania> canias;
    private int numeroJugadores;
    private int numeroFichas;
    private int montoApuestas;
    private Tablero tablero;
    /**
     * método constructor de la partida que crea un arraylist de cañas
     */
    public Partida() {
        canias = new ArrayList<>(5);
    }
    /**
     * método que regresa el tablero de la partida
     * @return tablero
     */
    public Tablero getTablero() {
        return tablero;
    }
    /**
     * método que regresa el numero de jugadores de la partida
     * @return numeroJugadores
     */
    public int getNumeroJugadores() {   
        return numeroJugadores;
    }
    /**
     * método que asigna el numero de jugadores a la partida
     * @param numeroJugadores 
     */
    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }
    /**
     * método que regresa el numero de fichas
     * @return numeroFichas
     */
    public int getNumeroFichas() {
        return numeroFichas;
    }
    /**
     * método que asigna el numero de fichas a una partida
     * @param numeroFichas 
     */
    public void setNumeroFichas(int numeroFichas) {
        this.numeroFichas = numeroFichas;
    }
    /**
     * método que regresa el monto de apuesta de la partida
     * @return montoApuestas
     */
    public int getMontoApuestas() {
        return montoApuestas;
    }
    /**
     * método que asigna el monto de apuestas
     * @param montoApuestas 
     */
    public void setMontoApuestas(int montoApuestas) {
        this.montoApuestas = montoApuestas;
    }
    /**
     * método que asigna un tablero a la partida
     * @param tablero 
     */
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
    /**
     * método que regresa los valores de la partida en un string
     * @return 
     */
    @Override
    public String toString() {
        return "Partida{" + "canias=" + canias + ", numeroJugadores=" + numeroJugadores + ", numeroFichas=" + numeroFichas + ", montoApuestas=" + montoApuestas + ", tablero=" + tablero + '}';
    }
    
}

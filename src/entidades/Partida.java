package entidades;

import java.util.ArrayList;

public class Partida {

    public int numJugadores;
    public int numFichas;
    public int montoApuesta;
    public int fondosApuesta;
    public ArrayList<Jugador> jugadores;
    public Tablero tablero;

    public Partida(int numJugadores, int numFichas, int montoApuesta, int fondosApuesta) {
        this.numJugadores = numJugadores;
        this.numFichas = numFichas;
        this.montoApuesta = montoApuesta;
        this.fondosApuesta = fondosApuesta;
    }

    public int getFondosApuesta() {
        return fondosApuesta;
    }

    public void setFondosApuesta(int fondosApuesta) {
        this.fondosApuesta = fondosApuesta;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public int getNumFichas() {
        return numFichas;
    }

    public void setNumFichas(int numFichas) {
        this.numFichas = numFichas;
    }

    public int getMontoApuesta() {
        return montoApuesta;
    }

    public void setMontoApuesta(int montoApuesta) {
        this.montoApuesta = montoApuesta;
    }

}

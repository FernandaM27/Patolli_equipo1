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

    public Partida() {
        canias = new ArrayList<>(5);
    }

    public Tablero getTablero() {
        return tablero;
    }
    
    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public int getNumeroFichas() {
        return numeroFichas;
    }

    public void setNumeroFichas(int numeroFichas) {
        this.numeroFichas = numeroFichas;
    }

    public int getMontoApuestas() {
        return montoApuestas;
    }

    public void setMontoApuestas(int montoApuestas) {
        this.montoApuestas = montoApuestas;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    @Override
    public String toString() {
        return "Partida{" + "canias=" + canias + ", numeroJugadores=" + numeroJugadores + ", numeroFichas=" + numeroFichas + ", montoApuestas=" + montoApuestas + ", tablero=" + tablero + '}';
    }
    
}

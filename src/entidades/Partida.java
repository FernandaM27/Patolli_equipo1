package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Partida implements Serializable{

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
    
    /**Mover a la clase correspondiente*/
    public List<Cania> tirarCanias() {
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            Boolean b= rd.nextBoolean();            
            canias.add(new Cania(b));
        }
        System.out.println(canias);
        return canias;
    }

    public Integer contarCanias() {
        List<Cania> turno = tirarCanias();
        Integer contador = 0;
        for (Cania b : turno) {
            if (b.getValor() == true) {
                contador++;
            }
        }
        return contador;
    }

    public Integer resultadoTurno() {
        Integer numCanias = contarCanias();
        if (numCanias == 5) {
            return 10;
        } else {
            return numCanias;
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Alfonso Sempoalt
 */
public class Partida {

    private List<Cania> canias;
    private int numeroJugadores;
    private int numeroFichas;
    private int montoApuestas;

    public Partida(int numeroJugadores, int numeroFichas, int montoApuestas) {
        canias = new ArrayList<>(5);
        this.numeroJugadores = numeroJugadores;
        this.numeroFichas = numeroFichas;
        this.montoApuestas = montoApuestas;
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

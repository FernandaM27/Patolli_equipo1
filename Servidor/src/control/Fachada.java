/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entidades.Apuesta;
import entidades.Ficha;
import entidades.Jugador;
import entidades.Movimiento;
import entidades.Partida;
import modelo.ModeloPartida;

/**
 *
 * @author Alfon
 */
public class Fachada implements IControl {

    private final CtrlMovimiento ctrlMovimiento;
    private final CtrlJugador ctrlJugador;
    private final CtrlPartida ctrlPartida;

    public Fachada() {
        this.ctrlJugador = CtrlJugador.getInstance();
        this.ctrlMovimiento = CtrlMovimiento.getInstance();
        this.ctrlPartida = CtrlPartida.getInstance();
    }

    @Override
    public void moverFichas(Movimiento movimiento) {
        this.ctrlMovimiento.moverFicha(movimiento);
    }

    @Override
    public void tirarCanias(int resultado) {
        this.ctrlMovimiento.tirarCanias(resultado);
    }

    @Override
    public void eliminarFicha(Ficha ficha) {
        //this.ctrlMovimiento.eliminarFicha(ficha);
    }

    @Override
    public void pagarApuesta(Movimiento apuesta) {
        this.ctrlMovimiento.apuestaRealizada(apuesta);
    }

    @Override
    public void agregarJugador(Jugador jugador) {
        this.ctrlJugador.agregarJugador(jugador);
    }

    @Override
    public void eliminarJugador(Jugador jugador) {
        this.ctrlJugador.eliminarJugador(jugador);
    }

    @Override
    public void crearPartida(Partida partida) {
        this.ctrlPartida.crearPartida(partida);
    }

    @Override
    public void iniciarPartida() {
        this.ctrlPartida.iniciarPartida();
    }

    @Override
    public void terminarPartida() {
        this.ctrlPartida.terminarPartida();
    }

}

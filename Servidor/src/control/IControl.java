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

/**
 *
 * @author Alfon
 */
public interface IControl {
    public void moverFichas(Movimiento movimiento);
    public void tirarCanias(int resultado);
    public void eliminarFicha(Ficha ficha);
    public void pagarApuesta(Movimiento apuesta);
    public void agregarJugador(Jugador jugador);
    public void eliminarJugador(Jugador jugador);
    public void crearPartida(Partida partida);
    public void iniciarPartida();
    public void terminarPartida();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entidades.Apuesta;
import entidades.Casilla;
import entidades.Ficha;
import entidades.Movimiento;
import modelo.ModeloPartida;

/**
 *
 * @author Alfon
 */
public class CtrlMovimiento {
    private static CtrlMovimiento ctrl;
    private ModeloPartida modeloPartida;
    private CtrlMovimiento() {
        this.modeloPartida= ModeloPartida.getInstance();
    }
    
    public static CtrlMovimiento getInstance(){
        if (ctrl==null) {
            return ctrl= new CtrlMovimiento();
        }
        return ctrl;
    }
    
    public void moverFicha(Movimiento movimiento) {
        if(movimiento.getApuesta()!=null){
            this.modeloPartida.pagarApuesta(movimiento.getFicha().getJugador(), movimiento.getApuesta());
        }else{
            
        }
        this.moverFicha(movimiento);
        
    }

    public void tirarCanias(int resultado) {
        this.modeloPartida.tirarCanias(resultado);
    }

    public void eliminarFicha(Casilla casilla) {
        if(!casilla.isDisponible()){
            this.modeloPartida.eliminarFicha(casilla);
        }
    }

    public void apuestaRealizada(Movimiento movimiento) {
        this.modeloPartida.pagarApuesta(movimiento.getFicha().getJugador(), movimiento.getApuesta());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entidades.Apuesta;
import entidades.Ficha;
import entidades.Movimiento;

/**
 *
 * @author Alfon
 */
public class CtrlMovimiento {
    private static CtrlMovimiento ctrl;
    
    private CtrlMovimiento() {
    }
    
    public static CtrlMovimiento getInstance(){
        if (ctrl==null) {
            return ctrl= new CtrlMovimiento();
        }
        return ctrl;
    }
    
    public void moverFicha(Movimiento movimiento) {

    }

    public void tirarCanias(int resultado) {

    }

    public void eliminarFicha(Ficha ficha) {

    }

    public void apuestaRealizada(Apuesta apuesta) {

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import entidades.Jugador;
import entidades.Movimiento;
import java.awt.event.ActionEvent;
import modelos.ModeloTablero;

/**
 *
 * @author Dany
 */
public class ControlTablero extends ControlComunicacion{
    private ModeloTablero modeloTablero;
    private static ControlTablero ctrl;
    
    /**
     * método que permite el tirar cañas
     */
    private void tirarCanias(){
        super.comunicacion.notificarTurno();
        //this.modeloTablero.setCanias(canias);
    }
    
    /**
     * método singleton que regresa una instancia de ControlTablero
     * @return 
     */
    public static ControlTablero getInstance(){
        if (ctrl==null) {
            return ctrl= new ControlTablero();
        }
        return ctrl;
    }
    
    /**
     * Metodo para movimiento normal y pagar apuesta ya que estas suceden despues de moverse.
     */
    public void realizarMovimiento(Movimiento movimiento){   
        super.comunicacion.pagarApuesta();
    }

     /**
      * método que se encarga de eliminar un jugador del modeloTablero
      * @param jugador 
      */
    public void eliminarJugador(Jugador jugador){
        this.modeloTablero.eliminarJugador(jugador);
    }
  
}

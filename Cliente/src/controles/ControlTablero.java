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
   
    public void tirarCanias(int i){
        super.comunicacion.notificarTurno();
        //this.modeloTablero.setCanias(canias);
    }
    
    /**
     * Mismo metodo para movimiento normal y pagar apuesta ya que estas suceden despues de moverse.
     */
    public void realizarMovimiento(Movimiento movimiento){   
        super.comunicacion.pagarApuesta();
    }

     //Decidir si va a regresar booleano o no al server
    public void eliminarJugador(Jugador jugador){
        this.modeloTablero.eliminarJugador(jugador);
    }
            
    @Override
    public void mostrarExito(String mensaje) {
        super.mostrarExito(mensaje); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarError(String mensaje) {
        super.mostrarError(mensaje); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarPantalla() {
        super.mostrarPantalla(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import entidades.Jugador;
import frames.FrmTablero;
import java.awt.event.ActionEvent;
import modelos.ModeloTablero;

/**
 *
 * @author Alfon
 */
public class ControlngresarPartida extends ControlComunicacion implements ControlBase{
    
    private FrmTablero frmTablero;

    public ControlngresarPartida() {
        this.frmTablero= new FrmTablero();
    }
    
    
    @Override
    public void mostrarPantalla() {
         
    }

  @Override
    public void mostrarError(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarExito(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void ingresarPartida(Jugador jugador){
        super.comunicacion.ingresarPartida(jugador);
        this.mostrarExito("");
        this.frmTablero.setVisible(true);
    }
}

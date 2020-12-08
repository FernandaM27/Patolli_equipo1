/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import comunicacionCliente.Comunicacion;
import comunicacionCliente.IComunicacion;
import java.awt.event.ActionEvent;

/**
 *
 * @author Alfon
 */
public class ControlComunicacion implements ControlBase {

    protected IComunicacion comunicacion;    

    public ControlComunicacion() {
        this.comunicacion = new Comunicacion(this);
    }

    @Override
    public void mostrarPantalla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

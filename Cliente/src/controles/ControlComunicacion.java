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
    private static ControlComunicacion ctrl;
   
    protected ControlComunicacion() {
        this.comunicacion = new Comunicacion(this);
    }

    public static ControlComunicacion getInstance(){
        if (ctrl==null) {
            return ctrl= new ControlComunicacion();
        }
        return ctrl;
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

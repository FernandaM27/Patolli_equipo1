/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import comunicacionCliente.Comunicacion;
import comunicacionCliente.IComunicacion;
import frames.FrameBase;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
    public void mostrarPantalla(JFrame frm) {
        frm.setVisible(true);
    }

    @Override
    public void  mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error",JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void mostrarExito(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Éxito",JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         
    }

}

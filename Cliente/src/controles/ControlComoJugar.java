/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import frames.FrmComoJugar;
import frames.FrmPrincipal;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

/**
 *
 * @author Alfonso Sempoalt
 */
public class ControlComoJugar implements ControlBase {

    private FrmComoJugar frame;
    private static ControlComoJugar ctrl;
    /**
     * método constructor privado que incializa el frmcomoJugar
     *
     * @param frame
     */
    private ControlComoJugar(FrmComoJugar frame) {
        this.frame = frame;
    }
    
    /**
     * método singleton que se encarga de regresar una instancia de
     * ControlComoJugar
     *
     * @param frame
     * @return
     */
    public static ControlComoJugar getInstance(FrmComoJugar frame){
        if (ctrl==null) {
            return ctrl= new ControlComoJugar(frame);
        }
        return ctrl;
    }
    
    /**
     * Mètodo encargado de procesar los eventos del frm comojugar
     *
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equalsIgnoreCase("salir")) {
            this.salir();
        }
    }
    /**
     * instancia y muestra el frmPrincipal
     */
    private void salir() {
        FrmPrincipal frm = FrmPrincipal.getInstance();
        frm.setVisible(true);
        frame.dispose();
    }

    /**
     * método que se encarga de hacer visible em método pasado por parametro
     * @param frm 
     */
    @Override
    public void mostrarPantalla(JFrame frm) {
        frm.setVisible(true);
    }
    /**
     * método encargado de mostrar un mensaje de error 
     * @param mensaje 
     */
    @Override
    public void mostrarError(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void mostrarExito(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notificar(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

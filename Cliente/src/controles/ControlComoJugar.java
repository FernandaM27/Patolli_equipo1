/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import frames.FrmComoJugar;
import frames.FrmPrincipal;
import java.awt.event.ActionEvent;

/**
 *
 * @author Alfonso Sempoalt
 */
public class ControlComoJugar implements ControlBase {

    private FrmComoJugar frame;

    public ControlComoJugar(FrmComoJugar frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equalsIgnoreCase("salir")) {
            this.salir();
        }
    }

    private void salir() {
        FrmPrincipal frm = FrmPrincipal.createPrincipal();
        frm.setVisible(true);
        frame.dispose();
    }

    @Override
    public void mostrarPantalla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarError() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarExito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

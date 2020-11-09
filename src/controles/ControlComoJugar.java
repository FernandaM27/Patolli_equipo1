/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import frames.FrmComoJugar;
import frames.FrmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Alfonso Sempoalt
 */
public class ControlComoJugar implements ActionListener {

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
}

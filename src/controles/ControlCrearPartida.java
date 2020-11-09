/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import frames.FrmCrearPartida;
import frames.FrmTablero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Alfonso Sempoalt
 */
public class ControlCrearPartida implements ActionListener {

    private FrmCrearPartida frame;

    public ControlCrearPartida(FrmCrearPartida frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
       int numTablero = 0;
            if (event.getActionCommand().equalsIgnoreCase("listo4")) {
                numTablero = 4;
            } else if (event.getActionCommand().equalsIgnoreCase("listo5")) {
                numTablero = 5;
            } else if (event.getActionCommand().equalsIgnoreCase("listo6")) {
                numTablero = 6;
            } else if (event.getActionCommand().equalsIgnoreCase("listo7")) {
                numTablero = 7;
            }
            this.listo(numTablero);
    }

    private void listo(int numTablero) {
        if (numTablero > 0) {
            FrmTablero fm = new FrmTablero(numTablero);
            fm.setVisible(true);
            frame.dispose();
        } else if (numTablero == 0) {
            JOptionPane.showMessageDialog(frame, "Debe seleccionar un número de casillas");
        }
    }

}

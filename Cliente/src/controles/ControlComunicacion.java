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

    /**
     * método constructor que se encarga de inicializar los valores de la clase
     */
    protected ControlComunicacion() {
        this.comunicacion = new Comunicacion(this);
    }

    /**
     * método singleton que nos regresa una instancia de controlComunicación
     *
     * @return
     */
    public static ControlComunicacion getInstance() {
        if (ctrl == null) {
            return ctrl = new ControlComunicacion();
        }
        return ctrl;
    }

    /**
     * método que se encarga de mostrar el frm pasado por parametro
     *
     * @param frm
     */
    @Override
    public void mostrarPantalla(JFrame frm) {
        frm.setVisible(true);
    }

    /**
     * método que se encarga de mostrar un mensaje de error
     *
     * @param mensaje
     */
    @Override
    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * método que se encarga de mostrar un mensaje de éxito
     *
     * @param mensaje
     */
    @Override
    public void mostrarExito(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * método que se encarga de procesar los eventos
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import comunicacionCliente.Comunicacion;
import comunicacionCliente.IComunicacion;
import entidades.Partida;
import frames.FrameBase;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.ModeloTablero;

/**
 *
 * @author Alfon
 */
public class ControlComunicacion implements ControlBase {

    protected IComunicacion comunicacion;
    private static ControlComunicacion ctrl;
    private ModeloTablero modeloTablero;
    /**
     * método constructor que se encarga de inicializar los valores de la clase
     */
    protected ControlComunicacion() {
        this.comunicacion = new Comunicacion(this);
        this.modeloTablero= ModeloTablero.getInstance();
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
    
    public void agregarPartida(Partida partida){
        this.modeloTablero.setPartida(partida);
        this.notificar("Partida creada");
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

    public void recibirPartida(Partida partida){
        
    }
    
    /**
     * método que se encarga de procesar los eventos
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void notificar(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Partida existente", JOptionPane.INFORMATION_MESSAGE);
    }

}
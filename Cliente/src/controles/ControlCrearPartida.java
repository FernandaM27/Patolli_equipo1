/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import entidades.Partida;
import frames.FrmCrearPartida;
import frames.FrmIngresarPartida;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


/**
 *
 * @author Alfonso Sempoalt
 */
public class ControlCrearPartida extends ControlComunicacion{
    
    private FrmCrearPartida fCrearPartida;
    private FrmIngresarPartida fIngresarPartida;
    private static ControlCrearPartida ctrl;
   /**
     *  método constructor que inicializa sus valores
     * @param crear 
     */
    private ControlCrearPartida(FrmCrearPartida crear) {
        this.fCrearPartida = crear;
        this.fIngresarPartida = FrmIngresarPartida.getInstance();
    }
    
    
    /**
     * Método singleton que regresa una instancai de controlCrearPartida
     * @param crear
     * @return 
     */
    public static ControlCrearPartida getInstance(FrmCrearPartida crear){
        if (ctrl==null) {
            return ctrl= new ControlCrearPartida(crear);
        }
        return ctrl;
    }
    
     /**
     * Método que se encarga de crear la partida 
     * @param partida 
     */
    public void crearPartida(String ip,Partida partida) {
        comunicacion.crearPartida(ip,partida);
    }

    
    
}

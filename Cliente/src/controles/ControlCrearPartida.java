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
public class ControlCrearPartida extends ControlComunicacion implements ControlBase{
    
    private FrmCrearPartida fCrearPartida;
    private FrmIngresarPartida fIngresarPartida;
    private static ControlCrearPartida ctrl;
    /**
     * NOTA: Aplicar singleton para evitar crear n intancias de los frame
     * @param crear 
     */
    private ControlCrearPartida(FrmCrearPartida crear) {
        this.fCrearPartida = crear;
        this.fIngresarPartida = FrmIngresarPartida.getInstance();
    }
    
    public static ControlCrearPartida getInstance(FrmCrearPartida crear){
        if (ctrl==null) {
            return ctrl= new ControlCrearPartida(crear);
        }
        return ctrl;
    }
    
    public void crearPartida(Partida partida) {
        if(super.comunicacion.crearPartida(partida).equalsIgnoreCase("Create")){
            this.mostrarExito("Partida Creada con éxito");
            this.fCrearPartida.setVisible(true);
        }else{
            this.mostrarError("Ocurrio un error al momento de crear la partida intenlo más tarde");
        }
    }

    @Override
    public void mostrarPantalla() {
        
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
        
    }
    
}

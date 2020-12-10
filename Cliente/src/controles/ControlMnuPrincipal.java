/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import frames.FrmComoJugar;
import frames.FrmCrearPartida;
import frames.FrmIngresarPartida;
import frames.FrmPrincipal;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
 
/**
 *
 * @author Alfonso Sempoalt
 */
public class ControlMnuPrincipal implements ControlBase {

    private FrmPrincipal principal;
    private static ControlMnuPrincipal ctrl;
    
    /**
     * método constructor que se encarga inicializar el frm pasado por parametro
     * @param principal 
     */
    private ControlMnuPrincipal(FrmPrincipal principal) {
        this.principal = principal;
    }
    /**
     * método singleton que regresa una instancia de la clase
     * @param principal
     * @return 
     */
    public static ControlMnuPrincipal getInstance(FrmPrincipal principal){
        if (ctrl==null) {
            return ctrl= new ControlMnuPrincipal(principal);
        }
        return ctrl;
    }
    /**
     * método que se encarga de proesar los eventos mandados por los btn del frm principal
     * @param event 
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equalsIgnoreCase("CrearPartida")) {
            this.crearPartida();
        } else if (event.getActionCommand().equalsIgnoreCase("Salir")) {
            this.salir();
        } else if (event.getActionCommand().equalsIgnoreCase("Como Jugar")) {
            this.comoJugar();
        } else if (event.getActionCommand().equalsIgnoreCase("Ingresar partida")) {
            this.ingresarPartida();
        }
    }
    /**
     * método que abre el de crearPartida
     */
    private void crearPartida() {
        FrmCrearPartida frmCP = FrmCrearPartida.getInstance();
        frmCP.setVisible(true);
        this.salir();
    }
    /**
     * método que cierra el frmPrincipal
     */
    private void salir(){
        principal.dispose();
    }
    
    /**
     * método que abre el frm comojugar
     */
    private void comoJugar(){
        FrmComoJugar frmCJ =  FrmComoJugar.getInstance();
        frmCJ.setVisible(true);
        this.salir();
    }
    /**
     * método que abre el frm ingresarPartida
     */
    private void ingresarPartida(){
    FrmIngresarPartida frmIP = FrmIngresarPartida.getInstance();
        frmIP.setVisible(true);
        this.salir();
    }
    /**
     * método que se encarga de mostrar el frm pasado por parametro
     * @param frm 
     */
    @Override
    public void mostrarPantalla(JFrame frm) {
        frm.setVisible(true);
    }
     /**
     * método que se encarga de mostrar un mensaje de error
     * @param mensaje 
     */
    @Override
    public void mostrarError(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     /**
     * método que se encarga de mostrar un mensaje de éxito
     * @param mensaje 
     */
    @Override
    public void mostrarExito(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}

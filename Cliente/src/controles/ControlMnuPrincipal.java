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
    
    private ControlMnuPrincipal(FrmPrincipal principal) {
        this.principal = principal;
    }

    public static ControlMnuPrincipal getInstance(FrmPrincipal principal){
        if (ctrl==null) {
            return ctrl= new ControlMnuPrincipal(principal);
        }
        return ctrl;
    }
    
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

    private void crearPartida() {
        FrmCrearPartida frmCP = FrmCrearPartida.getInstance();
        frmCP.setVisible(true);
        this.salir();
    }
    
    private void salir(){
        principal.dispose();
    }
    
    private void comoJugar(){
        FrmComoJugar frmCJ =  FrmComoJugar.getInstance();
        frmCJ.setVisible(true);
        this.salir();
    }
    
    private void ingresarPartida(){
    FrmIngresarPartida frmIP = FrmIngresarPartida.getInstance();
        frmIP.setVisible(true);
        this.salir();
    }

    @Override
    public void mostrarPantalla(JFrame frm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarError(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarExito(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}

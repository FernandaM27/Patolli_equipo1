/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import java.awt.event.ActionListener;
import javax.swing.JFrame;

 
/**
 *
 * @author Alfon
 */
public interface ControlBase extends ActionListener{
    public void mostrarPantalla(JFrame frm);
    public void mostrarError(String mensaje);
    public void mostrarExito(String mensaje); 
 }

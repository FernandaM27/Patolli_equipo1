/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import java.awt.event.ActionListener;

 
/**
 *
 * @author Alfon
 */
public interface ControlBase extends ActionListener{
    public abstract void mostrarPantalla();
    public abstract void mostrarError(String mensaje);
    public abstract void mostrarExito(String mensaje); 

    
}

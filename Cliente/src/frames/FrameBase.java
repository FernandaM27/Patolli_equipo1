/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import controles.ControlBase;
import java.util.Observer;
import modelos.ModeloBase;

/**
 *
 * @author Alfonso
 * @param <C>
 * @param <M>
 */
public interface FrameBase<C,M> extends Observer{
    public void asignarEtiquetas();
    public void asignarComando();
    public void asignarEventos(ControlBase control);
}

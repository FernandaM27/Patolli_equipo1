/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import comunicacion.Comunicacion;
import comunicacion.IComunicacion;

/**
 *
 * @author Alfon
 */
public class ControlComunicacion {

    protected IComunicacion comunicacion;    

    public ControlComunicacion() {
        this.comunicacion = new Comunicacion(this);
    }

}

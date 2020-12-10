/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.List;

/**
 *
 * @author Alfon
 */
public class ModeloIngresarPartida extends ModeloBase{
    /**
     * Mètodo constructor que ejecuta el método setEtiquetas
     */
    public ModeloIngresarPartida() {
        super();
        this.setEtiquetas( );
    }
    /**
     * método que asigna el valor de las etiquetas heredadas de modeloBase correspondientes al frm IngresarPartida
     */
    @Override
    protected void setEtiquetas( ) {
        super.etiquetas.add("Ingresar a partida");
        super.etiquetas.add("Nombre de usuario");
        super.etiquetas.add("Color");
        super.etiquetas.add("Selecciona el color");
        super.etiquetas.add("Listo");
    }
    /**
     * Mètodo get regresa la lista etiquetas heredada de la clase abstracta modeloBaseSS
     * @return 
     */
    
    public List<String> getEtiquetas() {
        return super.getEtiquetas();
    }
}

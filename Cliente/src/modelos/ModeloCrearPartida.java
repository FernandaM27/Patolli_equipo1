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
public class ModeloCrearPartida extends ModeloBase{
    
    /**
     * Método constructor vacío que ejecuta el método set etiquetas que es heredado de modeloBase
     */
    public ModeloCrearPartida() {
        super();
        this.setEtiquetas();
    }
    /**
     * Método heredado y sobreescrito que asigna valores a la lista que es heredada 
     * de modeloBase, cuyos valores corresponen al frmCrarPartida
     */
    @Override
    protected void setEtiquetas() {
       super.etiquetas.add("crear partida");
       super.etiquetas.add("Tamaño del tablero");
       super.etiquetas.add("casillas");
       super.etiquetas.add("Num. jugadores");
       super.etiquetas.add("Num. fichas");
       super.etiquetas.add("fondos de apuesta");
       super.etiquetas.add("valor por apuesta");
       super.etiquetas.add("listo");
    }
    
    
}

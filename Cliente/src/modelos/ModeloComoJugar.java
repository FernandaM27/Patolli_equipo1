/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.List;

/**
 *
 * @author MSI GF63
 */
public class ModeloComoJugar extends ModeloBase {
     
  /**
     * Método constructor vacío que ejecuta el constructor vacío de modelo base y asigna 
     * los valores a la lista de etiquetas que corresponden al frmComoJugar heredada de ModeloBase
     */
    public ModeloComoJugar(){
        super();
        super.addEtiqueta("Como Jugar");
        super.addEtiqueta("1. crear partida");
        super.addEtiqueta("2. INGRESAR datos de la partida");
        super.addEtiqueta("3. guardar datos");
        super.addEtiqueta("4. ingresar a partida");
        super.addEtiqueta("5. INGRESAR datos");
        super.addEtiqueta("SALIR");
    }
    //Pendiente un cambiar
    public List <String> getEtiquetas(){
        return super.getEtiquetas();
    }
    /**
     * metodo que cambia el valor de la etiqueta
     * @param i
     * @param etiqueta 
     */
    public void cambiarEtiqueta(int i, String etiqueta){
        super.etiquetas.set(i, etiqueta);
        super.setChanged(); 
        super.notifyObservers();
    }
}

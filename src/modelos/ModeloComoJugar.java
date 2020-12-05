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
     
    public ModeloComoJugar(){
        super();
        super.addEtiqueta("Como Jugar");
        super.addEtiqueta("1. crear partida");
        super.addEtiqueta(" - INGRESAR datos de la partida");
        super.addEtiqueta("- guardar datos");
        super.addEtiqueta("2. ingresar a partida");
        super.addEtiqueta(" - INGRESAR datos");
        super.addEtiqueta("SALIR");
    }
    //Pendiente un cambiar
    public List <String> getEtiquetas(){
        return super.getEtiquetas();
    }
    
    public void cambiarEtiqueta(int i, String etiqueta){
        super.etiquetas.set(i, etiqueta);
        setChanged(); 
        this.notifyObservers();
    }
}

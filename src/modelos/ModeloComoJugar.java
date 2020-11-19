/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author MSI GF63
 */
public class ModeloComoJugar extends Observable {
     private List <String>etiquetasComoJugar;
    
    public ModeloComoJugar(){
        this.etiquetasComoJugar=new ArrayList<>();
        etiquetasComoJugar.add("Como Jugar");
        etiquetasComoJugar.add("1. crear partida");
        etiquetasComoJugar.add(" - INGRESAR datos de la partida");
        etiquetasComoJugar.add("- guardar datos");
        etiquetasComoJugar.add("2. ingresar a partida");
        etiquetasComoJugar.add(" - INGRESAR datos");
        etiquetasComoJugar.add("SALIR");
    }
    //Pendiente un cambiar
    public List <String> getEtiquetas(){
        return etiquetasComoJugar;
    }
    
    public void cambiarEtiqueta(int i, String etiqueta){
        this.etiquetasComoJugar.set(i, etiqueta);
        setChanged(); 
        this.notifyObservers();
    }
}

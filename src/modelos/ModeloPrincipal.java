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
 *
 */
public class ModeloPrincipal extends Observable{
    private List <String>etiquetasBotones;
    
    public ModeloPrincipal(){
        this.etiquetasBotones=new ArrayList<>();
        etiquetasBotones.add("PATOLLI");
        etiquetasBotones.add("CREAR PARTIDA");
        etiquetasBotones.add("INGRESAR A PARTIDA");
        etiquetasBotones.add("COMO JUGAR");
        etiquetasBotones.add("SALIR");
    }
    //Pendiente un cambiar
    public List <String> getEtiquetas(){
        return etiquetasBotones;
    }
    
    /*Metodo creado para probar el concepto observer*/
    public void cambiarEtiqueta(int i, String etiqueta){
        this.etiquetasBotones.set(i, etiqueta);
        setChanged(); 
        this.notifyObservers();
    }
}

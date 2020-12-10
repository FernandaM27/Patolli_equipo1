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
 * @author Alfon
 */
public abstract class ModeloBase extends Observable{
    protected List<String> etiquetas;

    public ModeloBase() {
        this.etiquetas = new ArrayList<>();
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }
    
    public String getEtiqueta(int index){
        return this.etiquetas.get(index);
    }

    protected void setEtiquetas() {
        this.etiquetas = etiquetas;
    }
    
    protected void addEtiqueta(String etiqueta){
        etiquetas.add(etiqueta);
    }
    
    
}

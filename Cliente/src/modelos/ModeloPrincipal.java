/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

 import java.util.List;
 
/**
 *
 *
 */
public class ModeloPrincipal extends ModeloBase{
     /**
     * Método constructor que inicializa los valores de la lista heredada de ModeloBase y corresponden a frmPrincipal
     */   
    public ModeloPrincipal(){
        super.addEtiqueta("PATOLLI");
        super.addEtiqueta("CREAR PARTIDA");
        super.addEtiqueta("INGRESAR A PARTIDA");
        super.addEtiqueta("COMO JUGAR");
        super.addEtiqueta("SALIR");
    }
    /**
     * método que regresa la lista de etiquetas heredada de modeloBase
     * @return 
     */
    public List <String> getEtiquetas(){
        return super.getEtiquetas();
    }
    
    /**
     * Metodo creado para probar el concepto observer*/
    public void cambiarEtiqueta(int i, String etiqueta){
        super.etiquetas.set(i, etiqueta);
        setChanged(); 
        this.notifyObservers();
    }
}

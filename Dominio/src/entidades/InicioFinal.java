/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;

/**
 *
 * @author Alfonso Sempoalt
 */
public class InicioFinal extends Casilla implements Serializable{

    private static final long serialVersionUID = 5368681532413255406L;

    public InicioFinal(boolean disponible) {
        super(disponible);
    }

    @Override
    public String toString() {
        return "InicioFinal{" + '}';
    }
    
}

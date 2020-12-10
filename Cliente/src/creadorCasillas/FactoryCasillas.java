/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creadorCasillas;

import entidades.Central;
import entidades.ICasilla;
import entidades.InicioFinal;
import entidades.Normal;
import entidades.Redondeada;
import entidades.Triangulo;

/**
 *
 * @author Alfonso Sempoalt
 */
public class FactoryCasillas {

   /**
     * Método que se encarga de generar una instancia dependiendo del tipo que se pasado por parametro
     * @param type
     * @return
     */  
    public static ICasilla createInstance(String type) {
        if (type.equalsIgnoreCase("normal")) {
            return (ICasilla) new Normal(true);
        } else if (type.equalsIgnoreCase("Central")) {
            return (ICasilla) new Central(true);
        } else if (type.equalsIgnoreCase("Redondeada")) {
            return (ICasilla) new Redondeada(true);
        } else if (type.equalsIgnoreCase("triangular")) {
            return (ICasilla) new Triangulo(true);
        } else if (type.equalsIgnoreCase("inicioFinal")) {
            return (ICasilla) new InicioFinal(true);
        }
        return null;
    }
}

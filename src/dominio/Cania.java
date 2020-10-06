/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Alfonso Sempoalt
 */
public class Cania {
    private Boolean valor;

    public Cania(Boolean valor) {
        this.valor = valor;
    }

    public Boolean getValor() {
        return valor;
    }

    public void setValor(Boolean valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Cania{" + "valor=" + valor + '}';
    }
    
}

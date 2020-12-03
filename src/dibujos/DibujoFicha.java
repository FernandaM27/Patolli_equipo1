/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import entidades.Ficha;
import java.awt.Point;

/**
 *
 * @author MSI GF63
 */
public class DibujoFicha {
    private Ficha ficha;
    private Point coordenadas;

    public DibujoFicha(Ficha ficha, int x, int y) {
        this.ficha = ficha;
        this.coordenadas = new Point(x, y);
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public Point getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Point coordenadas) {
        this.coordenadas = coordenadas;
    }

    @Override
    public String toString() {
        return "DibujoFicha{" + "ficha=" + ficha + ", coordenadas=" + coordenadas + '}';
    }
    
    
}

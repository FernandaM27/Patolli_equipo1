/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import entidades.Casilla;
import java.awt.Point;

/**
 *
 * @author MSI GF63
 */
public class DibujoCasilla {
    private Casilla casilla;
    private Point coordenadas;
    
    public DibujoCasilla(Casilla casilla, int x, int y){
        this.casilla = casilla;
        this.coordenadas=new Point(x, y);
    }

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    public Point getPoint() {
        return coordenadas;
    }

    public void setPoint(Point point) {
        this.coordenadas = point;
    }
    
    public int getX(){
        return (int)coordenadas.getX();
    }
    public int getY(){
        return (int)coordenadas.getY();
    }
    
    @Override
    public String toString() {
        return "DibujoCasilla{" + "casilla=" + casilla + ", coordenadas=" + coordenadas + '}';
    }
    
}

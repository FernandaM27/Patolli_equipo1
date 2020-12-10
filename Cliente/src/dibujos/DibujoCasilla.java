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
    /**
     * método constructor que se encarga de inicializar los valores pasados por parametro
     * @param casilla
     * @param x
     * @param y 
     */
    public DibujoCasilla(Casilla casilla, int x, int y){
        this.casilla = casilla;
        this.coordenadas=new Point(x, y);
    }

    /**
     * método constructor que se encarga de iniciaizar una casilla 
     * @param casilla 
     */
    public DibujoCasilla(Casilla casilla) {
        this.casilla = casilla;
    }    
    
    /**
     * método que se encarga de obtener la casilla 
     * @return Casilla
     */
    public Casilla getCasilla() {
        return casilla;
    }
    /**
     * método que se encarga de inicializar la casilla pasada por parametro
     * @param casilla 
     */
    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }
    /**
     * método que regresa el objeto point que tiene las coordenadas
     * @return 
     */
    public Point getPoint() {
        return coordenadas;
    }
    
   /**
    * método que se encarga de incializar el objeto pasado por parametro
    * @param point 
    */ 
    public void setPoint(Point point) {
        this.coordenadas = point;
    }
    
    /**
     *obtiene el valor en x de las coordenadas  
     * @return 
     */
    public int getX(){
        return (int)coordenadas.getX();
    }
    /**
     * Método que se encarga de obtener el valor en y de las coordenadas
     * @return 
     */
    public int getY(){
        return (int)coordenadas.getY();
    }
    /**
     * metodo que nos regresa la información del objeto
     * @return 
     */
    @Override
    public String toString() {
        return "DibujoCasilla{" + "casilla=" + casilla + ", coordenadas=" + coordenadas + '}';
    }
    
}

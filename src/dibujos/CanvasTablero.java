/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import entidades.Tablero;
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;

/**
 *
 * @author MSI GF63
 */
public class CanvasTablero  extends Canvas{
    private DibujoTablero dibujoTablero;
    private final int centro = 230;
    private final int tamanioCasilla = 20;
    private Graphics2D g2d;
     
    public CanvasTablero(int numTablero) {
       
    }
    
    @Override
    public void paint(Graphics g) {
        g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        Rectangle rect = new Rectangle();
        rect.setBounds(0, 0, this.getWidth() - 1, this.getHeight() - 1);
        g2d.draw(rect);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));
        this.dCasillas();
        this.dFichas();
    }
    
    private void dCasillas(){
        
    }
    
    private void dFichas(){
        
    }
    
    //Metodos visibles desde una clase externa
    public void dibujarTablero(){
        this.repaint();
    }
    
    public void dibujarFichas(){
        this.repaint();
    }
    
}

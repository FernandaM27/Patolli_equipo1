/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import entidades.Ficha;
import entidades.Jugador;
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sun.java2d.loops.DrawPolygons;
import java.util.stream.IntStream;

public class CnvDibujo extends Canvas {

    private int numTablero;
    private final int centro = 230;
    private final int tamanioCasilla = 20;
    private List<CoordenadaFicha> coordenadasFichas;
    private List<CoordenadaCasilla>coordenadasCasillas;
    
    private Graphics2D g2d;

    public CnvDibujo(int numTablero) {
        this.numTablero = numTablero - 1;
        coordenadasFichas = new ArrayList<>();
        coordenadasCasillas = new ArrayList<>();
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
        this.dibujarCentro(g2d);
        this.dibujarLados(g2d);
        this.dibujarCirculo(g2d);
        this.dibujarTriangulos(g2d);
        this.dibujarFicha(g2d);
         
    }

    private void dibujarFicha(Graphics2D g2d) {
        g2d.setStroke(new BasicStroke(1));
        Ellipse2D.Double ficha;
        for (CoordenadaFicha coordenada : coordenadasFichas) {
            g2d.setColor(Color.BLUE);
            ficha = new Ellipse2D.Double(coordenada.getX(),
                    coordenada.getY(), tamanioCasilla / 2, tamanioCasilla / 2);
            g2d.fill(ficha);
            g2d.setColor(Color.BLACK);
            g2d.draw(ficha);
        }

    }

    public void agregarFichas(Ficha ficha,int numJugador) {
        int x=0;
        int y=0;
        switch (numJugador) {
            case 1:
                x=(centro - tamanioCasilla);
                y=(centro);
                break;
            case 2:
                x=(centro);
                y=(centro + tamanioCasilla * 2);
                break;
            case 3:
                x=(centro + tamanioCasilla * 2);
                y=(centro + tamanioCasilla);
                break;
            case 4:
                x=(centro + tamanioCasilla);
                y=(centro - tamanioCasilla);
                break;
        }
        coordenadasFichas.add(new CoordenadaFicha(ficha, x, y));
        this.repaint();
    }

    public void moverFicha(int orden, int cantidad){
        CoordenadaFicha coordenada = this.buscarFicha(orden);
        this.moverFichaAbajo(coordenada);
    }
    //>AGREGARjUGADOR
    public CoordenadaFicha buscarFicha(int orden){
        for (CoordenadaFicha coor : coordenadasFichas) {
            if(coor.getFicha().getOrden() == orden){
                return coor;
            }
        }
        return null;
    }
    
    public CoordenadaCasilla buscarCasilla(int x, int y){
        for (CoordenadaCasilla coordenaC: coordenadasCasillas) {
            if(coordenaC.getX()== x && coordenaC.getY()==y){
                return coordenaC;
            }
        }
        return null;
    }
    
    public void moverFichaIzquierda(CoordenadaFicha coordenada) {
        coordenada.setX(coordenada.getX() - tamanioCasilla);
        this.repaint();
    }

    private void moverFichaDerecha(CoordenadaFicha coordenada) {
        coordenada.setX(coordenada.getX()  + tamanioCasilla);
        this.repaint();
    }
    
   private void moverFichaAbajo(CoordenadaFicha coordenada) {
        coordenada.setY(coordenada.getY() + tamanioCasilla);
        this.repaint();
    }

     private void moverFichaArriba(CoordenadaFicha coordenada) {
        coordenada.setY(coordenada.getY() - tamanioCasilla);
        this.repaint();
    }
    
    

    private void dibujarTriangulos(Graphics2D g2d) {
        this.dibujarTriangulosIzquierda(g2d);
        this.dibujarTriangulosDerecha(g2d);
        this.dibujarTrianguloSuperior(g2d);
        this.dibujarTriangulosInferior(g2d);
    }

    private void dibujarTriangulosIzquierda(Graphics2D g2d) {
        //primer triangulo izquierda
        int[] x = {(this.centro - (tamanioCasilla * this.numTablero)) + (tamanioCasilla),
            this.centro - (tamanioCasilla * this.numTablero) + tamanioCasilla+tamanioCasilla/2,
            this.centro - (tamanioCasilla * this.numTablero)+tamanioCasilla/2};
        int[] y = {this.centro + tamanioCasilla,
            this.centro, this.centro};
        Polygon p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
        //segundo triangulo izquierda
        x = new int[]{(this.centro - (tamanioCasilla * this.numTablero)) + (tamanioCasilla),
            this.centro - (tamanioCasilla * this.numTablero) + tamanioCasilla * 2,
            this.centro - (tamanioCasilla * this.numTablero)};
        y = new int[]{this.centro + tamanioCasilla,
            this.centro + (this.tamanioCasilla * 2), this.centro + (this.tamanioCasilla * 2)};
        p = new Polygon(x, y, 3);
        g2d.fill(p);
        g2d.drawPolygon(p);

    }

    private void dibujarTriangulosDerecha(Graphics2D g2d) {
        //primer triangulo derecha 
        int[] x = new int[]{(this.centro + (tamanioCasilla * this.numTablero)) + ((tamanioCasilla * 2) - tamanioCasilla),
            this.centro + (tamanioCasilla * this.numTablero) + tamanioCasilla * 2,
            this.centro + (tamanioCasilla * this.numTablero)};
        int[] y = new int[]{this.centro + tamanioCasilla,
            this.centro + (this.tamanioCasilla * 2), this.centro + (this.tamanioCasilla * 2)};
        Polygon p = new Polygon(x, y, 3);
        g2d.fill(p);
        g2d.drawPolygon(p);
        //segundo triangulo derecha
        x = new int[]{(this.centro + (tamanioCasilla * this.numTablero)) + ((tamanioCasilla * 2) - tamanioCasilla),
            this.centro + (tamanioCasilla * this.numTablero) + tamanioCasilla * 2,
            this.centro + (tamanioCasilla * this.numTablero)};
        y = new int[]{this.centro + tamanioCasilla,
            this.centro, this.centro};
        p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);

    }

    private void dibujarTrianguloSuperior(Graphics2D g2d) {
        //primer triangulo superior
        int[] x = new int[]{(this.centro),
            this.centro,
            this.centro + (tamanioCasilla)};
        int[] y = new int[]{this.centro - (this.tamanioCasilla * this.numTablero),
            this.centro - ((tamanioCasilla * this.numTablero) - this.tamanioCasilla * 2),
            this.centro - (tamanioCasilla * this.numTablero) + this.tamanioCasilla};
        Polygon p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
        //segundo triangulo superior 
        x = new int[]{(this.centro + tamanioCasilla * 2),
            this.centro + tamanioCasilla * 2,
            this.centro + (tamanioCasilla)};
        y = new int[]{this.centro - (this.tamanioCasilla * this.numTablero),
            this.centro - ((tamanioCasilla * this.numTablero) - this.tamanioCasilla * 2),
            this.centro - (tamanioCasilla * this.numTablero) + this.tamanioCasilla};
        p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
    }

    private void dibujarTriangulosInferior(Graphics2D g2d) {
        //primer triangulo inferior 
        int[] x = new int[]{(this.centro),
            this.centro,
            this.centro + (tamanioCasilla)};
        int[] y = new int[]{this.centro + (this.tamanioCasilla * this.numTablero),
            this.centro + ((tamanioCasilla * this.numTablero) + this.tamanioCasilla) + tamanioCasilla,
            this.centro + (tamanioCasilla * this.numTablero) + this.tamanioCasilla * 2 - (tamanioCasilla)};
        Polygon p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
        //segundo triangulo inferior
        x = new int[]{(this.centro + this.tamanioCasilla * 2),
            this.centro + this.tamanioCasilla * 2,
            this.centro + (tamanioCasilla)};
        y = new int[]{this.centro + (this.tamanioCasilla * this.numTablero),
            this.centro + ((tamanioCasilla * this.numTablero) + this.tamanioCasilla) + tamanioCasilla,
            this.centro + (tamanioCasilla * this.numTablero) + this.tamanioCasilla * 2 - (tamanioCasilla)};
        p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
    }

    private void dibujarCirculo(Graphics2D g2d) {
        g2d.drawArc(this.centro - (this.tamanioCasilla * this.numTablero) - 17, this.centro, this.tamanioCasilla * 2, this.tamanioCasilla * 2, 90, 180);
        g2d.drawArc(this.centro, this.centro + (this.tamanioCasilla * this.numTablero) + 17, this.tamanioCasilla * 2, this.tamanioCasilla * 2, 180, 180);
        g2d.drawArc(this.centro + (this.tamanioCasilla * this.numTablero) + 17, this.centro, this.tamanioCasilla * 2, this.tamanioCasilla * 2, 90, -180);
        g2d.drawArc(this.centro, this.centro - (this.tamanioCasilla * this.numTablero) - 17, this.tamanioCasilla * 2, this.tamanioCasilla * 2, -180, -180);
        this.dibujarLinea(this.centro, this.centro, g2d);
    }

    private void dibujarLinea(int x, int y, Graphics2D g2d) {
        g2d.drawLine(x - (this.numTablero * this.tamanioCasilla) - 17, y + this.tamanioCasilla, x, y + this.tamanioCasilla);
        g2d.drawLine(x + (this.numTablero * this.tamanioCasilla) + 57, y + this.tamanioCasilla, x, y + this.tamanioCasilla);
        g2d.drawLine(x + this.tamanioCasilla, y - (this.numTablero * this.tamanioCasilla) - 17, x + this.tamanioCasilla, y);
        g2d.drawLine(x + this.tamanioCasilla, y + (this.numTablero * this.tamanioCasilla) + 57, x + this.tamanioCasilla, y);
    }

    private void dibujarCentro(Graphics2D g2d) {
        this.dibujaHorizontal(this.centro, this.centro, this.tamanioCasilla, this.tamanioCasilla, 2, g2d);
    }

    private void dibujarLados(Graphics2D g2d) {
        this.dibujaHorizontal(this.centro + this.tamanioCasilla * 2, this.centro, this.tamanioCasilla, this.tamanioCasilla, this.numTablero, g2d);
        this.dibujaHorizontal(this.centro - (this.tamanioCasilla * this.numTablero), this.centro, this.tamanioCasilla, this.tamanioCasilla, this.numTablero, g2d);
        this.dibujaVertical(this.centro, this.centro + 40, this.tamanioCasilla, this.tamanioCasilla, this.numTablero, g2d);
        this.dibujaVertical(this.centro, this.centro - (this.tamanioCasilla * this.numTablero), this.tamanioCasilla, this.tamanioCasilla, this.numTablero, g2d);
    }

    private void dibujaHorizontal(int x, int y, int ancho, int alto, int cuantos, Graphics2D g) {
        int x1 = x;
        Rectangle rect = new Rectangle();
        for (int i = 0; i < cuantos; i++) {
            rect.setBounds(x, y, ancho, alto);
            g.draw(rect);
            x += ancho;
        }
        Rectangle rect1 = new Rectangle();
        for (int i = 0; i < cuantos; i++) {
            rect1.setBounds(x1, y + this.tamanioCasilla, ancho, alto);
            g.draw(rect1);
            x1 += ancho;
        }
    }

    private void dibujaVertical(int x, int y, int ancho, int alto, int cuantos, Graphics2D g) {
        int y1 = y;
        Rectangle rect = new Rectangle();
        for (int i = 0; i < cuantos; i++) {
            rect.setBounds(x, y, ancho, alto);
            g.draw(rect);
            y += alto;
        }
        Rectangle rect1 = new Rectangle();
        for (int i = 0; i < cuantos; i++) {
            rect1.setBounds(x + this.tamanioCasilla, y1, ancho, alto);
            g.draw(rect1);
            y1 += alto;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.util.Arrays;
import sun.java2d.loops.DrawPolygons;
import java.util.stream.IntStream;

public class CnvDibujo extends Canvas {

    private int numTablero;
    private final int centro = 230;
    private final int tamanioCasilla = 20;

    public CnvDibujo(int numTablero) {
        this.numTablero = numTablero - 1;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
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
//        g2d.setStroke(new BasicStroke(1));
//        g2d.setColor(Color.BLUE);
//        Ellipse2D.Double ficha = new Ellipse2D.Double(x+(ancho/7), y+(alto/7), ancho-(ancho/4), alto-(alto/4));
//        g2d.fill(ficha);        
//        g2d.setColor(Color.BLACK);
//        g2d.draw(ficha);

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
            this.centro - (tamanioCasilla * this.numTablero) + tamanioCasilla*2,
            this.centro - (tamanioCasilla * this.numTablero)};
        int[] y = {this.centro + tamanioCasilla,
            this.centro, this.centro};
        Polygon p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
        //segundo triangulo izquierda
        x = new int[]{(this.centro - (tamanioCasilla * this.numTablero)) + (tamanioCasilla),
            this.centro - (tamanioCasilla * this.numTablero) + tamanioCasilla*2,
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
            this.centro + (tamanioCasilla * this.numTablero) };
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
            this.centro - ((tamanioCasilla * this.numTablero) - this.tamanioCasilla*2),
            this.centro - (tamanioCasilla * this.numTablero) + this.tamanioCasilla};
        Polygon p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
        //segundo triangulo superior 
        x = new int[]{(this.centro + tamanioCasilla * 2),
            this.centro + tamanioCasilla * 2,
            this.centro + (tamanioCasilla)};
        y = new int[]{this.centro - (this.tamanioCasilla * this.numTablero),
            this.centro - ((tamanioCasilla * this.numTablero) - this.tamanioCasilla*2),
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
        int[] y = new int[]{this.centro + (this.tamanioCasilla * this.numTablero) ,
            this.centro + ((tamanioCasilla * this.numTablero) + this.tamanioCasilla) +tamanioCasilla,
            this.centro + (tamanioCasilla * this.numTablero) + this.tamanioCasilla * 2 - (tamanioCasilla)};
        Polygon p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
        //segundo triangulo inferior
        x = new int[]{(this.centro + this.tamanioCasilla * 2),
            this.centro + this.tamanioCasilla * 2,
            this.centro + (tamanioCasilla)};
        y = new int[]{this.centro + (this.tamanioCasilla * this.numTablero) ,
            this.centro + ((tamanioCasilla * this.numTablero) + this.tamanioCasilla) + tamanioCasilla,
            this.centro + (tamanioCasilla * this.numTablero) + this.tamanioCasilla * 2 - (tamanioCasilla )};
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

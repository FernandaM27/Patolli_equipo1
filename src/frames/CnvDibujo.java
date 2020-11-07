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
import modelos.CoordenadaCasilla;
import modelos.CoordenadaFicha;

public class CnvDibujo extends Canvas {

    private int numTablero;
    private final int centro = 230;
    private final int tamanioCasilla = 20;
    private List<CoordenadaFicha> coordenadasFichas;
    private List<CoordenadaCasilla> coordenadasCasillas;

    private Graphics2D g2d;

    /**
     * Constructor del para crear el canvas Inicializa las listas de las
     * coordenadas de las fichas y de las casillas
     *
     * @param numTablero cantidad de casillas del tablero
     */
    public CnvDibujo(int numTablero) {
        this.numTablero = numTablero - 1;
        coordenadasFichas = new ArrayList<>();
        coordenadasCasillas = new ArrayList<>();
    }

    /**
     * Metodo para pintar el canvas, es decir el tablero
     *
     * @param g variable para los graficos
     */
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

    /**
     * Metodo para dibujar una ficha de color azul
     *
     * @param g2d variable de los graficos 2d
     */
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

    /**
     * Metodo para agregar una ficha al tablero
     *
     * @param ficha ficha que se va a agregar
     * @param numJugador identificador para saber a que jugador pertenece la
     * ficha
     */
    public void agregarFichas(Ficha ficha, int numJugador) {
        int x = 0;
        int y = 0;
        switch (numJugador) {
            case 1:
                x = (centro - tamanioCasilla);
                y = (centro);
                break;
            case 2:
                x = (centro);
                y = (centro + tamanioCasilla * 2);
                break;
            case 3:
                x = (centro + tamanioCasilla * 2);
                y = (centro + tamanioCasilla);
                break;
            case 4:
                x = (centro + tamanioCasilla);
                y = (centro - tamanioCasilla);
                break;
        }
        coordenadasFichas.add(new CoordenadaFicha(ficha, x, y));
        this.repaint();
    }

    /**
     * Metodo para realizar el movimiento de la ficha
     *
     * @param orden variable que guarda el orden de entrada de cada ficha
     * @param cantidad variable para saber la cantidad de casillas que se va a
     * mover
     */
    public void moverFicha(int orden, int cantidad) {
        CoordenadaFicha coordenada = this.buscarFicha(orden);
        this.moverFichaAbajo(coordenada);
    }

    //>AGREGARjUGADOR
    /**
     * Metodo para regresar las coordenadas de una ficha
     *
     * @param orden variable del orden de entrada de las fichas
     * @return regresa las coordenadas de la ficha
     */
    public CoordenadaFicha buscarFicha(int orden) {
        for (CoordenadaFicha coor : coordenadasFichas) {
            if (coor.getFicha().getOrden() == orden) {
                return coor;
            }
        }
        return null;
    }

    /**
     * Metodo para encontrar las coordenadas de una casilla
     *
     * @param x coordenada x
     * @param y coordenada y
     * @return regresa las coordenadas de la casilla
     */
    public CoordenadaCasilla buscarCasilla(int x, int y) {
        for (CoordenadaCasilla coordenaC : coordenadasCasillas) {
            if (coordenaC.getX() == x && coordenaC.getY() == y) {
                return coordenaC;
            }
        }
        return null;
    }

    /**
     * Mueve la ficha hacia el lado izquierdo
     *
     * @param coordenada coordenadas de la ficha que se va a mover
     */
    public void moverFichaIzquierda(CoordenadaFicha coordenada) {
        coordenada.setX(coordenada.getX() - tamanioCasilla);
        this.repaint();
    }

    /**
     * Mueve la ficha hacia el lado derecho
     *
     * @param coordenada coordenadas de la ficha que se va a mover
     */
    private void moverFichaDerecha(CoordenadaFicha coordenada) {
        coordenada.setX(coordenada.getX() + tamanioCasilla);
        this.repaint();
    }

    /**
     * Mueve la ficha hacia abajo
     * @param coordenada coordenadas de la ficha que se va a mover
     */
    private void moverFichaAbajo(CoordenadaFicha coordenada) {
        coordenada.setY(coordenada.getY() + tamanioCasilla);
        this.repaint();
    }

    /**
     * Mueve la ficha hacia arriba
     * @param coordenada coordenadas de la ficha que se va a mover
     */
    private void moverFichaArriba(CoordenadaFicha coordenada) {
        coordenada.setY(coordenada.getY() - tamanioCasilla);
        this.repaint();
    }

    /**
     * Dibuja todos los triangulos de las casillas especiales
     * @param g2d variable de los graficos 2d
     */
    private void dibujarTriangulos(Graphics2D g2d) {
        this.dibujarTriangulosIzquierda(g2d);
        this.dibujarTriangulosDerecha(g2d);
        this.dibujarTrianguloSuperior(g2d);
        this.dibujarTriangulosInferior(g2d);
    }

    /**
     * Dibuja los triangulos del lado izquierdo
     * @param g2d variable de los graficos 2d
     */
    private void dibujarTriangulosIzquierda(Graphics2D g2d) {
        //primer triangulo izquierda
        int[] x = {(this.centro - (tamanioCasilla * this.numTablero)) + (tamanioCasilla),
            this.centro - (tamanioCasilla * this.numTablero) + tamanioCasilla + tamanioCasilla / 2,
            this.centro - (tamanioCasilla * this.numTablero) + tamanioCasilla / 2};
        int[] y = {this.centro + tamanioCasilla,
            this.centro, this.centro};
        Polygon p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
        //segundo triangulo izquierda
        x = new int[]{(this.centro - (tamanioCasilla * this.numTablero)) + (tamanioCasilla),
            this.centro - (tamanioCasilla * this.numTablero) + tamanioCasilla + tamanioCasilla / 2,
            this.centro - (tamanioCasilla * this.numTablero) + tamanioCasilla / 2};
        y = new int[]{this.centro + tamanioCasilla,
            this.centro + (this.tamanioCasilla * 2), this.centro + (this.tamanioCasilla * 2)};
        p = new Polygon(x, y, 3);
        g2d.fill(p);
        g2d.drawPolygon(p);

    }

    /**
     * Dibuja los triangulos del lado derecho
     * @param g2d variable de los graficos 2d
     */
    private void dibujarTriangulosDerecha(Graphics2D g2d) {
        //primer triangulo derecha 
        int[] x = new int[]{(this.centro + (tamanioCasilla * this.numTablero)) + ((tamanioCasilla * 2) - tamanioCasilla),
            this.centro + (tamanioCasilla * this.numTablero) + tamanioCasilla + tamanioCasilla / 2,
            this.centro + (tamanioCasilla * this.numTablero) + tamanioCasilla / 2};
        int[] y = new int[]{this.centro + tamanioCasilla,
            this.centro + (this.tamanioCasilla * 2), this.centro + (this.tamanioCasilla * 2)};
        Polygon p = new Polygon(x, y, 3);
        g2d.fill(p);
        g2d.drawPolygon(p);
        //segundo triangulo derecha
        x = new int[]{(this.centro + (tamanioCasilla * this.numTablero)) + ((tamanioCasilla * 2) - tamanioCasilla),
            this.centro + (tamanioCasilla * this.numTablero) + tamanioCasilla + tamanioCasilla / 2,
            this.centro + (tamanioCasilla * this.numTablero) + tamanioCasilla / 2};
        y = new int[]{this.centro + tamanioCasilla,
            this.centro, this.centro};
        p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);

    }

    /**
     * Dibuja los triangulos de arriba
     * @param g2d variable de los graficos 2d
     */
    private void dibujarTrianguloSuperior(Graphics2D g2d) {
        //primer triangulo superior
        int[] x = new int[]{(this.centro),
            this.centro,
            this.centro + (tamanioCasilla)};
        int[] y = new int[]{this.centro - (this.tamanioCasilla * this.numTablero) + tamanioCasilla / 2,
            this.centro - ((tamanioCasilla * this.numTablero) - tamanioCasilla - this.tamanioCasilla / 2),
            this.centro - (tamanioCasilla * this.numTablero) + this.tamanioCasilla};
        Polygon p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
        //segundo triangulo superior 
        x = new int[]{(this.centro + tamanioCasilla * 2),
            this.centro + tamanioCasilla * 2,
            this.centro + (tamanioCasilla)};
        y = new int[]{this.centro - (this.tamanioCasilla * this.numTablero) + tamanioCasilla / 2,
            this.centro - ((tamanioCasilla * this.numTablero) - this.tamanioCasilla - this.tamanioCasilla / 2),
            this.centro - (tamanioCasilla * this.numTablero) + this.tamanioCasilla};
        p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
    }

    /**
     * Dibuja los triangulos de abajo
     * @param g2d variable de los graficos 2d
     */
    private void dibujarTriangulosInferior(Graphics2D g2d) {
        //primer triangulo inferior 
        int[] x = new int[]{(this.centro),
            this.centro,
            this.centro + (tamanioCasilla)};
        int[] y = new int[]{this.centro + (this.tamanioCasilla * this.numTablero) + tamanioCasilla / 2,
            this.centro + ((tamanioCasilla * this.numTablero) + this.tamanioCasilla) + tamanioCasilla / 2,
            this.centro + (tamanioCasilla * this.numTablero) + this.tamanioCasilla * 2 - (tamanioCasilla)};
        Polygon p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
        //segundo triangulo inferior
        x = new int[]{(this.centro + this.tamanioCasilla * 2),
            this.centro + this.tamanioCasilla * 2,
            this.centro + (tamanioCasilla)};
        y = new int[]{this.centro + (this.tamanioCasilla * this.numTablero) + tamanioCasilla / 2,
            this.centro + ((tamanioCasilla * this.numTablero) + this.tamanioCasilla) + tamanioCasilla / 2,
            this.centro + (tamanioCasilla * this.numTablero) + this.tamanioCasilla * 2 - (tamanioCasilla)};
        p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
    }

    /**
     * Dibuja las casillas semicirculares del tablero
     * @param g2d variable de los graficos 2d
     */
    private void dibujarCirculo(Graphics2D g2d) {
        g2d.drawArc(this.centro - (this.tamanioCasilla * this.numTablero) - 17, this.centro, this.tamanioCasilla * 2, this.tamanioCasilla * 2, 90, 180);
        g2d.drawArc(this.centro, this.centro + (this.tamanioCasilla * this.numTablero) + 17, this.tamanioCasilla * 2, this.tamanioCasilla * 2, 180, 180);
        g2d.drawArc(this.centro + (this.tamanioCasilla * this.numTablero) + 17, this.centro, this.tamanioCasilla * 2, this.tamanioCasilla * 2, 90, -180);
        g2d.drawArc(this.centro, this.centro - (this.tamanioCasilla * this.numTablero) - 17, this.tamanioCasilla * 2, this.tamanioCasilla * 2, -180, -180);
        this.dibujarLinea(this.centro, this.centro, g2d);
    }

    /**
     * Dibuja una linea
     * @param x coordenada x
     * @param y coordenada y
     * @param g2d variable de los graficos 2d
     */
    private void dibujarLinea(int x, int y, Graphics2D g2d) {
        g2d.drawLine(x - (this.numTablero * this.tamanioCasilla) - 17, y + this.tamanioCasilla, x, y + this.tamanioCasilla);
        g2d.drawLine(x + (this.numTablero * this.tamanioCasilla) + 57, y + this.tamanioCasilla, x, y + this.tamanioCasilla);
        g2d.drawLine(x + this.tamanioCasilla, y - (this.numTablero * this.tamanioCasilla) - 17, x + this.tamanioCasilla, y);
        g2d.drawLine(x + this.tamanioCasilla, y + (this.numTablero * this.tamanioCasilla) + 57, x + this.tamanioCasilla, y);
    }

    /**
     * Dibuja el cuadro central del tablero
     * @param g2d variable de los graficos 2d
     */
    private void dibujarCentro(Graphics2D g2d) {
        this.dibujaHorizontal(this.centro, this.centro, this.tamanioCasilla, this.tamanioCasilla, 2, g2d);
    }

    /**
     * Dibuja los lados del tablero
     * @param g2d variable de los graficos 2d
     */
    private void dibujarLados(Graphics2D g2d) {
        this.dibujaHorizontal(this.centro + this.tamanioCasilla * 2, this.centro, this.tamanioCasilla, this.tamanioCasilla, this.numTablero, g2d);
        this.dibujaHorizontal(this.centro - (this.tamanioCasilla * this.numTablero), this.centro, this.tamanioCasilla, this.tamanioCasilla, this.numTablero, g2d);
        this.dibujaVertical(this.centro, this.centro + 40, this.tamanioCasilla, this.tamanioCasilla, this.numTablero, g2d);
        this.dibujaVertical(this.centro, this.centro - (this.tamanioCasilla * this.numTablero), this.tamanioCasilla, this.tamanioCasilla, this.numTablero, g2d);
    }

    /**
     * Dibuja las casillas horizontales del tablero
     * @param x coordenada x
     * @param y coordenada y
     * @param ancho ancho de cada casilla
     * @param alto alto de cada casilla
     * @param cuantos cantidad de casillas 
     * @param g variable de los graficos 2d
     */
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

    /**
     * Dibuja las casillas verticales del tablero
     * @param x coordenada x
     * @param y coordenada y
     * @param ancho ancho de la casilla
     * @param alto alto de la casilla
     * @param cuantos cantidad de casillas
     * @param g variable de los graficos 2d
     */
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

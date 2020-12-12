package entidades;

import java.io.Serializable;

public class Ficha implements Serializable{

    private static final long serialVersionUID = -1543394243285328423L;

    private String color;
    private Jugador jugador;
    private int orden;

    /**
     * Constructor que crea una ficha y establece el orden de salida de ella
     * @param orden valor de orden en el que salieron las fichas
     */
    public Ficha(int orden) {
        this.orden=orden;
    }
    /**
     * método que nos regresa el jugador que es dueño de la casilla
     * @return 
     */
    public Jugador getJugador() {
        return jugador;
    }
    
    /**
     * método que asigna el jugador a una ficha
     * @param jugador 
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    /**
     * método que regresa el color de la ficha
     * @return 
     */
    public String getColor() {
        return color;
    }
    /**
     * método que asigna el color a la ficha
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * método que retorna el orden de la ficha
     * @return 
     */
    public int getOrden() {
        return orden;
    }
    /**
     * método que nos sirve para asignar orden a la ficha
     * @param orden 
     */
    public void setOrden(int orden) {
        this.orden = orden;
    }

}

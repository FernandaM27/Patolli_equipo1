package entidades;

import java.io.Serializable;
import java.util.ArrayList;

public class Jugador implements Serializable{

    private static final long serialVersionUID = -5149299437684139825L;

    private String nombre;
    private String color;
    private ArrayList<Ficha> fichas;

    /**
     * Constructor que crea un jugador
     * @param nombre nombre del jugador
     * @param color color de fichas que va  tener el jugados
     */
    public Jugador(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

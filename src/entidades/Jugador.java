package entidades;

import java.util.ArrayList;

public class Jugador {

    public String nombre;
    public String color;
    public ArrayList<Ficha> fichas;

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

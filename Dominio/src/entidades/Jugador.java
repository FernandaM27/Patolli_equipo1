package entidades;

import java.io.Serializable;
import java.util.ArrayList;

public class Jugador implements Serializable{

    private static final long serialVersionUID = -5149299437684139825L;

    private String nombre;
    private String color;
    private int fondos;
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
    /**
     * método get que nos regresa el nombre del jugador
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método que permite asignar un nombre al jugador
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * método que nos regresa el color de un jugador    
     * @return 
     */
    public String getColor() {
        return color;
    }
    /**
     * método que asigna el color a un jugador
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * metodo que regresa el monto para apostar a un jugador
     * @return 
     */
    public int getFondos() {
        return fondos;
    }
    /**
     * método que asigna el valor para apostar a un jugador
     * @param monto 
     */
    public void setFondos(int fondos) {
        this.fondos = fondos;
    }
    /**
     * método que regresa las fichas de un jugador
     * @return 
     */
    public ArrayList<Ficha> getFichas() {
        return fichas;
    }
    
    public Ficha getFicha(int i) {
        return fichas.get(i);
    }
    /**
     * método que asigna las fichas que perteneceran a un jugador
     * @param fichas 
     */
    public void setFichas(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
    }

}

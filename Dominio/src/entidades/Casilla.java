package entidades;

import java.io.Serializable;

public class Casilla implements ICasilla, Serializable {

    private static final long serialVersionUID = -2801164631629048638L;

    private boolean disponible;
    private Ficha ficha;

    /**
     * Constructor que crea una casilla y se establece si esta ocupada o no
     * @param disponible valor booleano de si esta ocupado o no
     */
    public Casilla(boolean disponible){
        this.disponible = disponible;
    }
    /**
     * método que nos retorna si la casilla esta disponible o no
     * @return 
     */
    public boolean isDisponible() {
        return disponible;
    }
    /**
     * método que nos sirve para asignar que la casilla se encuentra disponible o no
     * @param disponible 
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    /**
     * método que nos sirve para retornar el valor de casilla en un string
     * @return 
     */
    @Override
    public String toString() {
        return "Casilla{" + "disponible=" + disponible + ", ficha=" + ficha + '}';
    }
    /**
     * método que nos regresa la ficha que se encuentra dentro de la casilla
     * @return 
     */
    public Ficha getFicha() {
        return ficha;
    }
    /**
     * método que nos sirve para asignar una ficha dentro de la casilla
     * @param ficha 
     */
    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }
    
    

}

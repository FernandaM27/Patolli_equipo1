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

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Casilla{" + "disponible=" + disponible + ", ficha=" + ficha + '}';
    }

}

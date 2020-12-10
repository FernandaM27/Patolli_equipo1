package entidades;

import java.io.Serializable;

public class Central extends Casilla implements Serializable{

    private static final long serialVersionUID = 7416955555827437182L;

    /**
     * Casilla especial del tablero, las 4 del centro, hereda de Casilla
     * @param disponible valor que determina si tiene una ficha o no
     */
    public Central(boolean disponible) {
        super(disponible);
    }

    @Override
    public String toString() {
        return "Central{" + '}';
    }

}

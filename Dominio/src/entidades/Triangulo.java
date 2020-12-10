package entidades;

import java.io.Serializable;

public class Triangulo extends Casilla implements Serializable {

    private static final long serialVersionUID = 4094741646027454008L;

    /**
     * Casilla especial del tablero en donde se paga doble apuesta
     * @param disponible checa si tiene ficha o no
     */
    public Triangulo(boolean disponible) {
        super(disponible);
    }

    @Override
    public String toString() {
        return "Triangulo{" + '}';
    }

}

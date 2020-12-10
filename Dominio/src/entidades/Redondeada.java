package entidades;

import java.io.Serializable;

public class Redondeada extends Casilla implements Serializable {

    private static final long serialVersionUID = -6866087733924946885L;

    /**
     * Casilla especial del tablero en donde el jugador toma otro turno
     * Hereda de Casilla
     * @param disponible checa si tiene ficha o no
     */
    public Redondeada(boolean disponible) {
        super(disponible);
    }

    @Override
    public String toString() {
        return "Redondeada{" + '}';
    }
    
}

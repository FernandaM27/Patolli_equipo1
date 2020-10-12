package entidades;

public class Redondeada extends Casilla {

    /**
     * Casilla especial del tablero en donde el jugador toma otro turno
     * Hereda de Casilla
     * @param disponible checa si tiene ficha o no
     */
    public Redondeada(boolean disponible) {
        super(disponible);
    }

}

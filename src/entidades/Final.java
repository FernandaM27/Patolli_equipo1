package entidades;

public class Final extends Normal {

    /**
     * Casilla especial del tablero, las fichas tienen que llegar a esta casilla para ganar
     * Hereda de Casilla
     * @param disponible determina si tiene una ficha o no 
     */
    public Final(boolean disponible) {
        super(disponible);
    }

}

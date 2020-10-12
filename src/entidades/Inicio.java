package entidades;

public class Inicio extends Central {

    /**
     * Casilla especial del tablero, de aqui parten las fichas
     * Hereda de Casilla
     * @param disponible verifica si tiene una ficha o no 
     */
    public Inicio(boolean disponible) {
        super(disponible);
    }

}

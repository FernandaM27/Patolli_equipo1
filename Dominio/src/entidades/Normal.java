package entidades;

public class Normal extends Casilla {

    /**
     * Casillas normales del juego, sin nada especial
     * Hereda de Casilla
     * @param disponible verifica si tienen una ficha o no 
     */
    public Normal(boolean disponible) {
        super(disponible);
    }

    @Override
    public String toString() {
        return "Normal{" + '}';
    }

}

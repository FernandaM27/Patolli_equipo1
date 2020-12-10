package entidades;

import java.io.Serializable;

public class Normal extends Casilla  implements Serializable{

    private static final long serialVersionUID = -8460970944268130788L;

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

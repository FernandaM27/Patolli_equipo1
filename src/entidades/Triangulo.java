package entidades;

public class Triangulo extends Casilla {

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

package entidades;

public class Casilla {

    public boolean disponible;
    public Ficha ficha;

    /**
     * Constructor que crea una casilla y se establece si esta ocupada o no
     * @param disponible valor booleano de si esta ocupado o no
     */
    public Casilla(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}

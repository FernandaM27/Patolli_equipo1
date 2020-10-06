package entidades;

public class Casilla {

    public boolean disponible;
    public Ficha ficha;

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

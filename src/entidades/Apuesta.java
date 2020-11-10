package entidades;

public class Apuesta {

    private int cantidad;

    /**
     * Constructor que establece el valor que va a tener la apuesta en la partida
     * @param cantidad valor de la apuesta
     */
    public Apuesta(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

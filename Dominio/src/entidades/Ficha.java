package entidades;

public class Ficha {

    private String color;
    private Jugador jugador;
    private int orden;

    /**
     * Constructor que crea una ficha y establece el orden de salida de ella
     * @param orden valor de orden en el que salieron las fichas
     */
    public Ficha(int orden) {
        this.orden=orden;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

}

package entidades;

import java.io.Serializable;

public class Apuesta implements Serializable{

    private static final long serialVersionUID = 8487873446876610838L;

    private int cantidad;

    /**
     * Constructor que establece el valor que va a tener la apuesta en la partida
     * @param cantidad valor de la apuesta
     */
    public Apuesta(int cantidad) {
        this.cantidad = cantidad;
    }
    
    /**
     * método get que regresa la cantida de apuesta
     * @return 
     */
    public int getCantidad() {
        return cantidad;
    }
    
    /**
     * método set que asigna la cantidad de la apuesta
     * @param cantidad 
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

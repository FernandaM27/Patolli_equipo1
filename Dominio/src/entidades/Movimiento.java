package entidades;

import java.io.Serializable;

public class Movimiento implements Serializable {

    private static final long serialVersionUID = -4175647374884078757L;

    private Apuesta apuesta;

    private Ficha ficha;
    
    private int cantidad;
    /**
     * constructor vacio de movimiento
     */
    public Movimiento() {
    }
    /**
     * Construcor con los parametros de apuesta y ficha para asignar
     * @param apuesta
     * @param ficha 
     * @param cantidad 
     */
    public Movimiento(Apuesta apuesta, Ficha ficha, int cantidad) {
        this.apuesta = apuesta;
        this.ficha = ficha;
        this.cantidad= cantidad;
    }
    /**
     * método que nos regresa la apuesta del movimiento
     * @return 
     */
    public Apuesta getApuesta() {   
        return apuesta;
    }
    /**
     * método que asigna la apuesta al movimiento
     * @param apuesta 
     */
    public void setApuesta(Apuesta apuesta) {
        this.apuesta = apuesta;
    }
    /**
     * obtiene la ficha del movimiento
     * @return 
     */
    public Ficha getFicha() {
        return ficha;
    }
    /**
     * asigna ficha a movimiento
     * @param ficha 
     */
    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}

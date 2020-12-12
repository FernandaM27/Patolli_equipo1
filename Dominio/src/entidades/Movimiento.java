package entidades;

import java.io.Serializable;

public class Movimiento implements Serializable {

    private static final long serialVersionUID = -4175647374884078757L;

    private Apuesta apuesta;

    private Ficha ficha;
    /**
     * constructor vacio de movimiento
     */
    public Movimiento() {
    }
    /**
     * Construcor con los parametros de apuesta y ficha para asignar
     * @param apuesta
     * @param ficha 
     */
    public Movimiento(Apuesta apuesta, Ficha ficha) {
        this.apuesta = apuesta;
        this.ficha = ficha;
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

}

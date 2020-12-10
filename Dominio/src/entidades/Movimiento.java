package entidades;

import java.io.Serializable;

public class Movimiento implements Serializable {

    private static final long serialVersionUID = -4175647374884078757L;

    private Apuesta apuesta;

    private Ficha ficha;

    public Movimiento() {
    }

    public Movimiento(Apuesta apuesta, Ficha ficha) {
        this.apuesta = apuesta;
        this.ficha = ficha;
    }

    public Apuesta getApuesta() {
        return apuesta;
    }

    public void setApuesta(Apuesta apuesta) {
        this.apuesta = apuesta;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

}

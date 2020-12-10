package entidades;

import java.io.Serializable;

public class Movimiento implements Serializable{

    private static final long serialVersionUID = -4175647374884078757L;

    private int id;

    public Movimiento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

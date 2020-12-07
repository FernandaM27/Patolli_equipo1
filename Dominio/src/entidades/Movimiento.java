package entidades;

import java.io.Serializable;

public class Movimiento implements Serializable{

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

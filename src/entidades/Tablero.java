package entidades;

import java.util.ArrayList;

public class Tablero {

    public int numCasillas;
    public ArrayList<Casilla> casillas = new ArrayList<>(numCasillas);

    public Tablero(int numCasillas) {
        this.numCasillas = numCasillas;
    }

    public int getNumCasillas() {
        return numCasillas;
    }

    public void setNumCasillas(int numCasillas) {
        this.numCasillas = numCasillas;
    }
}

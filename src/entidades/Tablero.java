package entidades;

import java.util.ArrayList;

public class Tablero {

    private int numCasillas;
    private ArrayList<Casilla> casillas = new ArrayList<>(numCasillas);

    /**
     * Crea el tablero
     * @param numCasillas numero de casillas por aspa
     */
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

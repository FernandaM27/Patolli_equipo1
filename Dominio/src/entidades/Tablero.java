package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tablero implements Serializable{

    private int numCasillas;
    //Cambiar Linked list
    private List<Casilla> casillas;
    /**
     * Crea el tablero
     * @param numCasillas numero de casillas por aspa
     * @param casillas
     */
    public Tablero(int numCasillas,List casillas) {
        this.numCasillas = numCasillas;
        this.casillas= casillas;
    }

    public int getNumCasillas() {
        return numCasillas;
    }

    public void setNumCasillas(int numCasillas) {
        this.numCasillas = numCasillas;
    }
    
    public void addCasilla(Casilla casilla){
        this.casillas.add(casilla);
    }
    
    /* Si se llega necesitar todas las casillas.
    */
    public List<Casilla> getCasillas(){
        return casillas;
    }

    @Override
    public String toString() {
        return "Tablero{" + "numCasillas=" + numCasillas + ", casillas=" + casillas + '}';
    }
    
}

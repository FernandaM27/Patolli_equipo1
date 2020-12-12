package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tablero implements Serializable{

    private static final long serialVersionUID = 6545490717344550556L;

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
    /**
     * método que regresa el numero de casillas en un tablero
     * @return 
     */
    public int getNumCasillas() {
        return numCasillas;
    }
    /**
     * método que asigna el numero de casillas a un tablero
     * @param numCasillas 
     */
    public void setNumCasillas(int numCasillas) {   
        this.numCasillas = numCasillas;
    }
    /**
     * método que asigna una casilla al tablero
     * @param casilla 
     */
    public void addCasilla(Casilla casilla){
        this.casillas.add(casilla);
    }
    
    /* método que regresa todas las casillas del tablero
    */
    public List<Casilla> getCasillas(){
        return casillas;
    }
    /**
     * método que regresa los valores del tablero en un string
     * @return 
     */
    @Override
    public String toString() {
        return "Tablero{" + "numCasillas=" + numCasillas + ", casillas=" + casillas + '}';
    }
    
}

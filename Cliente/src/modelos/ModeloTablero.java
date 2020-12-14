/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.Casilla;
import entidades.Partida;
import entidades.Tablero;
import java.util.List;

/**
 *
 * @author Alfon
 */
public class ModeloTablero extends ModeloBase {

    private Tablero tablero;
    private static ModeloTablero mTablero;
    private Partida partida;
    
    /**
     * método constructor vacio de la clase el cual ejecuta el método
     * setEtiquetas
     */
    private ModeloTablero() {
        super();
        this.setEtiquetas();
    }

    /**
     * método constructor del modelo tablero que recibe dos parametros el
     * tablero y la lista de jugadores e inicializa los atributos con el valor
     * de los parámetros.
     *
     * @param tablero
     * @param jugadores
     */
    private ModeloTablero(Partida partida) {
        this();
        this.partida=partida;
    }

    public static ModeloTablero getInstance() {
        if (mTablero != null) {
            return mTablero = new ModeloTablero();
        }
        return mTablero;
    }

    public static ModeloTablero getInstance(Partida partida) {
        if (mTablero != null) {
            return mTablero = new ModeloTablero(partida);
        }
        return mTablero;
    }

    /**
     * Método que regresa el tablero
     *
     * @return
     */
    public Tablero getTablero() {
        return this.tablero;
    }

 
    /**
     * Mètodo set que asigna el tablero
     *
     * @param tablero
     */
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    /**
     * método para mover una ficha de casilla dentro del tablero tomando la
     * posición desde el tablero
     *
     * @param casilla
     */
    public void realizaMovimiento(Casilla casilla) {
        List<Casilla> casillas = tablero.getCasillas();
        Casilla c = casillas.get(casillas.indexOf(casilla));

    }
    
    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
 
    /**
     * le asigna los valores a la lista de etiquetas heredada de modeloBase y
     * corresponden al frame s
     */
    @Override
    protected void setEtiquetas() {
        super.addEtiqueta("Patolli");
        super.etiquetas.add("crear partida");
        super.etiquetas.add("Tamaño del tablero");
        super.etiquetas.add("casillas");
        super.etiquetas.add("Num. jugadores");
        super.etiquetas.add("Num. fichas");
        super.etiquetas.add("fondos de apuesta");
        super.etiquetas.add("valor por apuesta");
    }

}

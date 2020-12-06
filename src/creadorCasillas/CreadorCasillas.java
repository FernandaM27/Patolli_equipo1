/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creadorCasillas;

import entidades.Casilla;
import entidades.Tablero;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Equipo 1
 */
public class CreadorCasillas {

    private List<Casilla> casillas;
    private int size;

    public CreadorCasillas(int size) {
        this.casillas = new LinkedList<>();
        this.size = size;
    }

    /**
     * Metodo que permite crear todas las casillas dependiento el tamaño del
     * tablero Las casillas tendran el orden el cual los jugadores deberan de
     * seguir
     *
     * @param size tamaño de las aspa del tablero
     */
    public List crearCasillas(int size) {
        for (int i = 0; i < 4; i++) {
            this.guardarC("InicioFinal");
            this.guardarC("Central");
            this.guardarNormal(size, 3);
            this.guardarTriangular();
            for (int l = 0; l < 2; l++) {
                this.guardarC("Redondeada");
            }
            this.guardarTriangular();
            this.guardarNormal(size, 4);
        }
        return casillas;
    }

    private void guardarNormal(int size, int i) {
        for (int j = 0; j < size - i; j++) {
            this.guardarC("Normal");
        }
    }

    private void guardarTriangular() {
        for (int k = 0; k < 2; k++) {
            this.guardarC("Triangular");
        }
    }

    /*
     * Si existen problemas verificar los casteos
     */
    private void guardarC(String tipo) {
        this.casillas.add((Casilla) FactoryCasillas.createInstance(tipo));
    }
}

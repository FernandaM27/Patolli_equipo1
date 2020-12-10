/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import entidades.Casilla;
import entidades.Tablero;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI GF63
 */
public class DibujoTablero {

   /**
     * Se utiliza la referencia de memoria para modificar esta instancia nota
     * para desarrollador: En dado caso no funcionen los cambios, implementar
     * observer.
     */
    private Tablero tablero;
    private final String movimientos[] = {"R", "U", "R", "D", "R", "D", "L", "D", "L", "U", "L", "U", "R"};
    //variable x y: son para la posición dentro del tablero  
    // if L x-=20 
    // if R x+=20 
    // if U y-=20 
    // if D y+=20 
    private int x = 210;
    private int y = 230;
    private int contador = 0;
    private String movimiento = null;
    private List<DibujoCasilla> casillas;
    
    /**
     * Método constructor que se encarga de iniciaizar los valores
     * @param tablero 
     */
    public DibujoTablero(Tablero tablero) {
        this.tablero = tablero;
        this.casillas = new ArrayList<>();
    }
    
    /**
     * méotodo que nos regresa la lista de casillas
     * @return 
     */
    public List<DibujoCasilla> getCasillas() {
        return casillas;
    }
    
    /**
     * métodos que inicializa la lista de casillas con la lista pasada por el parametro 
     * @param casillas 
     */
    public void setCasillas(List<DibujoCasilla> casillas) {
        this.casillas = casillas;
    }
    
    /**
     * método que se encarga crear el tablero 
     */
    public void crearTablero() {

    }
    
    /**
     * método que se encarga crear las coordenadas de las casillas 
     * @param size 
     */
    private void crearCoordenadasCasillas(int size) {

        for (Casilla c : tablero.getCasillas()) {
            
            DibujoCasilla dibujoCasilla = new DibujoCasilla(c, x, y);
            casillas.add(dibujoCasilla);
            movimiento = movimientos[contador];
            this.calcularXY(movimiento);
            contador++;
            
        }
        
    }

//    private void guardarNormal(String movimiento, int size, int i) {
//        for (int j = 0; j < size - i; j++) {
//            movimiento = movimientos[contador];
//            this.calcularXY(movimiento);
//            this.guardarC(x, y, "Normal");
//        }
//    }
//
//    private void guardarTriangular(String movimiento) {
//        for (int k = 0; k < 2; k++) {
//            //movimiento = movimientos[contador];
//            this.calcularXY(movimiento);
//            this.guardarC(x, y, "Triangular");
//        }
//    }
    /**
     * método utilizado para calcular las coordenadas donde se dibujaran las casillas
     * @param movimiento 
     */
    private void calcularXY(String movimiento) {
        if (movimiento.equals("L")) {
            this.x -= 20;
        } else if (movimiento.equals("R")) {
            this.x += 20;
        } else if (movimiento.equals("U")) {
            this.y -= 20;
        } else if (movimiento.equals("D")) {
            this.y += 20;
        }
    }

    /**
     * método que se encarga de agregar una ficha
     */
    public void agregarFichas() {

    }
    /**
     * método que se encarga de eliminar una ficha
     */
    public void eliminarFicha() {

    }
    /**
     * método que se encarga de mover ficha una ficha de casilla
     */
    public void moverFicha() {

    }
}

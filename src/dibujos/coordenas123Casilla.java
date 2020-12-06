package dibujos;

 import entidades.Casilla;
import creadorCasillas.FactoryCasillas;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class coordenas123Casilla {

  
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

    public coordenas123Casilla(int size) {
          guardarCasillas(size);
    }

    private void guardarCasillas(int size) {
        for (int i = 0; i < 4; i++) {
            this.guardarC(x, y, "InicioFinal");
            movimiento = movimientos[contador];
            this.calcularXY(movimiento);
            contador++;
            this.guardarC(x, y, "Central");
            movimiento=movimientos[contador]; 
            this.guardarNormal(movimiento, size, 3);
            this.guardarTriangular(movimiento);
            for (int l = 0; l < 2; l++) {
                this.calcularXY(movimiento);
                this.guardarC(x, y, "Redondeada");
                contador++;
                movimiento=movimientos[contador];
            }
            this.guardarTriangular(movimiento);
            this.guardarNormal(movimiento, size, 4);
            this.calcularXY(movimiento);
        }
     }

    private void guardarNormal(String movimiento, int size, int i) {
        for (int j = 0; j < size - i; j++) {
            movimiento = movimientos[contador];
            this.calcularXY(movimiento);
            this.guardarC(x, y, "Normal");
        }
    }

    private void guardarTriangular(String movimiento) {
        for (int k = 0; k < 2; k++) {
            //movimiento = movimientos[contador];
            this.calcularXY(movimiento);
            this.guardarC(x, y, "Triangular");
        }
    }

    private void calcularXY(String movimiento) {
        if (movimiento.equals("L")) {
            this.x -= 20;
        } else if (movimiento.equals("R")) {
            this.x += 20;
        } else if (movimiento.equals("U")) {
            this.y -= 20;
        } else if(movimiento.equals("D")){
            this.y += 20;
        }
    }

    private void guardarC(int x, int y, String tipo) {
//        CoordenadaCasilla cCasilla = new CoordenadaCasilla(x, y,
//                (Casilla) FactoryCasillas.createInstance(tipo));
//        this.CoordenadasCasillas.add(cCasilla);
    }

    public void agregarFichas() {

    }

    public void eliminarFicha() {

    }

    public void moverFicha() {

    }

}

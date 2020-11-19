/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import entidades.Tablero;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author MSI GF63
 */
public class DibujoTablero {
    /** Se utiliza la referencia de memoria para modificar esta instancia
     * nota para desarrollador: En dado caso no funcionen los cambios, implementar observer.
     */
    private Tablero tablero;   
    
    private List<DibujoCasilla> casillas;
    private List<DibujoFicha> fichas;

    public DibujoTablero(Tablero tablero) {
        this.tablero = tablero;
        this.casillas = new ArrayList<>();
        this.fichas = new ArrayList<>();
    }

    public List<DibujoCasilla> getCasillas() {
        return casillas;
    }

    public void setCasillas(List<DibujoCasilla> casillas) {
        this.casillas = casillas;
    }

    public List<DibujoFicha> getFichas() {
        return fichas;
    }

    public void setFichas(List<DibujoFicha> fichas) {
        this.fichas = fichas;
    }
    
}

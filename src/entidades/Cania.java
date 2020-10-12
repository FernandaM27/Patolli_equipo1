package entidades;

public class Cania {

    private Boolean valor;

    /**
     * Constructor que establece el valor de la cania, que se usa como dado en el juego
     * Solo puede tener dos vakores
     * @param valor valor de la cania
     */
    public Cania(Boolean valor) {
        this.valor = valor;
    }

    public Boolean getValor() {
        return valor;
    }

    public void setValor(Boolean valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Cania{" + "valor=" + valor + '}';
    }
    
}

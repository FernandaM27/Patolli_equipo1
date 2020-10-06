package entidades;

public class Cania {

       private Boolean valor;

    public Cania(Boolean valor) {
        this.valor = valor;
    }

    /**
     * Métodos de acceso.
     * @return 
     */
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

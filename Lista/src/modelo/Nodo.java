
package modelo;

/**
 *
 * @author Alberto Paternina 
 */
public class Nodo {

    private Object dato;
    private Nodo getSiguiente;

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return getSiguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.getSiguiente = siguiente;
    }

  

    public Nodo(Object dato) {
        this.dato = dato;
        this.getSiguiente = null;
    }

}

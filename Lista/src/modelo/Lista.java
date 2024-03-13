package modelo;

/**
 *
 * @author Alberto Paternina
 */
public class Lista {

    private Nodo cabeza;

    public Lista() {
        this.cabeza = null;
    }

    public void insertar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            this.cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }

            actual.setSiguiente(nuevo);
        }
    }

    public void eliminar(Object dato) {

        if (cabeza == null) {
            return;
        }

        if (cabeza.getDato() == dato) {
            cabeza = cabeza.getSiguiente();
            return;
        }

        Nodo actual = cabeza;
        while (actual.getSiguiente() != null && actual.getSiguiente().getDato() != dato) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
        }
    }

    public void ordenar() {
        if (cabeza == null || cabeza.siguiente == null) {
            return;
        }

        boolean intercambio;
        do {
            intercambio = false;
            Nodo actual = cabeza;
            Nodo siguiente = cabeza.siguiente;

            while (siguiente != null) {
                if (actual.dato > siguiente.dato) {
                    int temp = actual.dato;
                    actual.dato = siguiente.dato;
                    siguiente.dato = temp;
                    intercambio = true;
                }

                actual = siguiente;
                siguiente = siguiente.siguiente;
            }
        } while (intercambio);
    }
    
    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Lista{" + "cabeza=" + cabeza + '}';
    }
    
    
}

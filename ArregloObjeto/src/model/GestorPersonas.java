package model;

import java.util.Arrays;

/**
 *
 * @author AlPater
 */
public class GestorPersonas {

    private static final int TAMANO_INICIAL = 10;
    private Persona[] personas;
    private int contadorPersonas;

    /**
     * Constructor de la clase GestorPersonas.
     */
    public GestorPersonas() {
        this.personas = new Persona[TAMANO_INICIAL];
        this.contadorPersonas = 0;
    }

    /**
     * Agrega una persona al arreglo.
     *
     * @param persona La persona a agregar.
     */
    public void agregarPersona(Persona persona) {
        if (contadorPersonas == personas.length) {
            personas = Arrays.copyOf(personas, personas.length * 2);
        }

        personas[contadorPersonas++] = persona;
    }

    /**
     * Obtiene la persona en la posición especificada.
     *
     * @param indice La posición en el arreglo.
     * @return La persona en la posición indicada.
     */
    public Persona obtenerPersona(int indice) {
        if (indice >= 0 && indice < contadorPersonas) {
            return personas[indice];
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    /**
     * Obtiene el número total de personas almacenadas.
     *
     * @return El número total de personas almacenadas.
     */
    public int obtenerCantidadPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Personas Almacenadas ");
        for (int i = 0; i < contadorPersonas; i++) {
            Persona persona = personas[i];
            result.append("\nPersona ").append(i + 1).append(" : ")
                    .append("\n\tIdentificación: ").append(persona.getIdentificacion())
                    .append("\n\tNombre y Apellido: ").append(persona.getNombre())
                    .append("\n\tEdad: ").append(persona.getEdad())
                    .append("\n");

            if (i < contadorPersonas - 1) {
                result.append("; ");
            }
        }
        result.append("\n Total de Personas Agregadas = ").append(contadorPersonas).append('}');
        return result.toString();
    }

}

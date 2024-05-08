package model;

import java.util.Scanner;

/**
 * Esta clase permite llevar el control de Asistencia de cada Curso
 *
 * @author pater
 */
public class ControlAsistencia {

    private Curso curso;
    private Asistencia[] lista;
    private String fecha;

    public Curso getCurso() {
        return curso;
    }

    public String getFecha() {
        return fecha;
    }

    public ControlAsistencia(Curso curso, String fecha) {
        this.curso = curso;
        this.fecha = fecha;
        this.lista = new ListaAsistencia(fecha).crearListaAsistencia(this.curso);
    }

    public void mostarListaAsistenciaConsola() {
        StringBuilder result = new StringBuilder("Lista de Asistencia ").append(fecha).append("\n");
        result.append("-----------------------------------------------------\n");
        result.append(String.format("| %-40s | %-7s |\n", "Nombre", "Asistio"));
        result.append("-----------------------------------------------------\n");

        for (Asistencia asistencia : this.lista) {
            String nombre = asistencia.getEstudiante().getNombre();
            String asistio = asistencia.isAsistio() ? "Si" : "No";
            result.append(String.format("| %-40s | %-7s |\n", nombre, asistio));
        }

        result.append("-------------------------------------------------\n");

        System.out.println(result);
    }

    public void tomarAsistenciaConsola() {
        Scanner respuesta = new Scanner(System.in);
        StringBuilder result = new StringBuilder("Lista de Asistencia ").append(fecha).append("\n");
        result.append("-----------------------------------------------------\n");
        result.append(String.format("| %-40s | %-7s |\n", "Nombre", "Asistio"));
        result.append("-----------------------------------------------------\n");

        int index = 0;
        do {
            Asistencia asistencia = this.lista[index];
            String nombre = asistencia.getEstudiante().getNombre();
            //String asistio = asistencia.isAsistio() ? "Si" : "No";
            result.append(String.format("| %-40s | %-7s |\n", nombre, ""));
            System.out.println(result);
            result.setLength(0); // Limpiar el StringBuilder para la próxima iteración
            System.out.print(" ¿ Asistio el estudiante (Si/No) ? ");
            String res = respuesta.nextLine();
            boolean modAsistio = res.equalsIgnoreCase("si");
            asistencia.setAsistio(modAsistio);
            index++;
        } while (index < this.lista.length);

        System.out.println("-------------------------------------------------\n");

    }

}

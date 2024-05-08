package model;

import java.util.Scanner;

/**
 * Esta clase permite llevar el control de Asistencia de cada Curso
 *
 * @author pater
 */
public class AssistanceControl {

    private final Course course;
    private final Assistance[] list;
    private final String date;

    public Course getCourse() {
        return course;
    }

    public String getDate() {
        return date;
    }

    public AssistanceControl(Course curso, String fecha) {
        this.course = curso;
        this.date = fecha;
        this.list = new AssistanceList(fecha).createAssistanceList(this.course);
    }

    public void mostarListaAsistenciaConsola() {
        StringBuilder result = new StringBuilder("Lista de Asistencia ").append(date).append("\n");
        result.append("-----------------------------------------------------\n");
        result.append(String.format("| %-40s | %-7s |\n", "Nombre", "Asistio"));
        result.append("-----------------------------------------------------\n");

        for (Assistance asistencia : this.list) {
            String nombre = asistencia.getStudent().getName();
            String asistio = asistencia.isAsistio() ? "Si" : "No";
            result.append(String.format("| %-40s | %-7s |\n", nombre, asistio));
        }

        result.append("-------------------------------------------------\n");

        System.out.println(result);
    }

    public void tomarAsistenciaConsola() {
        Scanner respuesta = new Scanner(System.in);
        StringBuilder result = new StringBuilder("Lista de Asistencia ").append(date).append("\n");
        result.append("-----------------------------------------------------\n");
        result.append(String.format("| %-40s | %-7s |\n", "Nombre", "Asistio"));
        result.append("-----------------------------------------------------\n");

        int index = 0;
        do {
            Assistance asistencia = this.list[index];
            String nombre = asistencia.getStudent().getName();
            //String asistio = asistencia.isAsistio() ? "Si" : "No";
            result.append(String.format("| %-40s | %-7s |\n", nombre, ""));
            System.out.println(result);
            result.setLength(0); // Limpiar el StringBuilder para la próxima iteración
            System.out.print(" ¿ Asistio el estudiante (Si/No) ? ");
            String res = respuesta.nextLine();
            boolean modAsistio = res.equalsIgnoreCase("si");
            asistencia.setAsistio(modAsistio);
            index++;
        } while (index < this.list.length);

        System.out.println("-------------------------------------------------\n");

    }

}

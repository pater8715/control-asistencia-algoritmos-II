
package model;
/**
 *
 * @author pater
 */
public class Asistencia {
    private Estudiante estudiante;
    private boolean asistio;

    /**
     * @return the estudiante
     */
    public Estudiante getEstudiante() {
        return estudiante;
    }

    /**
     * @param estudiante the estudiante to set
     */
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    /**
     * @return the asistio
     */
    public boolean isAsistio() {
        return asistio;
    }

    /**
     * @param asistio the asistio to set
     */
    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }

    
}

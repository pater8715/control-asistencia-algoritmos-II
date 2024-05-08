package model;

/**
 *
 * @author pater
 */
public class Curso {

    private int codCcurso;
    private String nombre;
    private String aula;
    private Estudiante[] estudiante;
    private Profesor profesor;

    /**
     * @return the codCcurso
     */
    public int getCodCcurso() {
        return codCcurso;
    }

    public Curso(Estudiante[] estudiante) {
        this.estudiante = estudiante;
    }

    public Estudiante[] getEstudiante() {
        return estudiante;
    }
    
    

    /**
     * @param codCcurso the codCcurso to set
     */
    public void setCodCcurso(int codCcurso) {
        this.codCcurso = codCcurso;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the aula
     */
    public String getAula() {
        return aula;
    }

    /**
     * @param aula the aula to set
     */
    public void setAula(String aula) {
        this.aula = aula;
    }

    /**
     * @param pos posisción del estudiante
     * @return the estudiante
     */
    public Estudiante getEstudiante(int pos) {
        return estudiante[pos];
    }

    /**
     * @param estudiante the estudiante to set
     * @param pos posisción del estudiante
     */
    public void setEstudiante(Estudiante estudiante, int pos) {
        this.estudiante[pos] = estudiante;
    }

    /**
     * @return the profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public int getNumeroEstudiantes() {
        return estudiante.length;
    }

}

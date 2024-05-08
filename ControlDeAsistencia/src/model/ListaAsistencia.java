
package model;


public class ListaAsistencia {
    private Asistencia [] listaAsistencia;
    private String fecha;
    
    public ListaAsistencia(String fecha) {
      this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }
    
    public Asistencia [] crearListaAsistencia(Curso curso){
        this.listaAsistencia = new Asistencia[curso.getNumeroEstudiantes()];
        for(int i = 0; i < this.listaAsistencia.length;i++){
            this.listaAsistencia[i]= new Asistencia();
            this.listaAsistencia[i].setEstudiante(curso.getEstudiante(i));
        }
        
        return this.listaAsistencia;
    }
    
}

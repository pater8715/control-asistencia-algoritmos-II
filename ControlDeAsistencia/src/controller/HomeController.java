
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.AssistanceControl;
import model.Student;
import view.HomeView;

/**
 *
 * @author pater
 */
public class HomeController implements ActionListener{
        private AssistanceControl model;
        private HomeView vista;

    public HomeController(AssistanceControl model, HomeView vista) {
        this.model = model;
        this.vista = vista;
        cargarDatos();
       
    }
        
    public void iniciar(){
        this.vista.setTitle("Control de Asistencia");
        this.vista.setVisible(true);
    }
    
    public void cargarDatos(){
        String columname[] ={"Nombre del Estudiante", "Asistio"};
        DefaultTableModel modeloDatos = new DefaultTableModel(columname,0);
        for (Student estudiante : this.model.getCourse().getStudents()) {
        Object[] rowData = {estudiante.getName(), ""}; // Inicialmente, la asistencia está vacía
        modeloDatos.addRow(rowData);
    }
        
        this.vista.nameCurso.setText(this.model.getCourse().getName());
        this.vista.date.setText(this.model.getDate());
        this.vista.tbListEstudiantes.setModel(modeloDatos);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}


package controller;

import home.Home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.ControlAsistencia;
import model.Estudiante;
import view.HomeView;

/**
 *
 * @author pater
 */
public class HomeController implements ActionListener{
        private ControlAsistencia model;
        private HomeView vista;

    public HomeController(ControlAsistencia model, HomeView vista) {
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
        for (Estudiante estudiante : this.model.getCurso().getEstudiante()) {
        Object[] rowData = {estudiante.getNombre(), ""}; // Inicialmente, la asistencia está vacía
        modeloDatos.addRow(rowData);
    }
        
        this.vista.nameCurso.setText(this.model.getCurso().getNombre());
        this.vista.date.setText(this.model.getFecha());
        this.vista.tbListEstudiantes.setModel(modeloDatos);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}

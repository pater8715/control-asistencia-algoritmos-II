package home;

import controller.HomeController;
import model.AssistanceControl;
import model.Course;
import model.Student;
import view.HomeView;

public class Home {

    public static void main(String[] args) {
        String[] nombresEstudiantes = {
            "DIAZ GALVAN JAIRO ANDRES",
            "FERNANDEZ VILLALBA JOSUE CALEB",
            "GONZALEZ NEGRETE JUAN SEBASTIAN",
            "GONZALEZ ORTEGA CARLOS RICARDO",
            "GUERRA ORTIZ VANESSA ISABEL",
            "MADERA BANDA LUIS FERNANDO",
            "MEDINA LOPEZ JESUS RICARDO",
            "PENA PASTRANA NEWIN",
            "RODRIGUEZ RODRIGUEZ BRAYAN ANDRES",
            "ROJAS CUELLO CARLOS MARIO",
            "ROJAS MONTERROSA JOSE JAVIER",
            "SALGADO BULFFORD DANNA",
            "SIERRA PEREZ DANIELA",
            "SOTO HERNANDEZ JOSEFS JESUS",
            "SOTO JARABA ALBEIRO JOSE",
            "VERGARA ROMERO JOSE SEBASTIAN",
            "VILLA TAPIA SNAIDER",
            "VILLEGAS GRACIA FARID LEONARDO",
            "GOMEZ LOPEZ SANTIAGO ANDRES",
            "RIVERO SOTERO FREDY DAVID"
        };

        Student listaEstudiantes[] = new Student[nombresEstudiantes.length];

        for (int i = 0; i < listaEstudiantes.length; i++) {
            listaEstudiantes[i]=new Student();
            listaEstudiantes[i].setName(nombresEstudiantes[i]);
        }
        Course curso = new Course(listaEstudiantes);
        curso.setName("Algoritmos II");
        
        AssistanceControl control = new AssistanceControl(curso,"04/05/2024");
    
        //control.tomarAsistenciaConsola();
        
        //control.mostarListaAsistenciaConsola();
        
        HomeView vista = new HomeView();
        
        HomeController controlador = new HomeController(control, vista);
        controlador.iniciar();

    }
}

package home;

import controller.HomeController;
import model.ControlAsistencia;
import model.Curso;
import model.Estudiante;
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

        Estudiante listaEstudiantes[] = new Estudiante[nombresEstudiantes.length];

        for (int i = 0; i < listaEstudiantes.length; i++) {
            listaEstudiantes[i]=new Estudiante();
            listaEstudiantes[i].setNombre(nombresEstudiantes[i]);
        }
        Curso curso = new Curso(listaEstudiantes);
        curso.setNombre("Algoritmos II");
        
        ControlAsistencia control = new ControlAsistencia(curso,"04/05/2024");
    
        //control.tomarAsistenciaConsola();
        
        //control.mostarListaAsistenciaConsola();
        
        HomeView vista = new HomeView();
        
        HomeController controlador = new HomeController(control, vista);
        controlador.iniciar();

    }
}

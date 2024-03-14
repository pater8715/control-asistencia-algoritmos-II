
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import torreshannoi.TorreHannoi;
import vista.VTorre;


public class CVTorre implements ActionListener{
    private VTorre vista;
    private TorreHannoi modelo;

    public CVTorre(VTorre vista, TorreHannoi modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
    }
    
    public void iniciar(){
        this.vista.setTitle("Juego Torres de Hannoi");
        this.modelo.getDibujar().setOpaque(true);
        this.vista.setContentPane(modelo.getDibujar());
        this.vista.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

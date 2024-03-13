/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arregloobjeto;

import controller.CVArregloObjeto;
import model.GestorPersonas;
import view.VistaArregloObjeto;

/**
 *
 * @author AlPater
 */
public class ArregloObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        GestorPersonas modelo = new GestorPersonas();
        VistaArregloObjeto vista = new VistaArregloObjeto();
        CVArregloObjeto controlador = new CVArregloObjeto(vista, modelo);
        controlador.iniciarApp();
                
        
        
    }
    
}

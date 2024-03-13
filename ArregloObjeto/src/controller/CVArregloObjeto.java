package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.GestorPersonas;
import model.Persona;
import view.VistaArregloObjeto;

/**
 *
 * @author AlPater
 */
public class CVArregloObjeto implements ActionListener {

    private VistaArregloObjeto vista;
    private GestorPersonas modelo;

    public CVArregloObjeto(VistaArregloObjeto vista, GestorPersonas modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.btnAgregar.addActionListener((e) -> {
            agregarDato();
        });
        this.vista.btnMostrar.addActionListener((e) -> {
            mostrarDato();
        });

    }

    public void iniciarApp() {
        this.vista.setTitle("Mi Aplicación MVC con Arreglos de Objetos");
        this.vista.setSize(500, 350);
        this.vista.setLocationRelativeTo(null);
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    private void agregarDato() {
        Persona tempPersona = new Persona();
        tempPersona.setNombre(this.vista.txtNomApe.getText());
        tempPersona.setEdad(this.vista.txtEdad.getText());
        tempPersona.setIdentificacion(this.vista.txtIde.getText());
        this.modelo.agregarPersona(tempPersona);
    }

    private void mostrarDato() {
       this.vista.txtResultado.setText(this.modelo.toString());
    }

}

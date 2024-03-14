/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torreshannoi;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author AlPater
 */
public class DibujarTorre extends JPanel {
    private Graphics disco;

    @Override
    public void paintComponent(Graphics g) {
        disco = g;
        super.paintComponent(g);
        crearTorre(g);
    }

    public void crearTorre(Graphics g) {
        
        int alto = 15;
        int ancho = 60;
        int baseTorre = 200;
        int altoTorre = 100;
        int POS_TORRE_1 = 105;
        int posTorre2 = 195;
        int posTorre3 = 285;
        //dibujo base
        g.drawLine(40, baseTorre, 350, baseTorre);
        //dibujo torre 1
        g.drawLine(POS_TORRE_1, altoTorre, POS_TORRE_1, baseTorre);
        g.drawString("Torre A", (int) (POS_TORRE_1 - 20), baseTorre + 20);
        g.setColor(Color.red);
        g.fillRect(POS_TORRE_1 - ancho / 2, (int) (baseTorre - (alto * 1.5)), ancho, alto);
        //dibujo torre 2
        g.setColor(Color.BLACK);
        g.drawLine(posTorre2, altoTorre, posTorre2, baseTorre);
        g.drawString("Torre B", (int) (posTorre2 - 20), baseTorre + 20);
        // dubujar discos 1
        g.setColor(Color.red);
        g.fillRect(posTorre2 - ancho / 2, (int) (baseTorre - (alto * 1.5)), ancho, alto);
        // dibujar disco 2
        ancho -= 10;
        g.setColor(Color.BLUE);
        g.fill3DRect(posTorre2 - ancho / 2, (int) (baseTorre - (alto * 3)), ancho, alto, true);
        ancho -= 10;
        
        disco.setColor(Color.GREEN);
        disco.fill3DRect(posTorre2 - ancho / 2, (int) (baseTorre - (alto * 4.5)), ancho, alto, true);

        //dibujo torre 3
        g.setColor(Color.BLACK);
        g.drawLine(posTorre3, altoTorre, posTorre3, baseTorre);
        g.drawString("Torre C", (int) (posTorre3 - 20), baseTorre + 20);

        //dibujar disco
        ancho = 60;
        g.setColor(Color.red);
        g.fillRect(posTorre3 - ancho / 2, (int) (baseTorre - (alto * 1.5)), ancho, alto);
        
        
        disco.translate(posTorre3, baseTorre - alto * 3);
        
        
    }

    public void crearDiscos(Color color,int x, int y ) {
        int alto = 15;
    }
    
    public void mover(){
        
    }

}

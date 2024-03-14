
package inicio;

import controlador.CVTorre;
import torreshannoi.TorreHannoi;
import vista.VTorre;

/**
 *
 * @author AlPater
 */
public class Inicio {
    public static void main(String[] args) {
        TorreHannoi modelo = new TorreHannoi();
        VTorre vista = new VTorre();
        CVTorre controlador = new CVTorre(vista, modelo);
        controlador.iniciar();
    }
}

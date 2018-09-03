
package calcularsueldo;
import vistas.VistaPpal.VistaPpal;
/**
 *
 * @author sebaudracco
 */
public class Calcularsueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new VistaPpal().setVisible(true);
        } //Muestro en un hilo nuevo la interfaz gráfica
        );
    }
}

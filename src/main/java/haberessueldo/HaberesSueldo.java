
package haberessueldo;

import vistas.VistaPrincipal;
/**
 *
 * @author sebaudracco
 */
public class HaberesSueldo {
    
 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            //Muestro en un hilo nuevo la interfaz gráfica
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }
    
}

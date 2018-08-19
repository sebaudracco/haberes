
/**
 *
 * @author sebaudracco
 */
package presentadores;

import javax.swing.JOptionPane;
import servicios.ServicioArticulo;
import servicios.ServicioEmpleado;
import vistas.VistaPrincipal;


public class PresentadorVistaPrincipal {
    private VistaPrincipal vistaPrincipal;
    
    private ServicioArticulo servicioArticulo;
    private ServicioEmpleado servicioEmpleado;

    public PresentadorVistaPrincipal(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        
        this.servicioArticulo = new ServicioArticulo();
        this.servicioEmpleado = new ServicioEmpleado();
    }
    
    public void guardarDatosPersonales()
    {
        //Obtengo los datos ingresados por el usuario
        String nombre = this.vistaPrincipal.getNombreTextField().getText();
        String apellido = this.vistaPrincipal.getApellidoTextField().getText();
        String dni = this.vistaPrincipal.getDniTextField().getText();
        String sueldoBase = this.vistaPrincipal.getSueldoBaseTextField().getText();
        
        try {
            //Intento guardar los datos personales
            this.servicioEmpleado.guardarDatosPersonales(nombre, apellido, dni, sueldoBase);
            
            /*
            El empleado se guardó exitosamente. Limpiar la vista y mostrar un 
            mensaje indicando el éxito.
            */
            
            //Limpiar vista
            this.vistaPrincipal.getNombreTextField().setText("");
            this.vistaPrincipal.getApellidoTextField().setText("");
            this.vistaPrincipal.getDniTextField().setText("");
            this.vistaPrincipal.getSueldoBaseTextField().setText("");
            
            //Mostrar mensaje de éxito.
            JOptionPane.showMessageDialog(null, "¡El empleado fue guardado correctamente!");
        } catch (IllegalArgumentException excepcion) {
            /*
            Llamé a "guardarDatosPersonales", pero ocurrió un error y por eso lanzó
            una excepción. Mostremos dicho error en una nueva ventana.
            */
            JOptionPane.showMessageDialog(null, excepcion.getMessage());
        }
    }
    
    public void guardarArticulo()
    {
        //Obtengo los datos del artículo ingresados por el usuario
        String cantidadVendida = this.vistaPrincipal.getCantidadArticulosVendidosTextField().getText();
        String precioUnitario = this.vistaPrincipal.getPrecioArticuloTextField().getText();
        
        try {
            //Intento guardar los datos del artículo
            this.servicioArticulo.guardarArticulo(cantidadVendida, precioUnitario);
            
            //Indicar que fue guardado correctamente.
            JOptionPane.showMessageDialog(null, "¡El artículo fue guardado correctamente!");
            
            //Limpiar vista
            this.vistaPrincipal.getPrecioArticuloTextField().setText("");
            this.vistaPrincipal.getCantidadArticulosVendidosTextField().setText("");
        } catch (IllegalArgumentException excepcion) {
            /*
            Llamé a "guardarArticulo", pero ocurrió un error y por eso lanzó
            una excepción. Mostremos dicho error en una nueva ventana.
             */
            JOptionPane.showMessageDialog(null, excepcion.getMessage());
        }
    }
    
    public void calcularSueldo()
    {
        try {
            double sueldo = this.servicioEmpleado.calcularSueldo();
            
            JOptionPane.showMessageDialog(null, "El sueldo del empleado es " + sueldo);
        } catch (IllegalArgumentException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }
    }
}


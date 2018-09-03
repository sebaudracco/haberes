
package presentadores;

import javax.swing.JOptionPane;
import servicios.ServicioArticulo;
import servicios.ServicioEmpleado;
import vistas.VistaPpal.VistaPpal;

/**
 *
 * @author sebaudracco
 */
public class PresVistaPrincipal {
       private VistaPpal vistaPrincipal;
    
    private ServicioArticulo servicioArticulo;
    private ServicioEmpleado servicioEmpleado;

    public PresVistaPrincipal(VistaPpal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        
        this.servicioArticulo = new ServicioArticulo();
        this.servicioEmpleado = new ServicioEmpleado();
    }
    
    public void guardarDatosPersonales()
    {
        
        String nombre = this.vistaPrincipal.getNombreTextField().getText();
        String apellido = this.vistaPrincipal.getApellidoTextField().getText();
        String dni = this.vistaPrincipal.getDniTextField().getText();
        String sueldoBase = this.vistaPrincipal.getSueldoBaseTextField().getText();
        
        try {
            
            this.servicioEmpleado.guardarDatosPersonales(nombre, apellido, dni, sueldoBase);
            

            this.vistaPrincipal.getNombreTextField().setText("");
            this.vistaPrincipal.getApellidoTextField().setText("");
            this.vistaPrincipal.getDniTextField().setText("");
            this.vistaPrincipal.getSueldoBaseTextField().setText("");
            
           
            JOptionPane.showMessageDialog(null, "Joya! Tus Datos Han Sido Perfectamente Guardados!");
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
        
        String cantidadVendida = this.vistaPrincipal.getCantidadArticulosVendidosTextField().getText();
        String precioUnitario = this.vistaPrincipal.getPrecioArticuloTextField().getText();
        
        try {
            
            this.servicioArticulo.guardarArticulo(cantidadVendida, precioUnitario);
            
            
            JOptionPane.showMessageDialog(null, "¡Fantastic! El artículo fue guardado correctamente!");
            
            //Limpiar vista
            this.vistaPrincipal.getPrecioArticuloTextField().setText("");
            this.vistaPrincipal.getCantidadArticulosVendidosTextField().setText("");
        } catch (IllegalArgumentException excepcion) {
           

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

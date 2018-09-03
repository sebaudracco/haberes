
package servicios;

import java.util.ArrayList;
import modelos.Articulos;
import modelos.Empleado;
import repo.RepoArticulo;
import repo.RepoEmpleado;

/**
 *
 * @author sebaudracco
 */
public class ServicioEmpleado {
     private RepoArticulo repoArticulo;
    
    private RepoEmpleado repoEmpleado;

    public ServicioEmpleado() {

        this.repoArticulo = new RepoArticulo();
        this.repoEmpleado = new RepoEmpleado();
    }
    
    public void guardarDatosPersonales(
            String nombre,
            String apellido,
            String dni,
            String sueldoBase
    ) {

        this.validarNombre(nombre);
        this.validarApellido(apellido);
        this.validarDNI(dni);
        double sueldoBaseConvertido = this.parsearSueldoBase(sueldoBase);

        Empleado empleado = new Empleado(nombre, apellido, dni, sueldoBaseConvertido);

        this.repoEmpleado.guardar(empleado);
    }
    
    private void validarNombre(String nombre) {

        if (nombre.length() == 0) {
            throw new IllegalArgumentException("¡El nombre es vacío!");
        }
    }
    
    private void validarApellido(String apellido) {

        if (apellido.length() == 0) {
            throw new IllegalArgumentException("¡El apellido es vacío!");
        }
    }
    
    private void validarDNI(String dni) {
        try {

            int dniParseado = Integer.parseInt(dni);

            if (dniParseado <= 0) {

                throw new IllegalArgumentException("El DNI debe ser mayor a 0");
            }
        } catch (NumberFormatException exception) {

            throw new IllegalArgumentException("¡El DNI es inválido!");
        }
    }
    
    private double parsearSueldoBase(String sueldoBase) {
        try {

            double sueldoBaseParseado = Double.valueOf(sueldoBase);
 
            if (sueldoBaseParseado < 0) {
                throw new IllegalArgumentException("¡El sueldo base debe ser mayor a 0!");
            }

            return sueldoBaseParseado;
        } catch (NumberFormatException exception) {

            throw new IllegalArgumentException("¡El sueldo base es inválido!");
        }
    }
    
    public double calcularSueldo()
    {

        Empleado empleado = this.repoEmpleado.obtenerEmpleadoGuardado();

        if (empleado == null) {
            throw new IllegalArgumentException("¡No ha guardado ningún empleado todavía!");
        }

        ArrayList<Articulos> articulosGuardados = this.repoArticulo.obtenerArticulosGuardados();

        double sueldo = empleado.getSueldoBase();

        sueldo = articulosGuardados.stream().map((articulos) -> articulos.getCantidadVendida() * articulos.getPrecioUnitario() * 0.05).reduce(sueldo, (accumulator, _item) -> accumulator + _item);

        return sueldo;
    }
}

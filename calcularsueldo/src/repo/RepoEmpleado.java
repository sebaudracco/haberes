
package repo;

import modelos.Empleado;

/**
 *
 * @author sebaudracco
 */
public class RepoEmpleado {
        private static Empleado empleadoGuardado;
    
    public void guardar(Empleado empleado)
    {
        this.empleadoGuardado = empleado;
    }
    
    public Empleado obtenerEmpleadoGuardado()
    {
        return this.empleadoGuardado;
    }
}

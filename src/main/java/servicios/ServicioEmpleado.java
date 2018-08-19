/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import modelos.Articulo;
import modelos.Empleado;
import repositorios.RepositorioArticulo;
import repositorios.RepositorioEmpleado;

/**
 *
 * @author sebaudracco
 */
public class ServicioEmpleado {
    private RepositorioArticulo repositorioArticulo;
    
    private RepositorioEmpleado repositorioEmpleado;

    public ServicioEmpleado() {
        /*
        Inicializar las dependencias externas, sino van a ser null y van a 
        fallar cuando intente usarlas
        */
        this.repositorioArticulo = new RepositorioArticulo();
        this.repositorioEmpleado = new RepositorioEmpleado();
    }
    
    public void guardarDatosPersonales(
            String nombre,
            String apellido,
            String dni,
            String sueldoBase
    ) {
        /*
        Validar datos. Si alguno es incorrecto, se va a lanzar una excepción y
        lo va a agarrar el presentador. El presentador, va a mostrar un mensaje
        de error indicando por qué falló.
        */
        this.validarNombre(nombre);
        this.validarApellido(apellido);
        this.validarDNI(dni);
        double sueldoBaseConvertido = this.parsearSueldoBase(sueldoBase);
        
        /*
        Si llegó hasta acá, entonces no se lanzó ninguna excepción. Por lo tanto,
        los datos ingresados por el usuario son válidos.
        */
        
        //Creemos el modelo para guardarlo en la Base de Datos
        Empleado empleado = new Empleado(nombre, apellido, dni, sueldoBaseConvertido);
        
        /*
        El objeto Empleado ya está creado. Ahora enviémoslo al repositorio así
        se guarda en la Base de Datos.
        */
        this.repositorioEmpleado.guardar(empleado);
    }
    
    private void validarNombre(String nombre) {
        /*
        Si la cantidad de caracteres es igual a 0, entonces el usuario no 
        introdujo ningún nombre. Si es así, lanzar una excepción para
        que lo agarre el Presentador y muestre el mensaje de error.
        */
        if (nombre.length() == 0) {
            throw new IllegalArgumentException("¡El nombre es vacío!");
        }
    }
    
    private void validarApellido(String apellido) {
        /*
        Si la cantidad de caracteres es igual a 0, entonces el usuario no 
        introdujo ningún apellido. Si es así, lanzar una excepción para
        que lo agarre el Presentador y muestre el mensaje de error.
         */
        if (apellido.length() == 0) {
            throw new IllegalArgumentException("¡El apellido es vacío!");
        }
    }
    
    private void validarDNI(String dni) {
        try {
            //Intento convertir el DNI en un número
            int dniParseado = Integer.parseInt(dni);
            
            //Se pudo convertir sin problemas. Verificar que es uno válido
            if (dniParseado <= 0) {
                //Dni inválido. Lanzar una excepción para indicar el error.
                throw new IllegalArgumentException("El DNI debe ser mayor a 0");
            }
        } catch (NumberFormatException exception) {
            /*
            Si al intentar convertir el DNI ocurre una excepción, significa que
            no es un número y, por tanto, es inválido. Lanzar una excepción
            para que la agarre el presentador.
            */
            
            throw new IllegalArgumentException("¡El DNI es inválido!");
        }
    }
    
    private double parsearSueldoBase(String sueldoBase) {
        try {
            //Intento convertir el sueldo base en un double
            double sueldoBaseParseado = Double.valueOf(sueldoBase);
            
            //Lo pude parsear (convertir) sin problemas. Verificar que sea mayor a 0
            if (sueldoBaseParseado < 0) {
                //El sueldo es menor a 0. Lanzar una excepción para indicar el error.
                throw new IllegalArgumentException("¡El sueldo base debe ser mayor a 0!");
            }
            
            //El sueldo base es correcto. Devolverlo.
            return sueldoBaseParseado;
        } catch (NumberFormatException exception) {
            /*
            Si al intentar convertir el sueldo base se lanza un NumberFormatException, 
            significa que no es un double y, por tanto, es inválido. 
            Lanzar una excepción para que la agarre el presentador.
             */

            throw new IllegalArgumentException("¡El sueldo base es inválido!");
        }
    }
    
    public double calcularSueldo()
    {
        //Obtener el empleado guardado previamente
        Empleado empleado = this.repositorioEmpleado.obtenerEmpleadoGuardado();
        
        /*
        Si el empleado es null, significa que no se guardo ninguno todavía.
        Lanzar una excepción así la agarra el presentador y muestra el mensaje de error.
        */
        if (empleado == null) {
            throw new IllegalArgumentException("¡No ha guardado ningún empleado todavía!");
        }
        
        //Obtener todos los articulos guardados
        ArrayList<Articulo> articulosGuardados = this.repositorioArticulo.obtenerArticulosGuardados();
        
        /*
        La forma de calcular el sueldo es igual al sueldo base, más el 5% de
        todas las ventas que hizo el empleado.
        */
        //Primero subar el sueldo base
        double sueldo = empleado.getSueldoBase();
        
        //Luego sumar el 5% de todas las ventas
        for (Articulo articulo : articulosGuardados) {
            sueldo += articulo.getCantidadVendida() * articulo.getPrecioUnitario() * 0.05;
        }
        
        //Devolver el sueldo total
        return sueldo;
    }
}

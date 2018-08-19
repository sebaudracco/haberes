/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import modelos.Empleado;

/**
 *
 * @author sebaudracco
 */
public class RepositorioEmpleado {
    /*
    Hacerlo static para simular que está en la Base de Datos.
    Si no lo hacemos así, cuando creemos diferentes objetos Repositorio,
    vamos a perder lo que ya está guardado.
    */
    private static Empleado empleadoGuardado;
    
    public void guardar(Empleado empleado)
    {
        /*
        Simulamos que estamos guardando en la base de datos al empleado, 
        aunque en realidad lo estamos haciendo en memoria.
        
        En un futuro nos vamos a conectar a la base de datos desde acá.
        */
        this.empleadoGuardado = empleado;
    }
    
    public Empleado obtenerEmpleadoGuardado()
    {
        /*
        Simulamos que estamos obteniendo el empleado guardado en la base
        de datos, aunque en realidad está guardado en memoria.
        
        En un futuro nos vamos a conectar a la base de datos desde acá.
        */
        return this.empleadoGuardado;
    }
}

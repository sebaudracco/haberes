/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import modelos.Articulo;
import repositorios.RepositorioArticulo;

/**
 *
 * @author sebaudracco
 */
public class ServicioArticulo {
    private RepositorioArticulo repositorioArticulo;

    public ServicioArticulo() {
        this.repositorioArticulo = new RepositorioArticulo();
    }
    
    public void guardarArticulo(String cantidadVendida, String precioUnitario)
    {
        //Los datos enviados son String. Convertirlos a los datos que correspondan
        
        //Obtener la cantidad vendida
        int cantidadVendidaConvertida = this.parsearCantidadVendida(cantidadVendida);
        
        //Obtener el precio unitario
        double precioUnitarioConvertido = this.parsearPrecioUnitario(precioUnitario);
        
        //Crear el modelo.
        Articulo articulo = new Articulo(cantidadVendidaConvertida, precioUnitarioConvertido);
        
        //Guardarlo en la Base de Datos usando el repositorio.
        this.repositorioArticulo.guardarArticulo(articulo);
    }
    
    private int parsearCantidadVendida(String cantidadVendida)
    {
        try {
            //Intento convertir la cantidad en un int
            int cantidadParseada = Integer.valueOf(cantidadVendida);

            //Lo pude parsear (convertir) sin problemas. Verificar que sea un número válido.
            if (cantidadParseada <= 0) {
                //La cantidad es inválida. Lanzar una excepción para indicar el error
                throw new IllegalArgumentException("La cantidad vendida debe ser mayor a 0");
            }
            
            //La cantidad vendida es correcta. Devolverla.
            return cantidadParseada;
        } catch (NumberFormatException excepcion) {
            /*
            Si al intentar convertir la cantidad vendida se lanza un 
            NumberFormatException, significa que no es un entero y, por tanto, 
            es inválido. Lanzar una excepción para que la agarre el presentador.
             */

            throw new IllegalArgumentException("¡La cantidad vendida es inválida!");
        }
    }
    
    private double parsearPrecioUnitario(String precioUnitario)
    {
        try {
            //Intento convertir el precio en un double
            double precioUnitarioParseado = Double.valueOf(precioUnitario);

            //Lo pude parsear (convertir) sin problemas. Verificar que sea un número válido.
            if (precioUnitarioParseado <= 0) {
                //El precio unitario es inválido. Lanzar una excepción para indicar el error.
                throw new IllegalArgumentException("El precio unitario debe ser mayor a 0");
            }
            
            //El precio unitario es correcto. Devolverlo.
            return precioUnitarioParseado;
        } catch (NumberFormatException excepcion) {
            /*
            Si al intentar convertir el precio unitario se lanza un 
            NumberFormatException, significa que no es un double y, por tanto, 
            es inválido. Lanzar una excepción para que la agarre el presentador.
            */

            throw new IllegalArgumentException("¡El precio unitario es inválido!");
        }
    }
}

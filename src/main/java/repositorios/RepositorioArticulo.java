/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.ArrayList;
import modelos.Articulo;

/**
 *
 * @author sebaudracco
 */
public class RepositorioArticulo {
    /*
     * Simulamos que lo guardamos en la Base de Datos poniendolos en un
     * ArrayList.
     */
    private static ArrayList<Articulo> articulosGuardados;

    public RepositorioArticulo() {
        this.articulosGuardados = new ArrayList<>();
    }
    
    public void guardarArticulo(Articulo articulo)
    {
        //Agregar al ArrayList el nuevo artículo. Simulamos que lo guardamos en la base de datos.
        this.articulosGuardados.add(articulo);
    }
    
    public ArrayList<Articulo> obtenerArticulosGuardados()
    {
        return this.articulosGuardados;
    }
}

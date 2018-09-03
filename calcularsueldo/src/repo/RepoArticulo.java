/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo;

import java.util.ArrayList;
import modelos.Articulos;
/**
 *
 * @author Usuario
 */
public class RepoArticulo {
        private static ArrayList<Articulos> articulosGuardados;

    public RepoArticulo() {
        this.articulosGuardados = new ArrayList<>();
    }
    
    public void guardarArticulo(Articulos articulos)
    {
        //Agregar al ArrayList el nuevo artículo. Simulamos que lo guardamos en la base de datos.
        this.articulosGuardados.add(articulos);
    }
    
    public ArrayList<Articulos> obtenerArticulosGuardados()
    {
        return this.articulosGuardados;
    }
}

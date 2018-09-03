/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author sebaudracco
 */
public class Articulos {
        private int cantidadVendida;
    
    private double precioUnitario;

    public Articulos(int cantidadVendida, double precioUnitario) {
        this.cantidadVendida = cantidadVendida;
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadVendida() {
        return this.cantidadVendida;
    }

    public double getPrecioUnitario() {
        return this.precioUnitario;
    }
}

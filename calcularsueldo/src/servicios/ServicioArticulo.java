
package servicios;
import modelos.Articulos;
import repo.RepoArticulo;
/**
 *
 * @author sebaudracco
 */
public class ServicioArticulo {
        private RepoArticulo repositorioArticulo;

    public ServicioArticulo() {
        this.repositorioArticulo = new RepoArticulo();
    }
    
    public void guardarArticulo(String cantidadVendida, String precioUnitario)
    {

        int cantidadVendidaConvertida = this.parsearCantidadVendida(cantidadVendida);
        double precioUnitarioConvertido = this.parsearPrecioUnitario(precioUnitario);

        Articulos articulos = new Articulos(cantidadVendidaConvertida, precioUnitarioConvertido);
        this.repositorioArticulo.guardarArticulo(articulos);
    }
    
    private int parsearCantidadVendida(String cantidadVendida)
    {
        try {
            int cantidadParseada = Integer.valueOf(cantidadVendida);

            if (cantidadParseada <= 0) {

                throw new IllegalArgumentException("Debes haber vendido ALGO! La cantidad vendida debe ser mayor a 0! Corrigelo Por Favor!");
            }

            return cantidadParseada;
        } catch (NumberFormatException excepcion) {

            throw new IllegalArgumentException("¡La cantidad vendida es inválida! Corrigelo Por Favor!");
        }
    }
    
    private double parsearPrecioUnitario(String precioUnitario)
    {
        try {

            double precioUnitarioParseado = Double.valueOf(precioUnitario);

            if (precioUnitarioParseado <= 0) {
                throw new IllegalArgumentException("El precio unitario debe ser mayor a 0 Corrigelo Por Favor!");
            }

            return precioUnitarioParseado;
        } catch (NumberFormatException excepcion) {
            throw new IllegalArgumentException("¡El precio unitario es inválido!!!!!Corrigelo Por Favor!");
        }
    }
}

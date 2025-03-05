package recursividadEDD.tallerCollecEjercicios.punto6;

import java.util.*;

class ListaProductos {
    private List<Producto> productos;

    public ListaProductos() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public boolean eliminarProducto(String codigo) {
        return productos.removeIf(p -> p.getCodigo().equals(codigo));
    }

    public Producto buscarPorCodigo(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public void ordenarPorNombreYPrecio() {
        productos.sort(Comparator.comparing(Producto::getNombre)
                .thenComparing(Producto::getPrecio));
    }

    public void mostrarInventario() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}

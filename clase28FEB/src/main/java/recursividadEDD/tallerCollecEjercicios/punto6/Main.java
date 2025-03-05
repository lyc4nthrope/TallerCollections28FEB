package recursividadEDD.tallerCollecEjercicios.punto6;

public class Main {
    public static void main(String[] args) {
        ListaProductos lista = new ListaProductos();

        lista.agregarProducto(new Producto("001", "Laptop", 800));
        lista.agregarProducto(new Producto("002", "Grafica", 700));
        lista.agregarProducto(new Producto("003", "Mouse", 20));
        lista.agregarProducto(new Producto("004", "Teclado", 50));
        lista.agregarProducto(new Producto("005", "Celular", 900));

        System.out.println("Inventario ordenado por nombre y precio:");
        lista.ordenarPorNombreYPrecio();
        lista.mostrarInventario();

        String codigoBuscar = "002";
        //String codigoBuscar = "009";
        Producto encontrado = lista.buscarPorCodigo(codigoBuscar);
        System.out.println("\nBuscando producto " + codigoBuscar + ":");
        if (encontrado != null) {
            System.out.print(encontrado);
            System.out.println("");
        } else {
            System.out.print("No encontrado\n");
        }

        String codigoEliminar = "001";
        //String codigoEliminar = "009";
        if (lista.eliminarProducto(codigoEliminar)) {
            System.out.print("\nProducto: " + codigoEliminar + " eliminado.\n");
        } else {
            System.out.print("\nProducto: " + codigoEliminar + " no encontrado / no eliminado.\n");
        }

        System.out.println("\nInventario después de eliminar:");
        lista.mostrarInventario();
    }
}

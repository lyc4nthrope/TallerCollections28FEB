package recursividadEDD.tallerCollecEjercicios.punto1;

import java.util.TreeSet;

public class Empresa {
    TreeSet<Producto> lista;

    public Empresa() {
        this.lista = new TreeSet<>();
    }

    public void agregarProduct(Producto producto){
        lista.add(producto);
    }

    public Producto buscarProduc(int x){
        Producto productoTemp = new Producto();
        productoTemp.setCodigo(x);
        if (lista.contains(productoTemp)){
            return lista.ceiling(productoTemp);
        }else {
            return null;
        }
    }
}

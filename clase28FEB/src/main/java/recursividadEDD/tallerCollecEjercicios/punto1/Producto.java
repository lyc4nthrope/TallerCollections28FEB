package recursividadEDD.tallerCollecEjercicios.punto1;

import java.util.Objects;

public class Producto implements Comparable<Producto> {
    private String nombre;
    private int codigo;
    private String categoria;

    public Producto(){

    }
    public Producto(String nombre, int codigo, String categoria) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return codigo == producto.codigo && Objects.equals(nombre, producto.nombre) && Objects.equals(categoria, producto.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, codigo, categoria);
    }

    @Override
    public int compareTo(Producto o) {
        return codigo - o.getCodigo();
    }
}

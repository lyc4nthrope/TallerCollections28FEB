package recursividadEDD.tallerCollecEjercicios.punto3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HastSet {
    private Set<Object> elementos;

    public HastSet() {
        elementos = new HashSet<>();
    }

    public void add(Object elemento) {
        if (elementos.contains(elemento)) {
            System.out.println("Elemento duplicado, no se agregó: " + elemento);
        } else {
            elementos.add(elemento);
            System.out.println("Elemento agregado: " + elemento);
        }
    }

    public Iterator<Object> iterator() {
        return elementos.iterator();
    }
}
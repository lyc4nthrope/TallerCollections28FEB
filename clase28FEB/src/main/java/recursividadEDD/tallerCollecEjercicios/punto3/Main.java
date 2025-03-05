package recursividadEDD.tallerCollecEjercicios.punto3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HastSet hastSet = new HastSet();
        hastSet.add("Manzana");
        hastSet.add("Banano");
        hastSet.add("Manzana");
        hastSet.add("Naranja");

        Iterator<Object> iterator = hastSet.iterator();

        System.out.println("Elementos de la lista:");
        while (iterator.hasNext()) {
            Object elemento = iterator.next();
            System.out.println(elemento);
        }
    }
}
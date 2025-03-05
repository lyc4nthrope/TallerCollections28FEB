package recursividadEDD.tallerCollecEjercicios.Punto11;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * En una aplicación de música, los usuarios pueden marcar canciones como favoritas.
Para garantizar que las canciones favoritas se mantengan en el orden en que fueron
añadidas sin permitir duplicados, se empleará un LinkedHashSet, el cual conservará
la secuencia de inserción y asegurará que no haya repeticiones.
 */
public class MainPunto11 {
    public static void main(String[] args) {

        LinkedList<String> canciones = new LinkedList<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        canciones.add("Take me to the beach");
        canciones.add("Not like us");
        canciones.add("Dead to me");
        canciones.add("Villain");
        canciones.add("Elf");

        añadirFavoritos(canciones, linkedHashSet);

    }

    public static void añadirFavoritos(LinkedList<String> canciones, LinkedHashSet<String> pila) {
        System.out.println("\nFavoritos agregados: \n" + pila);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nCanciones:\n" + canciones);
            System.out.print("\nAgregar a favoritos: ");
            String op = sc.nextLine();

            if (canciones.contains(op)) {
                pila.add(op);
                añadirFavoritos(canciones, pila);
            }else{
                System.out.println("\nCancion no encontrada");
            }
        }
    }
}

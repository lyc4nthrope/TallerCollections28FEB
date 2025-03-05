package recursividadEDD.tallerCollecEjercicios.Punto10;

import java.util.HashSet;
import java.util.Scanner;

/*
 * En un edificio con control de acceso, los empleados deben identificarse mediante un
código único para poder ingresar. Para gestionar estos accesos sin permitir
duplicados, se utilizará un HashSet, donde cada ID de empleado será almacenado y
verificado antes de permitir la entrada.
 */
public class MainPunto10 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        hashSet.add("5");

        verificarEntrada(hashSet);
    }

    public static void verificarEntrada(HashSet<String> hs) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese su código: ");
            String op = sc.nextLine();
            if (hs.contains(op)) {
                System.out.println("Acceso permitido");
            } else {
                System.out.println("Acceso denegado");
            }
        }

    }
}

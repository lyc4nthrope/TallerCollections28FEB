package recursividadEDD.tallerCollecEjercicios.Punto8;

import java.util.Scanner;
import java.util.Vector;

/*
 * Un editor de texto necesita registrar los cambios recientes para que el usuario pueda
deshacerlos cuando sea necesario. Para este caso, se utilizará un Vector, ya que
permite almacenar los cambios de forma segura en entornos concurrentes. Se
deberá implementar una función de "deshacer" que elimine el último cambio
realizado, asegurando que se mantenga un historial de modificaciones.
 */
public class MainPunto8 {
    public static void main(String[] args) {
        Vector<String> texto = new Vector<>();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Escribe lo que quieres: ");

            String txt = scanner.nextLine();
            texto.add(txt);
        }

        editarTxt(texto);
    }

    public static void editarTxt(Vector<String> texto) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Texto actual: " + texto.lastElement());
            System.out.print("1.Editar\n2.Deshacer\n3.Salir\n4.Ver todos los cambios\n\n");
            String op = scanner.nextLine();

            if (op.equals("1")) {
                String txt = reescribir();
                texto.add(txt);
                editarTxt(texto);
            } else if (op.equals("2")) {
                texto = deshacer(texto);
                editarTxt(texto);
            } else if (op.equals("3")) {
                System.exit(0);
            } else if (op.equals("4")) {
                System.out.println(texto);
                editarTxt(texto);
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
                editarTxt(texto);
            }
        }

    }

    public static String reescribir() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Escribe el nuevo texto: ");

            String txt = scanner.nextLine();

            return txt;
        }
    }

    public static Vector<String> deshacer(Vector<String> vector) {
        if (!vector.isEmpty()) {
            vector.remove(vector.size() - 1);
        }
        return vector;
    }

}

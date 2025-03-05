package recursividadEDD.tallerCollecEjercicios.Punto9;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/*
 * En la navegación web, los usuarios necesitan poder retroceder a páginas anteriores.
Para este propósito, se usará un Stack, que funciona como una pila LIFO (Last In,
First Out). Cada vez que el usuario visite una nueva página, esta se añadirá a la pila,
y cuando decida volver atrás, se eliminará la última página visitada para regresar a
la anterior.
 */
public class MainPunto9 {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        LinkedList<String> listaVistas = new LinkedList<>();

        listaVistas.add("home");
        listaVistas.add("ajustes");
        listaVistas.add("cuenta");
        listaVistas.add("productos");
        listaVistas.add("carrito");

        visitarPagina(listaVistas, pila);

    }

    public static void visitarPagina(LinkedList<String> vistas, Stack<String> pila) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!pila.isEmpty()) {
                System.out.println("\nPila: " + pila + "\n");

                System.out.println("Pagina actual: " + pila.peek());
                System.out.print("Botones: " + vistas + "\nIngrese cual desea visitar, (ingrese 0 para volver): ");
                String op = sc.nextLine();
                if (vistas.contains(op)) {
                    pila.push(op);
                    visitarPagina(vistas, pila);
                }
                if (op.equals("0")) {
                    pila.pop();
                    visitarPagina(vistas, pila);
                }

            }
            System.out.print("\nBotones: " + vistas + "\nIngrese cual desea visitar: ");
            String op = sc.nextLine();
            if (vistas.contains(op)) {
                pila.push(op);
                visitarPagina(vistas, pila);
            }
        }

        System.exit(0);

    }

}

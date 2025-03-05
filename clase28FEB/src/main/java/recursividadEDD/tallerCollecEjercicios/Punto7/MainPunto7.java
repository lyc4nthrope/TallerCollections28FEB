package recursividadEDD.tallerCollecEjercicios.Punto7;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

/*
 * En un banco, el sistema de atención al cliente debe manejar los turnos de manera
ordenada. Para lograrlo, se empleará una LinkedList (String), la cual permitirá
agregar clientes en la cola de espera, atender al primero en la lista y ofrecer una
funcionalidad especial para insertar clientes con urgencia al inicio de la cola sin
afectar el rendimiento.
 */
public class MainPunto7 {
    public static void main(String[] args) {
        Queue<String> clientes = new LinkedList<>();

        ingresar(clientes);
    }

    public static void ingresar(Queue<String> c) {

        Deque<String> clientesDeque = (Deque<String>) c;

        for (int i = 1; i <= 3; i++) {
            String cliente = JOptionPane.showInputDialog(null, "Urgencia o Normal?");

            if (cliente.equals("Urgencia")) {
                clientesDeque.addFirst(cliente);
            } else {
                clientesDeque.add(cliente);
            }
        }

        System.out.println("Clientes ingresados: " + c);
        atenderCliente(clientesDeque);

    }

    public static void atenderCliente(Deque<String> c) {

        if (c.isEmpty()) {
            int n = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Clientes atendidos, ingresando de nuevo?\n" + "1.Si\n2.No"));
            if (n == 1) {
                ingresar((Queue<String>) c);
            } else {
                System.exit(0);
            }

        }
        String cliente = c.removeFirst();
        System.out.println("Atendiendo al primer cliente en la cola...\n" + "Nivel: " + cliente);
        System.out.println("Clientes en espera: " + c);
        atenderCliente(c);

    }

}

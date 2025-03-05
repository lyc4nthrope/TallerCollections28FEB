package recursividadEDD.tallerCollecEjercicios.punto4;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add(new Tarea("Hacer la compra", 2));
        queue.add(new Tarea("Estudiar para el examen", 1));
        queue.add(new Tarea("Llamar al médico", 3));

        queue.procesarTareas();
    }
}
package recursividadEDD.tallerCollecEjercicios.punto4;

import java.util.PriorityQueue;

public class Queue {
    private java.util.Queue<Tarea> lista;

    public Queue() {
        this.lista = new PriorityQueue<>();
    }

    public void add(Tarea tarea) {
        lista.add(tarea);
        System.out.println("Tarea agregada: " + tarea.getDescripcion() + " (Prioridad: " + tarea.getPrioridad() + ")");
    }

    public void procesarTareas() {
        System.out.println("Procesando tareas en orden de prioridad:");
        while (!lista.isEmpty()) {
            Tarea tarea = lista.poll();
            System.out.println(tarea);
        }
    }
}
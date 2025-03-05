package recursividadEDD.tallerCollecEjercicios.P13;

import java.util.PriorityQueue;

public class P13 {
    public static void main(String[] args) {
        PriorityQueue<Paciente> pacientes = new PriorityQueue<>();
        pacientes.add(new Paciente("Juan", 15));
        pacientes.add(new Paciente("Rodrigo", 6));
        pacientes.add(new Paciente("March", 24));
        pacientes.add(new Paciente("Ana", 22));
        pacientes.add(new Paciente("Miguel", 10));
        pacientes.add(new Paciente("Angel", 12));

        while (!pacientes.isEmpty()) {
            Paciente paciente = pacientes.poll();
            System.out.println(paciente);
        }

    }
}

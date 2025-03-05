package recursividadEDD.tallerCollecEjercicios.punto4;

public class Tarea implements Comparable<Tarea> {
    private String descripcion;
    private int prioridad;

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tarea o) {
        return this.prioridad - o.getPrioridad();
    }

    @Override
    public String toString() {
        return "Tarea: " + descripcion + " (Prioridad: " + prioridad + ")";
    }
}
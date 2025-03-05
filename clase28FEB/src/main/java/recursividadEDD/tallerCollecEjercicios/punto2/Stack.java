package recursividadEDD.tallerCollecEjercicios.punto2;

public class Stack {
    private java.util.Stack<Object> pila;

    public Stack() {
        pila = new java.util.Stack<>();
    }

    public void push(Object elemento) {
        if (pila.isEmpty()) {
            pila.push(elemento);
        } else {
            Object cima = pila.peek();
            if (elemento.getClass().equals(cima.getClass())) {
                pila.push(elemento);
            } else {
                throw new IllegalArgumentException("El tipo del elemento no coincide con el tipo en la cima de la pila");
            }
        }
    }

    public void imprimirPila() {
        if (pila.isEmpty()) {
            System.out.println("No hay elementos en la pila");
            return;
        }
        System.out.println("Elementos de la pila");
        for (Object elemento : pila) {
            System.out.println(elemento);
        }
    }
}
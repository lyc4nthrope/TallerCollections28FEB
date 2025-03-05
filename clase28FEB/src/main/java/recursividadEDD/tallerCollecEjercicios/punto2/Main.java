package recursividadEDD.tallerCollecEjercicios.punto2;

public class Main {
    public static void main(String[] args) {
        Stack pila = new Stack();
        pila.push("hola");
        pila.push("que hace");
        try {
            pila.push(2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        pila.imprimirPila();
    }
}
package recursividadEDD.tallerCollecEjercicios.P14;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        ArrayDeque<String> mensajes = new ArrayDeque<>();
        mensajes.add("Hello world");mensajes.add("No hay nadie en casa");mensajes.add("Voy por leche");
        mensajes.add("Vamos a la fiesta");mensajes.add("Has tus tareas");

        int i;
        System.out.println("Desea enviar un mensaje? \n"+"Ingrese 1: Si \n"+"Ingrese 0: No");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        boolean b = false;
        if (i==1){
            b = true;
        }

        while (b){
            System.out.println("Ingrese el mensaje: ");
            String nombre = sc.next();
            mensajes.add(nombre);
            System.out.println("Desea enviar otro mensaje? \n"+"Ingrese 1: Si \n"+"Ingrese 0: No");
            i = sc.nextInt();
            if (i==1){
                b = true;
            }else {
                b = false;
            }
        }

        String[] recuperados = new String[10];

        for (int j = 0; j < 10; j++) {
            recuperados[j] = mensajes.pollLast();
            System.out.println(recuperados[j]);
        }
    }
}

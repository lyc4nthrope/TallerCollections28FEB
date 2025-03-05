package recursividadEDD.tallerCollecEjercicios.P12;

import java.util.Scanner;
import java.util.TreeSet;

public class P12 {
    public static void main(String[] args) {
        TreeSet<String> nombres = new TreeSet<>();

        nombres.add("Jose");nombres.add("Camilo");nombres.add("Alexis");nombres.add("Michelle");
        nombres.add("Jose");nombres.add("Juan");nombres.add("Cristhian");

        int i;
        System.out.println("Desea añadir un nombre? \n"+"Ingrese 1: Si \n"+"Ingrese 0: No");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        boolean b = false;
        if (i==1){
            b = true;
        }

        while (b){
            System.out.println("Ingrese el nombre: ");
            String nombre = sc.next();
            nombres.add(nombre);
            System.out.println("Desea añadir otro nombre? \n"+"Ingrese 1: Si \n"+"Ingrese 0: No");
            i = sc.nextInt();
            if (i==1){
                b = true;
            }else {
                b = false;
            }
        }

        System.out.println("Primer elemento (menor): " + nombres.first());
        System.out.println("Último elemento (mayor): " + nombres.last());
        System.out.println(nombres.toString());
    }
}

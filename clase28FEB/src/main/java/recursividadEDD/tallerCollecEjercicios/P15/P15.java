package recursividadEDD.tallerCollecEjercicios.P15;

import java.util.HashMap;
import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        HashMap<String, Long> hm = new HashMap<>();

        hm.put("Camilo", 3222222222L);hm.put("Cristhian", 3111111111L);hm.put("Alexis", 3333333333L);
        hm.put("Pedraza", 3444444444L);hm.put("Robinson", 3555555555L);hm.put("David", 3666666666L);
        hm.put("Daniel", 3777777777L);hm.put("Daniela", 3888888888L);

        System.out.println("Ingrese el nombre de la persona cuyo esta buscando");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        if (hm.containsKey(nombre)) {
            System.out.println("El numero de "+nombre+" es: "+hm.getOrDefault(nombre, 0L));
        }else {
            System.out.println("El numero de "+nombre+" no existe");
        }
    }
}

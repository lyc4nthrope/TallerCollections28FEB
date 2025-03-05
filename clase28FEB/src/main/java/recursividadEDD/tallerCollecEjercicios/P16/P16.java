package recursividadEDD.tallerCollecEjercicios.P16;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> map = new LinkedHashMap<>();

        map.put("Jabon", 2000.00);map.put("Carne", 15000.00);map.put("Leche",8000.00);map.put("Crema dental",5000.00);
        map.put("Comida gatos", 12000.00);

        int i;
        System.out.println("Desea añadir un producto? \n"+"Ingrese 1: Si \n"+"Ingrese 0: No");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        boolean b = false;
        if (i==1){
            b = true;
        }

        while (b){
            System.out.println("Ingrese el nombre del producto: ");
            String nombre = sc.next();
            System.out.println("Ingrese el valor: ");
            double valor = Double.parseDouble(sc.next());
            map.put(nombre, valor);
            System.out.println("Desea añadir otro producto? \n"+"Ingrese 1: Si \n"+"Ingrese 0: No");
            i = sc.nextInt();
            if (i==1){
                b = true;
            }else {
                b = false;
            }
        }

        double total = 0;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            total += entry.getValue();
        }

        System.out.println("El total de la compra es: " + total);
        System.out.println("La lista de compra es: "+ map.entrySet());
    }
}

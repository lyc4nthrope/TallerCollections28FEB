package recursividadEDD.tallerCollecEjercicios.punto5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        /**
         * para hashMap esta es la implementacion mas rapida, ya que no requiere orden
         * se usa para cuando uno busca la maxima eficiencia, cuando solo necesitas acceder o buscar los datos y
         * para eliminar y insertar datos
         */
        Map<String, Producto> hashMap = new HashMap<>();
        hashMap.put("P001", new Producto("Naranja", 6.4));
        hashMap.put("P002", new Producto("Banana", 4.3));
        hashMap.put("P003", new Producto("Manzana", 1.5));


        /**
         * en linkedHashMap esta es menos rapida ya que esta mantiene un orden pero en la inserccion
         * esta se eficiente para cualquier cosa donde el orden de llegada sera importante
         */
        Map<String, Producto> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("P004", new Producto("pera", 6.0));
        linkedHashMap.put("P005", new Producto("Platano", 7.0));
        linkedHashMap.put("P006", new Producto("Coco", 3.5));

        /**
         * para treeMap es la mas lenta ya que esta ordena de forma natural los valores
         * estas ordenan de manera personalizada en un orden natural, permite iterar sobre las
         * claves en un orden especifico, no permite que la lista tenga claves nulas
         */
        Map<Producto, String> treeMap = new TreeMap<>(Comparator.comparingDouble(Producto::getPrecio));
        treeMap.put(new Producto("Camaron", 7), "P007");
        treeMap.put(new Producto("uvas", 9), "P008");
        treeMap.put(new Producto("Aniz", 1.5), "P009");

        System.out.println("HashMap: " + hashMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("TreeMap ordenado por precio: " + treeMap);
    }
}
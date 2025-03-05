package recursividadEDD.tallerCollecEjercicios.P17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.TreeMap;

public class P17 {
    public static void main(String[] args) {
        TreeMap<LocalDate, String> map = new TreeMap<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        map.put(LocalDate.parse("02/04/2025",formatter), "Carrera");map.put(LocalDate.parse("06/07/2025",formatter), "Fiesta");
        map.put(LocalDate.parse("24/12/2025",formatter), "Navidad");map.put(LocalDate.parse("31/10/2025",formatter), "Halloween");
        map.put(LocalDate.parse("10/06/2025",formatter), "Partido");

        System.out.println("El siguiente evento es: " + map.ceilingEntry(LocalDate.now()));
        System.out.println(map);// el treeMap
    }
}

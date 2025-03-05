package recursividadEDD.tallerCollecEjercicios.punto1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el codigo a buscar: ");
        int x = sc.nextInt();

        Empresa empresa = new Empresa();
        empresa.agregarProduct(new Producto("nevera", 1223, "Electrodomesticos"));
        empresa.agregarProduct(new Producto("pc", 45313, "Tecnologia"));
        empresa.agregarProduct(new Producto("pan", 99883, "comida"));

        Producto productoXD = empresa.buscarProduc(x);

        if (productoXD != null){
            System.out.println("producto encontrado");
            System.out.println(productoXD);
        }else {
            System.out.println("producto con codigo "+x+" no se encontro");
        }
    }
}
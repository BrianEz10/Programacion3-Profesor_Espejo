package tp5;

import java.util.HashSet;
import java.util.Set;

public class MainTP5 {
    public static void main(String[] args) {
        Set<Producto> set = new HashSet<>();

        Producto p1 = new Producto("A001", "Mouse", 1000.0);
        Producto p2 = new Producto("A002", "Teclado", 2000.0);
        Producto p3 = new Producto("A001", "Mouse Genérico", 950.0);

        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println("HashSet de productos duplicados por codigo no se añaden:");
        System.out.println(set);
        System.out.println("Tamaño del HashSet: " + set.size());
    }
}
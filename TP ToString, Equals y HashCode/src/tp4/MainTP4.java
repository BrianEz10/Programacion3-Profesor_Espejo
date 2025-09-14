package tp4;

import java.util.ArrayList;
import java.util.List;

public class MainTP4 {
    public static void main(String[] args) {
        List<Producto> lista = new ArrayList<>();

        Producto p1 = new Producto("A001", "Mouse", 1000.0);
        Producto p2 = new Producto("A002", "Teclado", 2000.0);
        Producto p3 = new Producto("A001", "Mouse Genérico", 950.0);

        if (!lista.contains(p1)) lista.add(p1);
        if (!lista.contains(p2)) lista.add(p2);
        if (!lista.contains(p3)) lista.add(p3);

        System.out.println("Lista de productos:");
        System.out.println(lista);
    }
}
package TP4_Record;

import java.util.ArrayList;
import java.util.List;

public class MainTP4 {
    public static void main(String[] args) {
        Producto p1 = new Producto("A01", "Teclado", "Logitech", 5000.0);
        Producto p2 = new Producto("A02", "Mouse", "Razer", 7000.0);

        ProductoRecord r1 = new ProductoRecord(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductoRecord r2 = new ProductoRecord(p2.getCodigo(), p2.getNombre(), p2.getPrecio());

        List<ProductoRecord> lista = new ArrayList<>();
        lista.add(r1);
        lista.add(r2);

        System.out.println("Lista de ProductoRecord:");
        lista.forEach(System.out::println);
    }
}

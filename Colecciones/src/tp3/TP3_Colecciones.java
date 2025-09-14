package tp3;

import java.util.HashSet;
import java.util.Set;

public class TP3_Colecciones {
    public static void main(String[] args) {
        Set<Producto> productos = new HashSet<>();

        productos.add(new Producto(1, "Teclado"));
        productos.add(new Producto(2, "Mouse"));
        productos.add(new Producto(3, "Monitor"));
        productos.add(new Producto(1, "Teclado Duplicado")); // no se inserta

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
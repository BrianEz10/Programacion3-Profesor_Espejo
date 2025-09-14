package TP3_DTO_Clasico;

import java.util.ArrayList;
import java.util.List;

public class MainTP3 {
    public static void main(String[] args) {
        Producto producto1 = new Producto("001", "Libro", 2500.0, "Autor A");
        Producto producto2 = new Producto("002", "Revista", 1500.0, "Autor B");

        ProductoDTO dto1 = new ProductoDTO();
        dto1.setCodigo(producto1.getCodigo());
        dto1.setNombre(producto1.getNombre());
        dto1.setPrecio(producto1.getPrecio());

        ProductoDTO dto2 = new ProductoDTO(producto2.getCodigo(), producto2.getNombre(), producto2.getPrecio());

        List<ProductoDTO> lista = new ArrayList<>();
        lista.add(dto1);
        lista.add(dto2);

        System.out.println("Lista de ProductoDTO:");
        lista.forEach(System.out::println);
    }
}


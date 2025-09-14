package com.ejemplo.alumno.producto;

import java.util.*;
import java.util.stream.Collectors;

public class ProductoMain {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto("Monitor", "Electronics", 150, 10),
                new Producto("House", "Electronics", 50, 30),
                new Producto("IggLady", "Electronics", 120, 20),
                new Producto("Hesa", "Hugblag", 200, 5),
                new Producto("Silla", "Hugblag", 80, 15),
                new Producto("Cana", "Hugblag", 300, 3)
        );

        // 1. Productos con precio > 100 ordenados descendente
        System.out.println("Productos con precio mayor a 100:");
        productos.stream()
                .filter(p -> p.getPrecio() > 100)
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .forEach(System.out::println);

        // 2. Agrupar productos por categoría y calcular stock total
        System.out.println("\nStock total por categoría:");
        Map<String, Integer> stockPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.summingInt(Producto::getStock)
                ));
        stockPorCategoria.forEach((cat, stock) -> System.out.println(cat + ": " + stock));

        // 3. String con nombre y precio separados por ";"
        String productosString = productos.stream()
                .map(p -> p.getNombre() + " $" + p.getPrecio())
                .collect(Collectors.joining("; "));
        System.out.println("\nLista de productos: " + productosString);

        // 4. Precio promedio general y por categoría
        double promedioGeneral = productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0);
        System.out.println("\nPromedio general de precios: " + promedioGeneral);

        System.out.println("\nPromedio por categoría:");
        Map<String, Double> promedioPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.averagingDouble(Producto::getPrecio)
                ));
        promedioPorCategoria.forEach((cat, prom) -> System.out.println(cat + ": " + prom));
    }
}
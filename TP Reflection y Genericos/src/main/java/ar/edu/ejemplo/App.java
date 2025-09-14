package ar.edu.ejemplo;

import ar.edu.ejemplo.genericos.GenericosDemo;
import ar.edu.ejemplo.reflection.ReflectionDemo;

public class App {
    public static void main(String[] args) {
        System.out.println("=== EJECUTANDO TRABAJOS PRACTICOS ===\n");

        // Ejecuta demo de genericos (incluye Caja<T> y imprimirLista)
        ar.edu.ejemplo.genericos.GenericosDemo.ejecutarDemo();

        // Ejecuta demo de reflection
        ar.edu.ejemplo.reflection.ReflectionDemo.ejecutarDemo();

        System.out.println("=== TODOS LOS DEMOS FINALIZADOS ===");
    }
}

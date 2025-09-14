package ar.edu.ejemplo.genericos;

import java.util.ArrayList;
import java.util.List;

public class GenericosDemo {

    public static <T> void imprimirLista(List<T> lista) {
        for (T elemento : lista) {
            System.out.println(" - " + elemento);
        }
    }

    public static void ejecutarDemo() {
        System.out.println("=== DEMO GENERICOS ===");

        Caja<String> cajaString = new Caja<>("Hola mundo");
        Caja<Integer> cajaInteger = new Caja<>(42);

        System.out.println("Caja<String>: " + cajaString);
        System.out.println("Caja<Integer>: " + cajaInteger);

        System.out.println("\n-- Colección raw (sin genéricos) --");
        List listaRaw = new ArrayList();
        listaRaw.add("cadena");
        listaRaw.add(100);

        for (Object o : listaRaw) {
            System.out.println("Elemento (raw): " + o + " (class: " + o.getClass().getSimpleName() + ")");
        }

        System.out.println("\n-- Colecciones con genéricos --");
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("uno");
        listaCadenas.add("dos");

        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(10);
        listaEnteros.add(20);

        System.out.println("Imprimo lista de Strings usando imprimirLista:");
        imprimirLista(listaCadenas);

        System.out.println("Imprimo lista de Integers usando imprimirLista:");
        imprimirLista(listaEnteros);

        System.out.println("=== FIN DEMO GENERICOS ===\n");
    }
}

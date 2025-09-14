package tp4;

import java.util.HashMap;
import java.util.Map;

public class TP4_Colecciones {
    public static void main(String[] args) {
        Map<String, Curso> cursos = new HashMap<>();

        cursos.put("INF101", new Curso("Programación I", "Prof. García"));
        cursos.put("INF102", new Curso("Programación II", "Prof. López"));
        cursos.put("INF201", new Curso("Estructuras de Datos", "Prof. Martínez"));

        // Recuperar por clave
        System.out.println("Recuperando curso INF101: " + cursos.get("INF101"));

        // Recorrer el Map
        for (Map.Entry<String, Curso> entry : cursos.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " - Valor: " + entry.getValue());
        }
    }
}

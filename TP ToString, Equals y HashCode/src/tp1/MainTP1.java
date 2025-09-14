package tp1;

import java.util.ArrayList;
import java.util.List;

public class MainTP1 {
    public static void main(String[] args) {
        List<Estudiante> lista = new ArrayList<>();
        lista.add(new Estudiante("Rober", 45, "Arquitectura"));
        lista.add(new Estudiante("Ana", 32, "Moda"));
        lista.add(new Estudiante("Jorgito", 51, "Marketing"));

        System.out.println(lista);
    }
}

package tp2;

import java.util.ArrayList;

public class TP2_Colecciones {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Juan", 8.5));
        alumnos.add(new Alumno("Ana", 9.0));
        alumnos.add(new Alumno("Pedro", 6.0));
        alumnos.add(new Alumno("Ana", 9.0)); // duplicado permitido

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}

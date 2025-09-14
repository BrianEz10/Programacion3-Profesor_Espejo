package tp3;

import tp1.Estudiante;

public class MainTP3 {
    public static void main(String[] args) {
        Curso c1 = new Curso("Estructuras de Imagenes");
        c1.agregarEstudiante(new Estudiante("Kick", 22, "Ingeniería en Nuclear"));
        c1.agregarEstudiante(new Estudiante("Marco", 23, "Ingeniería en Sistemas"));

        Curso c2 = new Curso("Programación");
        c2.agregarEstudiante(new Estudiante("Joaco", 22, "Diseño"));

        System.out.println(c1);
        System.out.println(c2);
    }
}

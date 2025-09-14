package tp3;

import tp1.Estudiante;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Estudiante> listaDeEstudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.listaDeEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        listaDeEstudiantes.add(e);
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso: ").append(nombre).append(System.lineSeparator());
        sb.append("Cantidad de alumnos: ").append(listaDeEstudiantes.size()).append(System.lineSeparator());
        sb.append("Lista de estudiantes:").append(System.lineSeparator());
        for (Estudiante e : listaDeEstudiantes) {
            sb.append(" - ").append(e.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}


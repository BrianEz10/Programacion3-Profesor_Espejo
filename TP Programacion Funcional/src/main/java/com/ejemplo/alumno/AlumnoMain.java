package com.ejemplo.alumno;

import java.util.*;
import java.util.stream.Collectors;

public class AlumnoMain {
    public static void main(String[] args) {
        List<Alumno> alumnos = Arrays.asList(
                new Alumno("Ana", 8.5, "Java"),
                new Alumno("Luis", 6.0, "Java"),
                new Alumno("María", 9.0, "Python"),
                new Alumno("Pedro", 7.5, "Python"),
                new Alumno("Sofía", 4.0, "C#"),
                new Alumno("Carlos", 10.0, "Java")
        );

        // 1. Alumnos aprobados en mayúsculas y ordenados
        System.out.println("Alumnos aprobados:");
        alumnos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(a -> a.getNombre().toUpperCase())
                .sorted()
                .forEach(System.out::println);

        // 2. Promedio general de notas
        double promedio = alumnos.stream()
                .mapToDouble(Alumno::getNota)
                .average()
                .orElse(0);
        System.out.println("\nPromedio general: " + promedio);

        // 3. Agrupar alumnos por curso
        System.out.println("\nAlumnos agrupados por curso:");
        Map<String, List<Alumno>> agrupados = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));
        agrupados.forEach((curso, lista) -> {
            System.out.println(curso + " -> " + lista);
        });

        // 4. Los 3 mejores promedios
        System.out.println("\nTop 3 mejores alumnos:");
        alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::getNota).reversed())
                .limit(3)
                .forEach(System.out::println);
    }
}

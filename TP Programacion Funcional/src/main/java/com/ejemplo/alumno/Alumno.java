package com.ejemplo.alumno;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Alumno {
    private String nombre;
    private double nota;
    private String curso;
}

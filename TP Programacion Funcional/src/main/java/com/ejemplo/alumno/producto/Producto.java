package com.ejemplo.alumno.producto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;
}
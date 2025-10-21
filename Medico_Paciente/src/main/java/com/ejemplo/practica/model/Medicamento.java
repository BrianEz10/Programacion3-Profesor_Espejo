package com.ejemplo.practica.model;


import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Medicamento extends Base {

    private String nombre;
    private String descripcion;

    @ManyToMany(mappedBy = "medicamentos")
    private Set<Paciente> pacientes = new HashSet<>();

    public Medicamento() {}
    public Medicamento(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}

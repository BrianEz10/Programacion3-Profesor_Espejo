package com.ejemplo.practica.model;

import jakarta.persistence.*;

@Entity
public class HistorialClinico extends Base {

    @OneToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @Column(length = 2000)
    private String descripcion;

    public HistorialClinico() {}
    public HistorialClinico(Paciente paciente, String descripcion) {
        this.paciente = paciente;
        this.descripcion = descripcion;
    }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}

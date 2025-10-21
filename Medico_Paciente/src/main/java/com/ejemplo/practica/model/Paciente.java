package com.ejemplo.practica.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Paciente extends Base {

    private String nombre;
    private Integer edad;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    private ObraSocial obraSocial;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paciente", fetch = FetchType.LAZY)
    private HistorialClinico historialClinico;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name = "paciente_medicamento",
            joinColumns = @JoinColumn(name = "paciente_id"),
            inverseJoinColumns = @JoinColumn(name = "medicamento_id"))
    private Set<Medicamento> medicamentos = new HashSet<>();

    public Paciente() {}

    public Paciente(String nombre, Integer edad, ObraSocial obraSocial) {
        this.nombre = nombre;
        this.edad = edad;
        this.obraSocial = obraSocial;
    }


    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }

    public ObraSocial getObraSocial() { return obraSocial; }
    public void setObraSocial(ObraSocial obraSocial) { this.obraSocial = obraSocial; }

    public HistorialClinico getHistorialClinico() { return historialClinico; }
    public void setHistorialClinico(HistorialClinico historialClinico) { this.historialClinico = historialClinico; }

    public Set<Medicamento> getMedicamentos() { return medicamentos; }
    public void addMedicamento(Medicamento m) { medicamentos.add(m); }
}

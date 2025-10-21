package com.ejemplo.practica.model;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Consulta extends Base {

    private LocalDate fecha;
    private String diagnostico;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Medico medico;

    public Consulta() {}
    public Consulta(LocalDate fecha, String diagnostico, Paciente paciente, Medico medico) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.paciente = paciente;
        this.medico = medico;
    }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public Medico getMedico() { return medico; }
    public void setMedico(Medico medico) { this.medico = medico; }
}

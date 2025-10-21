package com.ejemplo.practica.service;

import com.ejemplo.practica.model.*;
import com.ejemplo.practica.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReportService {

    private final PacienteRepository pacienteRepository;
    private final ConsultaRepository consultaRepository;
    private final MedicamentoRepository medicamentoRepository;
    private final MedicoRepository medicoRepository;
    private final HistorialRepository historialRepository;

    public ReportService(PacienteRepository pacienteRepository,
                         ConsultaRepository consultaRepository,
                         MedicamentoRepository medicamentoRepository,
                         MedicoRepository medicoRepository,
                         HistorialRepository historialRepository) {
        this.pacienteRepository = pacienteRepository;
        this.consultaRepository = consultaRepository;
        this.medicamentoRepository = medicamentoRepository;
        this.medicoRepository = medicoRepository;
        this.historialRepository = historialRepository;
    }

    public void listPacientesMayoresDe30() {
        System.out.println("Pacientes mayores de 30:");
        List<Paciente> list = pacienteRepository.findByEdadGreaterThan(30);
        list.forEach(p -> System.out.println(" - " + p.getNombre() + " (" + p.getEdad() + ")"));
        System.out.println();
    }

    public void consultasPorMedicoNombre(String nombreMedico) {
        System.out.println("Consultas del médico: " + nombreMedico);
        List<Consulta> consultas = consultaRepository.findByMedicoNombre(nombreMedico);
        consultas.forEach(c -> System.out.println(" - Fecha: " + c.getFecha() + " Paciente: " + c.getPaciente().getNombre() + " Diagnóstico: " + c.getDiagnostico()));
        System.out.println();
    }

    public void medicamentosPorPacienteNombre(String nombrePaciente) {
        System.out.println("Medicamentos del paciente: " + nombrePaciente);
        List<Medicamento> meds = medicamentoRepository.findByPacienteNombre(nombrePaciente);
        meds.forEach(m -> System.out.println(" - " + m.getNombre() + ": " + m.getDescripcion()));
        System.out.println();
    }

    public void consultasConDiagnosticoYNombrePaciente() {
        System.out.println("Todas las consultas (diagnóstico + paciente):");
        List<Object[]> rows = consultaRepository.consultasDiagnosticoYNombrePaciente();
        rows.forEach(r -> System.out.println(" - Diagnóstico: " + r[0] + " | Paciente: " + r[1]));
        System.out.println();
    }

    public void promedioEdadPacientes() {
        Double avg = pacienteRepository.promedioEdad();
        System.out.println("Promedio de edad de pacientes: " + (avg != null ? String.format("%.2f", avg) : "N/A"));
        System.out.println();
    }

    public void pacientesPorObraSocial(String obraSocialNombre) {
        System.out.println("Pacientes con Obra Social: " + obraSocialNombre);
        pacienteRepository.findByObraSocialNombre(obraSocialNombre)
                .forEach(p -> System.out.println(" - " + p.getNombre() + " (" + p.getEdad() + ")"));
        System.out.println();
    }

    public void medicosConCantidadConsultas() {
        System.out.println("Médicos y cantidad de consultas:");
        List<Object[]> rows = consultaRepository.cantidadConsultasPorMedico();
        rows.forEach(r -> System.out.println(" - Médico: " + r[0] + " | Cantidad: " + r[1]));
        System.out.println();
    }

    public void pacientesConHistoriaClinica() {
        System.out.println("Pacientes con descripción de su historia clínica:");
        List<Paciente> pacientes = pacienteRepository.findAll();
        pacientes.forEach(p -> {
            String descripcion = p.getHistorialClinico() != null ? p.getHistorialClinico().getDescripcion() : "Sin historial";
            System.out.println(" - " + p.getNombre() + ": " + descripcion);
        });
        System.out.println();
    }
}

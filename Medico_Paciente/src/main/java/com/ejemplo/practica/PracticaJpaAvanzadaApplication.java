package com.ejemplo.practica;

import com.ejemplo.practica.service.ReportService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PracticaJpaAvanzadaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticaJpaAvanzadaApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ReportService reportService) {
        return args -> {
            System.out.println("=== Reportes Practica JPA Avanzada ===\n");

            reportService.listPacientesMayoresDe30();
            reportService.consultasPorMedicoNombre("Dr. Juan Perez");
            reportService.medicamentosPorPacienteNombre("Ana Gómez");
            reportService.consultasConDiagnosticoYNombrePaciente();
            reportService.promedioEdadPacientes();
            reportService.pacientesPorObraSocial("OSDE");
            reportService.medicosConCantidadConsultas();
            reportService.pacientesConHistoriaClinica();
        };
    }
}

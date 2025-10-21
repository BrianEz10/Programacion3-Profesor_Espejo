package com.ejemplo.practica.repository;


import com.ejemplo.practica.model.Consulta;
import com.ejemplo.practica.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    List<Consulta> findByMedicoNombre(String nombre); // Spring Data name property path

    @Query("SELECT c FROM Consulta c WHERE c.medico.id = :medicoId")
    List<Consulta> findByMedicoId(Long medicoId);

    @Query("SELECT c.diagnostico, c.paciente.nombre FROM Consulta c")
    List<Object[]> consultasDiagnosticoYNombrePaciente();

    @Query("SELECT m.nombre, COUNT(c) FROM Medico m LEFT JOIN Consulta c ON c.medico = m GROUP BY m.id, m.nombre")
    List<Object[]> cantidadConsultasPorMedico();
}

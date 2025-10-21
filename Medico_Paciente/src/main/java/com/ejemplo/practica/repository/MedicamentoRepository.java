package com.ejemplo.practica.repository;


import com.ejemplo.practica.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {

    @Query("SELECT m FROM Medicamento m JOIN m.pacientes p WHERE p.nombre = :nombrePaciente")
    List<Medicamento> findByPacienteNombre(String nombrePaciente);
}

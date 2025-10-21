package com.ejemplo.practica.repository;


import com.ejemplo.practica.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    List<Paciente> findByEdadGreaterThan(Integer edad);

    @Query("SELECT p FROM Paciente p WHERE p.obraSocial.nombre = :nombre")
    List<Paciente> findByObraSocialNombre(String nombre);

    @Query("SELECT AVG(p.edad) FROM Paciente p")
    Double promedioEdad();
}

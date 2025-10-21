package com.ejemplo.practica.repository;


import com.ejemplo.practica.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    Medico findByNombre(String nombre);
}

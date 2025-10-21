package com.ejemplo.practica.repository;


import com.ejemplo.practica.model.HistorialClinico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistorialRepository extends JpaRepository<HistorialClinico, Long> {
}

package com.ejemplo.cursos.service;

import com.ejemplo.cursos.entity.Estudiante;
import com.ejemplo.cursos.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> getEstudiantes() {
        return estudianteRepository.findAll();
    }

    public Estudiante saveEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }
}
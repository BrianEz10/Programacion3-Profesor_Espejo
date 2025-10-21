package com.ejemplo.cursos.service;

import com.ejemplo.cursos.entity.Profesor;
import com.ejemplo.cursos.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    public List<Profesor> getProfesores() {
        return profesorRepository.findAll();
    }

    public Profesor saveProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }
}
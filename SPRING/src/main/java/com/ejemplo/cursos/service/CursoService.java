package com.ejemplo.cursos.service;

import com.ejemplo.cursos.entity.Curso;
import com.ejemplo.cursos.entity.Estudiante;
import com.ejemplo.cursos.entity.Profesor;
import com.ejemplo.cursos.repository.CursoRepository;
import com.ejemplo.cursos.repository.EstudianteRepository;
import com.ejemplo.cursos.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;
    @Autowired
    private ProfesorRepository profesorRepository;
    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Curso> getCursos() {
        return cursoRepository.findAll();
    }

    public Curso saveCurso(Curso curso) {
        if (curso.getProfesor() != null && curso.getProfesor().getId() != null) {
            Profesor p = profesorRepository.findById(curso.getProfesor().getId())
                    .orElseThrow(() -> new RuntimeException("Profesor no encontrado con id: " + curso.getProfesor().getId()));
            curso.setProfesor(p);
        } else {
            throw new RuntimeException("Se requiere un profesor existente para crear el curso");
        }
        return cursoRepository.save(curso);
    }

    public Curso assignEstudianteACurso(Long cursoId, Long estudianteId) {
        Curso curso = cursoRepository.findById(cursoId)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));

        Estudiante estudiante = estudianteRepository.findById(estudianteId)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));

        curso.getEstudiantes().add(estudiante);

        return cursoRepository.save(curso);
    }
}
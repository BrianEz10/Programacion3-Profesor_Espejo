package com.ejemplo.cursos.controller;

import com.ejemplo.cursos.entity.Curso;
import com.ejemplo.cursos.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> getCursos() {
        return cursoService.getCursos();
    }

    @PostMapping
    public Curso createCurso(@RequestBody Curso curso) {
        return cursoService.saveCurso(curso);
    }

    @PostMapping("/{cursoId}/agregar-estudiante/{estudianteId}")
    public Curso assignEstudiante(@PathVariable Long cursoId, @PathVariable Long estudianteId) {
        return cursoService.assignEstudianteACurso(cursoId, estudianteId);
    }
}
package com.ejemplo.cursos.controller;

import com.ejemplo.cursos.entity.Estudiante;
import com.ejemplo.cursos.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> getEstudiantes() {
        return estudianteService.getEstudiantes();
    }

    @PostMapping
    public Estudiante createEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteService.saveEstudiante(estudiante);
    }
}
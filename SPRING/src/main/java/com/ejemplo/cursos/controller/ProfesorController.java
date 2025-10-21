package com.ejemplo.cursos.controller;

import com.ejemplo.cursos.entity.Profesor;
import com.ejemplo.cursos.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    @GetMapping
    public List<Profesor> getProfesores() {
        return profesorService.getProfesores();
    }

    @PostMapping
    public Profesor createProfesor(@RequestBody Profesor profesor) {
        return profesorService.saveProfesor(profesor);
    }
}
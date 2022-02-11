package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.AlumnoModel;
import com.example.demo.services.AlumnoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/alumno")
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    @GetMapping()
    public ArrayList<AlumnoModel> obtenerAlumnos(){
        return alumnoService.obtenerAlumnos();
    }

    @PostMapping()
    public AlumnoModel guardarAlumno(@RequestBody AlumnoModel alumno){
        return this.alumnoService.guardarAlumno(alumno);
    }

    @GetMapping( path = "/{id}")
    public Optional<AlumnoModel> obtenerAlumnoPorId(@PathVariable("id") Long id) {
        return this.alumnoService.obtenerPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.alumnoService.eliminarAlumno(id);
        if (ok){
            return "Se eliminó el alumno con id " + id;
        }else{
            return "No pudo eliminar el alumno con id" + id;
        }
    }

}
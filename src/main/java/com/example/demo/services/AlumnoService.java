package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.AlumnoModel;
import com.example.demo.repositories.AlumnoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository alumnoRepository;
    
    public ArrayList<AlumnoModel> obtenerAlumnos(){
        return (ArrayList<AlumnoModel>) alumnoRepository.findAll();
    }

    public AlumnoModel guardarAlumno(AlumnoModel alumno){
        return alumnoRepository.save(alumno);
    }

    public Optional<AlumnoModel> obtenerPorId(Long id){
        return alumnoRepository.findById(id);
    }

    public boolean eliminarAlumno(Long id) {
        try{
            alumnoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


    
}
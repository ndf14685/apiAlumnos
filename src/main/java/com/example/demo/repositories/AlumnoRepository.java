package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.AlumnoModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository <AlumnoModel, Long> {
    //public abstract ArrayList<AlumnoModel> findByPrioridad(Integer prioridad);
    //public abstract ArrayList<AlumnoModel> gAlumnoModels(Integer prioridad);
}
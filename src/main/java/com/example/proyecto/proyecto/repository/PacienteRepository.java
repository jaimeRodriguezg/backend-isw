package com.example.proyecto.proyecto.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proyecto.proyecto.entity.Paciente;

@Repository("repositorypaciente")
public interface PacienteRepository extends JpaRepository<Paciente, Serializable> {

    public abstract Paciente findById(long id);
	
    public abstract List<Paciente> findByNombre(String nombre);
    
    public abstract List<Paciente> findByRut(String rut);

    public abstract List<Paciente> findByDiagnostico(String diagnostico);

	public abstract List<Paciente> findAll();
}
package com.example.proyecto.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.proyecto.proyecto.entity.Paciente;
import com.example.proyecto.proyecto.repository.PacienteRepository;

@Service("servicepaciente")
public class PacienteService {
    
    @Autowired
    @Qualifier("repositorypaciente")
    private PacienteRepository repositorio;

    public boolean crear(Paciente paciente){
        if (    paciente.getNombre() == null || paciente.getCodigo() == null ||paciente.getDiagnostico() == null 
            || paciente.getEmail() == null   ||  paciente.getFechaCreacion() == null  || paciente.getFechaNacimiento() == null
            || paciente.getRut() == null    ||  paciente.getSexo() == null|| paciente.getTelefono() == null){ 
            return false;
        }else{
            
            try{
                repositorio.save(paciente);
                return true;
            } catch(Exception e){
                return false;
            }
        }
    }

    public boolean actualizar(long id){
        try{
            Paciente paciente = repositorio.findById(id);
            repositorio.save(paciente);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    
    public boolean borrar(long id){
        try{
        	Paciente paciente = repositorio.findById(id);
            repositorio.delete(paciente);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Paciente obtenerporId(long id){
        return repositorio.findById(id);
        

    }

    public List<Paciente> obtenerAll(){
        return repositorio.findAll();
    }
    
    public List<Paciente> obtenerporNombre(String nombre) {
    	return repositorio.findByNombre(nombre);
    }

    public List<Paciente> obtenerporRut(String rut) {
    	return repositorio.findByRut(rut);
    }

    public List<Paciente> obtenerporDiagnostico(String diagnostico) {
    	return repositorio.findByDiagnostico(diagnostico);
    }  

}


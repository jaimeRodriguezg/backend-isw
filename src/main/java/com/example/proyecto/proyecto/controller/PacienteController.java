package com.example.proyecto.proyecto.controller;



import java.util.List;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.proyecto.proyecto.entity.Paciente;
import com.example.proyecto.proyecto.service.PacienteService;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class PacienteController {
    
    @Autowired
	@Qualifier("servicepaciente")
    PacienteService servicio;
    
    @GetMapping("/paciente/id")
	public Paciente obtenerporId(@RequestParam(name="id", required = true ) long id) {
		return servicio.obtenerporId(id);
    }
    
    @GetMapping("/paciente/nombre")
	public List<Paciente> obtenerporNombre(@RequestParam(name="nombre", required = true) String nombre) {
		return servicio.obtenerporNombre(nombre);
    }
    
    @GetMapping("/pacientes")
	public List<Paciente> getAllPaciente(){
		return servicio.obtenerAll();
    }
    
    @PostMapping("/paciente")
	public boolean agregarPaciente(@RequestBody @Valid Paciente paciente) {
		return servicio.crear(paciente);
    }
    
    @PutMapping("/paciente")
	public boolean actualizarPaciente(@RequestBody @Valid Paciente paciente) {
		return servicio.actualizar(paciente);
    }
    
    @DeleteMapping("/paciente/{id}")
	public boolean borrarPaciente(@PathVariable("id") long id) {
		return servicio.borrar(id);
	}


}
	



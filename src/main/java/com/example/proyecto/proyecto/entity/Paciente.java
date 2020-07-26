package com.example.proyecto.proyecto.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paciente")
public class Paciente {

    @Id
    @GeneratedValue
    @Column(name="id_paciente")
    private long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="rut")
    private String rut;
    @Column(name="codigo")
	private String codigo;
    @Column(name="fechaNacimiento")
    private Date fechaNacimiento;
    @Column(name="sexo")
    private String sexo;
    @Column(name="email")
    private String email;
    @Column(name="telefono")
    private String telefono;
    @Column(name="fechaCreacion")
    private Date fechaCreacion;
    @Column(name="diagnostico")
	private String diagnostico;
    
    
    public Paciente () {

    }

    public Paciente (long id, String nombre, String rut, Date fechaNacimiento, 
                    String sexo, String email, String telefono,
                    Date fechaCreacion, String diagnostico, String codigo
                    ) 
                    {
                        this.id= id;
                        this.nombre= nombre;
                        this.rut= rut;
                        this.fechaNacimiento= fechaNacimiento;
                        this.sexo= sexo;
                        this.email= email;
                        this.telefono= telefono;
                        this.fechaCreacion= fechaCreacion;
                        this.diagnostico= diagnostico;
                        this.codigo= codigo;   
                    }
        
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public String getDiagnostico() {
        return diagnostico;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    


}





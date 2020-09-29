package com.ejemplo.springboot.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="supervisor")
public class Supervisor {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSupervisor;
	
	
	@Size(min = 3, message = "Nombre debe tener minimo 3 caracteres")
	@Column(name = "nombre", nullable = false, length = 70)
	private String nombreSupervisor;
	
	
	@Size(min = 3, max = 150, message = "Dirección debe tener minimo 3 caracteres")
	@Column(name = "direccion", nullable = true, length = 150)
	private String dirSupervisor;
	
	
	@Size(min = 9, max = 9, message = "Telefono debe tener 9 caracteres")
	@Column(name = "telefono", nullable = true, length = 9)
	private String telSupervisor;


	public Integer getIdSupervisor() {
		return idSupervisor;
	}


	public void setIdSupervisor(Integer idSupervisor) {
		this.idSupervisor = idSupervisor;
	}


	public String getNombreSupervisor() {
		return nombreSupervisor;
	}


	public void setNombreSupervisor(String nombreSupervisor) {
		this.nombreSupervisor = nombreSupervisor;
	}


	public String getDirSupervisor() {
		return dirSupervisor;
	}


	public void setDirSupervisor(String dirSupervisor) {
		this.dirSupervisor = dirSupervisor;
	}


	public String getTelSupervisor() {
		return telSupervisor;
	}


	public void setTelSupervisor(String telSupervisor) {
		this.telSupervisor = telSupervisor;
	}
	

}

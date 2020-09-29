package com.ejemplo.springboot.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="marca")
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMarca;
	
	@Size(min = 3, max = 300, message = "Descripción debe tener minimo 3 caracteres")
	@Column(name = "descripcion", length = 300, nullable = true)
	private String descripcion;
	
	@Size(min = 3, max = 300, message = "Dirección debe tener minimo 3 caracteres")
	@Column(name = "direccion", length = 300, nullable = true)
	private String direccion;
	
	@Size(min = 3, max = 50, message = "Ciudad debe tener minimo 3 caracteres")
	@Column(name = "ciudad", length = 50, nullable = true)
	private String ciudad;

	public Integer getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	

}

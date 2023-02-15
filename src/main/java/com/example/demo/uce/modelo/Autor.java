package com.example.demo.uce.modelo;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="autor")
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_sec")
	@SequenceGenerator(name = "auto_sec", sequenceName = "auto_sec", allocationSize = 1)
	@Column(name="auto_id")
	private Integer id;
	@Column(name="auto_nombre")
	private String nombre;
	 
	@ManyToMany(mappedBy = "autores")
	private List<Libro> libros;
	
	
	
	public List<Libro> getLibros() {
		return libros;
	}
	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}

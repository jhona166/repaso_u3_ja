package com.example.demo.uce.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
//Principal
@Entity
@Table(name="libro")
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libr_sec")
	@SequenceGenerator(name = "libr_sec", sequenceName = "libr_sec", allocationSize = 1)
	@Column(name="libr_id")
	private Integer id;
	@Column(name="libr_nombre")
	private String nombre;
	@Column(name="libr_editorial")
	private String editorial;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
	name="libro_autor",
	joinColumns = @JoinColumn(name="liau_id_libro"),//PK
	inverseJoinColumns  = @JoinColumn(name= "liau_id_autor")
			)
	
	
	private List<Autor> autores;
	
	
	
	
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
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
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
	
}

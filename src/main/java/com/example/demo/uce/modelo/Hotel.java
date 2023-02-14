package com.example.demo.uce.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hote_sec")
	@SequenceGenerator(name = "hote_sec", sequenceName = "hote_sec", allocationSize = 1)
	@Column(name="hote_id")
	private Integer id;
	@Column(name="hote_nombre")
	private String nombre;
	@Column(name="hote_direccion")
	private String direccion;
    @Column(name="hote_nombre_primero")
    
    @OneToMany(mappedBy = "hotel",cascade=CascadeType.ALL)
    private List<Habitacion> habitaciones;
    
    
    
    
 
	
	
	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}
	private String nombrePrimero;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNombrePrimero() {
		return nombrePrimero;
	}
	public void setNombrePrimero(String nombrePrimero) {
		this.nombrePrimero = nombrePrimero;
	}
    
}   

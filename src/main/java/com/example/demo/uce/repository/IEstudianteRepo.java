package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.DTO.EstudianteDTO;

public interface IEstudianteRepo {
	public void insertar(Estudiante estudiante);
	public Estudiante buscarPorNombreQuery(String apellido);
	//Typed Query
	public Estudiante buscarPorNombreTypedQuery(String nombre);
	//Named Query
	public Estudiante buscarPorCedulaNamedQuery(String cedula);
	//Combinado
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre);
	//Native
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	//Combinado Native Typed Named 
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre);
	//DTO
	public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre);
	
}

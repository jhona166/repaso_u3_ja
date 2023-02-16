package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteService {
	public void crear(Estudiante estudiante);
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
	
}

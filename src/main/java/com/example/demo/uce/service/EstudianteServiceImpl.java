package com.example.demo.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.DTO.EstudianteDTO;
import com.example.demo.uce.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
	@Autowired
	private IEstudianteRepo iEstudianteRepo;

	@Override
	public void crear(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.iEstudianteRepo.insertar(estudiante);
	}

	@Override
	public Estudiante buscarPorNombreQuery(String apellido) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreQuery(apellido);

	
	}

	@Override
	public Estudiante buscarPorNombreTypedQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreTypedQuery(nombre);
	}

	@Override
	public Estudiante buscarPorCedulaNamedQuery(String cedula) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorCedulaNamedQuery(cedula);
	}

	@Override
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreNamedQueryTyped(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreNativeQuery(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreNativeQueryTypedNamed(nombre);
	}

	@Override
	public EstudianteDTO buscarPorNombreTypedQueryDTO(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreTypedQueryDTO( nombre);
	}

	@Override
	public Estudiante buscarPorNombreQueryTypedCriteria(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreQueryTypedCriteria(nombre);
	}

	@Override
	public List<Estudiante> buscarPorNombreCriteriaAndOr(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreCriteriaAndOr( nombre,  apellido, genero);
	}

}

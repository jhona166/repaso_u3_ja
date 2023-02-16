package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo{
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante buscarPorNombreQuery(String apellido) {
		// TODO Auto-generated method stub
		//select * from estudiante where estu_nombre = 'Sandra'  ----SQL
		//select e from estud iante e where e.nombre=:datoNombre  ----SPQL
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.apellido=:datoApellido");
		jpqlQuery.setParameter("datoApellido", apellido);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreTypedQuery(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery
				("select e from Estudiante e where e.nombre=:datoNombre", Estudiante.class);
		myTypedQuery.setParameter("datoNombre",nombre);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCedulaNamedQuery(String cedula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorCedula");
		myQuery.setParameter("datoCedula", cedula);
		return (Estudiante) myQuery.getSingleResult();
		
	}

	@Override
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery(
				"Estudiante.buscarPorNombre", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = 
				this.entityManager.createNativeQuery("select * from estudiante where estu_nombre=:datoNombre",Estudiante.class);//Sentencia SQL
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();		
	}

	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = 
				this.entityManager.createNamedQuery("Estudiante.buscarPorNombre",Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
		
		
	}

}

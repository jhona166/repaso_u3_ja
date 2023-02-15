package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Libro;

public interface ILibroService {
	public void crear(Libro libro);
	public void actualizar(Libro libro);
	public Libro buscar(Integer id);
	public void borrar(Integer id);
}

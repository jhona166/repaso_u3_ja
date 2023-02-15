package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Libro;

public interface ILibroRepo {
		public void insertar(Libro libro);
		public void actualizar(Libro libro);
		public Libro buscar(Integer id);
		public void eliminar(Integer id);
		
}

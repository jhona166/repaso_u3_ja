package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.modelo.Libro;
import com.example.demo.uce.service.IHotelService;
import com.example.demo.uce.service.ILibroService;

@SpringBootApplication
public class RepasoUnidad3JaApplication implements CommandLineRunner {
	@Autowired 
	private IHotelService iHotelService;
	@Autowired
	private ILibroService iLibroService;
	public static void main(String[] args) {
		SpringApplication.run(RepasoUnidad3JaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Hotel hotel = new Hotel();
//		hotel.setNombre("Hilton");
//		hotel.setDireccion("Av Patria");
//		hotel.setNombrePrimero("Hotel Hilton");
//		
//		List<Habitacion> habitaciones = new ArrayList<>();
//		Habitacion habitacion = new Habitacion();
//		habitacion.setNumero("A1");
//		habitacion.setTipo("VIP");
//		habitacion.setHotel(hotel);
//		habitaciones.add(habitacion);
//		
//		Habitacion habitacion1 = new Habitacion();
//		habitacion1.setNumero("A2");
//		habitacion1.setTipo("VIP");
//		habitacion1.setHotel(hotel);
//		habitaciones.add(habitacion1);
//		
//		hotel.setHabitaciones(habitaciones);
//		
//		this.iHotelService.crear(hotel);
		
		
		List<Libro> libros= new ArrayList<>();
		Libro libro = new Libro();
		libro.setNombre("Analisis Numerico");
		libro.setEditorial("Los Andes");
		libros.add(libro);
		
		Libro libro1 = new Libro();
		libro1.setNombre("Fisica Vectorial");
		libro1.setEditorial("Pearson");
		libros.add(libro1);

		
		List<Autor> autores = new ArrayList<>();
		Autor autor = new Autor();
		autor.setNombre("Galindo");
		autores.add(autor);
		Autor autor1 = new Autor();
		autor1.setNombre("Lara");
		autores.add(autor1);
		libro.setAutores(autores);
		autor1.setLibros(libros);
		autor.setLibros(libros);
		this.iLibroService.crear(libro);
		this.iLibroService.crear(libro1);
		
		
	}

}

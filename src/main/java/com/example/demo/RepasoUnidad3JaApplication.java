package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class RepasoUnidad3JaApplication implements CommandLineRunner {
	@Autowired 
	private IHotelService iHotelService;
	public static void main(String[] args) {
		SpringApplication.run(RepasoUnidad3JaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Hotel hotel = new Hotel();
		hotel.setNombre("Hilton");
		hotel.setDireccion("Av Patria");
		hotel.setNombrePrimero("Hotel Hilton");
		
		List<Habitacion> habitaciones = new ArrayList<>();
		Habitacion habitacion = new Habitacion();
		habitacion.setNumero("A1");
		habitacion.setTipo("VIP");
		habitacion.setHotel(hotel);
		habitaciones.add(habitacion);
		
		Habitacion habitacion1 = new Habitacion();
		habitacion1.setNumero("A2");
		habitacion1.setTipo("VIP");
		habitacion1.setHotel(hotel);
		habitaciones.add(habitacion1);
		
		hotel.setHabitaciones(habitaciones);
		
		this.iHotelService.crear(hotel);
		
	}

}

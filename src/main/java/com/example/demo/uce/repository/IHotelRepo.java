package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Hotel;

public interface IHotelRepo {
	public void insertar(Hotel hotel);
	public void actualizar(Hotel hotel);
	public Hotel buscar(Integer id);
	public void eliminar(Integer id);

}

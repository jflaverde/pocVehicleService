package com.vehiculos.wep.app.services;

import java.util.List;

import com.vehiculos.wep.app.entities.Vehiculo;

public interface IVehiculoService {

	public List<Vehiculo> findByTipo(String tipo);
	public Vehiculo findById(int id);
	public void createVehiculo(Vehiculo vehiculo);
}

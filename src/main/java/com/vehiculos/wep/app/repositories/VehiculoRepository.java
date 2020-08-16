package com.vehiculos.wep.app.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.vehiculos.wep.app.entities.Vehiculo;

public interface VehiculoRepository extends MongoRepository<Vehiculo, Integer> {

	public Vehiculo findById(int id);
	public List<Vehiculo> findByTipo(String tipo);
}

package com.vehiculos.wep.app.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiculos.wep.app.entities.Vehiculo;
import com.vehiculos.wep.app.repositories.VehiculoRepository;
import com.vehiculos.wep.app.services.IVehiculoService;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private VehiculoRepository vehiculoRepository;
	
	public List<Vehiculo> findByTipo(String tipo){
		return vehiculoRepository.findByTipo(tipo);
	}

	@Override
	public Vehiculo findById(int id) {
		return vehiculoRepository.findById(id);
	}

	@Override
	public void createVehiculo(Vehiculo vehiculo) {
		vehiculoRepository.save(vehiculo);
	}
	
}

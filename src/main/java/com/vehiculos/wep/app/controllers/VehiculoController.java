package com.vehiculos.wep.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehiculos.wep.app.entities.Vehiculo;
import com.vehiculos.wep.app.services.IVehiculoService;

@RestController
@RequestMapping("vehiculo")
public class VehiculoController {

	@Autowired
	private IVehiculoService vehiculoService;
	
	@GetMapping("/tipo/{tipo}")
	public List<Vehiculo> getByTipo(@PathVariable String tipo){
		return vehiculoService.findByTipo(tipo);
	}
	
	@GetMapping("/{id}")
	public Vehiculo getById(@PathVariable int id) {
		return vehiculoService.findById(id);
	}
	
	@PostMapping
	public void createVehiculo(@RequestBody Vehiculo vehiculo) {
		vehiculoService.createVehiculo(vehiculo);
	}
}

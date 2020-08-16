package com.vehiculos.wep.app.entities;


import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor
public class Vehiculo {

	@Id
	private int id;
	private String tipo;
	private String funcionalidad;
	private double peso;
	
	
}

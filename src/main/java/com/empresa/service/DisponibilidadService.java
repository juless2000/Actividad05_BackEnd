package com.empresa.service;

import java.util.List;


import com.empresa.entity.Disponibilidad;

public interface DisponibilidadService {
	
	public Disponibilidad insertaActualizaDisponibilidad(Disponibilidad obj);
	
	public List<Disponibilidad> listaDisponibilidad();

}

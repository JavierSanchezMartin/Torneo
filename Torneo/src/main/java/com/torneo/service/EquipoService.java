package com.torneo.service;

import java.util.List;

import com.torneo.model.Equipo;

public interface EquipoService {

	public Boolean anadirEquipo(Equipo equipo);
	
	public List<Equipo> listarEquipos();
	
	public Equipo consultarEquipo(int idEquipo);
}

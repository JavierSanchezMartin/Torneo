package com.torneo.dao;

import java.util.List;

import com.torneo.model.Equipo;

public interface EquipoDAO {

	public Boolean anadirEquipo(Equipo equipo);
	
	public List<Equipo> listarEquipos();
	public int getCountGrupos();
	public Equipo consultarEquipo(int idEquipo);
	
	public void insertarOrModificar(Equipo equipo);
	
	public void eliminarEquipo(Equipo equipo);
	public List<Equipo> listarEquiposAleatorio();
}

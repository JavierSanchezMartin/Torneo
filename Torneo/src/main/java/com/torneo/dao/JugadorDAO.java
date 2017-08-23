package com.torneo.dao;

import java.util.List;

import com.torneo.model.Jugador;

public interface JugadorDAO {

	public List<Jugador> listarJugadores();
	
	public void insertarOrModificar(Jugador jugador);
	
	public Jugador consultarJugador(int idJugador);
	
	public void eliminarJugador(Jugador jugador);
}

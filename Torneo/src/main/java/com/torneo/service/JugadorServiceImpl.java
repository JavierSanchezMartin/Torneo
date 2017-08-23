package com.torneo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torneo.dao.JugadorDAO;
import com.torneo.model.Jugador;

@Service
public class JugadorServiceImpl implements JugadorService {

	@Autowired
	private JugadorDAO jugadorDAO;

	@Transactional
	public List<Jugador> listarJugadores() {
		return jugadorDAO.listarJugadores();
	}

	@Transactional
	public void insertarOrModificar(Jugador jugador) {
		jugadorDAO.insertarOrModificar(jugador);
	}
	
	@Transactional
	public Jugador consultarJugador(int idJugador) {
		return jugadorDAO.consultarJugador(idJugador);
	}

	@Transactional
	public void eliminarJugador(Jugador jugador) {
		jugadorDAO.eliminarJugador(jugador);
	}
	
	public JugadorDAO getJugadorDAO() {
		return jugadorDAO;
	}
	
	public void setJugadorDAO(JugadorDAO jugadorDAO) {
		this.jugadorDAO = jugadorDAO;
	}

}

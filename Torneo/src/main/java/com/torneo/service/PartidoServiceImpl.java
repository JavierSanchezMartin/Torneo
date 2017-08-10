package com.torneo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.torneo.model.Partido;
import com.torneo.dao.PartidoDAO;

@Service
public class PartidoServiceImpl implements PartidoService {

	@Autowired
	private PartidoDAO partidoDAO;
	// @Autowired
	// private EquipoDAO equipoDAO;

	@Transactional
	public List<Partido> generarRonda(int fase) {
		// int grupos = equipoDAO.getCountGrupos();
		List<Partido> partidos = partidoDAO.partidosJugadosPorFase(fase);

		return partidos;
	}

	public PartidoDAO getPartidoDAO() {
		return partidoDAO;
	}

	public void setPartidoDAO(PartidoDAO partidoDAO) {
		this.partidoDAO = partidoDAO;
	}

}

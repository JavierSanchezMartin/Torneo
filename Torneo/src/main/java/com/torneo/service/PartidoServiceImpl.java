package com.torneo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.torneo.model.Partido;
import com.torneo.dao.PartidoDAO;

@Service
public class PartidoServiceImpl implements PartidoService{
	@Autowired
	private PartidoDAO partidoDAO;
	public List<Partido> generarRonda(int fase){
		int grupos = 1;
		List<Partido> partidos = partidoDAO.partidosJugadosPorFase(fase);
		
		return partidos;
	}

}

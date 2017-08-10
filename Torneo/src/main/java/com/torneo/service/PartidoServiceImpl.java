package com.torneo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.torneo.model.Partido;
import com.torneo.dao.EquipoDAO;
import com.torneo.dao.PartidoDAO;

@Service
public class PartidoServiceImpl implements PartidoService{
	@Autowired
	private PartidoDAO partidoDAO;
	@Autowired
	private EquipoDAO equipoDAO;
	
	public List<Partido> generarRonda(int fase){
		int grupos = equipoDAO.getCountGrupos();
		List<Partido> partidos = partidoDAO.partidosJugadosPorFase(fase);
		
		return partidos;
	}

}

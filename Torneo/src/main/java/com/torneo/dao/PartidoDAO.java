package com.torneo.dao;

import java.util.List;
import com.torneo.model.Partido;

public interface PartidoDAO {
	public List<Partido> partidosJugadosPorFase(int fase);
}

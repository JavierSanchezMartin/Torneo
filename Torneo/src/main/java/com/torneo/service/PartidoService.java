package com.torneo.service;

import java.util.List;
import com.torneo.model.Partido;


public interface PartidoService {
	public List<Partido> generarRonda(int ronda);
}

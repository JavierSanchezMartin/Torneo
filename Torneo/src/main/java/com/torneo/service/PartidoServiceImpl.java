package com.torneo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.torneo.dao.EquipoDAO;
import com.torneo.dao.PartidoDAO;
import com.torneo.model.Equipo;

@Service
public class PartidoServiceImpl implements PartidoService {

	@Autowired
	private PartidoDAO partidoDAO;
	@Autowired
	private EquipoDAO equipoDAO;

	@Transactional
	public List generarPartidos() {
		// Recibe la lista de equipo ALEATORIAMENTE.
		List<Equipo> equipos = (List<Equipo>) equipoDAO.listarEquiposAleatorio();

		// Se divide la array en dos grupos.
		ArrayList<Equipo> grupo1 = new ArrayList<Equipo>();
		List<Equipo> grupo2 = new ArrayList<Equipo>();
				
		for (int i=0; i < equipos.size(); i++) {
			if (i < 4) grupo1.add(equipos.get(i));
			else grupo2.add(equipos.get(i));
		}
		
		List grupo = new ArrayList();
		String[] partidos;
		String fase = "Eliminatoria";
		int ronda = 1; // 1 ida, 2 vuelta
		
		// Se recorre el primer grupo de 4 equipos.
		for (int i = 0; i < grupo1.size(); i++) {
			
			// Id del equipo actual
			int idEquipoLocal = grupo1.get(i).getId();
			
			// Se vuelve a iterar la lista para su emparejamiento con el equipo actual
			for (int j = 0; j < grupo1.size(); j++) {
				
				partidos = new String[4];
				
				// Si el equipo iterado actualmente NO es el equipoLocal, guarda el partido en una array.
				if (idEquipoLocal != grupo1.get(j).getId()) {
					
					partidos[0] = String.valueOf(idEquipoLocal);
					partidos[1] = String.valueOf(grupo1.get(j).getId());
					partidos[2] = fase;
					partidos[3] = String.valueOf(ronda);
					
					
					grupo.add(partidos);
				}
				
			}
			
		}
		
		String json = "";
		try {
			Gson gson = new Gson();
			json = gson.toJson(grupo);			
		} catch (Exception e) {
			System.out.println("HE PETADO -- " + e.getMessage());
		}
		
		return grupo;
	}

	public PartidoDAO getPartidoDAO() {
		return partidoDAO;
	}

	public void setPartidoDAO(PartidoDAO partidoDAO) {
		this.partidoDAO = partidoDAO;
	}

}

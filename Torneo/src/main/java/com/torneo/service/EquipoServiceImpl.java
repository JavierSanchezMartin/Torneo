package com.torneo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torneo.dao.EquipoDAO;
import com.torneo.model.Equipo;
import com.torneo.model.Jugador;

@Service
public class EquipoServiceImpl implements EquipoService {

	@Autowired
	private EquipoDAO equipoDAO;

	@Transactional
	public Boolean anadirEquipo(Equipo equipo) {
		if (equipo.getId() == 0) {
			if (equipoDAO.anadirEquipo(equipo)) {
				return true;
			}
		} /*else {
			if (equipoDAO.editarEquipo(equipo)) {
				return true;
			}
		}*/
		return false;
	}
	
	@Transactional
	public List<Equipo> listarEquipos() {
		return equipoDAO.listarEquipos();
	}

	public EquipoDAO getEquipoDAO() {
		return equipoDAO;
	}

	public void setEquipoDAO(EquipoDAO equipoDAO) {
		this.equipoDAO = equipoDAO;
	}
}

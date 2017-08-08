package com.torneo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.torneo.model.Jugador;

@Controller
public class AppController {

	@Autowired
	private JugadorService jugadorService;
	
	@RequestMapping("/index")
	public String listarJugadores(Map<String, Object> map) {
		map.put("listadoJugadores", new Jugador());
		map.put("ListadoDeJugadores", jugadorService.listJugador());
		return null;
	}
	
}

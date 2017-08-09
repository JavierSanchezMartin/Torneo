package com.torneo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.torneo.model.Jugador;
import com.torneo.service.JugadorService;

@Controller
public class AppController {

	@Autowired
	private JugadorService jugadorService;
	
	@RequestMapping("/")
	public String menu() {
		return "menu";
	}
	
	@RequestMapping("/jugadores")
	public String listarJugadores(Map<String, Object> map) {
		map.put("ListadoDeJugadores", jugadorService.listJugador());
		return "listadoJugadores";
	}
	
}

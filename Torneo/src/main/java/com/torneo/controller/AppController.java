package com.torneo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@Autowired
	private JugadorService jugadorService;
	
	@RequestMapping("/index")
	public String listarJugadores() {
		return null;
	}
	
}

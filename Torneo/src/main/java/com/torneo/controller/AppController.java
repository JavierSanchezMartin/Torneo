package com.torneo.controller;

import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.torneo.model.Equipo;
import com.torneo.model.Jugador;
import com.torneo.service.JugadorService;

@Controller
public class AppController {

	@Autowired
	private JugadorService jugadorService;
	@Autowired
	private EquipoService equipoService;
	
	@RequestMapping("/")
	public String menu() {
		return "menu";
	}
	
	@RequestMapping("/jugadores")
	public String listarJugadores(Map<String, Object> map) {
		map.put("ListadoDeJugadores", jugadorService.listarJugador());
		return "listadoJugadores";
	}
	
	@RequestMapping("/FormularioJugador")
	public String formularioJugador(Map<String, Object> map) {
		List<Equipo> listaEquipos = equipoService.listarEquipos();
		map.put("nuevoJugador", new Jugador());
		map.put("listaEquipos", listaEquipos);
		return "FormJugador";
	}
	
	@RequestMapping(value = "/CrearJugador", method = RequestMethod.POST)
	public String CreateaJugador(@ModelAttribute("jugador") Jugador jugador) {
		System.out.println("Nuevo jugador nombre: " + jugador.getNombre());
		return "redirect:/";
	}
	
}

package com.torneo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.torneo.model.Equipo;
import com.torneo.model.Jugador;
import com.torneo.service.EquipoService;
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
	
	@RequestMapping("/formularioEquipo")
	public ModelAndView formularioEquipo() {
		return new ModelAndView("formularioEquipo", "equipo", new Equipo());
	}
	
	@RequestMapping("/anadirEquipo")
	public String anadirEquipo(Equipo equipo) {
		System.out.println(equipo.getNombre());
		equipoService.anadirEquipo(equipo);
		return "formularioEquipo";
	}
	
	@RequestMapping("/listadoEquipos")
	public String listarEquipos(Map<String, Object> map) {
		map.put("ListadoDeEquipos", equipoService.listarEquipos());
		return "listadoEquipos";
	}
	
	@RequestMapping("/ListarJugadores")
	public String listarJugadores(Map<String, Object> map) {
		map.put("ListadoDeJugadores", jugadorService.listarJugadores());
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
	public String createaJugador(@ModelAttribute("jugador") Jugador jugador) {
		jugadorService.insertarOrModificar(jugador);
		return "redirect:/";
	}
	
}

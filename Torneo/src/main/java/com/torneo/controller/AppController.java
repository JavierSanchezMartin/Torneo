package com.torneo.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.torneo.model.Equipo;
import com.torneo.model.Jugador;
import com.torneo.service.EquipoService;
import com.torneo.service.JugadorService;
import com.torneo.service.PartidoService;

@Controller
public class AppController {

	@Autowired
	private JugadorService jugadorService;
	@Autowired
	private EquipoService equipoService;
	@Autowired
	private PartidoService partidoService;

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
	public String listarJugadores(Map<String, Object> map, HttpServletRequest request) {
		
		List<Jugador> listaJugadores = jugadorService.listarJugadores();
		
		request.setAttribute("ListadoDeJugadores", listaJugadores);
		request.setAttribute("session", equipoService);
		
		map.put("ListadoDeJugadores", listaJugadores);
		return "listadoJugadores";
	}

	@RequestMapping("/FormularioJugador")
	public String formularioJugador(Map<String, Object> map) {
		List<Equipo> listaEquipos = equipoService.listarEquipos();
		map.put("jugador", new Jugador());
		map.put("listaEquipos", listaEquipos);
		return "FormJugador";
	}
	
	@RequestMapping(value = "/EditarJugador",  method = RequestMethod.GET)
	public String editarJugador(@RequestParam String idJugador, Map<String, Object> map) {
		
		Jugador jugador = jugadorService.consultarJugador(Integer.parseInt(idJugador));
		List<Equipo> listaEquipos = equipoService.listarEquipos();
		
		map.put("jugador", jugador);
		map.put("listaEquipos", listaEquipos);
		
		return "FormJugador";
	}

	@RequestMapping(value = "/CrearJugador", method = RequestMethod.POST)
	public String crearJugador(@ModelAttribute("jugador") Jugador jugador, @RequestParam String action) {
		
		if (action.equals("Crear")) {			
			jugadorService.insertarOrModificar(jugador);
		}
		
		return "redirect:/ListarJugadores";
	}

	@RequestMapping("/EliminarJugador")
	public String eliminarJugador(@RequestParam String idJugador) {
		
		Jugador jugador = jugadorService.consultarJugador(Integer.parseInt(idJugador));
		jugadorService.eliminarJugador(jugador);
		
		return "redirect:/ListarJugadores";
	}
	
	@RequestMapping("/consultarJugador")
	@ResponseBody
	public Jugador consultarJugador(@RequestParam String idJugador) {
		
		return (Jugador) jugadorService.consultarJugador(Integer.parseInt(idJugador));
	}

}

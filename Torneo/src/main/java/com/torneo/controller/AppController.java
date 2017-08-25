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
		return "Menu";
	}

	@RequestMapping("/formulario-equipo")
	public ModelAndView formularioEquipo() {
		return new ModelAndView("FormularioEquipo", "equipo", new Equipo());
	}

	@RequestMapping("/anadir-equipo")
	public String anadirEquipo(Equipo equipo) {
		System.out.println(equipo.getNombre());
		equipoService.anadirEquipo(equipo);
		return "FormularioEquipo";
	}

	@RequestMapping("/listado-equipos")
	public String listarEquipos(Map<String, Object> map) {
		map.put("ListadoDeEquipos", equipoService.listarEquipos());
		return "ListadoEquipos";
		//return new ModelAndView("ListadoEquipos", "ListadoDeEquipos", equipoService.listarEquipos());
	}
	
	@RequestMapping(value = "/crear-equipo", method = RequestMethod.POST)
	public String crearEquipo(@ModelAttribute("equipo") Equipo equipo, @RequestParam String action) {
		
		if (action.equals("Crear")) {			
			equipoService.insertarOrModificar(equipo);
		}
		
		return "redirect:/listado-equipos";
	}
	
	@RequestMapping(value = "/editar-equipo",  method = RequestMethod.GET)
	public String editarEquipo(@RequestParam String idEquipo, Map<String, Object> map) {
		
		Equipo equipo = equipoService.consultarEquipo(Integer.parseInt(idEquipo));
		
		map.put("equipo", equipo);
		
		return "FormularioEquipo";
	}
	
	@RequestMapping("/eliminar-equipo")
	public String eliminarEquipo(@RequestParam String idEquipo) {
		
		Equipo equipo = equipoService.consultarEquipo(Integer.parseInt(idEquipo));
		equipoService.eliminarEquipo(equipo);
		
		return "redirect:/listado-equipos";
	}
	
	@RequestMapping("/consultar-equipo")
	@ResponseBody
	public Equipo consultarEquipo(@RequestParam String idEquipo) {
		
		return (Equipo) equipoService.consultarEquipo(Integer.parseInt(idEquipo));
	}
	
	
	
	
	
	

	@RequestMapping("/listado-jugadores")
	public String listarJugadores(Map<String, Object> map, HttpServletRequest request) {
		
		List<Jugador> listaJugadores = jugadorService.listarJugadores();
		
		request.setAttribute("ListadoDeJugadores", listaJugadores);
		request.setAttribute("session", equipoService);
		
		map.put("ListadoDeJugadores", listaJugadores);
		return "ListadoJugadores";
	}

	@RequestMapping("/formulario-jugador")
	public String formularioJugador(Map<String, Object> map) {
		List<Equipo> listaEquipos = equipoService.listarEquipos();
		map.put("jugador", new Jugador());
		map.put("listaEquipos", listaEquipos);
		return "FormularioJugador";
	}
	
	@RequestMapping(value = "/editar-jugador",  method = RequestMethod.GET)
	public String editarJugador(@RequestParam String idJugador, Map<String, Object> map) {
		
		Jugador jugador = jugadorService.consultarJugador(Integer.parseInt(idJugador));
		List<Equipo> listaEquipos = equipoService.listarEquipos();
		
		map.put("jugador", jugador);
		map.put("listaEquipos", listaEquipos);
		
		return "FormularioJugador";
	}

	@RequestMapping(value = "/crear-jugador", method = RequestMethod.POST)
	public String crearJugador(@ModelAttribute("jugador") Jugador jugador, @RequestParam String action) {
		
		if (action.equals("Crear")) {			
			jugadorService.insertarOrModificar(jugador);
		}
		
		return "redirect:/listado-jugadores";
	}

	@RequestMapping("/eliminar-jugador")
	public String eliminarJugador(@RequestParam String idJugador) {
		
		Jugador jugador = jugadorService.consultarJugador(Integer.parseInt(idJugador));
		jugadorService.eliminarJugador(jugador);
		
		return "redirect:/listado-jugadores";
	}
	
	@RequestMapping("/consultar-jugador")
	@ResponseBody
	public Jugador consultarJugador(@RequestParam String idJugador) {
		
		return (Jugador) jugadorService.consultarJugador(Integer.parseInt(idJugador));
	}

}

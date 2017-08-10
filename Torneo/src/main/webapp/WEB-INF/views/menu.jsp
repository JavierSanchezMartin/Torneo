<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Torneo</title>
	</head>
	<body>
		<div class="container" align="center">
		    <h2>Menu principal</h2>
		    <div class="row">
		    	<div class="col-xs-12 col-sm-4">
					<a href="/Torneo/formularioEquipo"> <!-- <img
						class="img-responsive center-block"
		
						src="../img/torneo.png'/>" />
						Torneos
		
						src="WEB-INF/img/equipo.png" /> -->
						Añadir Equipo
		
					</a>
					<a href="/Torneo/listadoEquipos">Listado Equipos</a>
		        </div>
		        <div class="col-xs-12 col-sm-4">
		            <a href="/Torneo/FormularioJugador">Crear jugador</a>
		            <a href="/Torneo/ListarJugadores">Listado de jugadores</a>
		        </div>
		    </div>
	    </div>
	</body>
</html>
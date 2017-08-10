<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<title>Editor de Jugador</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	</head>
	<body>
	    <div class="form-jugador">
	        <!--
	            ATRIBUTOS DE UN FORMULARIO:
	            - modelAttribute: Objeto referencia del Formulario (Jugador, Equipo, etc).
	                              Es recibido por el Map del Controllador. (map.put(..., new Jugador)).
	            - commandName: Hace lo mismo que un 'modelAttribute'.
	         -->
		    <form:form action="/Torneo/CrearJugador" method="post" modelAttribute="nuevoJugador">
		        <div class="form-group">
			        <form:label path="nombre">Nombre</form:label>
			        <form:input class="form-control" placeholder="Nombre" path="nombre"/>
		        </div>
		        <div class="form-group">
			        <form:label path="apellido">Apellido</form:label>
			        <form:input class="form-control" placeholder="Apellido" path="apellido"/>
		        </div>
		        <div class="form-group">
			        <form:label path="dni">DNI</form:label>
			        <form:input class="form-control" placeholder="DNI" path="dni"/>
		        </div>
		        <div class="form-group">
		            <form:label path="idEquipo">Equipo</form:label>
			        <form:select class="form-control" path="idEquipo">
			            <c:forEach items="${listaEquipos}" var="equipo">
			                <form:option value="${equipo.id}">${equipo.nombre}</form:option>
			            </c:forEach>
			        </form:select>
		        </div>
		        <input type="submit" value="Crear" class="btn btn-success">
		    </form:form>
	    </div>
	</body>
</html>
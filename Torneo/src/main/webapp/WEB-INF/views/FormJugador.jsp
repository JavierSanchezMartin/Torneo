<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<title>Editor de Jugador</title>
	</head>
	<body>
	    <div class="form-jugador">
	        <!--
	            ATRIBUTOS DE UN FORMULARIO:
	            - modelAttribute: Objeto referencia del Formulario (Jugador, Equipo, etc).
	                              Es recibido por el Map del Controllador. (map.put(..., new Jugador)).
	            - commandName: Hace lo mismo que un 'modelAttribute'.
	         -->
		    <form:form action="CrearJugador" method="post" modelAttribute="nuevoJugador">
		        <form:label path="nombre">Nombre</form:label>
		        <form:input path="nombre"/>
		        <form:label path="apellido">Apellido</form:label>
		        <form:input path="apellido"/>
		        <form:label path="dni">DNI</form:label>
		        <form:input path="dni"/>
		        <form:select path="idEquipo">
		            <form:options items="${listaEquipos}" />
		        </form:select>
		        <input type="submit" value="Crear">
		    </form:form>
	    </div>
	</body>
</html>
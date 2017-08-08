<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Prueba de conexión con la Base de datos</title>
	</head>
	<body>
	    <h2>Lista de Jugadores</h2>
	    <c:if test="${!ListadoDeJugadores.isEmpty()}">
	    <ul>
	        <c:forEach items="${ListadoDeJugadores}" var="jugador">
	    	<li>${jugador.nombre}</li>
	        </c:forEach>
	    </ul>
	    </c:if>
	</body>
</html>
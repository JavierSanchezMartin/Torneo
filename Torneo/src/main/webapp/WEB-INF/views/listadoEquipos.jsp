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
	    <h2>Listado de Equipos</h2>
	    <c:if test="${!ListadoDeEquipos.isEmpty()}">
	    <ul>
	        <c:forEach items="${ListadoDeEquipos}" var="equipo">
	    	<li>${equipo.nombre}</li>
	        </c:forEach>
	    </ul>
	    </c:if>
	</body>
</html>
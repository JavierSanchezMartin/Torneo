<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Torneo | Equipos</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Encode+Sans+Expanded" rel="stylesheet">
        <link rel="stylesheet" href="css/style.css" />
	</head>
	<body>
        <header class="team-header">
		    <h2>Listado de Equipos</h2>
        </header>
        <section class="team-navbar">
			<a href="/Torneo">
			    <button class="btn btn-danger">Atrás</button>
			</a>
			<a href="/Torneo/formularioEquipo">
			    <button class="btn btn-success">Crear equipo</button>
			</a>
        </section>
	    <section class="team-body">
		    <c:if test="${!ListadoDeEquipos.isEmpty()}">
                <c:forEach items="${ListadoDeEquipos}" var="equipo">
                    <article>
                        <h3>${equipo.nombre}</h3>
                    </article>
                </c:forEach>
            </c:if>
            <c:if test="${ListadoDeEquipos.isEmpty()}">
                <h3>No existe ningún equipo</h3>
            </c:if>
	    </section>
	</body>
</html>
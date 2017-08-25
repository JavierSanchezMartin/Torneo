<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Torneo | Equipos</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Encode+Sans+Expanded" rel="stylesheet">
        <link rel="stylesheet" href="css/style.css" />
    </head>
	<body>
	    <div class="container">
	        <div class="form-jugador">
	            <div class="form-header">
			        <h2>Formulario equipo</h2>
			        <a href="listado-equipos">
			            <button class="btn btn-primary">
			                <i class="glyphicon glyphicon-menu-left"></i> Volver
			            </button>
			        </a>
	            </div>
	            <div class="form-body">
			        <c:if test="${equipo != null}">
			            <div class="row">
						    <form:form action="/Torneo/crear-equipo" method="post" modelAttribute="equipo" class="col-md-5">
				                <form:hidden path="id" value="${equipo.id}"/>
						        <div class="form-group">
							        <form:label path="nombre">Nombre del equipo</form:label>
							        <form:input class="form-control" placeholder="Nombre del equipo" path="nombre" />
						        </div>
						        <input type="submit" class="btn btn-success" name="action" value="Crear" />
						        <input type="submit" class="btn btn-danger" name="action" value="Cancelar" />
						    </form:form>
			            </div>
			        </c:if>
	            </div>
	        </div>
	    </div>
	</body>
</html>

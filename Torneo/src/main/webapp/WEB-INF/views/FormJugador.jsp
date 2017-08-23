<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Editor de Jugador</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Encode+Sans+Expanded" rel="stylesheet">
        <link rel="stylesheet" href="css/style.css" />
        <style>
            .form-header {
                margin-top: 10px;
                margin-bottom: 15px;
            }
            .form-body form { font-size: 20px; }
            .form-body form input[type="submit"] { width: 100px;}
        </style>
    </head>
	<body>
	    <div class="container">
	        <div class="form-jugador">
	            <div class="form-header">
			        <h2>Formulario jugador</h2>
			        <a href="ListarJugadores">
			            <button class="btn btn-danger">
			                <i class="glyphicon glyphicon-menu-left"></i> Volver
			            </button>
			        </a>
	            </div>
	            <div class="form-body">
			        <!--
			            ATRIBUTOS DE UN FORMULARIO:
			            - modelAttribute: Objeto referencia del Formulario (Jugador, Equipo, etc).
			                              Es recibido por el Map del Controllador. (map.put(..., new Jugador)).
			            - commandName: Hace lo mismo que un 'modelAttribute'.
			         -->
			        <c:if test="${jugador != null}">
			            <div class="row">
						    <form:form action="/Torneo/CrearJugador" method="post" modelAttribute="jugador" class="col-md-5">
				                <form:hidden path="id" value="${jugador.id}"/>
						        <div class="form-group">
							        <form:label path="nombre">Nombre</form:label>
							        <form:input class="form-control" placeholder="Nombre" path="nombre" />
						        </div>
						        <div class="form-group">
							        <form:label path="apellido">Apellido</form:label>
							        <form:input class="form-control" placeholder="Apellido" path="apellido" />
						        </div>
						        <div class="form-group">
							        <form:label path="dni">DNI</form:label>
							        <form:input class="form-control" placeholder="DNI" path="dni" />
						        </div>
						        <div class="form-group">
						            <form:label path="idEquipo">Equipo</form:label>
							        <form:select class="form-control" path="idEquipo">
							            <form:option value="0">--- Seleccione un equipo ---</form:option>
							            <c:forEach items="${listaEquipos}" var="equipo">
							                <form:option value="${equipo.id}">${equipo.nombre}</form:option>
							            </c:forEach>
							        </form:select>
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
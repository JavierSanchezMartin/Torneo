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
		    <h2>Añadir equipo</h2>
	    	<div class="col-xs-12 col-sm-4">
				<form:form action="anadirEquipo" method="post" modelAttribute="equipo">
					<form:label path="nombre">Nombre: </form:label>
					<form:input path="nombre" type="text" name="nombre" />
					<input type="submit" value="Añadir" />
				</form:form>
			</div>
	    </div>
	</body>
</html>
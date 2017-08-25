<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Torneo | Menu</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Encode+Sans+Expanded" rel="stylesheet">
	    <link rel="stylesheet" href="css/style.css" />
	</head>
	<body>
		<div class="container main">
		    <h2>Menu principal</h2>
		    <div class="row">
		    	<div class="col-xs-12 col-sm-6 main-block">
					<a href="/Torneo/listado-equipos">
					   <img	class="img-responsive center-block" src="img/balon.png" alt="Equipos"/>
					   <h3>Equipos</h3>
					</a>
		        </div>
		        <div class="col-xs-12 col-sm-6 main-block">
		            <a href="/Torneo/listado-jugadores">
		                <img class="img-responsive center-block" src="img/jugador.png" alt="Jugadores" />
		                <h3>Jugadores</h3>
		            </a>
		        </div>
		    </div>
	    </div>
	</body>
</html>
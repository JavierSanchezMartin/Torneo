<%@page import="com.torneo.dao.EquipoDAO"%>
<%@page import="org.springframework.beans.factory.annotation.Autowired"%>
<%@page import="com.torneo.service.EquipoService"%>
<%@page import="com.torneo.model.Jugador"%>
<%@page import="com.torneo.model.Equipo"%>
<%@page import="com.torneo.controller.AppController"%>
<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
        <script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/style.css" />
        <script>
            $(function(){            	
	            $('.btn-ajax').on('click', function(){
	            	var id = $(this).data('id');
	            	
	            	$.get(
	            			'/Torneo/consultarEquipo', 
	            			{idEquipo: id}, 
	            			function(data){ 
	            				var nombre = data.nombre;
	            				$('.team-model .team-model--title').html(nombre);
	            				
	            				var info = '<p> Grupo: '+data.grupo+'</p>';
	            				$('.team-model .team-model--info').html(info);
	            			} );
	            });
            })
        </script>
	</head>
	<body class="container">
	    <header class="team-head">
		    <h2>Lista de Equipos</h2>
	    </header>
	    <section class="team-navbar">
	        <a href="/Torneo"><button class="btn btn-primary">Atrás</button></a>
	        <a href="/Torneo/formulario-equipo" class="pull-right">
	            <button class="btn btn-success">Crear equipo</button>
	        </a>
	    </section>
	    <section class="row team-body">
	       
	       <% 
	           List<Equipo> lista = (List<Equipo>) request.getAttribute("ListadoDeEquipos"); 
	           System.out.println(lista.size());
	           
	           if (!lista.isEmpty() && lista != null){
	        	   for (int i=0; i < lista.size(); i++){
	       %>
		        	<article class="col-sm-4 col-md-3">
			    	    <div class="team__cart">
				    	    <div class="team__cart__image">
					    	    <img class="img-responsive imagen" src="img/balon.png" alt="equipo" />
				    	    </div>
				    	    <div class="team__cart__data">
				    	        <div>
					    	        <h4><%= lista.get(i).getNombre() %></h4>
				    	        </div>
				    	        <div class="team__cart__data__actions">
				    	            <button class="btn btn-default btn-ajax" data-toggle="modal" data-target="#modalEquipo" data-id="<%= lista.get(i).getId() %>">
	    			    	            <i class="glyphicon glyphicon-eye-open" aria-hidden="true"></i>
				    	            </button>
				    	            <a href="editar-equipo?idEquipo=<%= lista.get(i).getId() %>">
	    			    	            <button class="btn btn-default">
		    			    	            <i class="glyphicon glyphicon-pencil" aria-hidden="true"></i>
	    			    	            </button>
				    	            </a>
				    	            <a href="eliminar-equipo?idEquipo=<%= lista.get(i).getId() %>">
					    	            <button class="btn btn-danger">
		    			    	            <i class="glyphicon glyphicon-trash" aria-hidden="true"></i>
					    	            </button>
				    	            </a>
				    	        </div>
				    	    </div>
			    	    </div>
			    	</article>
	       <% 
	               }
	           }
	       %>
	    </section>
	    <div class="modal fade" id="modalEquipo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel">Información de equipo</h4>
		      </div>
		      <div class="modal-body container">
		        <div class="row team-model">
		          <div class="col-md-2 team-model__image">
		            <img src="img/balon.png" class="team-model--image" alt="equipo" />
		          </div>
		          <div class="col-md-8 team-model__info">
		            <h3 class="team-model--title"></h3>
		            <div class="team-model--info"></div>
		          </div>
		        </div>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
		      </div>
		    </div>
		  </div>
		</div>
	</body>
</html>

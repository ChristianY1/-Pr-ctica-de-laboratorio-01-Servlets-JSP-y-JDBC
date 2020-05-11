<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Agenda Telefonica</title>

    <!-- Icons font CSS-->
    <link type = "text/css" href="/-Pr-ctica-de-laboratorio-01-Servlets-JSP-y-JDBC/JSPs/publico/colorlib-regform-4/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link type = "text/css"  href="/-Pr-ctica-de-laboratorio-01-Servlets-JSP-y-JDBC/JSPs/publico/colorlib-regform-4/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link  type = "text/css" href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link type = "text/css" href="/-Pr-ctica-de-laboratorio-01-Servlets-JSP-y-JDBC/JSPs/publico/colorlib-regform-4/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link type = "text/css" href="/-Pr-ctica-de-laboratorio-01-Servlets-JSP-y-JDBC/JSPs/publico/colorlib-regform-4/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link type = "text/css" href="/-Pr-ctica-de-laboratorio-01-Servlets-JSP-y-JDBC/JSPs/publico/colorlib-regform-4/css/main.css" rel="stylesheet" media="all">
</head>
<body>
<style type = "text/css">
	.buscar{
		margin-left: auto;
  margin-right: auto;
	}

</style>
<div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
	<div class="wrapper wrapper--w680">
		<div class = "card card-4">
			<div class = "card-body">
				
			   <div id="navigation">
    				<ul class="nav-list">
        				<li id="js-show-all">Modificar</li>
       				    <li id="js-search">Eliminar</li>
        				<li id="js-add-new">Buscar</li>
        				<li id="js-add-new">Agregar un teléfono</li>
        				<li id="js-add-new">Ver mis teléfonos</li>
    				</ul>
				
				</div>
				
				<div id="search-panel" class="panel">

	
			<div class="p-t-15">
				 <label class = "label">Buscar Contactos:</label>
			</div>
   
    	<form id="search" action="#">
    
    	<label>
        	<input type="text" name="search" class="input--style-4" placeholder="Ingrese el e-mail o número de cédula" />
        </label>
        	<div id="results">
        	</div>
       			 <div>
            
        		 </div>
        		 <div class="p-t-15">
        		 	<button class="btn btn--radius-2 btn--blue" type="submit">Buscar</button>
        		 </div>
                	
    </form>
</div>
    <div  class="p-t-15">
        <form id="contact" action="#">
        <label class ="title">Mis Datos</label>
            <h1></h1>
            <div class = "p-t-15" name = "datosUsuario">
                <label class = "label "> 
                     Cédula: &nbsp; ${cedula} 
                </label>
                <label class = "label">
                    Nombre: &nbsp; ${nombre}
                </label>
                <label class = "label ">
                    Apellido: &nbsp;  ${apellido}
                </label>
                <label class = "label ">
                    Correo: &nbsp; ${correo}
                </label>
                <label class = "label ">
                    Contraseña: &nbsp; ${contrasenia}
                </label>
            </div>
            <div class = "p-t-15">
            	<label class ="title">Mis Teléfonos</label>
            </div>
            
            <div class = "p-t-15" name = "datosTelefonos">
                <label class="label">
                    Número: &nbsp; ${numero}
                </label>
                <label class="label">
                	Tipo: &nbsp; ${tipo}
                    
                </label>
                <label class="label">
                     Operadora: &nbsp; ${operadora}
                </label>
            </div>
            <div class="p-t-15">
        		 	<button class="btn btn--radius-2 btn--blue" type="submit" name = "bMultiusos">Submit</button>
           </div>
        </form>
    </div>
<div id = "show-panel" class="panel">
  
</div>
			
			</div>
		</div>
	</div>
</div>


 	<!-- Jquery JS-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="vendor/select2/select2.min.js"></script>
    <script src="vendor/datepicker/moment.min.js"></script>
    <script src="vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="js/global.js"></script>

</body>
</html>
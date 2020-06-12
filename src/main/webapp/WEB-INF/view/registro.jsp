<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario Registro</title>
</head>
<body>
	<form:form action="/inicio"  modelAttribute="persona">
	<form:hidden path="id"></form:hidden>
		<fieldset>
			<legend>Nombre</legend>
			
			<form:label  path="nombre">Nombre</form:label>
			<form:input type="text" path="nombre"></form:input>
			<form:errors  path="nombre" cssClass="text-warning"></form:errors>


		</fieldset>

		<fieldset>
			<legend>Apellido</legend>
			<form:label path="apeliido">Apellido</form:label>
			<form:input type="text" path="apeliido"></form:input>
			<form:errors  path="apeliido" cssClass="text-warning"></form:errors>


		</fieldset>
		<input type="submit" value="enviar"/>

	
	</form:form>


</body>
</html>
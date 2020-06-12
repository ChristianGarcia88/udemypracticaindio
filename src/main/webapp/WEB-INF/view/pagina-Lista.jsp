<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Acciones</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${lista}"  var="item">
			<tr>
			<td>${item.id}</td>
			<td>${item.nombre}</td>
			<td>${item.apeliido}</td>
			<td><a href="/actualizar?id=${item.id}">editar</a>  <a href="/eliminar?id=${item.id}">eliminar</a></td>

			</tr>
			</c:forEach>

		</tbody>




	</table>

</body>
</html>
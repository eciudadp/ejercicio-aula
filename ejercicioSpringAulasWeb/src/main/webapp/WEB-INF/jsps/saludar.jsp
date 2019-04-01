<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<h2> Aula1: ${aula.nombre }</h2>
Alumno1: ${mensajeAlumno1.nombre} - ${mensajeAlumno1.subvencionado}<br/>
Alumno2: ${mensajeAlumno2.nombre} - ${mensajeAlumno2.subvencionado}<br/>
<h2> Aula2: ${aula2.nombre }</h2>
Alumno3: ${loquesea.nombre} - ${loquesea.subvencionado}<br/>
<%-- Alumno3: ${mensajeAlunmno.nombre} - ${mensajeAlumno.subvencionado}<br/> --%>


<%-- Prototype: ${mensajePrototype.nombre} - ${mensajePrototype.descripcion}<br/> --%>
<%-- Request: ${mensajeRequest.nombre} - ${mensajeRequest.descripcion}<br/> --%>
<%-- Session: ${mensajeSession.nombre} - ${mensajeSession.descripcion}<br/> --%>

</body>
</html>
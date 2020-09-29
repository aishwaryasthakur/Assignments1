<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Marks of ${studentName }</h2>
	<b>Mathematics : </b><c:out value="${marks.maths}"></c:out><br>
	<b>Biology : </b><c:out value="${marks.biology}"></c:out><br>
	<b>Physics : </b><c:out value="${marks.physics}"></c:out><br>
</body>
</html>
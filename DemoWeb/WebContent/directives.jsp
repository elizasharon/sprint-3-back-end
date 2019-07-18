<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Directive Demo</title>
</head>
<%@ page import="java.util.Date" %>
<%@ page isErrorPage="true" %>
<%@ page info="Just for demo" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<body>
	<h1>Directive Demo</h1>
	<hr>
	<%@ include file="Login.html" %>
	
	<h2>
	Todays date : <%= new Date() %>
	<br> 
	Exception : <%= exception %>
	<br>
	Information : <%= getServletInfo() %>
	<br>
	Session : <%= session.getId() %>
	<c:catch></c:catch>
	</h2>

</body>
</html>
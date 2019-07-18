<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Demo</title>
</head>
<body>
<%@page import="java.util.Date" %>
<h2>Session ID : <%= session.getId() %></h2>
<br>
<h2>Session Created Time : <%= new Date(session.getCreationTime()) %></h2>
<br>
<h2>Session Last Accessed Time : <%= new Date(session.getLastAccessedTime()) %></h2>
<h2>Is NEW ? : <%= session.isNew() %></h2>
<br>
<% 
// session.invalidate(); 
session.setMaxInactiveInterval(10);
%>
<br>
<br>
</body>
</html>
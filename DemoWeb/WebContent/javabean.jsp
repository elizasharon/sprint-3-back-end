<%@page import="com.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Bean Demo</title>
</head>
<body>
<h1>
Java Bean Demo</h1>
<hr>
<h2>
<jsp:useBean id="p1" class="com.Person"></jsp:useBean>
<jsp:setProperty property="name" name="p1" value="Cooper"/>
<jsp:setProperty property="age" name="p1" value="25"/>
Your good name is : <jsp:getProperty property="name" name="p1"/>
<br>
Your age is : <jsp:getProperty property="age" name="p1"/>
</h2>
<hr>
<h2>
<%
	com.Person p2 = new Person();
p2.setName("Barney");
p2.setAge(25);
out.println("name : "+ p2.getName());
out.println("age : "+ p2.getAge());
%>
</h2>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTER</title>
</head>
<body>
	<h1>Spring Data JPA Demo</h1>
	<hr>
	<form action="addStudent" method="post">
		<h2>
			Roll No : <input type="text" name="rollno" />
			<br>
			<br>
			Name : <input type="text" name="name" />
			<br>
			<br>
			School : <input type="text" name="school" />
			<br>
			<br>
			<input type="submit" name="submit" value="SUBMIT" />
			<input type="reset" name="reset" value="RESET" />
			<br>
			<br>
		</h2>
	</form>
</body>
</html>
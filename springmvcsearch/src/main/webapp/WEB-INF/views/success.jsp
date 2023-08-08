<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Successful</title>
</head>
<body>
	<h1>Student is registered with below details:</h1>
	<h2>ID: ${studentEntity.id }</h2>
	<h2>Name: ${studentEntity.name }</h2>
	<h2>DOB: ${studentEntity.dob }</h2>
	<h2>Courses selected by Student: ${studentEntity.courses }</h2>
	<h2>Gender: ${studentEntity.gender }</h2>
	<h2>Type: ${studentEntity.studentType }</h2>
	<h2>Address- Street: ${studentEntity.address.street }</h2>
	<h2>City: ${studentEntity.address.city }</h2>
</body>
</html>
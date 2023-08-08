<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<h3 class="text-center">${Header }</h3>
<h1 style="color: green;">${msg }</h1>
<h1>Welcome ${user.userName }</h1>
<h2>Your registration is successful. Please use ${user.email } to login to your account.</h2>
</body>
</html>
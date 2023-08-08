<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>Called by Home Controller</h1>
	<h1>URL /home</h1>
	<%
	String name = (String) request.getAttribute("name");
	String contactNo = (String) request.getAttribute("contactNo");
	List<String> friends = (List<String>) request.getAttribute("frnds");
	%>
	<h1>
		Name is
		<%=name%></h1>
	<h2>
		Contact No.:
		<%=contactNo%>
	</h2>
	<h2>
		<%
		for (String s : friends) {
			out.println(s);
		}
		%>
	</h2>

</body>
</html>
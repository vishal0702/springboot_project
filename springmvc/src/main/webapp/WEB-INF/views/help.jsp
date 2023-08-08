<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>

<!-- https://docs.oracle.com/javaee/5/jstl/1.1/docs/tlddocs/c/tld-summary.html -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<h1>Hello, This page is designed to help you</h1>

	<%
	/* String helpdesk = (String) request.getAttribute("helpdesk");
	Integer pincode = (Integer) request.getAttribute("Pincode");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
	%>
	<h2>
		Helpdesk:
		<%-- <%=helpdesk%> --%>

		<!-- JSP Expression language -->
		${helpdesk }
	</h2>
	<h2>
		Pincode:
		<%-- <%=pincode%> --%>
		${Pincode }
	</h2>
	<h2>
		Date & Time:
		<%-- <%=time%> --%>
		${time }
	</h2>
	<hr>

	<!-- Traversing through ArrayList using JSTL -->
	<c:forEach var="item" items="${ids }">
		<h3>${item }</h3>
	</c:forEach>
</body>
</html>
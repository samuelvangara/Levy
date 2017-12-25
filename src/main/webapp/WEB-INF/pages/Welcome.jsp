<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Levy</title>
<link rel="shortcut icon"
	href="http://nasuke.net/wp-content/uploads/favorite.ico" />
<%
	String UserName = request.getAttribute("Username").toString();
	String Password = request.getAttribute("Password").toString();
%>
</head>
<body>
	<h1>Welcome to Levy</h1>
	<h3 align="left">
		UserName:<%
		out.print(UserName);
	%>
	</h3>
	<h3 align="left">
		Password:<%
		out.print(Password);
	%>
	</h3>
</body>
</html>
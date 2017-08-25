<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Multiples of Two</title>
</head>
<%!int x;%>
<body>
	<%
		for (x = 1; x < 11; x++) {
			out.println(x + " multiplied by 2 is " + x * 2);
			out.println("</br>");
		}
	%>
</body>
</html>
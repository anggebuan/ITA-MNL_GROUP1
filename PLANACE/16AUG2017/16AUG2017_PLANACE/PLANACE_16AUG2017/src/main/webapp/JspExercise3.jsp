<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exception Handling</title>
</head>
<%!String sample = null;%>
<body>
	<form enctype="multipart/form-data" method="get">
		<input type="submit" name="makeException" value="Click me!">
	</form>
	<%
		if (request.getParameter("makeException") != null) {
			try {
				sample.length();
			} catch (Exception e) {
				out.println(e.getClass().getSimpleName() + " Happened!");
				out.print("</br>");
			}
		}
	%>
</body>
</html>
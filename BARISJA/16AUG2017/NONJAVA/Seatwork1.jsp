<%@page import="java.net.InetAddress"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<p>Hello World</p>
	<%
		InetAddress ip;

		String hostname, address;
		ip = InetAddress.getLocalHost();
		hostname = ip.getHostName();
		address = ip.getHostAddress();
	%>
	Hostname:
	<%=hostname%>
	</br> Address:
	<%=address%>

</body>
</html>
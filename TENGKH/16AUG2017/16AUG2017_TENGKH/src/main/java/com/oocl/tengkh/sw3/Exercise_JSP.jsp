<%@page import="com.sun.webkit.ContextMenu.ShowContext"%>
<%@page import="org.eclipse.jdt.internal.compiler.ast.ThrowStatement"%>
<%@page import="java.net.InetAddress"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP EXERCISES</title>
</head>
<body>
	<h1>HELLO WORLD</h1>
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

	<h1>MULTIPLES OF TWO</h1>
	<%
		int number = 0;
		int count = 10;

		for (int i = 0; i < count; i++) {
			number = number + 2;
			out.println(number);
			out.println("</br>");
		}
	%>

	<h1>EXCEPTION HANDLING</h1>
	<%
		int x = 1;
		try {
			x = x / 0;
		} catch (Exception e) {
			out.print("Arithmetic Error!" + e.getMessage());
		}
	%>
	<%
		String msg = null;
		try {
			ShowError();
		} catch (Exception e) {
			out.println("</br>");
			out.print("Null Error! " + e.getMessage());
		}
	%>
	<%!public void ShowError() throws Exception {
		throw new NullPointerException();
	}%>

</body>
</html>
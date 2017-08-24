<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title> JSP Expressions </title>
</head>
<body bgColor="white">
<h2>Simple JSP Expression</h2>
<ul><font color = “#0000FF”>
<li> <font color = “#0000FF”> Session id:<%= session.getId() %>
<li> <font color = “#0000FF”> Creation time:<%= new java.util.Date(session.getCreationTime()) %>
<li> <font color = “#0000FF”> Time of last access: " + <%= new java.util.Date(session.getLastAccessedTime())%>
</ul>
</body>
</html>
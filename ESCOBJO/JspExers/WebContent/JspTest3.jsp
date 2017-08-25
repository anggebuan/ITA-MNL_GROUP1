<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Example of JSP Implicit Object</title>
<%@ page import="java.util.Date" %>
</head>
<body bgcolor=#ffffff>
<font color="Black">
<h2> This example gives the Current Date </h2>
<h3>
<% response.setHeader("Refresh", "6"); %>
Current date: <%= new Date() %>.
</h3>
</body>
</html>
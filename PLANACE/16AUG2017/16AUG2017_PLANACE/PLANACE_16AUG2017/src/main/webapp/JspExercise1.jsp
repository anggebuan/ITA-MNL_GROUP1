<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exercise 1 Hello World</title>
</head>
<body>
<p>Hello World!</p></br>
<%=("Your host address is " + request.getRemoteHost())%>
</br>
<%=("Your session id is " + request.getSession().getId()) %>

</body>
</html>
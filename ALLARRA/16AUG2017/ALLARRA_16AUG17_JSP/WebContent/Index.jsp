<%@page import="java.net.InetAddress"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyJSP</title>
</head>
<body>
<h5>HELLO WORLD</h5>

<%
InetAddress ip;
String hostname, address;
ip = InetAddress.getLocalHost();
hostname = ip.getHostName();
address = ip.getHostAddress();

%>
<p>Hostname: <%=hostname %></p>
<p>Hostname: <%=address %></p>

<h3>Excercise2</h3>
<% for(int x=0; x<10; x+=2){

	out.println(x);
	out.print("</br>");
}%>

<%
try{
	out.print("test");
	exceptTest();
}catch(Exception e){
	out.print(e.getMessage());
}
%>
<%-- catching null --%>
</br>
<%
String x= null;
try{
	x.length();
}catch(Exception e){
	out.print(e.getMessage());
}

%>

<%!
	public void exceptTest() throws Exception{
	throw new Exception("wazza exception");
	}
%>

	

</body>
</html>
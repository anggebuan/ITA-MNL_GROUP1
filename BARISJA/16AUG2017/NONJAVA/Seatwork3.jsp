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

<form enctype="multipart/form-data" method="get">
<input type="text" id="text" name="num1"/>
<br> + <br>
<input type="text" id="text" name="num2"/>	
<input type="submit" id="btnSubmit" name="btnSubmit" value="Execute"/>
</form>
<% 




if(request.getParameter("btnSubmit")!=null)
{
	try{
		if(!request.getParameter("num1").isEmpty() && !request.getParameter("num2").isEmpty()){
			out.println("Sum is "+   (Integer.parseInt(request.getParameter("num1")) + Integer.parseInt(request.getParameter("num2"))));
		}
		else{
			throw new RuntimeException("An Error has occured");
		}

	}catch(RuntimeException e){
	out.println(e);
	}
}

%> 

</body>
</html>
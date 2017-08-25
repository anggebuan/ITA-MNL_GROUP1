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
<input type="text" id="text" name="textfield"/>
<input type="submit" id="btnSubmit" name="btnSubmit" value="Execute"/>
</form>
<% 
if(request.getParameter("btnSubmit")!=null) //btnSubmit is the name of your button, not id of that button.
{
	try{
		if(!request.getParameter("textfield").isEmpty()){
			out.println("Text length: "+ request.getParameter("textfield").length());
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
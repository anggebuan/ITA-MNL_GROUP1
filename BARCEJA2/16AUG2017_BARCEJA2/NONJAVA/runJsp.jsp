<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <%@page import="java.util.Date" %> 
</head>
<body>

<%     
       long creationTime = session.getCreationTime();     
       String sessionId = session.getId();     
       long lastAccessedTime = session.getLastAccessedTime();     
       Date createDate= new Date(creationTime);     
       Date lastAccessedDate= new Date(lastAccessedTime);     
       StringBuffer buffer = new StringBuffer();     
       if(session.isNew())     
       {         
         buffer.append("<h3>Welcome </h3>");         
       }     
       else     
       {         
          buffer.append("<h3>Welcome Back!! </h3>");     
       }     
       buffer.append("<STRONG> Session ID : </STRONG>" + sessionId);     buffer.append(" <BR/> ");  
       buffer.append("<STRONG> Session Creation Time </STRONG>: " + createDate);     
       buffer.append(" <BR/> "); buffer.append("<STRONG> Last Accessed Time : </STRONG>" + lastAccessedDate);     
       buffer.append(" <BR/> ");        
    %>     
      
<%
		buffer.append("<STRONG> No. 2: Multiples of   </STRONG>");
		buffer.append(" <BR/> ");  
		int ctr=0;
		for(int x=1 ; x<= 10;x++) {
			if(ctr > 10){
				break;
			}
			ctr = x * 2;
			buffer.append(ctr + ", ");
		}
		
		buffer.append(" <BR/> ");
		buffer.append("<STRONG> No. 3: Error Message</STRONG>");
		buffer.append(" <BR/> ");  
		String str = null;
		try {
			str.length();
		} catch (Exception e) {
			// TODO: handle exception
			buffer.append(e.toString());
		}
%>

<%=buffer.toString()%> 
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<%
java.util.Vector v = (java.util.Vector)session.getAttribute("array");
if (v == null)
{
v = new java.util.Vector(); 
}
String i = null;
String submit = request.getParameter("submit");

if (submit == null)
{
submit = "";
}
if (submit.equals("add") || submit.equals(""))
{
v.addElement(request.getParameter("item"));
%>
<br> Your cart Contains :
<ol>
<%
String[] items = new String[v.size()];
v.copyInto(items);
for (int ix=1; ix < items.length; ix++) {
%>
<li> <% out.print(items[ix]);
}
%>
</ol>

<%
}
if (submit.equals("remove"))
{
String removeitem=request.getParameter("item");
if(v.contains(removeitem))
{
v.removeElement(removeitem);
}
else
{
out.println("element not found in vector");
}

%> 
<br> Your cart Contains :
<ol>
<%
String[] items = new String[v.size()];
v.copyInto(items);
for (int ix=1; ix<items.length; ix++) {
%>
<li> <% out.print(items[ix]);
}
%>
</ol>

<%
}
session.setAttribute("array",v); 
%>
</font>
<hr>
<font size = 3>
<form type=POST>
<BR>
Please Select the item to add or remove:
<br>
Add / Remove Item:
<select name="item">
<option>Chinese food
<option>Phillipino food
<option>Bangladeshi food
</select>
<br> <br>
<input type=submit name="submit" value="add">
<input type=submit name="submit" value="remove">
</form>
</font>
</html>
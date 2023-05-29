<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>URL Params</title>
</head>

<body>
<h1> Reading URL Parameters</h1>
<%
out.println("Value1="+ request.getParameter("Value1"));
out.println("Value1="+ request.getParameter("Value2"));

%>
<br/>

<%@include file= "Test1.txt"%>

</body>
</html>
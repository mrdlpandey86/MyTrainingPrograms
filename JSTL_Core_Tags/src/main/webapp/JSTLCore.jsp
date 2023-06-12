<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="User" class="com.org.User" scope="page"></jsp:useBean>
	<h2>Hello World!</h2>
	<c:set var="name" value="Arun"></c:set>
	<c:out value="${name}"></c:out>
	
	<br/>
	<c:out value="${User.getFirstName()}"></c:out>
	<c:out value="${User.lastName}"></c:out>
	
    <br/>
 
  
</body>
</html>
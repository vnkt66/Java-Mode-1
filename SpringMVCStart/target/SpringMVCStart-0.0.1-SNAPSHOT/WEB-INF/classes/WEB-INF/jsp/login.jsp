<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<c:url var="login" value="/save"></c:url>
<form:form action="${login}" method="post" commandName="login">
UserName: <form:input path="name"/><br />
Password: <form:password path="password"/><br />
<input type="submit" value="Login"/>
</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" 
     prefix="form" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
     prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="log" value="/check"></c:url>
<form:form action="${log}" commandName="login">
<table>
<tr>
<td>Username:</td>
<td><form:input path="name"/></td>
</tr>
<tr>
<td>Password:</td>
<td><form:password path="password"/></td>
</tr>
<tr>
<td><input type="submit" value="Login" /></td>
</tr>
</table>
</form:form>
</body>
</html>
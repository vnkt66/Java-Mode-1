<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<h1>Register</h1>
<c:url var="submit" value="/submit"></c:url>
<form:form action="${submit}" method="post" commandName="emp">
Name: <form:input path="name"/><br />
<span style="color: red"><form:errors path="name"/><br /></span>
Age: <form:input path="age"/><br />
<span style="color: red"><form:errors path="age"/><br /></span>
Role: <form:input path="role"/><br />
<span style="color: red"><form:errors path="role"/><br /></span>
Salary: <form:input path="salary"/><br />
<span style="color: red"><form:errors path="salary"/><br /></span>
<input type="submit" value="Save"/>
</form:form>
</body>
</html>
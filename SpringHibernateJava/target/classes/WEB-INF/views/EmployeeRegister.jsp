<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Registration Page</title>
</head>
<body>
	<h3>Employee Registration Form</h3>
	<c:url var="action" value="/saveEmp"></c:url>
	<form:form action="${action}" method="post" commandName="empForm"
		novalidate="true">
		<table>
			<tr>
				<td>Employee Name:</td>
				<td><form:input path="name" /></td>
				<font color="red"><form:errors path="name" /></font>
			</tr>
			<tr>
				<td>Age:</td>
				<td><form:input path="age" /></td>
				<font color="red"><form:errors path="age" /></font>
			</tr>
			<tr>
				<td>Salary:</td>
				<td><form:input path="salary" /></td>
				<font color="red"><form:errors path="salary" /></font>
			</tr>
			<tr>
				<td>Qualification:</td>
				<td><form:input path="qualification" /></td>
				<font color="red"><form:errors path="qualification" /></font>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input type="email" path="email" /></td>
				<font color="red"><form:errors path="email" /></font>
			</tr>
			<tr>
				<td>Date of Join:</td>
				<td><form:input type="date" path="doj" /></td>
				<font color="red"><form:errors path="doj" /></font>
			</tr>
			<tr>
				<td><input type="submit" value="Add Employee" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
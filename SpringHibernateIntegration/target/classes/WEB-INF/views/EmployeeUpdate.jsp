<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body>
	<h3>Employee Edit Form</h3>
	<c:url var="action" value="/editEmp"></c:url>
	<form:form action="${action}" method="post" commandName="editForm"
		novalidate="true">
		<table>
			<tr>
				<td>Employee Id:</td>
				<td><form:input path="id" readonly="true" /></td>
			</tr>
			<tr>
				<td>Employee Name:</td>
				<td><form:input path="name" readonly="true" /></td>
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
				<td><input type="submit" value="Edit Employee" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
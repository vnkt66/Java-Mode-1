<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Student Registration Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body style="color: gray">
	<h4 style="text-align: center; padding: 20px;">Student
		Registration Form</h4>
	<c:url var="action" value="/saveStudent"></c:url>
	<form:form action="${action}" method="post" commandName="studentForm"
		novalidate="true">
		<div class="container"
			style="border: 1px solid gray; width: 40%; margin: 0 auto; padding: 30px 10px; background: linear-gradient(to right, #ffd89b, #19547b);">
			<div class="row">
				<div class="col-md-3">Name:</div>
				<div class="col-md-9">
					<form:input path="name" style="width: 100%" />
				</div>
			</div>
			<span style="color: red"><form:errors path="name" /><br /></span>
			<div class="row">
				<div class="col-md-3">Age:</div>
				<div class="col-md-9">
					<form:input path="age" style="width: 100%" />
				</div>
			</div>
			<span style="color: red"><form:errors path="age" /><br /></span>
			<div class="row">
				<div class="col-md-3">Gender:</div>
				<div class="col-md-9">
					<form:radiobuttons items="${genderList}" path="gender" />
				</div>
			</div>
			<%-- <span style="color: red"><form:errors path="gender" /><br /></span> --%>
			<div class="row">
				<div class="col-md-3">Course:</div>
				<div class="col-md-9">
					<form:input path="course" style="width: 100%" />
				</div>
			</div>
			<span style="color: red"><form:errors path="course" /><br /></span>
			<div class="row">
				<div class="col-md-3">DOB:</div>
				<div class="col-md-9">
					<form:input type="date" path="dob" min="1820-01-01" max="2000-01-01" style="width: 100%" />
				</div>
			</div>
			<span style="color: red"><form:errors path="dob" /><br /></span>
			<button class="btn btn-primary" type="submit">Add Student</button>
		</div>
	</form:form>
</body>
</html>
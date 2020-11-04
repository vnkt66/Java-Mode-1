<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucess Page</title>
</head>
<body style="box-sizing: border-box">
	<h1 style="text-align: center; color: gray">List of Employees</h1>
	<hr />
	<c:forEach var="employee" items="${employeeList}">
		<ul
			style="border: 1px solid gray; color: gray; font-size: 30px; list-style-type: none; padding: 0; width: 25%; text-align: center; margin: 0 auto 2px auto; display: inline-block">
			Id:
			<li>${employee.id}</li> Name:
			<li>${employee.name}</li> Age:
			<li>${employee.age}</li> Salary:
			<li>${employee.salary}</li> Qualification:
			<li>${employee.qualification}</li> Email:
			<li>${employee.email}</li> DOJ:
			<li>${employee.doj}</li>
			<a href="<c:url value='/fetchById/${employee.id}'/>">
			<img src="<c:url value='/images/vcard_edit.png' />" alt="Edit Employee" title="Edit Employee"/>
			</a>
			<img src="<c:url value='/images/vcard_delete.png' />" alt="Delete Employee" title="Delete Employee" onclick="javascript:deleteEmployee(${employee.id})" />
		</ul>
	</c:forEach>
	<script type="text/javascript">
	function deleteEmployee(eid) {
		if(confirm("Do you want to delete Employee?")) {
			var url = "delete/" + eid;
			window.location.href=url;
		}
	}
	</script>
</body>
</html>
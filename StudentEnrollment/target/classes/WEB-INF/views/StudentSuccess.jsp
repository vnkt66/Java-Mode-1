<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Records Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body style="box-sizing: border-box;">
	<h1 style="text-align: center; color: gray">Student Records</h1>
	<hr />
	<div class="container">
		<div class="row">
			<c:forEach var="student" items="${studentList}">
				<div class="col-md-3"
					style="border: 1px solid gray; box-shadow: 5px 10px 18px #888888;">
					<ul style="color: gray; list-style-type: none; padding: 0;">

						<li>Id: ${student.id}</li>
						<li>Name: ${student.name}</li>
						<li>Age: ${student.age}</li>
						<li>Course: ${student.course}</li>
						<li>Gender: ${student.gender}</li>
						<li>DOB: ${student.dob}</li>
						<%-- <img
				src="<c:url value='/images/vcard_edit.png' />" alt="Edit Student"
				title="Edit Student" /> --%>
						<%-- <a href="<c:url value='/fetchById/${student.id}'/>">Edit 
			</a> --%>
						<button type="button" class="btn btn-primary btn-block"
							onclick="javascript:editStudent(${student.id})">Edit</button>
						<button type="button" class="btn btn-danger btn-block"
							onclick="javascript:deleteStudent(${student.id})">Delete
						</button>
						<%-- <img src="<c:url value='/images/vcard_delete.png' />"
				alt="Delete Student" title="Delete Student"
				onclick="javascript:deleteStudent(${student.id})" /> --%>
					</ul>
				</div>
			</c:forEach>
		</div>
	</div>
	<!-- <script type="text/javascript">
	function deleteStudent(sid) {
		if(confirm("Do you want to delete Student?")) {
			var url = "delete/" + sid;
			window.location.href=url;
		}
	}
	function editStudent(sid) {
			var url = "fetchById/" + sid;
			window.location.href=url;
	}
	</script> -->
	<script src="<c:url value='/js/student.js' />"></script>
</body>
</html>
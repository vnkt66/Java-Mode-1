<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index1 Page</title>
</head>
<body>
<%-- <jsp:forward page="/param">
<jsp:param name="name" value="sam"/>
<jsp:param name="role" value="web developer"/>
</jsp:forward> --%>
<!-- <a href="/SpringMVCStart/fetch/sam/20">Register</a> -->
<jsp:forward page="/param">
<jsp:param name="name" value="sam"/>
<jsp:param name="role" value="web developer"/>
</jsp:forward>
</body>
</html>
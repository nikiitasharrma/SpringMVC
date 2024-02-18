<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	
<link href = "<c:url value="/resources/css/style.css" />" />
<script src = "<c:url value="/resources/js/script.js" />" ></script>

<title>Registration Form</title>
</head>
<body>
	<h2 class="text-center mt-5">${heading}</h2>
	<p class="text-center">${desc}</p>
	<img alt="my image" src="<c:url value="/resources/image/thumbsUp.jpeg" />" >
	<h3 class="ml-5">Hello ${user.userName}!</h3>
	<p class="ml-5">You have been successfully registered with the id:
		${user.id}</p>
</body>
</html>
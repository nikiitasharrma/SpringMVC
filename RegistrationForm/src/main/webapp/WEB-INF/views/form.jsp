<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

<title>Registration Form</title>
</head>
<body>
	<h2 class="text-center mt-5">${heading}</h2>
	<div class="alert alert-danger" role="alert">
		<form:errors path="user.*" />
	</div>
	<div class="container mt-5">
		<form action="processForm" method="post">
		    <div class="form-group">
				<label for="inputId">Id</label> <input type="text"
					class="form-control" id="id" placeholder="Enter id"
					name="id">
			</div>
			<div class="form-group">
				<label for="inputEmail">Email address</label> <input type="email"
					class="form-control" id="inputEmail" placeholder="Enter email"
					name="email">
			</div>

			<div class="form-group">
				<label for="inputUserName">User Name</label> <input type="text"
					class="form-control" id="inputUserName"
					placeholder="Enter userName" name="userName">
			</div>

			<div class="form-group">
				<label for="inputPassword">Password</label> <input type="password"
					class="form-control" id="inputPassword"
					placeholder="Enter password" name="password">
			</div>

			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Register</button>
			</div>

		</form>
	</div>
</html>
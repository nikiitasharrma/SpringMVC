<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
   <p>This is home page
   <br>My name is ${name}
   <br>My age is ${age}
   <br>My friends are:
   <c:forEach items="${f}" var="item">
   <c:out value="${item}" />
   </c:forEach>
</body>
</html>
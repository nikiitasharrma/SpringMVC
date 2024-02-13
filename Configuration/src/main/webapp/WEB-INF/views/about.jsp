<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDateTime" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About</title>
</head>
<body>
   <p>This is the about page</p>
   <%
   String email = (String) request.getAttribute("email");
   LocalDateTime now = (LocalDateTime) request.getAttribute("time");
   %>
   <br> For more information contact at <%=email%>
   <br> Date and time <%=now%>
</body>
</html>
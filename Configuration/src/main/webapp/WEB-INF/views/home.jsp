<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
   <p>This is home page
   
   <%
   String name = (String) request.getAttribute("name");
   Integer age = (Integer) request.getAttribute("age");
   List<String> friends = (List<String>) request.getAttribute("f");%>
   
   <br>My name is <%=name%>
   <br>My age is <%=age%> </p>
   <br>My friends are:
   <%
   for(String s : friends){
   %>
   <br><%=s %>
   <%} %>
</body>
</html>
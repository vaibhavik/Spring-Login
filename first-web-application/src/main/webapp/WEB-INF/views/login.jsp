<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Task management app</title>
</head>
<body>
<p> <font color = "red">${errorMessage}</font></p>
<form action = "/login" method = "POST">

Enter your name <input type = "text" name = "name">
Password <input type = "password" name="password">

<input type = "submit">

</form>

</body>
</html>
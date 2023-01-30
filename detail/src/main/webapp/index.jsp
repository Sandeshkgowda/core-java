<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
</head>
<body>
<h1>Details of person</h1>
<form action="detail" method="post">
<pre>
firstName <input type="text" name="firstName">
lastName<input type="text" name="lastName">
gender<input type="radio" name="gender" value="male">male <input type="radio" name="gender" value="female"> female <input type="radio" name="gender" value="others">others
reason<textarea rows="6" cols="30" name="reason"></textarea>
address<textarea rows="6" cols="30" name="address"></textarea>
<input type="submit" value="send">
</pre>
</form>


</body>
</html>
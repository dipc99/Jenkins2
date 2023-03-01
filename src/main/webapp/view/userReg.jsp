<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>User Registration Form</h1>

<form action="saveUser"  method="get">

<table>

	<tr>  
		<td>User First Name</td>
		<td><input type="text" name="fname"></td>
	</tr>
	
	<tr>  
		<td>User Last Name</td>
		<td><input type="text" name="lname"></td>
	</tr>

	<tr>  
		<td>User Name</td>
		<td><input type="text" name="uname"></td>
	</tr>
	
	<tr>  
		<td>User Email</td>
		<td><input type="text" name="email"></td>
	</tr>

	<tr>  
		<td>User Password</td>
		<td><input type="text" name="password"></td>
	</tr>

<tr>  
<td><input type="submit" value="Register"></td>
</tr>

	</table>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="homepage" >
Enter a name:<input type="text" value="name"/>
Enter a password:<input type="text" value="pass"/>
<input type="submit" value="submit">
<jsp:forward page="welcome.jsp"></jsp:forward>
</form>
</body>
</html>
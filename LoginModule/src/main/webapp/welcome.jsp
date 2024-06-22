<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
		
	
		<h1>welcome ${uname} to Home Page</h1>
		
		<% 
		response.setHeader("Cache-Control", "No-Cache,	no-store,must-revalidate");
		response.setHeader("pragma", "no-cache"); //http = 1.0
		response.setHeader("Expires","0");
		
		
		
		if(session.getAttribute("uname")==null){ 
					response.sendRedirect("login.jsp");
		}
		%>
			
			<a href="videos.jsp">Videos Here</a>
			
			<form action="Logout">
			<input type="submit" value="logout">
			</form>
</body>
</html>
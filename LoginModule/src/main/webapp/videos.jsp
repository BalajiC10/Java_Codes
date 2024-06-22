<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Videos Page</title>
</head>
<body>
		<h1>Videos Page</h1>
		<% 
		response.setHeader("Cache-Control", "No-Cache,	no-store,must-revalidate");
		response.setHeader("pragma", "no-cache"); //http = 1.0
		response.setHeader("Expires","0");

		
		
		if(session.getAttribute("uname")==null){ 
					response.sendRedirect("login.jsp");
		}
			%>
			<iframe width="560" height="315" src="https://www.youtube.com/embed/If1Lw4pLLEo" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" 
			allowfullscreen></iframe>
			
</body>
</html>
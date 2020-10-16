<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=yellow text=greeny>


	<%
		String loginId = (String) session.getAttribute("loginId");
	%>



	Hi
	<%=loginId%><h1>
		<center>Welcome to Employee Home Page..</center>
	</h1>
	<h3>
		<center>
			<a href='ProfileView.jsp'>View Profile</a> <br>
				<a href='Login.html'>Log off</a>
		</center>
	</h3>






</body>
</html>
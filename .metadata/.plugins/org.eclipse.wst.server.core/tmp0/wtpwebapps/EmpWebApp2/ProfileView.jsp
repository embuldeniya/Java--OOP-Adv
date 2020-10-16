<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.dto.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
		Employee emp = (Employee) session.getAttribute("employee");
	

	
	%>
	<%@ include file="EmpHomePage.jsp"%>



	<%if (emp != null) { %>
	<table border=2 align=center>
		<tr>
			<th>Employee ID</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Login ID</th>
			<th>Password</th>
		</tr>

		<tr>
			<td><%=emp.getEmpId()%></td>
			<td><%=emp.getEmpName()%></td>
			<td><%=emp.getSalary()%></td>
			<td><%=emp.getLoginId()%></td>
			<td><%=emp.getPassword()%></td>
		</tr>
	</table>
	<% 	} else {%>
	
	<h3><center>Error</center></h3>
	
	<%
	RequestDispatcher rd = request.getRequestDispatcher("Login.html");
	rd.include(request, response);
	} %>
	

</body>
</html>
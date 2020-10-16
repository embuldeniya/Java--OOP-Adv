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
		Employee employee = (Employee) request.getAttribute("employee");
	%>
	<%@ include file="HrHomePage.jsp"%>

	<table border=2 align=center>
		<tr>
			<th>Employee ID</th>
			<th>Name</th>
			<th>Salary</th>
		</tr>

		<tr>
			<td><%=employee.getEmpId()%></td>
			<td><%=employee.getEmpName()%></td>
			<td><%=employee.getSalary()%></td>
		</tr>
	</table>





</body>
</html>
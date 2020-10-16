<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.dto.Employee ,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		List<Employee> employ = (List<Employee>) request.getAttribute("empList");
	%>
	<%@ include file="HrHomePage.jsp"%>


	<table border=2 align=center>
		<tr>
			<th>Employee ID</th>
			<th>Name</th>
			<th>Salary</th>
		</tr>


		<%
			for (Employee e : employ) {
		%>
		<tr>
			<td><%=e.getEmpId()%></td>
			<td><%=e.getEmpName()%></td>
			<td><%=e.getSalary()%></td>
		</tr>
		<%
			}
		%>

	</table>
</body>
</html>
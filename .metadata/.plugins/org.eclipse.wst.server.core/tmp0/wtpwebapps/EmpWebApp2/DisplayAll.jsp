<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.dto.Employee ,java.util.List"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<%@ include file="HrHomePage.jsp"%>


	<table border=2 align=center>
		<tr>
			<th>Employee ID</th>
			<th>Name</th>
			<th>Salary</th>
		</tr>


		<c:forEach var="emp" items="${empList}">
		<tr>
			<td>${emp.empId}</td>
			<td>${emp.empName}</td>
			<td>${emp.salary}></td>
		</tr>
	</c:forEach>

	</table>
</body>
</html>
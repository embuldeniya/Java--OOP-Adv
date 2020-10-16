<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border=2>
		<tr>
			<th>DEPT ID</th>
			<th>DEPT NAME</th>
			<th>DEPT LOCATIION</th>
			<th>EMPLOYEE DETAILS</th>
		</tr>
		<c:forEach var="dept" items="${deptList}">
			<tr>
				<td>${dept.deptId}</td>
				<td>${dept.deptName}</td>
				<td>${dept.deptLoc}</td>
				<td>
					<table border=2>
						<tr>
							<th>EMP ID</th>
							<th>EMP NAME</th>
							<th>EMP SALARY</th>
						</tr>
						<c:forEach var="emp" items="${dept.empList}">
							<tr>
								<td>${emp.empId}</td>
								<td>${emp.empName}</td>
								<td>${emp.salary}</td>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
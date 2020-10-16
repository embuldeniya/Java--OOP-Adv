<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addEmployee" method="post">
Enter Name : <input type="text" name="empName"><br/>
Enter Salary : <input type="text" name="salary"><br/>
Enter HireDate : <input type="date" name="hireDate"><br/>
Enter Department Number : <select name="deptId">
<c:forEach items="${deptList}" var="dept">
  <option value="${dept.deptId}">${dept.deptId}</option>  
</c:forEach>
</select><br/>
<input type="submit" value="SUBMIT">
</form>
</body>
</html>
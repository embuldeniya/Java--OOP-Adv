<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${message}
<form action="LoginController" method="post"> 
Enter login Id : <input type="text" name="loginId"><br/>
Enter password : <input type="password" name="password"><br/> 
<input type="submit" value="Login">
</form>
<a href='getRegisterForm'>SignUp</a>
</body>
</html>
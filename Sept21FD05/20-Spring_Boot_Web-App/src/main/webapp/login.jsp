<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>Login Page...</h1>
    <hr>
      <div align="center" style="background-color: yellow;">
      <h1>Admin Login</h1>
      <hr>
      <form action="log">
         <label>User Name : </label><input type="text" name="uname"><br><br>
         <label>Password : </label><input type="text" name="pass"><br><br>
          <input type="submit" value="LOGIN">
      </form>
        <a href="registerPage">REGISTER NEW</a>
      
      </div>
       <div align="center" style="background-color: pink;">
       <h1>Employee Login</h1>
       <hr>
      <form action="emplog">
         <label>Employee ID : </label><input type="text" name="uname"><br><br>
          <input type="submit" value="LOGIN">
      </form>
      
      </div>
</body>
</html>
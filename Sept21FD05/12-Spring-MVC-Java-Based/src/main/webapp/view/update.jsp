<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update Page........</h1>
<hr>
 <div align="center">
    <form action="update">
      <label>Rollno : </label><input type="hidden" name="rollno" value="${data.rollno}"><br>
      <label>Name : </label><input type="text" name="name" value="${data.name}"><br>
      <label>Address : </label><input type="text" name="address" value="${data.address}"><br>
      <label>Mobile No : </label><input type="text" name="mobileno" value="${data.mobileno}"><br>
      <input type="submit" value="UPDATE">
    </form>
    </div>
</body>
</html>
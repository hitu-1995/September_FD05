<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Success Page.......</h1>
     
     
      <form name="myForm">
             <table border="1">
       <thead>
       <tr>
       <th>Select</th>
       <th>Rollno</th>
       <th>Name</th>
       <th>Address</th>
       <th>Mobile</th>
       </tr>
       </thead>
       <c:forEach items="${data}" var="stu">
         <tr>
          <td><input type="radio" name="rollno" value="${stu.rollno}"></td>
          <td>${stu.rollno}</td>
          <td>${stu.name}</td>
          <td>	${stu.address}</td>
          <td>${stu.mobileno}</td>
         </tr>       
            </c:forEach>
        </tbody>
       </table>
       

</body>
</html>
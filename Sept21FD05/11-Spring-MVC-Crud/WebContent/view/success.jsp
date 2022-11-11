<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.cjc.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
  <script type="text/javascript">
  
     function editStudent() {
		alert("You Are Editing Student Data");
		document.myForm.action="edit";
		document.myForm.submit();
	}
     function deleteStudent() {
 		alert("You Are Deleting Student Data");
 		document.myForm.action="delete";
 		document.myForm.submit();
 	}
     function addStudent() {
 		alert("You Are Updating Student Data");
 		document.myForm.action="reg";
 		document.myForm.submit();
 	}

     </script>

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
        <tbody>
           <c:forEach items="${data}" var="stu">
         <tr>
          <td><input type="radio" name="rollno" value="${stu.rollno}"></td>
          <td>${stu.rollno}</td>
          <td>${stu.name}</td>
          <td>${stu.address}</td>
          <td>${stu.mobileno}</td>
         </tr>       
            </c:forEach>
        </tbody>
       </table>
          <input type="button" value="EDIT" onclick="editStudent()">
         <input type="button" value="DELETE" onclick="deleteStudent()">
         <input type="button" value="ADD" onclick="addStudent()">
      </form>
</body>
</html>
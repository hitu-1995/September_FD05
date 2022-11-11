<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
   function addEmployee() {
	   alert("You Are Adding Employee");
	   document.myForm.action="registerPage";
	   document.myForm.submit();
    }
   function deleteEmployee() {
	   alert("You Are Deleting Employee");
	   document.myForm.action="delete";
	   document.myForm.submit();
    }
   function editEmployee() {
	   alert("You Are Editing Employee");
	   document.myForm.action="edit";
	   document.myForm.submit();
    }

</script>
<body style="background-color: #9999ff;">

	<form name="myForm">

		<table border="2">
			<thead>
				<tr>
					<th>Select</th>
					<th>E-ID</th>
					<th>E-Name</th>
					<th>E-Address</th>
					<th>E-Department</th>
					<th>E-Designation</th>
					<th>E-Mobile No</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${data}" var="emp">
					<tr>
						<td><input type="radio" name="eid" value="${emp.eid}"></td>
						<td>${emp.eid}</td>
						<td>${emp.ename}</td>
						<td>${emp.address}</td>
						<td>${emp.dept}</td>
						<td>${emp.desig}</td>
						<td>${emp.mobile}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<input type="button" value="ADD" onclick="addEmployee()"> <input
			type="button" value="DELETE" onclick="deleteEmployee()"> <input
			type="button" value="EDIT" onclick="editEmployee()">

	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<script type="text/javascript">
  function  login() {
	  var uname = document.getElementById("uname").value;
	  var pass = document.getElementById("pass").value;
	  alert(uname+"  "+pass);
		var req=new XMLHttpRequest();
		var url="http://localhost:8082/consumeApi/getAllConsumeStudent/"+uname+"/"+pass+"";
		req.open("GET",url,true);
		req.send();
		alert("Success");
		req.onreadystatechange = function()
		{
			alert(req.readyState);
			console.log(req.readyState);
			console.log(req.status);
			
			if(req.readyState==4 && req.status==202)
				{
				alert(req.responseText);
				}
		}
}
</script>
<body>
  <h1>Login Page...</h1>
   <hr>
   
 <label>User Name </label>
   <input type="text" name="uname" id="uname" placeholder="Enter User Name"><br><br>
     <label>Password </label>
   <input type="text" name="pass" id="pass" placeholder="Enter Password"><br>
<input type="button" value="login" onclick="login()">   
   
</body>

</html>
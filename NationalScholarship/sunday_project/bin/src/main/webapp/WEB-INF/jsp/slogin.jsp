<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
 body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password],input[type=date]{
    width: 275px;
  padding: 10px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;

}

textarea{
   width: 96%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
 border: 1px solid #ccc;
  border-radius: 4px;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

input[type=submit]:hover {
  opacity: 0.8;
}

select {
  width:  275px;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 30px;
   height: 108%;
  width: 60%;
} 

</style>
 <script src="assets/js/login.js"></script>
</head>
<body>
<center>
<h1>Login</h1>
<div class="container">
<form  action="loginProcess.do" method="post">
<table>
<tr><th>USERNAME:</th><td><input type="text" name="student_username" id="username"></td></tr>
<tr><td></td><td><div id="error-username" style="color: red"></div></td></tr>

<tr><th>PASSWORD:</th><td><input type="password" name="student_password" id="password"></td></tr>
<tr><td></td><td><div id="error-studentPassword" style="color: red"></div></td></tr>

<tr><th COLSPAN="4"><input type="submit" onclick="return validatelogin()" value="submit" ></th></tr>
</table>
<br>
<a href="ilogin.do">Institute/</a>
			<a href="statelogin.do">State/</a>
			<a href="#">Ministry<a>
			
			<a href="mail.do">Forgot Password</a>
</form>
</div>
</center>
</body>
</html>
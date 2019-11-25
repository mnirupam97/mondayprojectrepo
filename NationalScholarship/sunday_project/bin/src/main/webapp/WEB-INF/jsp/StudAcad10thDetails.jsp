<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
 body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password],input[type=date],input[type=email]{
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
  width:  298px;
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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="assets/js/scholarshipform.js"></script>
<title>10th Details</title>

</head>
<body>
<b>Hello</b>
<div class="container">
	<form id="10thAcademicRegistration" modelAttribute="student10thDetails" action="Register10th.do" method="post">

		<table align="center">
		
		
			<tr><th>10th Roll no:</th><td><input type="text" name="student_10_roll_number" id="student_10_roll_number" /></td></tr>
			<tr><td></td><td><div 	id="error-rollno" style="color: red"></div></td></tr>
			
			
			<tr><th>Board Name:</th><td><input type="text" name="student_board_name" id="student_board_name" /></td></tr>
			<tr><td></td><td><div 	id="error-bname" style="color: red"></div></td></tr>
			
			
			<tr><th>Passing Year:</th><td><input type="date" name="student_passing_year" id="student_passing_year" /></td>(Date on Marskheet)<td></td>></tr>
			<tr><td></td><td><div 	id="error-year" style="color: red"></div></td></tr>
				
				
			<tr><th>Student Percentage:</th><td><input type="text" name="student_percentage" id="student_percentage" /></td></tr>
			<tr><td></td><td><div 	id="error-percentage" style="color: red"></div></td></tr>


			<TR><TH COLSPAN="4"> <INPUT TYPE="submit" onclick="return validate10()" value="Submit"></INPUT></TH> </TR>

</table>
</form></div>
</body>
</html> --%>





<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
 body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password],input[type=date],input[type=email]{
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
  width:  298px;
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
<script src="assets/js/scholarshipform.js"></script>
</head>
<body>
<center>
<h1>Enter 10th Details</h1>

	<div class="container">
	<form id="10thAcademicRegistration" modelAttribute="student10thDetails" action="Register10th.do" method="post">

		<table align="center">
		
		
			<tr><th>10th Roll no:</th><td><input type="text" name="student_10_roll_number" id="student_10_roll_number" /></td></tr>
			<tr><td></td><td><div 	id="error-rollno" style="color: red"></div></td></tr>
			
			<tr><th>Board Name:</th><td><input type="text" name="student_board_name" id="student_board_name" /></td></tr>
			<tr><td></td><td><div 	id="error-bname" style="color: red"></div></td></tr>
			
			<tr><th>Passing Year:</th><td><input type="date" name="student_passing_year" id="student_passing_year" /></td></tr>
			<tr><td></td><td><div 	id="error-year" style="color: red"></div></td></tr>
			
			<tr><th>Student Percentage:</th><td><input type="text" name="student_percentage" id="student_percentage" /></td></tr>
			<tr><td></td><td><div 	id="error-percentage" style="color: red"></div></td></tr>
			
			<tr><td colspan="2"><input type="submit"  onclick="return validate10()"></td></tr>

</table></form></div></center>
</body>
</html>

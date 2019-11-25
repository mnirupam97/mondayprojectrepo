<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
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
   height: 120%;
  width: 60%;
} 
.hide{
display:none;
}

</style> 
<title>Registration</title>


 <script src="assets/js/scholarshipform.js"></script> 
</head>
<body>
<center>
<h1> Registration For User</h1>
<div class="container">
   
	<form id="basicScholarshipRegistration" modelAttribute="basicScholarshipRegistration" action="scholarshipRegister.do" method="post">

		<table align="center">
		
		
		<!-- 	<tr><th>Student ID:</th><td><input type="text" name="student_id" id="student_id" /></td></tr> -->
			
			<tr><th>Scholarship appling  for:</th><td><input type="text" name="scholarship_applied_for" id="scholarship_applied_for" /></td></tr>
			<tr><td></td><td><div 	id="error-scholarship" style="color: red"></div></td></tr>
			
			
			
			
			<tr><th>Aadhar Number</th><td><input type="text" name="student_aadhar_number" id="student_aadhar_number" /></td></tr>
			<tr><td></td><td><div 	id="error-aadhar" style="color: red"></div></td></tr>
			
			<tr>
						<th>Religion</th>
						<td><select id="student_religion" name="student_religion" onchange="optionCheck()">
								<option value="">Select</option>
								<option value="Hindu">Hindu</option>
								<option value="Muslim">Muslim</option>
								<option value="Christian">Christian</option>
						</select></td></tr>
					<tr><td></td><td><div id="error-religion" style="color: red"></div></td></tr>
					
			<tr><th>Caste</th><td><input type="text" name="student_caste" id="student_caste" /></td></tr>
			<tr><td></td><td><div id="error-caste" style="color: red"></div></td></tr>
			
			<tr>
				<th>Father Name</th>
				<td><input type="text" name="student_father_name" id="student_father_name" /></td>
			</tr>
			<tr><td></td><td><div id="error-fname" style="color: red"></div></td></tr>
			
			
			<tr><th>Family Income</th><td><input type="text" name="student_family_income" id="student_family_income" /></td></tr>
			<tr><td></td><td><div id="error-income" style="color: red"></div></td></tr>
			
			<tr><th>IsDisabled</th>
				<td><input type="radio" name="student_is_disabled" id="student_is_disabled" value="yes" onclick="show1();">yes</td>
				<td><input type="radio" name="student_is_disabled" id="student_is_disabled" value="no" onclick="show2();" checked>No</td>
			</tr>
			
			
			<tr id="tod" class="hide"><th>TYPE OF DISABILITY:</th>
				<td> <select name="student_type_disability" id="student_type_disability">
						<option value="">Select</option>
						<option value="deaf">Deaf</option>
						<option value="dumb">Dumb</option>
						<option value="blind">Blind</option>
						<option value="handicapped">Handicapped</option>
						</SELECT></td></tr>
						<tr><td></td><td><div id="error-dtype" style="color: red"></div></td></tr>
			
			
			
			<tr id="dod" class="hide">
				<th>DEGREE OF DISABILITY:</th>
				<td><select name="student_percentage_disability" id="student_percentage_disability">
						<option value="">Null</option>
						<option value="complete">Complete</option>
						<option value="partial">Partial</option>
						</SELECT>
						</td></tr>
						<tr><td></td><td><div id="error-degree" style="color: red"></div></td></tr>
			
			<tr><th>Maritial Status</th><td><input type="radio" name="student_martial_status" value="single" checked>single</td><td><input type="radio" name="student_martial_status" value="married">married</td></tr>
			
			<tr><th>Parents Profession</th><td><input type="text" name="student_parents_profession" id="student_parents_profession" /></td></tr>
		<tr><td></td><td><div id="error-profession" style="color: red"></div></td></tr>
				
				<tr><th colspan="4"><INPUT TYPE="SUBMIT"  id="register" name="register" onclick="return validate()" ></th></tr>
			
		</table>
	</form>
</div>


</center>
</body>
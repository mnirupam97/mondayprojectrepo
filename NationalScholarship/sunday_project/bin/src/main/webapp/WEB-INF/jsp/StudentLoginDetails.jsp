<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fresh Student Registration form</title>
<script src="assets/js/register.js"></script>
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
</head>
<body>

<CENTER>

<H1>REGISTER YOURSELF</H1>
<div class="container">
<form id="StudentLoginDetails"  modelAttribute="StudentLoginDetails" action="registerProcess.do" method="post">
	<table>
	
	<tr><th>NAME:</th><td><input type="text" name="student_name" id="student_name"></td></tr>
	<tr><td></td><td><div id="error-name" style="color: red"></div></td></tr>
	
	
	<tr><th>Gender</th><td> <input type="radio" name="student_gender"  ID="student_gender" value="male" checked> Male
  <input type="radio" name="student_gender" id="student_gender" value="female"> Female<br></td>
  </tr>
  
  
  
	
		<tr>
		<th>STATE OF DOMICILE:</th>
		<TD><select name="student_state_domicile" ID="student_state_domicile">
<option value="">Select</option>
<option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
<option value="Andhra Pradesh">Andhra Pradesh</option>
<option value="Arunachal Pradesh">Arunachal Pradesh</option>
<option value="Assam">Assam</option>
<option value="Bihar">Bihar</option>
<option value="Chandigarh">Chandigarh</option>
<option value="Chhattisgarh">Chhattisgarh</option>
<option value="Dadra and Nagar Haveli">Dadra and Nagar Haveli</option>
<option value="Daman and Diu">Daman and Diu</option>
<option value="Delhi">Delhi</option>
<option value="Goa">Goa</option>
<option value="Gujarat">Gujarat</option>
<option value="Haryana">Haryana</option>
<option value="Himachal Pradesh">Himachal Pradesh</option>
<option value="Jammu and Kashmir">Jammu and Kashmir</option>
<option value="Jharkhand">Jharkhand</option>
<option value="Karnataka">Karnataka</option>
<option value="Kerala">Kerala</option>
<option value="Lakshadweep">Lakshadweep</option>
<option value="Madhya Pradesh">Madhya Pradesh</option>
<option value="Maharashtra">Maharashtra</option>
<option value="Manipur">Manipur</option>
<option value="Meghalaya">Meghalaya</option>
<option value="Mizoram">Mizoram</option>
<option value="Nagaland">Nagaland</option>
<option value="Orissa">Orissa</option>
<option value="Pondicherry">Pondicherry</option>
<option value="Punjab">Punjab</option>
<option value="Rajasthan">Rajasthan</option>
<option value="Sikkim">Sikkim</option>
<option value="Tamil Nadu">Tamil Nadu</option>
<option value="Tripura">Tripura</option>
<option value="Uttaranchal">Uttaranchal</option>
<option value="Uttar Pradesh">Uttar Pradesh</option>
<option value="West Bengal">West Bengal</option>
</select></TD></tr>
<tr><td></td><td><div id="error-state" style="color: red"></div></td></tr>


<TR>
<TH>DISTRICT:</TH><TD><select name="student_district" ID="student_district">
<option value="">Select</option>
<option value="Thane">Thane</option>
<option value="Pune">Pune</option>
<option value="Mumbai">Mumbai</option>
<option value="Nashik">Nashik</option>
<option value="Nagpur">Nagpur</option>
<option value="Ahmadnagar">Ahmadnagar</option>
<option value="Solapur">Solapur</option>
<option value="Jalgaon">Jalgaon</option>
<option value="Kolhapur">Kolhapur</option>
<option value="Aurangabad">Aurangabad</option>
<option value="Nanded">Nanded</option>
<option value="Satara">Satara</option>
<option value="Amravati">Amravati</option>
<option value="Sangli">Sangli</option>
<option value="Yavatmal">Yavatmal</option>
<option value="Raighar">Raighar</option>
<option value="Buldana">Buldana</option>
<option value="Bid">Bid</option>
<option value="Latur">Latur</option>
<option value="Chandrapur">Chandrapur</option>
<option value="Dhule">Dhule</option>
<option value="Jalna">Jalna</option>
<option value="Parbhani">Parbhani</option>
<option value="Akola">Akola</option>
<option value="Osmanabad">Osmanabad</option>
<option value="Nandurbar">Nandurbar</option>
<option value="Ratnagiri">Ratnagiri</option>
<option value="Gondiya">Gondiya</option>
<option value="Wardha">Wardha</option>
<option value="Bhandara">Bhandara</option>
<option value="	Washim">Washim</option>
<option value="Hingoli">Hingoli</option>
<option value="Gadchiroli">Gadchiroli</option>
<option value="	Sindhudurg">Sindhudurg</option>
</select></TD></tr>
<tr><td></td><td><div id="error-district" style="color: red"></div></td></tr>


<TR>
<th>DOB:</th><td><input type="date" name="student_dob" ID="student_dob"></td>
</tr>
<tr><td></td><td><div id="error-dob" style="color: red"></div></td></tr>


<TR><th>MOBILE NUMBER:</th><td><input type="text" name="student_mobile_number" id="student_mobile_number"></td>
  </tr>
  <tr><td></td><td><div id="error-studentMobileNo" style="color: red"></div></td></tr>
  
  <TR><TH>EMAIL ID:</TH><TD><INPUT TYPE="email" name="student_email" ID="student_email"></INPUT></TD></TR>
  <tr><td></td><td><div id="error-studentEmail" style="color: red"></div></td></tr>
  
  <TR><th>INSTITUTE CODE:</th><TD><INPUT TYPE="TEXT" name="student_institute_code" ID="student_institute_code"></INPUT></TD>
  </TR>
   <tr><td></td><td><div id="error-institute" style="color: red"></div></td></tr>
   

<TR><th>AADHAR NUMBER:</th><TD><INPUT TYPE="TEXT" name="student_aadhar_number" ID="student_aadhar_number"></INPUT></TD>
  </TR>
  <tr><td></td><td><div id="error-studentAadharNo" style="color: red"></div></td></tr>
  
  
<TR><th>USERNAME:</th><TD><INPUT TYPE="TEXT" name="student_username" ID="student_username"></INPUT></TD>
  </TR>
<tr><td></td><td><div id="error-username" style="color: red"></div></td></tr>


<TR><TH>PASSWORD:</TH><TD><INPUT TYPE="PASSWORD" name="student_password" id="student_password"></INPUT></TD></TR></tr>
<TR>
<tr><td></td><td><div id="error-studentPassword" style="color: red"></div></td></tr>

<TR><TH>CONFIRM PASSWORD:</TH><TD><INPUT TYPE="PASSWORD" name="C_password" id="C_password"></INPUT></TD></TR>
<tr><td></td><td><div id="error-confpassword" style="color: red"></div></td></tr>
	
	<TR><TH COLSPAN="4"> <INPUT TYPE="submit" onclick="return validate()" value="Submit"></INPUT></TH> </TR>
	</table>
	</form></CENTER>
	</div>
</body>
</html> --%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
* {box-sizing: border-box}
/* Add padding to containers */
.container {
  padding: 16px;
}
/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}
input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}
/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}
/* Set a style for the submit/register button */
.registerbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}
.registerbtn:hover {
  opacity:1;
}
/* Add a blue text color to links */
a {
  color: dodgerblue;
}
/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fresh Student Registration form</title>
</head>
<body>

<CENTER>

<H1>REGISTER HERE</H1>
<form id="StudentLoginDetails" modelAttribute="StudentLoginDetails" action="registerProcess.do" method="post">
	<table>
	
	<tr><th>NAME:<br>(As in Marksheet)</th><td><input type="text" name="student_name" id="student_name"></td></tr>
	
	<tr><th>Gender</th><td> <input type="radio" name="student_gender"  ID="student_gender" value="male" checked> Male
  <input type="radio" name="student_gender" id="student_gender" value="female"> Female<br></td>
  </tr>
  
  
  
	
		<tr>
		<th>STATE OF DOMICILE:</th>
		<TD><select name="student_state_domicile" ID="student_state_domicile">

<option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
<option value="Andhra Pradesh">Andhra Pradesh</option>
<option value="Arunachal Pradesh">Arunachal Pradesh</option>
<option value="Assam">Assam</option>
<option value="Bihar">Bihar</option>
<option value="Chandigarh">Chandigarh</option>
<option value="Chhattisgarh">Chhattisgarh</option>
<option value="Dadra and Nagar Haveli">Dadra and Nagar Haveli</option>
<option value="Daman and Diu">Daman and Diu</option>
<option value="Delhi">Delhi</option>
<option value="Goa">Goa</option>
<option value="Gujarat">Gujarat</option>
<option value="Haryana">Haryana</option>
<option value="Himachal Pradesh">Himachal Pradesh</option>
<option value="Jammu and Kashmir">Jammu and Kashmir</option>
<option value="Jharkhand">Jharkhand</option>
<option value="Karnataka">Karnataka</option>
<option value="Kerala">Kerala</option>
<option value="Lakshadweep">Lakshadweep</option>
<option value="Madhya Pradesh">Madhya Pradesh</option>
<option value="Maharashtra">Maharashtra</option>
<option value="Manipur">Manipur</option>
<option value="Meghalaya">Meghalaya</option>
<option value="Mizoram">Mizoram</option>
<option value="Nagaland">Nagaland</option>
<option value="Orissa">Orissa</option>
<option value="Pondicherry">Pondicherry</option>
<option value="Punjab">Punjab</option>
<option value="Rajasthan">Rajasthan</option>
<option value="Sikkim">Sikkim</option>
<option value="Tamil Nadu">Tamil Nadu</option>
<option value="Tripura">Tripura</option>
<option value="Uttaranchal">Uttaranchal</option>
<option value="Uttar Pradesh">Uttar Pradesh</option>
<option value="West Bengal">West Bengal</option>
</select></TD></tr>


<TR>
<TH>DISTRICT:</TH><TD><select name="student_district" ID="student_district">
<option value="Thane">Thane</option>
<option value="Pune">Pune</option>
<option value="Mumbai">Mumbai</option>
<option value="Nashik">Nashik</option>
<option value="Nagpur">Nagpur</option>
<option value="Ahmadnagar">Ahmadnagar</option>
<option value="Solapur">Solapur</option>
<option value="Jalgaon">Jalgaon</option>
<option value="Kolhapur">Kolhapur</option>
<option value="Aurangabad">Aurangabad</option>
<option value="Nanded">Nanded</option>
<option value="Satara">Satara</option>
<option value="Amravati">Amravati</option>
<option value="Sangli">Sangli</option>
<option value="Yavatmal">Yavatmal</option>
<option value="Raighar">Raighar</option>
<option value="Buldana">Buldana</option>
<option value="Bid">Bid</option>
<option value="Latur">Latur</option>
<option value="Chandrapur">Chandrapur</option>
<option value="Dhule">Dhule</option>
<option value="Jalna">Jalna</option>
<option value="Parbhani">Parbhani</option>
<option value="Akola">Akola</option>
<option value="Osmanabad">Osmanabad</option>
<option value="Nandurbar">Nandurbar</option>
<option value="Ratnagiri">Ratnagiri</option>
<option value="Gondiya">Gondiya</option>
<option value="Wardha">Wardha</option>
<option value="Bhandara">Bhandara</option>
<option value="	Washim">Washim</option>
<option value="Hingoli">Hingoli</option>
<option value="Gadchiroli">Gadchiroli</option>
<option value="	Sindhudurg">Sindhudurg</option>
</select></TD></tr>



<TR>
<th>DOB:</th><td><input type="date" name="student_dob" ID="student_dob"></td>
</tr>



<TR><th>MOBILE NUMBER:</th><td><input type="text" name="student_mobile_number" id="student_mobile_number"></td>
  </tr>
  
  
  <TR><TH>EMAIL ID:</TH><TD><INPUT TYPE="email" name="student_email" ID="student_email"></INPUT></TD></TR>
  
  
  <TR><th>Institute Code:</th><TD><INPUT TYPE="TEXT" name="student_institute_code" ID="student_institute_code"></INPUT></TD>
  </TR>
  </td>
  </tr>
<TR><th>AADHAR NUMBER:</th><TD><INPUT TYPE="TEXT" name="student_aadhar_number" ID="student_aadhar_number"></INPUT></TD>
  </TR>
<TR><th>Username:</th><TD><INPUT TYPE="TEXT" name="student_username" ID="student_username"></INPUT></TD>
  </TR>

<TR><TH>PASSWORD:</TH><TD><INPUT TYPE="PASSWORD" name="student_password" id="student_password"></INPUT></TD></TR></tr>
<TR>
	<TR><TH>CONFIRM PASSWORD:</TH><TD><INPUT TYPE="PASSWORD" name=C_password id=C_password></INPUT></TD></TR>
	<TR><TH COLSPAN="4"> <INPUT TYPE="SUBMIT"></INPUT></TH> </TR>
	</table>
	</form></CENTER>
</body>
</html>
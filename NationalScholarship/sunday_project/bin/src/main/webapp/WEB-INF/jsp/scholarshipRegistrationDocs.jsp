<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Documents upload</title>
</head>
<body>
<h1 align="center">Upload Documents</h1>
<form align="center" action="uploadProcess.do" modelAttribute="ScholarshipRegistrationDocs" method="post"  enctype="multipart/form-data">
<table>
<tr><th>Domicile Certificate:</th><td><input type="file" id="stu_domicile_cert" name="file"></td></tr>
<tr><th>Photo:</th><td><input type="file" id="stu_photo" name="file"></td></tr>
<tr><th>Institute IDcard:</th><td><input type="file" id="stu_institute_idcard" name="file"></td></tr>
<tr><th>Caste/Income Certificate:</th><td><input type="file" id="stu_caste_income_cert" name="file"></td></tr>
<tr><th>Latest Marksheet:</th><td><input type="file" id="stu_previous_year_mark" name="file"></td></tr>
<tr><th>Current Fee Receipt:</th><td><input type="file" id="stu_fee_receipt_current_year" name="file"></td></tr>
<tr><th>Bank Passbook:</th><td><input type="file" id="stu_bank_passbook" name="file"></td></tr>
<tr><th>Aadhar Card:</th><td><input type="file" id="stu_aadhar_card" name="file"></td></tr>
<tr><th>10th Marksheet:</th><td><input type="file" id="stu_10th_markshhet" name="file"></td></tr>
<tr><th>12th Marksheet:</th><td><input type="file" id="stu_12th_marksheet" name="file"></td></tr>

<tr><th colspan="2"><input type="submit" value="submit"></th></tr>

</table>
</form>
</body>
</html>
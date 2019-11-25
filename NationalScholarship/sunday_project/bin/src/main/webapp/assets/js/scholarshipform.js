function show1(){
		document.getElementById('tod').style.display='block';
		document.getElementById('dod').style.display='block';
		}
function show2(){
	document.getElementById('tod').style.display='none';
	document.getElementById('dod').style.display='none';		
}

function validate(){
	
	var scholarsgip_name = document.getElementById('scholarship_applied_for').value;
	
	var aadharNo = document.getElementById('student_aadhar_number').value;
	
	var religion = document.getElementById('student_religion').value;
	
	var caste= document.getElementById('student_caste').value;
	
	var fname = document.getElementById('student_father_name').value;

	var family_income = document.getElementById('student_family_income').value;

	var isdisable = document.getElementById('student_is_disabled').value;

	var type = document.getElementById('student_type_disability').value;
	
	var degree = document.getElementById('student_percentage_disability').value;
	
	var profession = document.getElementById('student_parents_profession').value;

	var aadharRGEX= /^\d{12}$/;
	var aadharResult = aadharRGEX.test(aadharNo);
	
	document.getElementById('error-scholarship').innerHTML='';
	document.getElementById('error-studentAadharNo').innerHTML = '';
	document.getElementById('error-religion').innerHTML = '';
	document.getElementById('error-caste').innerHTML = '';
	document.getElementById('error-fname').innerHTML = '';
	document.getElementById('error-income').innerHTML = '';
	document.getElementById('error-dtype').innerHTML = '';
	document.getElementById('error-degree').innerHTML = '';
	document.getElementById('error-profession').innerHTML = '';
	document.getElementById('error-dtype').innerHTML = '';
	document.getElementById('error-degree').innerHTML = '';
	
	if (scholarsgip_name == '') 
	{
		document.getElementById('error-scholarship').innerHTML = "Select appropriate scholarship";
		return false;
	}
	else if(aadharNo == ''){
		document.getElementById('error-aadhar').innerHTML = "Aadhar no. cannot be blank";
		return false;
	}
	else if(!aadharResult){
		document.getElementById('error-aadhar').innerHTML = "Aadhar should be 12 digits";
		return false;
	}
	else if(religion == ''){
		document.getElementById('error-religion').innerHTML = "Religion not selected";
		return false;
	}
	else if(caste == ''){
		document.getElementById('error-caste').innerHTML = "Caste not selected";
		return false;
	}
	else if(fname == ''){
		document.getElementById('error-fname').innerHTML = "Father's name not entered";
		return false;
	}
	else if(family_income == ''){
		document.getElementById('error-income').innerHTML = "Family income not entered";
		return false;
	}
	else if(isdisable == 'yes'){
		
		if(type==''){
			document.getElementById('error-dtype').innerHTML = "Type of Disability not mentioned";
			return false;
		}
		else if(degree=='')
			{
			document.getElementById('error-degree').innerHTML = "Select the Degree of Disability";
			return false;
			}
		
	}
	else if(profession == ''){
		document.getElementById('error-profession').innerHTML = "Parent's profession not entered";
		return false;
	}
		
	else{return true;}
	
}

function validate10(){
	

	var rollnumber = document.getElementById('student_10_roll_number').value;
	
	var bname = document.getElementById('student_board_name').value;
	
	var year= document.getElementById('student_passing_year').value;
	
	var percentage = document.getElementById('student_percentage').value;

	document.getElementById('error-rollno').innerHTML = '';
	document.getElementById('error-bname').innerHTML = '';
	document.getElementById('error-year').innerHTML = '';
	document.getElementById('error-percentage').innerHTML = '';
	
	
	if (rollnumber == '') 
	{
		document.getElementById('error-rollno').innerHTML = "Roll number not Entered";
		return false;
	}
	else if(bname == ''){
		document.getElementById('error-bname').innerHTML = "Board name not Entered";
		return false;
	}
	else if(year == ''){
		document.getElementById('error-year').innerHTML = "Year of passing not selected";
		return false;
	}
	else if(percentage == ''){
		document.getElementById('error-percentage').innerHTML = "Percentage not Entered";
		return false;
	}
	else if(percentage>100 || percentage<35)
		{
		document.getElementById('error-percentage').innerHTML = "You are not elligible";
		return false;
		}
	else{return true;}
	
}

function validate12(){
	

	var rollnumber = document.getElementById('student_12_roll_number').value;
	
	var bname = document.getElementById('student_board_name').value;
	
	var year= document.getElementById('student_passing_year').value;
	
	var percentage = document.getElementById('student_percentage').value;

	document.getElementById('error-rollno').innerHTML = '';
	document.getElementById('error-bname').innerHTML = '';
	document.getElementById('error-year').innerHTML = '';
	document.getElementById('error-percentage').innerHTML = '';
	
	
	if (rollnumber == '') 
	{
		document.getElementById('error-rollno').innerHTML = "Roll number not Entered";
		return false;
	}
	else if(bname == ''){
		document.getElementById('error-bname').innerHTML = "Board name not Entered";
		return false;
	}
	else if(year == ''){
		document.getElementById('error-year').innerHTML = "Year of passing not selected";
		return false;
	}
	else if(percentage == ''){
		document.getElementById('error-percentage').innerHTML = "Percentage not Entered";
		return false;
	}
	else if(percentage>100 || percentage<35)
		{
		document.getElementById('error-percentage').innerHTML = "You are not elligible";
		return false;
		}
	else{return true;}
	
}

function validatesar(){
	
	var erp = document.getElementById('student_erp_id').value;
	
	var course = document.getElementById('student_present_course').value;
	
	var year= document.getElementById('student_present_year').value;
	
	var mode_study = document.getElementById('student_mode_study').value;

	var start = document.getElementById('student_class_start_date').value;

	var university = document.getElementById('student_university').value;

	var fee = document.getElementById('student_admission_fee').value;
	
	var tufee = document.getElementById('student_tution_fee').value;
	
	var ofee = document.getElementById('student_other_fee').value;
	
/*	var sum = tufee + ofee;*/
	

	if (erp == '') 
	{
		document.getElementById('error-erp').innerHTML = "ERP not Entered";
		return false;
	}
	else if(course == ''){
		document.getElementById('error-course').innerHTML = "Course not Selected";
		return false;
	}
	else if(year == ''){
		document.getElementById('error-year').innerHTML = "Year of Study not selected";
		return false;
	}
	else if(start == ''){
		document.getElementById('error-start').innerHTML = "Year of Study not selected";
		return false;
	}

	else if(university == ''){
		document.getElementById('error-university').innerHTML = "University not selected";
		return false;
	}

	else if(fee == ''){
		document.getElementById('error-fees').innerHTML = "Fees not Entered";
		return false;
	}
	else if(tufee == ''){
		document.getElementById('error-tufees').innerHTML = "Tutuion Fees not Entered";
		return false;
	}
	else if(ofee == ''){
		document.getElementById('error-ofees').innerHTML = "Other Fees not Entered";
		return false;
	}
	/*else if(fee != sum){
		document.getElementById('error-ofees').innerHTML = "Fees dont add up";
		return false;
	}*/

	
	else{return true;}
	
	
	return 
}
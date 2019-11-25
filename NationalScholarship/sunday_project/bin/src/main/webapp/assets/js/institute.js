function instituteValidate() {

	var code = document.getElementById('inst_code').value;
	
	var name = document.getElementById('inst_name').value;
	
	var state= document.getElementById('inst_state').value;
	
	var district= document.getElementById('inst_district').value;
	
	var dise = document.getElementById('inst_dice_code').value;

	var type = document.getElementById('inst_type').value;

	var aff_uni_state = document.getElementById('inst_aff_uni_state').value;
	
	var aff_uni_name= document.getElementById('inst_aff_uni_board').value;
	
	var year = document.getElementById('inst_year_adm_starT').value;

	var username = document.getElementById('inst_username').value;
	
	var est_cert = document.getElementById('inst_estab_cert').value;

	var aff_cert = document.getElementById('inst_uni_affil_cert').value;

	var address = document.getElementById('inst_address').value;
	
	var pname = document.getElementById('inst_principal_name').value;
	
	var pcontact = document.getElementById('inst_contact_number').value;
	
	var contact = document.getElementById('inst_college_phone').value;
	
	var password= document.getElementById('inst_password').value; 
	
	var cpassword= document.getElementById('c_inst_password').value; 
	
	var codeRGEX = /^\d{4}$/;
	var codeResult = codeRGEX.test(code);
	
	var pcontactRGEX = /^\d{10}$/;
	var pcontactResult = pcontactRGEX.test(pcontact);
	
	var contactRGEX = /^\d{8}$/;
	var contactResult = contactRGEX.test(contact);
	
	var passwordRGEX=/^[A-Za-z]\w{7,14}$/;
	var passwordResult = passwordRGEX.test(password);
	
	document.getElementById('error-code').innerHTML = '';
	document.getElementById('error-name').innerHTML = '';
	document.getElementById('error-state').innerHTML = '';
	document.getElementById('error-district').innerHTML = '';
	document.getElementById('error-dise').innerHTML = '';
	document.getElementById('error-type').innerHTML = '';
	document.getElementById('error-aff_state').innerHTML = '';
	document.getElementById('error-aff_board').innerHTML = '';
	document.getElementById('error-started').innerHTML = '';
	document.getElementById('error-username').innerHTML = '';
	document.getElementById('error-reg_cert').innerHTML = '';
	document.getElementById('error-aff_cert').innerHTML = '';
	document.getElementById('error-address').innerHTML = '';
	document.getElementById('error-principle').innerHTML = '';
	document.getElementById('error-pcontact').innerHTML = '';
	document.getElementById('error-contact').innerHTML = '';
	document.getElementById('error-password').innerHTML = '';
	document.getElementById('error-cpassword').innerHTML = '';
	
	if (code == '') 
	{
		document.getElementById('error-code').innerHTML = "Code cannot be blank";
		return false;
	}
	else if(!codeResult)
	{
		document.getElementById('error-code').innerHTML = "Code size must be 4";
		return false;
	}
	else if (name == '') 
	{
		document.getElementById('error-name').innerHTML = "Name cannot be blank";
		return false;
	}
	else if(state == ''){
		document.getElementById('error-state').innerHTML = "State not selected";
		return false;
	}
	else if(district == ''){
		document.getElementById('error-district').innerHTML = "District not selected";
		return false;
	}
	else if(dise == ''){
		document.getElementById('error-dise').innerHTML = "Dise cannot be empty";
		return false;
	}
	else if(type == ''){
		document.getElementById('error-type').innerHTML = "Type not selected";
		return false;
	}
	else if(aff_uni_state == ''){
		document.getElementById('error-aff_state').innerHTML = "Affliated university state not selected";
		return false;
	}
	else if(aff_uni_name == ''){
		document.getElementById('error-aff_board').innerHTML = "University name cannot be empty";
		return false;
	}
	
	else if(year == ''){
		document.getElementById('error-started').innerHTML = "Year not selected";
		return false;
	}
	else if(username == ''){
		document.getElementById('error-username').innerHTML = "Username name cannot be empty";
		return false;
	}
		
	else if(est_cert == ''){
		document.getElementById('error-reg_cert').innerHTML = "Upload Document";
		return false;
	}
	else if(aff_cert == ''){
		document.getElementById('error-aff_cert').innerHTML = "Upload Document";
		return false;
	}
	else if(address == ''){
		document.getElementById('error-address').innerHTML = "Enter Address";
		return false;
	}
	else if(pname == ''){
		document.getElementById('error-principle').innerHTML = "Enter Principal's name";
		return false;
	}
	else if(pcontact == ''){
		document.getElementById('error-pcontact').innerHTML = "Principal number not added";
		return false;
	}
	else if(!pcontactResult){
		document.getElementById('error-pcontact').innerHTML = "Contact Number should be 10 digits";
		return false;
	}
	
	else if(contact == ''){
		document.getElementById('error-contact').innerHTML = "Contact Number not added";
		return false;
	}
	else if(!contactResult){
		document.getElementById('error-contact').innerHTML = "Contact Number should be 8 digits";
		return false;
	}
	
	else if(password == ''){
		document.getElementById('error-password').innerHTML = "Password cannot be empty";
		return false;
	}
	else if(!passwordResult){
		document.getElementById('error-password').innerHTML = "Password format is wrong<br>Atleast 1 Capital and Small alphabet<br>Atleast 1 number";
		return false;
	}
	else{
		if(password != cpassword)
		{
		document.getElementById('error-cpassword').innerHTML = "Password does not match";
		return false;
		}
	else
		{
			return true;
		}

	}
	
}
function validate() {

	
	var name = document.getElementById('student_name').value;
	
	var state = document.getElementById('student_state_domicile').value;
	
	var district= document.getElementById('student_district').value;
	
	var dob = document.getElementById('student_dob').value;

	var mobileNumber = document.getElementById('student_mobile_number').value;

	var email = document.getElementById('student_email').value;
	
	var institute= document.getElementById('student_institute_code').value;
	
	var aadharNo = document.getElementById('student_aadhar_number').value;

	var userName = document.getElementById('student_username').value;

	var setPassword = document.getElementById('student_password').value;

	var confPassword = document.getElementById('C_password').value;
	
	var nameRGEX = /^[A-Za-z]+$/;
	var nameResult = nameRGEX.test(name);

	var phoneRGEX = /^\d{10}$/;
	var phoneResult = phoneRGEX.test(mobileNumber);
	  
	var passwordRGEX=/^[A-Za-z]\w{7,14}$/;
	var passwordResult = passwordRGEX.test(setPassword);
	
	var aadharRGEX= /^\d{12}$/;
	var aadharResult = aadharRGEX.test(aadharNo);

	
	var emailRGEX=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	var emailResult = emailRGEX.test(email);
	
	document.getElementById('error-name').innerHTML = '';
	document.getElementById('error-state').innerHTML = '';
	document.getElementById('error-district').innerHTML = '';
	document.getElementById('error-dob').innerHTML = '';
	document.getElementById('error-studentMobileNo').innerHTML = '';
	document.getElementById('error-studentEmail').innerHTML = '';
	document.getElementById('error-institute').innerHTML = '';
	document.getElementById('error-studentAadharNo').innerHTML = '';
	document.getElementById('error-username').innerHTML = '';
	document.getElementById('error-studentPassword').innerHTML = '';
	document.getElementById('error-confpassword').innerHTML = '';
	
	
	if (name == '') 
	{
		document.getElementById('error-name').innerHTML = "Name cannot be blank";
		return false;
	}
	else if (!nameResult) 
	{
		document.getElementById('error-name').innerHTML = "Name can only have Alphabets";
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
	else if(dob == ''){
		document.getElementById('error-dob').innerHTML = "Date Of Birth not selected";
		return false;
	}
	else if(mobileNumber == ''){
		document.getElementById('error-studentMobileNo').innerHTML = "Mobile Number cannot be blank";
		return false;
	}
	else if(!phoneResult){
		document.getElementById('error-studentMobileNo').innerHTML = "Mobile Number needs to be 10 digits ";
		return false;
	}
	
	else if(email == ''){
		document.getElementById('error-studentEmail').innerHTML = "Email cannot be blank";
		return false;
	}
	
	else if(!emailRGEX){
		document.getElementById('error-studentEmail').innerHTML = "Email format is wrong";
		return false;
	}

	else if(institute == ''){
		document.getElementById('error-institute').innerHTML = "Institute Code not Entered";
		return false;
	}
	else if(aadharNo == ''){
		document.getElementById('error-studentAadharNo').innerHTML = "Aadhar no. cannot be blank";
		return false;
	}
	else if(!aadharResult){
		document.getElementById('error-studentAadharNo').innerHTML = "Aadhar should be 12 digit number";
		return false;
	}
	else if(userName == ''){
		document.getElementById('error-username').innerHTML = "UserName cannot be blank";
		return false;
	}
	else if(setPassword == ''){
		document.getElementById('error-studentPassword').innerHTML = "Set Password cannot be blank";		
		return false;
	}
	else if(!passwordResult){
		document.getElementById('error-studentPassword').innerHTML = "Password format is wrong<br>Atleast 1 Capital and Small alphabet<br>Aleast 1 number<br>Atleast 8 Characters";		
		return false;
	}
	else if(confPassword == ''){
		document.getElementById('error-confpassword').innerHTML = "Confirm Password cannot be blank";
		return false;
	}
	else{
		
				if(setPassword != confPassword)
					{
					document.getElementById('error-confpassword').innerHTML = "Password does not match";
					return false;
					}
				else
					{
						return true;
					}
		
		
	}
	
}

function validateage(){
	

	var age=document.getElementById('error-dob').value;

	document.getElementById('error-dob').innerHTML = '';

	age = parseInt(age, 10);


	if (isNaN(age) || age <18 || age > 40)
	{ 
	document.getElementById('error-dob').innerHTML = "The age must be between 18 and 40";

	return false;
	}
	}
function populateRespectiveCity() {
	var htmlstring;
	var state = document.getElementById("student_state_domicile");
	var statevalue = state.options[state.selectedIndex].value;
	var xhr = new XMLHttpRequest();
	xhr.open('GET', 'resource/StateCity.json');
	xhr.responseType = 'text';
	xhr.send();

	xhr.onload = function() {
		if (xhr.status == 200) {
			var stateCityData = JSON.parse(xhr.responseText);
			for (let indexouter = 0; indexouter < stateCityData.states.length; indexouter++) {
				if (statevalue == stateCityData.states[indexouter].state) {
					for (let index = 0; index < stateCityData.states[indexouter].districts.length; index++) {
						htmlstring += "<option value='"
								+ stateCityData.states[indexouter].districts[index]
								+ "'>"
								+ stateCityData.states[indexouter].districts[index]
								+ "</option>"
					}
					document.getElementById("student_district").innerHTML = htmlstring;
				}

			}

		}

	}

}


/*function optionCheck() {



	var a = document.getElementById('input').value;

	if (a === 'Maharashtra') {

		var array = [ "Pune", "Palghar", "Thane" ];

	} else if (a === 'Kerala') {

		var array = [ "Irinjalakuda", "Thirissur", "Shornur" ];

	} else {

		var array = [];

	}



	var optionValue = "";

	for (i = 0; i < array.length; i++) {



		optionValue = optionValue + "<option>" + array[i] + "</option>";

	}

	optionValue = "<select name = 'lol'>" + optionValue + "</select>";

	document.getElementById('output').innerHTML = optionValue;

};*/
function validate(){

	
	var password = document.getElementById('student_password').value;
	
	var cpassword = document.getElementById('cstudent_password').value;
	
	
		document.getElementById('error-studentPassword').innerHTML = '';
		document.getElementById('error-cstudentPassword').innerHTML = '';
		
		var passwordRGEX=/^[A-Za-z]\w{7,14}$/;
		var passwordResult = passwordRGEX.test(password);
		
		if (password== '') 
		{
			document.getElementById('error-studentPassword').innerHTML = "Password cannot be blank";
			return false;
		}
		else if(!passwordResult){
			document.getElementById('error-studentPassword').innerHTML = "Password format is wrong<br>Atleast 1 Capital and Small alphabet<br>Aleast 1 number<br>Atleast 8 Characters";		
			return false;
		}
		else if(cpassword == ''){
			document.getElementById('error-cstudentPassword').innerHTML = "Confirm Password cannot be blank";
			return false;
		}
		else{
			
					if(password != cpassword)
						{
						document.getElementById('error-cstudentPassword').innerHTML = "Password does not match";
						return false;
						}
					else
						{
							return true;
						}
			
			
		}
	
}
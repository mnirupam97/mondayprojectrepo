function validatelogin() {
	var username = document.getElementById('username').value;

	var password = document.getElementById('password').value;

	document.getElementById('error-username').innerHTML = '';
	document.getElementById('error-studentPassword').innerHTML = '';	
	
	if(username == ''){
		document.getElementById('error-username').innerHTML = "UserName cannot be blank";
		return false;
	}
	else if(password == ''){
		document.getElementById('error-studentPassword').innerHTML = "Password cannot be blank";		
		return false;
	}
	else
		{
		return true;
		}
		}
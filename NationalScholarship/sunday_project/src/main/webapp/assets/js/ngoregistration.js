function populateRespectiveCity() {
	var htmlstring;
	var state = document.getElementById("student_state_domicile");
	var statevalue = state.options[state.selectedIndex].value;
	var xhr = new XMLHttpRequest();
	xhr.open('GET', 'RESOURCE/StateCity.json');
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
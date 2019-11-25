package com.NationalScholarship.model;

//import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="STATE_NODAL")
public class stateNodal {
	
	@Id
	private String state_name;
	private String state_username;
	private String state_password;
	
	//private String state_status

	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public String getState_username() {
		return state_username;
	}
	public void setState_username(String state_username) {
		this.state_username = state_username;
	}
	public String getState_password() {
		return state_password;
	}
	public void setState_password(String state_password) {
		this.state_password = state_password;
	}
	public stateNodal() {
		super();
	}
	@Override
	public String toString() {
		return "stateNodal [state_name=" + state_name + ", state_username=" + state_username + ", state_password="
				+ state_password + "]";
	}
	
	

}

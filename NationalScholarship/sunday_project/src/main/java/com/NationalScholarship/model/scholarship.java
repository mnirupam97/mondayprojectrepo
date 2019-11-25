package com.NationalScholarship.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="scholarship")
public class scholarship {

	
	@Id
	private String scholarship_id ;
	private  String scholarship_name ;
	private  String scholarship_criteria;
	public String getScholarship_id() {
		return scholarship_id;
	}
	public void setScholarship_id(String scholarship_id) {
		this.scholarship_id = scholarship_id;
	}
	public String getScholarship_name() {
		return scholarship_name;
	}
	public void setScholarship_name(String scholarship_name) {
		this.scholarship_name = scholarship_name;
	}
	public String getScholarship_criteria() {
		return scholarship_criteria;
	}
	public void setScholarship_criteria(String scholarship_criteria) {
		this.scholarship_criteria = scholarship_criteria;
	}
	public scholarship() {
		super();
	}
	@Override
	public String toString() {
		return "scholarship [scholarship_id=" + scholarship_id + ", scholarship_name=" + scholarship_name
				+ ", scholarship_criteria=" + scholarship_criteria + "]";
	}
	
	
	
}

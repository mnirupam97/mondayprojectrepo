package com.NationalScholarship.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="STUDENT_LOGIN_DETAILS")
public class StudentLoginDetails {

	@Id
	private String student_username;
	private String student_name;
	private String student_gender;
	private String student_state_domicile;
	private String student_district;
	@Temporal(TemporalType.DATE)
	private Date student_dob;
	private String student_mobile_number;
	private String student_email;
	@OneToOne
	@JoinColumn(name="inst_code")
	private Institute institute;
	private String student_aadhar_number;
	private String student_password;
	private String status; //do inst status here and add one more state status bit
	private String state_status;
	
	
	
	public String getState_status() {
		return state_status;
	}
	public void setState_status(String state_status) {
		this.state_status = state_status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStudent_username() {
		return student_username;
	}
	public void setStudent_username(String student_username) {
		this.student_username = student_username;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_gender() {
		return student_gender;
	}
	public void setStudent_gender(String student_gender) {
		this.student_gender = student_gender;
	}
	public String getStudent_state_domicile() {
		return student_state_domicile;
	}
	public void setStudent_state_domicile(String student_state_domicile) {
		this.student_state_domicile = student_state_domicile;
	}
	public String getStudent_district() {
		return student_district;
	}
	public void setStudent_district(String student_district) {
		this.student_district = student_district;
	}
	
	
	
	
	public Date getStudent_dob() {
		return student_dob;
	}
	public void setStudent_dob(Date student_dob) {
		this.student_dob = student_dob;
	}
	public String getStudent_mobile_number() {
		return student_mobile_number;
	}
	public void setStudent_mobile_number(String student_mobile_number) {
		this.student_mobile_number = student_mobile_number;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	
	
	public Institute getInstitute() {
		return institute;
	}
	public void setInstitute(Institute institute) {
		this.institute = institute;
	}
	public String getStudent_aadhar_number() {
		return student_aadhar_number;
	}
	public void setStudent_aadhar_number(String student_aadhar_number) {
		this.student_aadhar_number = student_aadhar_number;
	}
	public String getStudent_password() {
		return student_password;
	}
	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}
	public StudentLoginDetails() {
		super();
	}
	@Override
	public String toString() {
		return "StudentLoginDetails [student_username=" + student_username + ", student_name=" + student_name
				+ ", student_gender=" + student_gender + ", student_state_domicile=" + student_state_domicile
				+ ", student_district=" + student_district + ", student_dob=" + student_dob + ", student_mobile_number="
				+ student_mobile_number + ", student_email=" + student_email + ", institute=" + institute
				+ ", student_aadhar_number=" + student_aadhar_number + ", student_password=" + student_password
				+ ", status=" + status + ", state_status=" + state_status + "]";
	}
	
	
	
	
	
	
	
	
	
	
}

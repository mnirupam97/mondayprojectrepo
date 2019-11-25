package com.NationalScholarship.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="basic_scholarship_registration")
public class basicScholarshipRegistration {
	
	@Id
	 private String student_aadhar_number ;
	 @OneToOne
	 @JoinColumn(name="student_username")
	 private StudentLoginDetails studentLoginDetails;
	 
	 private String scholarship_applied_for ;
	 private String student_religion ;
	 private String student_caste ;
	 private String student_father_name ;
	 private String student_family_income;
	 private String student_is_disabled ;
	 private String student_type_disability ;
	 private String student_percentage_disability ;
	 private String student_martial_status ;
	 private String student_parents_profession ;
	
	public StudentLoginDetails getStudentLoginDetails() {
		return studentLoginDetails;
	}
	public void setStudentLoginDetails(StudentLoginDetails studentLoginDetails) {
		this.studentLoginDetails = studentLoginDetails;
	}
	public String getScholarship_applied_for() {
		return scholarship_applied_for;
	}
	public void setScholarship_applied_for(String scholarship_applied_for) {
		this.scholarship_applied_for = scholarship_applied_for;
	}
	public String getStudent_aadhar_number() {
		return student_aadhar_number;
	}
	public void setStudent_aadhar_number(String student_aadhar_number) {
		this.student_aadhar_number = student_aadhar_number;
	}
	public String getStudent_religion() {
		return student_religion;
	}
	public void setStudent_religion(String student_religion) {
		this.student_religion = student_religion;
	}
	public String getStudent_caste() {
		return student_caste;
	}
	public void setStudent_caste(String student_caste) {
		this.student_caste = student_caste;
	}
	public String getStudent_father_name() {
		return student_father_name;
	}
	public void setStudent_father_name(String student_father_name) {
		this.student_father_name = student_father_name;
	}
	public String getStudent_family_income() {
		return student_family_income;
	}
	public void setStudent_family_income(String student_family_income) {
		this.student_family_income = student_family_income;
	}
	public String getStudent_is_disabled() {
		return student_is_disabled;
	}
	public void setStudent_is_disabled(String student_is_disabled) {
		this.student_is_disabled = student_is_disabled;
	}
	public String getStudent_type_disability() {
		return student_type_disability;
	}
	public void setStudent_type_disability(String student_type_disability) {
		this.student_type_disability = student_type_disability;
	}
	public String getStudent_percentage_disability() {
		return student_percentage_disability;
	}
	public void setStudent_percentage_disability(String student_percentage_disability) {
		this.student_percentage_disability = student_percentage_disability;
	}
	public String getStudent_martial_status() {
		return student_martial_status;
	}
	public void setStudent_martial_status(String student_martial_status) {
		this.student_martial_status = student_martial_status;
	}
	public String getStudent_parents_profession() {
		return student_parents_profession;
	}
	public void setStudent_parents_profession(String student_parents_profession) {
		this.student_parents_profession = student_parents_profession;
	}
	public basicScholarshipRegistration() {
		super();
	}
	@Override
	public String toString() {
		return "basicScholarshipRegistration [student_aadhar_number=" + student_aadhar_number + ", studentLoginDetails="
				+ studentLoginDetails + ", scholarship_applied_for=" + scholarship_applied_for + ", student_religion="
				+ student_religion + ", student_caste=" + student_caste + ", student_father_name=" + student_father_name
				+ ", student_family_income=" + student_family_income + ", student_is_disabled=" + student_is_disabled
				+ ", student_type_disability=" + student_type_disability + ", student_percentage_disability="
				+ student_percentage_disability + ", student_martial_status=" + student_martial_status
				+ ", student_parents_profession=" + student_parents_profession + "]";
	}
	
	
	
	 
	 

}

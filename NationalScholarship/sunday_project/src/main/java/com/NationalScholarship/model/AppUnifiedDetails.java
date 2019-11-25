package com.NationalScholarship.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity()
@Table(name="appl_unified_details")
public class AppUnifiedDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int unified_appl_id;
	@OneToOne
	@JoinColumn(name="id")
	private ScholarshipRegistrationDocs scholarshipRegistrationDocs;
	
	@OneToOne
	@JoinColumn(name="student_erp_id")
	private studentAcademicsRegistration studentacademicregistration;
	
	@OneToOne
	@JoinColumn(name="student_10_roll_number")
	private student10thDetails student10thDetails;
	
	@OneToOne
	@JoinColumn(name="student_12_roll_number")
	private student10thDetails student12thDetails;
	
	
	@OneToOne
	@JoinColumn(name="student_aadhar_number")
	private basicScholarshipRegistration basicscholarshipregistration;
	
	@OneToOne
	@JoinColumn(name="inst_code")
	private Institute institute;
	
	
	@OneToOne
	@JoinColumn(name="student_username")
	private StudentLoginDetails studentLoginDetails;


	public int getUnified_appl_id() {
		return unified_appl_id;
	}


	public void setUnified_appl_id(int unified_appl_id) {
		this.unified_appl_id = unified_appl_id;
	}


	public ScholarshipRegistrationDocs getScholarshipRegistrationDocs() {
		return scholarshipRegistrationDocs;
	}


	public void setScholarshipRegistrationDocs(ScholarshipRegistrationDocs scholarshipRegistrationDocs) {
		this.scholarshipRegistrationDocs = scholarshipRegistrationDocs;
	}


	public studentAcademicsRegistration getStudentacademicregistration() {
		return studentacademicregistration;
	}


	public void setStudentacademicregistration(studentAcademicsRegistration studentacademicregistration) {
		this.studentacademicregistration = studentacademicregistration;
	}


	public student10thDetails getStudent10thDetails() {
		return student10thDetails;
	}


	public void setStudent10thDetails(student10thDetails student10thDetails) {
		this.student10thDetails = student10thDetails;
	}


	public student10thDetails getStudent12thDetails() {
		return student12thDetails;
	}


	public void setStudent12thDetails(student10thDetails student12thDetails) {
		this.student12thDetails = student12thDetails;
	}


	public basicScholarshipRegistration getBasicscholarshipregistration() {
		return basicscholarshipregistration;
	}


	public void setBasicscholarshipregistration(basicScholarshipRegistration basicscholarshipregistration) {
		this.basicscholarshipregistration = basicscholarshipregistration;
	}


	public Institute getInstitute() {
		return institute;
	}


	public void setInstitute(Institute institute) {
		this.institute = institute;
	}


	public StudentLoginDetails getStudentLoginDetails() {
		return studentLoginDetails;
	}


	public void setStudentLoginDetails(StudentLoginDetails studentLoginDetails) {
		this.studentLoginDetails = studentLoginDetails;
	}


	@Override
	public String toString() {
		return "AppUnifiedDetails [unified_appl_id=" + unified_appl_id + ", scholarshipRegistrationDocs="
				+ scholarshipRegistrationDocs + ", studentacademicregistration=" + studentacademicregistration
				+ ", student10thDetails=" + student10thDetails + ", student12thDetails=" + student12thDetails
				+ ", basicscholarshipregistration=" + basicscholarshipregistration + ", institute=" + institute
				+ ", studentLoginDetails=" + studentLoginDetails + "]";
	}
	
	
	

}

package com.NationalScholarship.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="scholarship_registration_docs")
public class ScholarshipRegistrationDocs {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@OneToOne
	@JoinColumn(name="student_username")
	private StudentLoginDetails studentLoginDetails;
	
	private String stu_domicile_cert ;
	private String stu_photo ;
	private String stu_institute_idcard ;
	private String stu_caste_income_cert ;
	private String stu_previous_year_mark ;
	private String stu_fee_receipt_current_year;
	private String stu_bank_passbook ;
	private String stu_aadhar_card ;
	private String stu_10th_markshhet ;
	private String stu_12th_marksheet ;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StudentLoginDetails getStudentLoginDetails() {
		return studentLoginDetails;
	}
	public void setStudentLoginDetails(StudentLoginDetails studentLoginDetails) {
		this.studentLoginDetails = studentLoginDetails;
	}

	public String getStu_domicile_cert() {
		return stu_domicile_cert;
	}
	public void setStu_domicile_cert(String stu_domicile_cert) {
		this.stu_domicile_cert = stu_domicile_cert;
	}
	public String getStu_photo() {
		return stu_photo;
	}
	public void setStu_photo(String stu_photo) {
		this.stu_photo = stu_photo;
	}
	public String getStu_institute_idcard() {
		return stu_institute_idcard;
	}
	public void setStu_institute_idcard(String stu_institute_idcard) {
		this.stu_institute_idcard = stu_institute_idcard;
	}
	public String getStu_caste_income_cert() {
		return stu_caste_income_cert;
	}
	public void setStu_caste_income_cert(String stu_caste_income_cert) {
		this.stu_caste_income_cert = stu_caste_income_cert;
	}
	public String getStu_previous_year_mark() {
		return stu_previous_year_mark;
	}
	public void setStu_previous_year_mark(String stu_previous_year_mark) {
		this.stu_previous_year_mark = stu_previous_year_mark;
	}
	public String getStu_fee_receipt_current_year() {
		return stu_fee_receipt_current_year;
	}
	public void setStu_fee_receipt_current_year(String stu_fee_receipt_current_year) {
		this.stu_fee_receipt_current_year = stu_fee_receipt_current_year;
	}
	public String getStu_bank_passbook() {
		return stu_bank_passbook;
	}
	public void setStu_bank_passbook(String stu_bank_passbook) {
		this.stu_bank_passbook = stu_bank_passbook;
	}
	public String getStu_aadhar_card() {
		return stu_aadhar_card;
	}
	public void setStu_aadhar_card(String stu_aadhar_card) {
		this.stu_aadhar_card = stu_aadhar_card;
	}
	public String getStu_10th_markshhet() {
		return stu_10th_markshhet;
	}
	public void setStu_10th_markshhet(String stu_10th_markshhet) {
		this.stu_10th_markshhet = stu_10th_markshhet;
	}
	public String getStu_12th_marksheet() {
		return stu_12th_marksheet;
	}
	public void setStu_12th_marksheet(String stu_12th_marksheet) {
		this.stu_12th_marksheet = stu_12th_marksheet;
	}
	
	public ScholarshipRegistrationDocs() {
		super();
	}
	@Override
	public String toString() {
		return "ScholarshipRegistrationDocs [username="  + ", stu_domicile_cert=" + stu_domicile_cert
				+ ", stu_photo=" + stu_photo + ", stu_institute_idcard=" + stu_institute_idcard
				+ ", stu_caste_income_cert=" + stu_caste_income_cert + ", stu_previous_year_mark="
				+ stu_previous_year_mark + ", stu_fee_receipt_current_year=" + stu_fee_receipt_current_year
				+ ", stu_bank_passbook=" + stu_bank_passbook + ", stu_aadhar_card=" + stu_aadhar_card
				+ ", stu_10th_markshhet=" + stu_10th_markshhet + ", stu_12th_marksheet=" + stu_12th_marksheet
				+ "]";
	}
	
	
	
	
}

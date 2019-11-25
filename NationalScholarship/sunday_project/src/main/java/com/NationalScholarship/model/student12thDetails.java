package com.NationalScholarship.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
@Table(name="student_12th_details")
public class student12thDetails {
	
	@Id
	 private String student_12_roll_number;
	 @OneToOne//(cascade=CascadeType.ALL)
	@JoinColumn(name="student_username")
	private StudentLoginDetails studentLoginDetails;
	 private String student_board_name; 
	 @Temporal(TemporalType.DATE)
	  private Date student_passing_year;  
	  private String student_percentage;
	 // private String student_id;
	public String getStudent_12_roll_number() {
		return student_12_roll_number;
	}
	public void setStudent_12_roll_number(String student_12_roll_number) {
		this.student_12_roll_number = student_12_roll_number;
	}
	public String getStudent_board_name() {
		return student_board_name;
	}
	public void setStudent_board_name(String student_board_name) {
		this.student_board_name = student_board_name;
	}
	
	public Date getStudent_passing_year() {
		return student_passing_year;
	}
	public void setStudent_passing_year(Date student_passing_year) {
		this.student_passing_year = student_passing_year;
	}
	public String getStudent_percentage() {
		return student_percentage;
	}
	public void setStudent_percentage(String student_percentage) {
		this.student_percentage = student_percentage;
	}
	
	
	
	public StudentLoginDetails getStudentLoginDetails() {
		return studentLoginDetails;
	}
	public void setStudentLoginDetails(StudentLoginDetails studentLoginDetails) {
		this.studentLoginDetails = studentLoginDetails;
	}
	public student12thDetails() {
		super();
	}
	@Override
	public String toString() {
		return "student12thDetails [student_12_roll_number=" + student_12_roll_number + ", studentLoginDetails="
				+ studentLoginDetails + ", student_board_name=" + student_board_name + ", student_passing_year="
				+ student_passing_year + ", student_percentage=" + student_percentage + "]";
	}
	
	
	  
	  

}

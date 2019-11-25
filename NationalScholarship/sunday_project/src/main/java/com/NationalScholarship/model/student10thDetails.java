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

import org.hibernate.annotations.Cascade;

@Entity 
@Table(name="student_10th_details")
public class student10thDetails {
	
	@Id
	private String student_10_roll_number;
	@OneToOne//(cascade=CascadeType.ALL)
	@JoinColumn(name="student_username")
	
	private StudentLoginDetails studentLoginDetails;
	private String student_board_name;
	@Temporal(TemporalType.DATE)
	private Date student_passing_year;
	private String student_percentage;
	public String getStudent_10_roll_number() {
		return student_10_roll_number;
	}
	public void setStudent_10_roll_number(String student_10_roll_number) {
		this.student_10_roll_number = student_10_roll_number;
	}
	
	public StudentLoginDetails getStudentLoginDetails() {
		return studentLoginDetails;
	}
	public void setStudentLoginDetails(StudentLoginDetails studentLoginDetails) {
		this.studentLoginDetails = studentLoginDetails;
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
	
	@Override
	public String toString() {
		return "student10thDetails [student_10_roll_number=" + student_10_roll_number + ", studentLoginDetails="
				+ studentLoginDetails + ", student_board_name=" + student_board_name + ", student_passing_year="
				+ student_passing_year + ", student_percentage=" + student_percentage + "]";
	}
	public student10thDetails() {
		super();
	}
	
	

}

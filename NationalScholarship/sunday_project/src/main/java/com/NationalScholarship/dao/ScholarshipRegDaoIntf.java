package com.NationalScholarship.dao;

import java.util.List;

import com.NationalScholarship.model.Institute;
import com.NationalScholarship.model.ScholarshipRegistrationDocs;
import com.NationalScholarship.model.StudentLoginDetails;
import com.NationalScholarship.model.basicScholarshipRegistration;
import com.NationalScholarship.model.stateNodal;
import com.NationalScholarship.model.student10thDetails;
import com.NationalScholarship.model.student12thDetails;
import com.NationalScholarship.model.studentAcademicsRegistration;


public interface ScholarshipRegDaoIntf {

	
	public boolean register(basicScholarshipRegistration bsr) ;
	
	public boolean register10(student10thDetails student10thdetails );
	
	public boolean register12(student12thDetails student12thdetails );
	
	public boolean studentRegister(StudentLoginDetails sld);
	
	public boolean addInstitute(Institute inst );

	public boolean instituteRegister(Institute inst);
	
	public StudentLoginDetails validateUser(StudentLoginDetails sld);
	
	public Institute validateUserInst(Institute inst);
	
	public boolean uploadDocuments(ScholarshipRegistrationDocs srd);
	
	//public List<basicScholarshipRegistration> getApplications();
	public List<Object[]> getUserNameAppl();
	
	
	public List<Object[]> getApplications();
	
	 public List<StudentLoginDetails> getmynewapplicants(String inst_code);
	 
	 public boolean AcceptScholarshipInst();
	 
	 public boolean scholAcadDetails(studentAcademicsRegistration sar);
	
	 public int updateStatus(String student_username,String status);
	 
	 
	 public int approvedList(String student_username);
	 
	 public int approvedListState(String student_username);
	 
	 public List<StudentLoginDetails> approvedrecords();
	 
	 public stateNodal validateUserState(stateNodal stn);
	 
	 public List<StudentLoginDetails> getmyapprovedapplicants(String state_name);
	 
	 public int updateStudentPassword(String student_email, String new_student_password);
	 
	 public List<StudentLoginDetails> getUsers(String student_username);
	 
	public List<StudentLoginDetails> getapplStatus(String student_username);

}

package com.NationalScholarship.service;



import java.util.List;

import javax.swing.text.StyledDocument;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.NationalScholarship.dao.ScholarshipRegDaoIntf;
import com.NationalScholarship.model.Institute;
import com.NationalScholarship.model.ScholarshipRegistrationDocs;
import com.NationalScholarship.model.StudentLoginDetails;
import com.NationalScholarship.model.basicScholarshipRegistration;
import com.NationalScholarship.model.stateNodal;
import com.NationalScholarship.model.student10thDetails;
import com.NationalScholarship.model.student12thDetails;
import com.NationalScholarship.model.studentAcademicsRegistration;


@Service("scholRegServ")
public class ScholarshipRegServiceImpl implements ScholarshipRegServiceIntf {

	
		@Autowired
		  public ScholarshipRegDaoIntf scholRegDao;
			
		@Transactional(noRollbackFor = Exception.class)
		  public boolean register(basicScholarshipRegistration bsr) {
		    return scholRegDao.register(bsr);
		  }

		@Transactional(noRollbackFor = Exception.class)
		public boolean register10(student10thDetails student10thdetails) {
			return scholRegDao.register10(student10thdetails);
		}
		
		@Transactional(noRollbackFor = Exception.class)
		public boolean register12(student12thDetails student12thdetails) {
			return scholRegDao.register12(student12thdetails);
		}

		@Transactional
		public boolean studentRegister(StudentLoginDetails sld) {
			
			return scholRegDao.studentRegister(sld);
		}

		@Transactional
		public boolean instituteRegister(Institute inst) {
			
			return scholRegDao.instituteRegister(inst);
		}
		 
		@Transactional
		public StudentLoginDetails validateUser(StudentLoginDetails sld) {
			
			return scholRegDao.validateUser(sld);
		}
		
		@Transactional
		public boolean uploadDocuments(ScholarshipRegistrationDocs srd) {

			return scholRegDao.uploadDocuments(srd);
		}

		@Transactional
		public Institute validateUserInst(Institute inst) {
			
			return scholRegDao.validateUserInst(inst);
		}

		
      @Transactional
      public List<StudentLoginDetails> getmynewapplicants(String inst_code){
    	  return scholRegDao.getmynewapplicants(inst_code);
      }

      @Transactional
      public boolean scholAcadDetails(studentAcademicsRegistration sar)
      {
    	  return scholRegDao.scholAcadDetails(sar);
      }
      
      @Transactional
      public int updateStatus(String student_username,String status)
      {
    	  return scholRegDao.updateStatus(student_username, status);
      }
      
      
      @Transactional
  	public int approvedList(String student_username) {
  		int result = scholRegDao.approvedList(student_username);
  		return result;
  		
  	}
  	@Transactional
  	public List<StudentLoginDetails> approvedrecords() {
  		List<StudentLoginDetails> list=scholRegDao.approvedrecords();
  		return list;
  	}

  	@Transactional
	public List<StudentLoginDetails> getmyapprovedapplicants(String state_name) {
		List<StudentLoginDetails>list=scholRegDao.getmyapprovedapplicants(state_name);
		return list;
	}
  	@Transactional
public stateNodal validateUserState(stateNodal stn) {
		
		return scholRegDao.validateUserState(stn);
	}

  	 @Transactional
   	public int approvedListState(String student_username) {
   		int result = scholRegDao.approvedListState(student_username);
   		return result;
   		
   	}
  	 @Transactional
	public int ForgetPassword(String student_email, String new_student_password) {
		
		return scholRegDao.updateStudentPassword(student_email, new_student_password);
	}
  	 @Transactional
	public List<StudentLoginDetails> getUsers(String student_username) {
		List<StudentLoginDetails> ulist=scholRegDao.getUsers(student_username);
		return ulist;
	}

	public List<StudentLoginDetails> getapplStatus(String student_username) {
		System.out.println(student_username);
		List<StudentLoginDetails> ulist=scholRegDao.getapplStatus(student_username);
		System.out.println(ulist);
		return ulist;
	}

	}



package com.NationalScholarship.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.NationalScholarship.model.Institute;
import com.NationalScholarship.model.ScholarshipRegistrationDocs;
import com.NationalScholarship.model.StudentLoginDetails;
import com.NationalScholarship.model.basicScholarshipRegistration;
import com.NationalScholarship.model.stateNodal;
import com.NationalScholarship.model.student10thDetails;
import com.NationalScholarship.model.student12thDetails;
import com.NationalScholarship.model.studentAcademicsRegistration;
import com.NationalScholarship.service.ScholarshipRegServiceIntf;






@Controller("myController")
public class MyController {
	@Autowired 
	JavaMailSender sender;	
	String emailSender="<mahascholarship2019@gmail.com>";
	
	
	@Autowired
	ScholarshipRegServiceIntf scholRegServ;

	@RequestMapping(value = "/scholarshipApp", method = RequestMethod.GET)
	  public ModelAndView showRegister2(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("StudAcad10thDetails");
	    mav.addObject("bsr", new basicScholarshipRegistration());
	    return mav;
	  }
	
	@RequestMapping(value = "/scholarshipRegister", method = RequestMethod.POST)
	  public ModelAndView addUser2(HttpServletRequest request, HttpServletResponse response,HttpSession session, @ModelAttribute("basicScholarshipRegistration") basicScholarshipRegistration bsr) {
		StudentLoginDetails sld  = new StudentLoginDetails();
		String student_username=(String) session.getAttribute("student_username");
		sld.setStudent_username(student_username);
		bsr.setStudentLoginDetails(sld);
		//sld.setStatus("N");
		
		
		boolean flag=scholRegServ.register(bsr);
	    if(flag) {
	    ModelAndView mav = new ModelAndView("StudAcad10thDetails");
	    session.setAttribute("student_username",sld.getStudent_username());
	  //  mav.addObject("login", new basicScholarshipRegistration());
	    return mav;
	    }
	    else {
	    	ModelAndView mav = new ModelAndView("register");
	        mav.addObject("user", new basicScholarshipRegistration());
	        mav.addObject("status","Sorry! Registration in incomplete");
	        return mav;	
	    }
	  }
	
	
	@RequestMapping(value ="/Register10th", method = RequestMethod.POST)
	  public ModelAndView addUser10th(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws ParseException {
		student10thDetails s10d=new student10thDetails();
		
		StudentLoginDetails sld  = new StudentLoginDetails();
		String student_username=(String) session.getAttribute("student_username");
		sld.setStudent_username(student_username);
		s10d.setStudentLoginDetails(sld);
		
		String student_10_roll_number=request.getParameter("student_10_roll_number");
		String student_board_name=request.getParameter("student_board_name");
		SimpleDateFormat formatter= new SimpleDateFormat("yyy-MM-dd");
		Date student_passing_year=formatter.parse(request.getParameter("student_passing_year"));
		String student_percentage=request.getParameter("student_percentage");
		
		
		s10d.setStudent_10_roll_number(student_10_roll_number);
		s10d.setStudent_board_name(student_board_name);
		s10d.setStudent_passing_year(student_passing_year);
		s10d.setStudent_percentage(student_percentage);
		
		 
		
		boolean flag=scholRegServ.register10(s10d);
	    if(flag) {
	    ModelAndView mav = new ModelAndView("student12thDetails");
	  
	    return mav;
	    }
	    else {
	    	ModelAndView mav = new ModelAndView("register");
	        mav.addObject("user", new basicScholarshipRegistration());
	        mav.addObject("status","Sorry! Registration in incomplete");
	        return mav;	
	    }
	  }
	
	@RequestMapping(value = "/Register12th", method = RequestMethod.POST)
	  public ModelAndView addUser12th(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws ParseException {
		StudentLoginDetails sld  = new StudentLoginDetails();
		student12thDetails s12d=new student12thDetails();
		String student_username=(String) session.getAttribute("student_username");
		sld.setStudent_username(student_username);
		s12d.setStudentLoginDetails(sld);
		
		String student_12_roll_number=request.getParameter("student_12_roll_number");
		 String student_board_name=request.getParameter("student_board_name"); 
		 SimpleDateFormat formatter= new SimpleDateFormat("yyy-MM-dd");
			Date student_passing_year=formatter.parse(request.getParameter("student_passing_year"));
		 String student_percentage=request.getParameter("student_percentage");
		 
			
		 s12d.setStudent_12_roll_number(student_12_roll_number);
		 s12d.setStudent_board_name(student_board_name);
		 s12d.setStudent_passing_year(student_passing_year);
		 s12d.setStudent_percentage(student_percentage);
		 
		boolean flag=scholRegServ.register12(s12d);
	    if(flag) {
	    ModelAndView mav = new ModelAndView("studentAcademicRegistration");
	   // session.setAttribute("student_id",s10d.getStudent_id());
	  //  mav.addObject("login", new basicScholarshipRegistration());
	    return mav;
	    }
	    else {
	    	ModelAndView mav = new ModelAndView("error");
	        mav.addObject("user", new basicScholarshipRegistration());
	        mav.addObject("status","Sorry! Registration in incomplete");
	        return mav;	
	    }
	  }
	
	@RequestMapping(value = "/scholacadregprocess", method = RequestMethod.POST)
	  public ModelAndView acadProcess(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws ParseException {
		StudentLoginDetails sld  = new StudentLoginDetails();
		studentAcademicsRegistration sar =new studentAcademicsRegistration();
		
		String student_username=(String) session.getAttribute("student_username");
		sld.setStudent_username(student_username);
		sar.setStudent_username(sld);
	
		String student_erp_id=request.getParameter("student_erp_id");
		String student_present_course=request.getParameter("student_present_course");
		SimpleDateFormat formatter= new SimpleDateFormat("yyy-MM-dd");
		Date student_present_year=formatter.parse(request.getParameter("student_present_year"));
		String student_mode_study=request.getParameter("student_mode_study");
		SimpleDateFormat formatter1= new SimpleDateFormat("yyy-MM-dd");
		Date student_class_start_date=formatter1.parse(request.getParameter("student_class_start_date"));
		String student_university=request.getParameter("student_university");
		String student_admission_fee=request.getParameter("student_admission_fee");
		String student_tution_fee=request.getParameter("student_tution_fee");
		String student_other_fee=request.getParameter("student_other_fee");
		//String inst_code=request.getParameter("inst_code");
		
		
		
		sar.setStudent_admission_fee(student_admission_fee);
		sar.setStudent_class_start_date(student_class_start_date);
		sar.setStudent_erp_id(student_erp_id);
		sar.setStudent_mode_study(student_mode_study);
		sar.setStudent_mode_study(student_mode_study);
		sar.setStudent_other_fee(student_other_fee);
		sar.setStudent_present_course(student_present_course);
		sar.setStudent_present_year(student_present_year);
		sar.setStudent_tution_fee(student_tution_fee);
		sar.setStudent_university(student_university);
		Institute institute = new Institute();
		institute.setInst_code(request.getParameter("student_institute_code"));
		sld.setInstitute(institute);
		
		boolean flag=scholRegServ.scholAcadDetails(sar);
	    if(flag) {
	    ModelAndView mav = new ModelAndView("scholarshipRegistrationDocs");
	    return mav;
	    }
	    else {
	    	ModelAndView mav = new ModelAndView("error");
	        mav.addObject("user", new basicScholarshipRegistration());
	        mav.addObject("status","Sorry! Registration in incomplete");
	        return mav;	
	    }
	  }
/*==========================================================	*/
	@RequestMapping(value="/register", method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response)
	{
	    ModelAndView mav = new ModelAndView("StudentLoginDetails");
	    mav.addObject("sld", new StudentLoginDetails());
	    return mav;
	  } 
	
	
	//plz stop
	// who makes this change//////
	//still it doesnt work
	
	@RequestMapping(value = "/viewdocs", method = RequestMethod.GET)
	  public String viewdocs(HttpServletRequest request, HttpServletResponse response) {
	   
	    
		 return "redirect:/getmynewapplicants.do";
	  } 
	
	
	
	
	
	
	
	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	  public ModelAndView studentRegister(HttpServletRequest request, HttpServletResponse response) throws ParseException 
	{
		
		 StudentLoginDetails sld = new StudentLoginDetails();
		 Institute institute = new Institute();
		 String student_username = request.getParameter("student_username");
		String student_name= request.getParameter("student_name");
		String student_gender=request.getParameter("student_gender");
		String student_state_domicile=request.getParameter("student_state_domicile");
		String student_district= request.getParameter("student_district");
		
		SimpleDateFormat formatter= new SimpleDateFormat("yyy-MM-dd");
		Date student_dob=formatter.parse(request.getParameter("student_dob"));
		String student_mobile_number= request.getParameter("student_mobile_number");
		
		String student_email= request.getParameter("student_email");
		String student_aadhar_number=request.getParameter("student_aadhar_number");
		 String student_password=request.getParameter("student_password");
		
		String inst_code=request.getParameter("student_institute_code");
		System.out.println(inst_code);
		institute.setInst_code(inst_code);
		sld.setInstitute(institute);
		
		
		
		sld.setStudent_username(student_username);
		 sld.setStudent_name(student_name);
		 sld.setStudent_gender(student_gender);
		 sld.setStudent_state_domicile(student_state_domicile);
		 sld.setStudent_district(student_district);
		 sld.setStudent_dob(student_dob);
		 sld.setStudent_mobile_number(student_mobile_number);
		 sld.setStudent_email(student_email);
		 sld.setStudent_aadhar_number(student_aadhar_number);
		 sld.setStudent_password(student_password);
		 
			//institute.setInst_code(request.getParameter("student_institute_code"));
			//sld.setInstitute(institute);
		 sld.setStatus("N");
		 sld.setState_status("N");
		 System.out.println(sld);
	
		 boolean flag=scholRegServ.studentRegister(sld);
	    if(flag) {
	    ModelAndView mav = new ModelAndView("mainhome");
	System.out.println("can register ");
	    return mav;
	   
	    
	    }
	    else {
	    	ModelAndView mav = new ModelAndView("error");
	        mav.addObject("user", new StudentLoginDetails());
	        mav.addObject("status","Sorry! Registration in incomplete");
	        return mav;	
	    }
	  }
	/*====================================*/
	@RequestMapping(value = "/institute", method = RequestMethod.GET)
	  public ModelAndView instituteRegister(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("institute");
	    mav.addObject("inst", new Institute());
	    return mav;
	  } 
	
	
	
	@RequestMapping(value = "/instituteProcess", method = RequestMethod.POST)
	  public ModelAndView instituteRegisterprocess(HttpServletRequest request, HttpServletResponse response) throws ParseException 
	 {
				 
		String inst_code=request.getParameter("inst_code");
		String inst_username=request.getParameter("inst_username");
		String inst_name=request.getParameter("inst_name");
		String inst_state=request.getParameter("inst_state");
		String inst_district=request.getParameter("inst_district");
		String inst_dice_code=request.getParameter("inst_dice_code");
		String inst_location=request.getParameter("inst_location");
		String inst_type=request.getParameter("inst_type");
		String inst_aff_uni_state=request.getParameter("inst_aff_uni_state");
		String inst_aff_uni_board=request.getParameter("inst_aff_uni_board");
		SimpleDateFormat formatter= new SimpleDateFormat("yyy-MM-dd");
		Date inst_year_adm_starT=formatter.parse(request.getParameter("inst_year_adm_starT"));
		String inst_password=request.getParameter("inst_password");
		String inst_estab_cert=request.getParameter("inst_estab_cert");
		String inst_uni_affil_cert=request.getParameter("inst_uni_affil_cert");
		String inst_address=request.getParameter("inst_address");
		String inst_principal_name=request.getParameter("inst_principal_name");
		String inst_contact_number=request.getParameter("inst_contact_number");
		String inst_college_phone=request.getParameter("inst_college_phone");
		//String inst_approval_status=request.getParameter("inst_approval_status");
		
			
		Institute i=new Institute();
		i.setInst_code(inst_code);
		i.setInst_username(inst_username);
		i.setInst_name(inst_name);
		i.setInst_state(inst_state);
		i.setInst_district(inst_district);
		i.setInst_dice_code(inst_dice_code);
		i.setInst_location(inst_location);
		i.setInst_type(inst_type);
		i.setInst_aff_uni_state(inst_aff_uni_state);
		i.setInst_aff_uni_board(inst_aff_uni_board);
		i.setInst_year_adm_starT(inst_year_adm_starT);
		i.setInst_password(inst_password);
		i.setInst_estab_cert(inst_estab_cert);
		i.setInst_uni_affil_cert(inst_uni_affil_cert);
		i.setInst_address(inst_address);
		i.setInst_principal_name(inst_principal_name);
		i.setInst_contact_number(inst_contact_number);
		i.setInst_college_phone(inst_college_phone);
		i.setInst_approval_status("N");
		
		 
		 boolean flag=scholRegServ.instituteRegister(i);
	    if(flag) {
	    ModelAndView mav = new ModelAndView("mainhome");
	    System.out.println("can register ");
	    return mav;
	   
	    
	    }
	    else {
	    	ModelAndView mav = new ModelAndView("error");
	        mav.addObject("user", new StudentLoginDetails());
	        mav.addObject("status","Sorry! Registration in incomplete");
	        return mav;	
	    }
	  }
	
	
	/*============================================*/
	
	 @RequestMapping(value = "/slogin", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("slogin");
	    mav.addObject("sld", new StudentLoginDetails());
	    return mav;
	  }
	

	  @RequestMapping(value ="/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,   @ModelAttribute StudentLoginDetails sld) {
	    ModelAndView mav = null;
	    StudentLoginDetails sld1 = scholRegServ.validateUser(sld);
	    if (sld1 != null) {
	      mav = new ModelAndView("redirect:/viewusers.do");
	      mav.addObject("firstname", sld1.getStudent_username());
	      //session manage
	      HttpSession session= request.getSession();
	      session.setAttribute("student_username", sld.getStudent_username());
	      System.out.println("sld:"+sld.getStudent_username());
	    } else {
	      mav = new ModelAndView("login");
	      mav.addObject("message", "Username or Password is wrong!!");
	    }
	    return mav;
	  }
	/*  ==========================================================*/
	  @RequestMapping(value = "/showscholarship", method = RequestMethod.GET)
	  public ModelAndView showscholarship(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("scholarshipForm");
	    mav.addObject("sld", new StudentLoginDetails());
	    return mav;
	  }
	/*===========================================*/
	  
	  @RequestMapping(value = "/viewusers", method = RequestMethod.GET)
		public ModelAndView viewusers(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		  ModelAndView mav = new ModelAndView("studenthome");
		  String student_username=request.getParameter("firstname");
			 session.setAttribute("student_username",student_username);
			 List<StudentLoginDetails>  userlist = scholRegServ.getUsers(student_username);
			 
			 mav.addObject("userlist", userlist);
			
			 
			 return mav;
		 }

	  
	  @RequestMapping(value = "/viewapplstatus", method = RequestMethod.GET)
		public ModelAndView viewapplStatus(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		  ModelAndView mav = new ModelAndView("applstatus");
		  //StudentLoginDetails sld=new StudentLoginDetails();
		  
		  /*String student_username=(String) session.getAttribute("student_username");
		  String student_username=request.getParameter("student_username");*/
		  String student_username=(String) session.getAttribute("student_username");
		  System.out.println("uid"+student_username);
			
			System.out.println(student_username);
			 List<StudentLoginDetails>  userlist = scholRegServ.getapplStatus(student_username);
			 
			 mav.addObject("userlist", userlist);
			System.out.println(userlist);
			 
			 return mav;
		 }

	 
	  
	  
	 /* =====================================================================*/
	  @RequestMapping(value = "/ilogin", method = RequestMethod.GET)
	  public ModelAndView showLoginInst(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("ilogin");
	    mav.addObject("inst", new Institute());
	    return mav;
	  }
	  
	  @RequestMapping(value = "/iloginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcessInst(HttpSession session,   @ModelAttribute Institute inst) {
	    ModelAndView mav = null;
	    Institute inst1 = scholRegServ.validateUserInst(inst);
	   /* session.setAttribute("inst_code", inst.getInst_code());
	    session.setAttribute("inst_code", inst1.getInst_code());*/
	    if (inst1 != null) {
	      mav = new ModelAndView("insthome");
	      mav.addObject("institute_username", inst1.getInst_name());
	      //session manage
	       session.setAttribute("inst_code", inst1.getInst_code());
	      String str=(String)session.getAttribute("inst_code");
	       System.out.print(str);
	    } else {
	      mav = new ModelAndView("error");
	      mav.addObject("message", "Username or Password is wrong!!");
	    }
	    return mav;
	  }
	  
	
	  @RequestMapping(value = "/getmynewapplicants", method = RequestMethod.GET)
	  public ModelAndView getmynewapplicants(HttpSession session) {
		  String inst_code =(String)session.getAttribute("inst_code");
		  System.out.println(inst_code);
		  List<StudentLoginDetails>  userlist = scholRegServ.getmynewapplicants(inst_code);
		  ModelAndView mav = new ModelAndView("myapplicantlist");
		    mav.addObject("userlist", userlist);
		    
		 return mav;
	  }
	  
	  @RequestMapping(value = "/statehome", method = RequestMethod.GET)
	  public ModelAndView showstatehome(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("statehome");
	    mav.addObject("sld", new StudentLoginDetails());
	    return mav;
	  }
	
	  
	  @RequestMapping(value = "/insthome", method = RequestMethod.GET)
	  public ModelAndView showinsthome(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("insthome");
	    mav.addObject("sld", new StudentLoginDetails());
	    return mav;
	  }
	
	  
	  
	  
	  
	  @RequestMapping(value = "/getmyapprovedapplicants", method = RequestMethod.GET)
	  public ModelAndView getmyapprovedapplicants(HttpSession session,@ModelAttribute stateNodal stn) {
		  String state_name =(String)session.getAttribute("state_name");
		  System.out.println(state_name);
		  List<StudentLoginDetails>  userlist1 = scholRegServ.getmyapprovedapplicants(state_name);
		  ModelAndView mav = new ModelAndView("myapplicantapprovedlist");
		    mav.addObject("userlist", userlist1);
		    
		 return mav;
	  }
	  
	  
	  
	  
	  @RequestMapping(value = "/approve", method = RequestMethod.GET)
		public ModelAndView approvedList(HttpServletRequest request) {
			String student_username = request.getParameter("student_username");

			 scholRegServ.approvedList(student_username);
			ModelAndView mav = new ModelAndView("redirect:/getmynewapplicants.do");
			return mav;
		}
	  
	  
	  
	  @RequestMapping(value = "/approvestate", method = RequestMethod.GET)
		public ModelAndView approvedStateList(HttpServletRequest request) {
			String student_username = request.getParameter("student_username");

			 scholRegServ.approvedListState(student_username);
			ModelAndView mav = new ModelAndView("redirect:/getmyapprovedapplicants.do");
			return mav;
		}
	  
	  
	  
	  
	  

	/*  ======================================*/
	 
	  
	  
			  
	/*========================================*/		  
	  
	  
		@RequestMapping(value = "/approvedrecords", method = RequestMethod.GET)
		public ModelAndView approvedrecords(HttpServletRequest request, HttpServletResponse response) {

			List<StudentLoginDetails> list = scholRegServ.approvedrecords();

			ModelAndView mav = new ModelAndView("viewapprovedusers");
			mav.addObject("list", list);

			return mav;
		}

	  
	  
	  
	  
	  
	  
	  
	  
	
	 /* ==================================================================*/
	  
		
		@RequestMapping(value = "/upload", method = RequestMethod.GET)
		  public ModelAndView uploadDoc(HttpServletRequest request, HttpServletResponse response) {
		    ModelAndView mav = new ModelAndView("scholarshipRegistrationDocs");
		    mav.addObject("srd", new ScholarshipRegistrationDocs());
		    return mav;
		  }
		
		
		
		
		
		
		
		@RequestMapping(value = "/uploadProcess", method = RequestMethod.POST)
		  public ModelAndView uploadDoc(HttpServletRequest request, HttpServletResponse response,HttpSession session, @ModelAttribute("ScholarshipRegistrationDocs") ScholarshipRegistrationDocs srd, @RequestParam("file") MultipartFile files[]) {
			
			
			String student_username=(String) session.getAttribute("student_username");
			
			StudentLoginDetails sld  = new StudentLoginDetails();
			sld.setStudent_username(student_username);
			srd.setStudentLoginDetails(sld);

			  String username = student_username;
					for (int i = 0; i < files.length; i++) {
						String filename="";
						if(i==0)
							filename=(username)+"_Domicile"+".pdf";
							else if(i==1)
								filename=(username)+"_Photo"+".pdf";
							else if(i==2)
								filename=(username)+"_IDcard"+".pdf";
							else if(i==3)
								filename=(username)+"_CIcert"+".pdf";
							else if(i==4)
								filename=(username)+"_LatestMarksheet"+".pdf";
							else if(i==5)
								filename=(username)+"_FeeReceipt"+".pdf";
							else if(i==6)
								filename=(username)+"_Passbook"+".pdf";
							else if(i==7)
								filename=(username)+"_Aadhar"+".pdf";
							else if(i==8)
								filename=(username)+"_10thMarksheet"+".pdf";
							else if(i==9)
								filename=(username)+"_12thMarksheet"+".pdf";
						MultipartFile file = files[i];
						try {
							byte[] bytes = file.getBytes();

							// Creating the directory to store file
							String rootPath = System.getProperty("catalina.home");
							File dir = new File(rootPath + File.separator + "tmpFiles");
							if (!dir.exists())
								dir.mkdirs();

							// Create the file on server
							File serverFile = new File(dir.getAbsolutePath()+ File.separator + filename);
							BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
							stream.write(bytes);
							stream.close();
							
							if(i==0)
		                 srd.setStu_domicile_cert(filename);
							else if(i==1)
								 srd.setStu_photo(filename);
							else if(i==2)
								 srd.setStu_institute_idcard(filename);
							else if(i==3)
								 srd.setStu_caste_income_cert(filename);
							else if(i==4)
								 srd.setStu_previous_year_mark(filename);
							else if(i==5)
								 srd.setStu_fee_receipt_current_year(filename);
							else if(i==6)
								 srd.setStu_bank_passbook(filename);
							else if(i==7)
								 srd.setStu_aadhar_card(filename);
							else if(i==8)
								 srd.setStu_10th_markshhet(filename);
							else if(i==9)
								 srd.setStu_12th_marksheet(filename);
							
							
							System.out.println("Server File Location="+ serverFile.getAbsolutePath());
							} catch (Exception e) {
							System.out.println( "You failed to upload " + (username+i) + " => " + e.getMessage());
						}
					}
				
			boolean flag=scholRegServ.uploadDocuments(srd);
		    if(flag) {
		    ModelAndView mav = new ModelAndView("mainhome");
		   // session.setAttribute("student_id",bsr.getStudent_id());
		  //  mav.addObject("login", new basicScholarshipRegistration());
		    return mav;
		    }
		    else {
		    	ModelAndView mav = new ModelAndView("error");
		        mav.addObject("user", new basicScholarshipRegistration());
		        mav.addObject("status","Sorry! Registration in incomplete");
		        return mav;	
		    }
		  
		
		}
		
		
		/*=========================================================*/
		
		 @RequestMapping(value = "/statelogin", method = RequestMethod.GET)
		  public ModelAndView showLoginState(HttpServletRequest request, HttpServletResponse response) {
		    ModelAndView mav = new ModelAndView("statelogin");
		    mav.addObject("inst", new Institute());
		    return mav;
		  }
		  
		  
		  
		  
		  
		  @RequestMapping(value = "/stateloginProcess", method = RequestMethod.POST)
		  public ModelAndView loginProcessState(HttpSession session,   @ModelAttribute stateNodal stn) {
		    ModelAndView mav = null;
		   stateNodal stn1 = scholRegServ.validateUserState(stn);
		   /* session.setAttribute("inst_code", inst.getInst_code());
		    session.setAttribute("inst_code", inst1.getInst_code());*/
		    if (stn1 != null) {
		      mav = new ModelAndView("statehome");
		      mav.addObject("state_name",stn1.getState_name());
		      //session manage
		       session.setAttribute("state_name",stn1.getState_name());
		      String str=(String)session.getAttribute("state_name");
		       System.out.print(str);
		    } else {
		      mav = new ModelAndView("error");
		      mav.addObject("message", "Username or Password is wrong!!");
		    }
		    return mav;
		  }

/*		  =======================================================
*/				  
		  
		  @RequestMapping(value="mail.do", method = RequestMethod.GET) 
		  public String genOtp() 
		  { 
			  return "Otp"; 
		  }
		 
			
			@RequestMapping(value="mailotp.do", method=RequestMethod.POST)
			public String sentOtp(Model model, HttpSession session ,HttpServletRequest request) {
				 final String student_email=request.getParameter("student_email");
				int randomPin   =(int) (Math.random()*9000)+1000; 
			     final String otp1  = String.valueOf(randomPin); 
			     
		        // Logging The Email Form Parameters For Debugging Purpose
		        //System.out.println("\nReceipient?= " + emailToRecipient + ", Subject?= " + emailSubject + ", Message?= " + emailMessage + "\n");
		 
		        sender.send(new MimeMessagePreparator() {
		            public void prepare(MimeMessage mimeMessage) throws Exception {
		            	
		                MimeMessageHelper mimeMsgHelperObj = new MimeMessageHelper(mimeMessage, true, "UTF-8");             
		                mimeMsgHelperObj.setTo(student_email);
		                mimeMsgHelperObj.setFrom(emailSender);               
		                mimeMsgHelperObj.setText(otp1);
		                mimeMsgHelperObj.setSubject("Your OTP is: ");             
		            }
		        });
		        session.setAttribute("otp", otp1);
		        session.setAttribute("student_email", student_email);
		        System.out.println("\nMessage Send Successfully.... Hurrey!\n");
		        model.addAttribute("msg","Mail Sent!");
		       return "forgotpwd";
			}
		  

	
@RequestMapping(value="validate.do", method=RequestMethod.GET)
public String validateOtp( @RequestParam("otp2")String otp2,@RequestParam("student_password")String student_password, HttpSession session) {
	Object obj= session.getAttribute("otp");
	String mail = (String)session.getAttribute("student_email");
	System.out.println(mail);
	String otp=null;
	if(obj!=null) {
		 otp = obj.toString();
	}		
	if(otp.contentEquals(otp2))
	{
		int result = scholRegServ.ForgetPassword(mail, student_password);
		if(result>0){
			return "redirect:slogin.do";
		}
		else {
		return "password not updated";
		}
	}
	else
	{
		return "redirect:mail.do";
	}
}


@RequestMapping(value = "/logout", method = RequestMethod.GET)
public ModelAndView userlogout(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
	 session.invalidate();
	 ModelAndView mav = new ModelAndView("mainhome");
	 mav.addObject("login", new StudentLoginDetails());
	 return mav;
 }





}


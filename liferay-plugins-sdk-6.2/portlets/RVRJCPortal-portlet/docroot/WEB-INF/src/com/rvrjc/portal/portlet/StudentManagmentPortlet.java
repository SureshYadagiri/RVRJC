package com.rvrjc.portal.portlet;

import com.liferay.mail.service.MailServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.mail.MailMessage;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.CompanyThreadLocal;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.rvrjc.portal.model.Address;
import com.rvrjc.portal.model.Invoice;
import com.rvrjc.portal.model.Student;
import com.rvrjc.portal.model.impl.StudentImpl;
import com.rvrjc.portal.service.AddressLocalServiceUtil;
import com.rvrjc.portal.service.CourseLocalServiceUtil;
import com.rvrjc.portal.service.InvoiceLocalServiceUtil;
import com.rvrjc.portal.service.ParentLocalServiceUtil;
import com.rvrjc.portal.service.StudentLocalServiceUtil;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

/**
 * Portlet implementation class StudentManagmentPortlet
 */
public class StudentManagmentPortlet extends MVCPortlet {
 

	static Log _log=LogFactoryUtil.getLog(StudentManagmentPortlet.class);

	@ProcessAction(name="addStudent")
	public void addStudent(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException, SystemException, PortalException {
		
		try{
			User loggedInUser = PortalUtil.getUser(actionRequest);
				
					
			String doorNo=ParamUtil.getString(actionRequest, "doorNo");
			String city=ParamUtil.getString(actionRequest, "city");
			String mandal=ParamUtil.getString(actionRequest, "mandal");
			String district=ParamUtil.getString(actionRequest, "district");
			String state=ParamUtil.getString(actionRequest, "state");
			String country=ParamUtil.getString(actionRequest, "country");
			
				//student Table
					
			 String firstName=ParamUtil.getString(actionRequest,"firstName");
		
		     String middleName=ParamUtil.getString(actionRequest, "middleName");
		     String lastName=ParamUtil.getString(actionRequest, "lastName");
		     int gender = ParamUtil.getInteger(actionRequest, "gender");
		     DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		     Date dob=ParamUtil.getDate(actionRequest, "dob", dateFormat);
		     String email=ParamUtil.getString(actionRequest,"email");
		     long emcetRank=ParamUtil.getLong(actionRequest, "emcetRank");
		     long dno=ParamUtil.getLong(actionRequest, "dno");
		    	
	    	 
	    	     
	    	     
	    	     
	    	     //Step 1: Add Liferay User
	 			long companyId = CompanyThreadLocal.getCompanyId();
	 			Role role = RoleLocalServiceUtil.getRole(companyId, "RVRJC_STUDENT");
	 			long []roleIds = {role.getRoleId() }; 
	 			
	 			ThemeDisplay td = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
	 			Group siteGroup = td.getSiteGroup();
	 			_log.info("siteGroup Name:" + siteGroup.getName() +" group ID:" + siteGroup.getGroupId());
	 			
	 			//We can also get Default Site name using Guest
	 			Group group = GroupLocalServiceUtil.getGroup(companyId, "Guest");
	 			_log.info("group Name:" + group.getName() +" groupID:" + group.getGroupId());
	 			
	 			long []groupIDS = {siteGroup.getGroupId() }; 
	 			
	 			Locale locale = Locale.getDefault();
	 			
	 			//(creatorUserId, companyId, autoPassword, password1, password2, autoScreenName, 
	 			//screenName, emailAddress, facebookId, openId, locale, firstName, middleName, lastName, 
	 			//prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds, 
	 			//organizationIds, roleIds, userGroupIds, sendEmail, serviceContext)
	 			User newUser =	UserLocalServiceUtil.addUser(loggedInUser.getUserId(), companyId, false,
	 					"test", "test", false,firstName+lastName , email, 
	 					0L, "", locale, firstName, middleName, lastName, 0, 
	 					0, false, 1, 1, 1980, "Student", 
	 					groupIDS, null, roleIds, null, true, new ServiceContext());
	 			
	 		   
	     
	     
	     //Date modifiedOn=ParamUtil.getDate(serviceContext, "modifiedOn", 'dd-mm-yyyy');
	 			Address addr=AddressLocalServiceUtil.createAddress(0);
	 		    //long addressId=addr.getAddressId();
				
	 		    addr.setDoorNo(doorNo);
				addr.setCity(city);
				addr.setMandal(mandal);
				addr.setDistrict(district);
				addr.setState(state);
				addr.setAddCountry(country);
				addr=AddressLocalServiceUtil.addAddress(addr);
	     
	     Student student=StudentLocalServiceUtil.createStudent(0);
	   
	    	 student.setFirstName(firstName);
	    	 student.setMiddleName(middleName);
	    	 student.setLastName(lastName);
	    	student.setGender(gender);
	    	student.setDateOfBirth(dob);
	    	 student.setEmail(email);
	    	 student.setEmcetRank(emcetRank);
	    	 student.setDno(dno);
	    	 student.setAddressId(addr.getAddressId());
	    	 
	    	 
	    	 student.setLiferayUserId(newUser.getUserId());
	    	 
	    	 
	    	 student.setCreatedOn(Calendar.getInstance().getTime());
	    	 student.setCreatedBy(loggedInUser.getFullName());
	    	 
	    	 
	    	 
	    	 //student.setModifiedBy(loggedInUser.getFullName());
	    	 //student.setModifiedOn(Calendar.getInstance().getTime());
	    	 
	    	 
	    	 
	    	 student=StudentLocalServiceUtil.addStudent(student); 
	    	
	    	
			    
		  //   addr=AddressLocalServiceUtil.addAddress(addr);
/*		    if(AgeValidation.validateStudentAge(student))
	    	 {
		    	
	    	 
	    	 }
	    else
		     {
		    	 System.out.print("Student validation failed");
		     }*/
		 // Parent Details
		
		    
		      
		     long[] parents=ParamUtil.getLongValues(actionRequest,	"parent");
		      
		      _log.info("parent Details "+Arrays.toString(parents));
		      ParentLocalServiceUtil.addStudentParents(student.getSno(),parents);
		 	     
		      long[] courses=ParamUtil.getLongValues(actionRequest, "courseCheckbox");
		      _log.info("course Details  " +Arrays.toString(courses));
				
		      CourseLocalServiceUtil.addStudentCourses(student.getSno(),courses);
		      
		    //  public static void sendActivationEmail() 
				// {
					 //User user = null;
							 //ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
				
		    
		      sendActivationEmail(student);
		     
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	

	@ProcessAction(name="updateStudent")
	public void updateStudent(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException {
	
		ThemeDisplay td = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		User loggedInUser=td.getUser();
		
	//Address Details
		long addressId=ParamUtil.getLong(actionRequest, "addressId");
		 String doorNo=ParamUtil.getString(actionRequest, "doorNo");
			String city=ParamUtil.getString(actionRequest, "city");
			String mandal=ParamUtil.getString(actionRequest, "mandal");
			String district=ParamUtil.getString(actionRequest, "district");
			String state=ParamUtil.getString(actionRequest, "state");
			String country=ParamUtil.getString(actionRequest, "country");
			
			
			Address addr;
			try {
				addr = AddressLocalServiceUtil.getAddress(addressId);
				addr.setDoorNo(doorNo);
				addr.setCity(city);
				addr.setMandal(mandal);
				addr.setDistrict(district);
				addr.setState(state);
				addr.setAddCountry(country);
				addr=AddressLocalServiceUtil.updateAddress(addr);
			} catch (PortalException | SystemException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			
				
		//Student Details
		
			long sno=ParamUtil.getLong(actionRequest, "sno");
		 String firstName=ParamUtil.getString(actionRequest,"firstName");
	     String middleName=ParamUtil.getString(actionRequest, "middleName");
	     String lastName=ParamUtil.getString(actionRequest, "lastName");
	     int gender = ParamUtil.getInteger(actionRequest, "gender");
	     DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	     Date dob=ParamUtil.getDate(actionRequest, "dob", dateFormat);
	
	     String email=ParamUtil.getString(actionRequest,"email");
	     long emcetRank=ParamUtil.getLong(actionRequest, "emcetRank");
	     long dno=ParamUtil.getLong(actionRequest, "dno");
	     
	   
		try {
			 
		     Student  student = StudentLocalServiceUtil.getStudent(sno);
			 student.setFirstName(firstName);
	    	 student.setMiddleName(middleName);
	    	 student.setLastName(lastName);
	    	student.setGender(gender);
	    	student.setDateOfBirth(dob);
	    	 student.setEmail(email);
	    	 student.setEmcetRank(emcetRank);
	    	 student.setDno(dno);
	    	
	    	 student.setLiferayUserId(loggedInUser.getUserId());
	    	
	    	 student.setModifiedBy(loggedInUser.getFullName());
	    	 student.setModifiedOn(Calendar.getInstance().getTime());
	    	 student=StudentLocalServiceUtil.updateStudent(student);
	    	   
		      long[] courses=ParamUtil.getLongValues(actionRequest, "courseCheckbox");
		      _log.info("course Details  " +Arrays.toString(courses));
		      try {
				CourseLocalServiceUtil.deleteStudentCourses(sno, CourseLocalServiceUtil.getStudentCourses(sno));
				CourseLocalServiceUtil.addStudentCourses(student.getSno(),courses);
			  	
	    	 
	    	/*  if(AgeValidation.validateStudentAge(student))
		    	 {
		    		
					student=StudentLocalServiceUtil.updateStudent(student);
		    	 }
	    	 */
		}  catch (SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	   
	    		      		     
				   
		} catch (PortalException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				      						
				      
				    		   
	}
	@ProcessAction(name="readStudent")
	public void readStudent(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException {
		 long sno=ParamUtil.getLong(actionRequest, "sno");
		  
		 
		  try {
		
			StudentLocalServiceUtil.getStudent(sno);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	@ProcessAction(name="deleteStudent")
	public void deleteStudent(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException {
	
		 long sno=ParamUtil.getLong(actionRequest, "sno");
		 long invoiceId=ParamUtil.getLong(actionRequest, "invoiceId");
		 long addressId=ParamUtil.getLong(actionRequest, "addressId");
		 long parentId=ParamUtil.getLong(actionRequest, "parentId");
		 long cno=ParamUtil.getLong(actionRequest, "cno");
		  
		  try {
	
			StudentLocalServiceUtil.deleteStudent(sno);
			InvoiceLocalServiceUtil.deleteInvoice(invoiceId);
			AddressLocalServiceUtil.deleteAddress(addressId);
			ParentLocalServiceUtil.deleteStudentParent(sno, parentId);
			StudentLocalServiceUtil.deleteCourseStudent(cno, sno);
			
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@ProcessAction(name="addInvoice")
	public void addInvoice(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException, SystemException, PortalException {
	
		 //invoice table
		User loggedInUser = PortalUtil.getUser(actionRequest);
		
		
   	 long amountPaid=ParamUtil.getLong(actionRequest, "amountPaid");
   	
	     Student student = new StudentImpl();
	     
	     
	     Invoice invoice=InvoiceLocalServiceUtil.createInvoice(0);
	     invoice.setAmountPaid(amountPaid);
	     invoice.setPaidDate(Calendar.getInstance().getTime());
	     invoice.setSno(student.getSno());
	     invoice.setCreatedBy(loggedInUser.getFullName());
	     invoice.setCreatedOn(Calendar.getInstance().getTime());
	     invoice=InvoiceLocalServiceUtil.addInvoice(invoice);   
	}
	

	  
	public static  void sendActivationEmail(Student student) 
		 {
			 //User user = null;
					 //ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			 try {
				 
				 InternetAddress sendTo=null;
					InternetAddress fromAddr=null;
				 try {
					 sendTo=new InternetAddress(student.getEmail());
						fromAddr=new InternetAddress("admin@rvrjc.com");
					} catch (AddressException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Exception ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					}
				 
				 String fname=student.getFirstName();
				 String lname=student.getLastName();
				 DateFormat dateForm = new SimpleDateFormat("MM-dd-yyyy");
				 Date date=student.getDateOfBirth();
				 String datestring = dateForm.format(date); 
					
				String	words=fname.substring(0,3)+""+lname.substring(lname.length()-3)+""+datestring.substring(6, 10);
				String password=words.trim();
				MailMessage  msg=new MailMessage();
				msg.setTo(sendTo);
				msg.setFrom(fromAddr);
				msg.setBody("You are added it RVCRJC portal, please try to login. \n Email ID :"+student.getEmail()+"\n password :"+password);
				msg.setSubject(" Rvr&JC Portal");
				
				MailServiceUtil.sendEmail(msg);
				 
				 
			 } catch (Exception e) {
				 e.printStackTrace();
				// responseData.put("success", "false");
				 _log.error(e.getMessage());
			 }
			 
			
	}

}
